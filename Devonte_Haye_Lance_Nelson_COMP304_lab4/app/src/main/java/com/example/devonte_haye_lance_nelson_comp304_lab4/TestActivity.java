package com.example.devonte_haye_lance_nelson_comp304_lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private EditText testId;
    private EditText testapplicantId;
    private EditText testexaminerId;
    private EditText testResult;
    private EditText testDate;
    private EditText testRoute;

    private Button testButton;

    public static MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_test);

        myDB = MyDBAccessor.getMyDBInstance (getApplicationContext ());

        testId = findViewById (R.id.testId);
        testapplicantId = findViewById (R.id.testapplicantId);
        testexaminerId = findViewById (R.id.testexaminerId);
        testResult = findViewById (R.id.testResult);
        testDate = findViewById (R.id.testDate);
        testRoute = findViewById (R.id.testRoute);

        testButton = findViewById (R.id.testButton);

        testButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                int testid =Integer.parseInt (testId.getText ().toString ());
                int testapplicantid =Integer.parseInt (testapplicantId.getText ().toString ());
                int testexaminerid =Integer.parseInt (testexaminerId.getText ().toString ());
                String testresult = testResult.getText ().toString ();
                int testdate =Integer.parseInt (testDate.getText ().toString ());
                int testroute =Integer.parseInt (testRoute.getText ().toString ());

                Test test = new Test ();
                test.setTestId (testid);
                test.setApplicantId (testapplicantid);
                test.setExaminerId (testexaminerid);
                test.setTestResult (testresult);
                test.setTestDate (testdate);
                test.setTestRoute (testroute);

                TestActivity.myDB.myDao ().addTest (test);


                testId.setText("");
                testapplicantId.setText("");
                testexaminerId.setText("");
                testResult.setText("");
                testDate.setText("");
                testRoute.setText("");
            }
        });


    }
}
package com.example.devonte_haye_lance_nelson_comp304_lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ViewTestInfo extends AppCompatActivity {

    private TextView displayTest;

    private Button displayButton;

    public static MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_view_test_info);

        myDB = MyDBAccessor.getMyDBInstance (getApplicationContext ());

        displayButton = findViewById (R.id.displayTest);
        displayButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                displayTest = findViewById (R.id.displaytestView);


                List<Test> tests = ViewTestInfo.myDB.myDao ().getTest ();

                String info = "";

                for(Test test: tests) {
                    int testapplicantid = test.getApplicantId ();
                    int testexaminerid = test.getExaminerId ();
                    String testresult = test.getTestResult ();
                    int testdate = test.getTestDate ();
                    int testroute = test.getTestRoute ();

                    info = info +
                            "\n\n applicant Id: " + testapplicantid +
                            "\n Examiner Id: " + testexaminerid +
                            "\n Test Result: " + testresult +
                            "\n Test Date: " + testdate +
                            "\n Test Route #: " + testroute;
                }
                displayTest.setText (info);
            }
        });

    }
}
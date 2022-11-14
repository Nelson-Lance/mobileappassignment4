package com.example.devonte_haye_lance_nelson_comp304_lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ApplicantActivity extends AppCompatActivity {

    private TextView displayText;

    private EditText applicantId;
    private EditText applicantfirstName;
    private EditText applicantlastName;
    private EditText applicanttestCenter;
    private EditText examinerId;

    private Button applicantButton;
    private Button displayButton;

    public static MyDB myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_applicant);

        myDB = MyDBAccessor.getMyDBInstance (getApplicationContext ());


        applicantId = findViewById (R.id.updateapplicantId);
        applicantfirstName = findViewById (R.id.updateapplicantfirstName);
        applicantlastName = findViewById (R.id.updateapplicantlastName);
        applicanttestCenter = findViewById (R.id.updateapplicanttestCenter);
        examinerId = findViewById (R.id.updateapplicantexaminerId);

        applicantButton = findViewById (R.id.applicantButton);

        applicantButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                int applicantid =Integer.parseInt (applicantId.getText ().toString ());
                String applicantfirstname = applicantfirstName.getText ().toString ();
                String applicantlastname = applicantlastName.getText ().toString ();
                String applicanttestcenter = applicanttestCenter.getText ().toString ();
                int examinerid = Integer.parseInt (examinerId.getText ().toString ());

                applicant applicant = new applicant ();

                applicant.setApplicantId (applicantid);
                applicant.setFirstName (applicantfirstname);
                applicant.setLastName (applicantlastname);
                applicant.setTestCenter (applicanttestcenter);
                applicant.setExaminerId (examinerid);

                ApplicantActivity.myDB.myDao ().addApplicant (applicant);

                applicantId.setText ("");
                applicantfirstName.setText ("");
                applicantlastName.setText ("");
                applicanttestCenter.setText ("");
                examinerId.setText("");
            }
        });
        displayButton = findViewById (R.id.displayButton);
        displayButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                displayText = findViewById (R.id.displayApplicants);


                List<applicant> applicants = ApplicantActivity.myDB.myDao ().getApplicant ();
                String info = "";

                for(com.example.devonte_haye_lance_nelson_comp304_lab4.applicant applicant: applicants) {
                    int applicantid = applicant.getApplicantId ();
                    String firstname = applicant.getFirstName ();
                    String lastname = applicant.getLastName ();
                    String testcenter = applicant.getTestCenter ();
                    int examinerid = applicant.getExaminerId ();


                    info = info +
                            "\n\n applicant Id: " + applicantid +
                            "\n First Name: " + firstname +
                            "\n Last Name: " + lastname +
                            "\n Test Center: " + testcenter +
                            "\n Examiner Id: " + examinerid;
                }
                displayText.setText (info);

            }
        });

    }
}
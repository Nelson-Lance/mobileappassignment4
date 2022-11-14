package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class update extends AppCompatActivity {

    Button button7,button8;
    TextView textView9,textView10,textView11,textView12,textView13;
    ListView lv;
    MyDB myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        myDB = Room.databaseBuilder(getApplicationContext(),MyDB.class,"labDB").allowMainThreadQueries().build();

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(textView9.getText().toString());
                String name =textView10.getText().toString();
                String lname =textView11.getText().toString();
                int tc =Integer.parseInt(textView12.getText().toString());
                int ex =Integer.parseInt(textView13.getText().toString());

                Myapplicant myapplicant = new Myapplicant();
                myapplicant.setApplicantid(id);
                myapplicant.setExaminerId(ex);
                myapplicant.setFirstName(name);
                myapplicant.setLastName(lname);
                myapplicant.setTestcenter(tc);


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Myapplicant> allapps = myDB.myDao().getapps();
                List<String> everyone = new ArrayList<>();
                for (int i = 0; i <allapps.size(); i++){
                    everyone.add("id: "+allapps.get(i).getApplicantid());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>(update.this, android.R.layout.simple_list_item_1);
                lv.setAdapter(arrayAdapter);
            }
        });
    }
}
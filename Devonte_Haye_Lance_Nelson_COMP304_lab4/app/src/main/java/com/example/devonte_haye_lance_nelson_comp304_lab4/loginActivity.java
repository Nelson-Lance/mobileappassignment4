package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    Button button4;
    MyDB myDB;
    TextView name, lname, pw, tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = findViewById(R.id.textView);
        lname = findViewById(R.id.textView2);
        pw = findViewById(R.id.textView3);
        tc = findViewById(R.id.editTextTextPersonName);
        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add user
                //toast
                //send back to main
            }
        });
    }
}
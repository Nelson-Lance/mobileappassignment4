package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class examiner {
    @PrimaryKey
    String Examinerid;
    @ColumnInfo(name = "nameColumn")
    String FirstName;
    String LastName;
    String Password;
    int testcenter;

    public examiner(String FirstName, String LastName, String Password, int testcenter){
        this.LastName = Examinerid;
        this.FirstName= FirstName;
        this.LastName= LastName;
        this.Password= Password;
        this.testcenter = testcenter;

    }
}

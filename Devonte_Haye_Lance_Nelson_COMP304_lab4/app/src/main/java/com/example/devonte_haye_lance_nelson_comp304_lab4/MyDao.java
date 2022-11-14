package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MyDao {

    @Insert
    public void addTest(Test test);


}

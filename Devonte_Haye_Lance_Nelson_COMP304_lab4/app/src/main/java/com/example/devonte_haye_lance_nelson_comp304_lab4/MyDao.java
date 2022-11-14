package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addTest(Test test);

    @Query ("select * from test")
    public List<Test> getTest();
}

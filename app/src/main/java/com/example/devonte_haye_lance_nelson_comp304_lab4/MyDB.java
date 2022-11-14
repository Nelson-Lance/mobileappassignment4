package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {examiner.class},version=1)
public abstract class MyDB extends RoomDatabase {
    public abstract MyDao myDao();
}

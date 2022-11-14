package com.example.devonte_haye_lance_nelson_comp304_lab4;

import android.content.Context;
import androidx.room.Room;

public class MyDBAccessor {

    private static MyDB myDBInstance;

    private MyDBAccessor(){}

    public static MyDB getMyDBInstance(Context context){
        if(myDBInstance == null){
            myDBInstance = Room.databaseBuilder (context, AppDB.class,"drivetestDB").allowMainThreadQueries().build();
        }
        return myDBInstance;
    }
}

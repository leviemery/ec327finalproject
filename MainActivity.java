//package com.example.levi.gpacalculator; use your package instead.

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity { //MainActivity is the name of your java file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //when it says package r does not exist it says to press alt-enter and that fixed it.
    }
}

//package com.example.levi.gpacalculator; use your package instead.

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity { //MainActivity is the name of your java file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //if it says r package is not included it is because your line 1 is wrong.
    }
}

package com.example.levi.gpacalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityAfterPush extends AppCompatActivity {
    static TextView gpatext1;
    static TextView totalcredtext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_push);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        gpatext1 = (TextView) findViewById(R.id.gpatext);
        ActivityAfterPush.gpatext1.setText("Your GPA Is: "+MainActivity.resulttext);
        totalcredtext1 = (TextView) findViewById(R.id.totalcredtext);
        ActivityAfterPush.totalcredtext1.setText("Your Total Credits: "+MainActivity.totalcredit);
    }

}

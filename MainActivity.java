package com.example.levi.gpacalculator; //change to your package

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button buttongpacalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
        buttongpacalc = (Button)findViewById(R.id.buttongpacalc);
        buttongpacalc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.levi.gpacalculator.ActivityAfterPush"); //change to your package
                        startActivity(intent);
                    }
                }
        );
    }
}

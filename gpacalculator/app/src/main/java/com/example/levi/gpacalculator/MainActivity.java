package com.example.levi.gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static Button buttongpacalc;
    EditText Grade1;
    EditText Grade2;
    EditText Grade3;
    EditText Grade4;
    EditText Grade5;
    EditText Credit1;
    EditText Credit2;
    EditText Credit3;
    EditText Credit4;
    EditText Credit5;
    static double resulttext;
    static double totalcredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
        Grade1 = (EditText) findViewById(R.id.grade1);
        Grade2 = (EditText) findViewById(R.id.grade2);
        Grade3 = (EditText) findViewById(R.id.grade3);
        Grade4 = (EditText) findViewById(R.id.grade4);
        Grade5 = (EditText) findViewById(R.id.grade5);
        Credit1 = (EditText) findViewById(R.id.credit1);
        Credit2 = (EditText) findViewById(R.id.credit2);
        Credit3 = (EditText) findViewById(R.id.credit3);
        Credit4 = (EditText) findViewById(R.id.credit4);
        Credit5 = (EditText) findViewById(R.id.credit5);

    }
    public void OnClickButtonListener(){
        buttongpacalc = (Button)findViewById(R.id.buttongpacalc);
        buttongpacalc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double num1 = Integer.parseInt(Grade1.getText().toString());
                        double num2 = Integer.parseInt(Grade2.getText().toString());
                        double num3 = Integer.parseInt(Grade3.getText().toString());
                        double num4 = Integer.parseInt(Grade4.getText().toString());
                        double num5 = Integer.parseInt(Grade5.getText().toString());
                        double cred1 = Integer.parseInt(Credit1.getText().toString());
                        double cred2 = Integer.parseInt(Credit2.getText().toString());
                        double cred3 = Integer.parseInt(Credit3.getText().toString());
                        double cred4 = Integer.parseInt(Credit4.getText().toString());
                        double cred5 = Integer.parseInt(Credit5.getText().toString());
                        //num1
                        if(num1>92&&num1<=100){
                            num1 = 4.0;
                        }
                        else if(num1>89&&num1<93){
                            num1 = 3.7;
                        }
                        else if(num1>86&&num1<90){
                            num1 = 3.3;
                        }
                        else if(num1>82&&num1<87){
                            num1 = 3.0;
                        }
                        else if(num1>79&&num1<83) {
                            num1 = 2.7;
                        }
                        else if(num1>76&&num1<80){
                            num1 = 2.3;
                        }
                        else if(num1>72&&num1<77){
                            num1 = 2.0;
                        }
                        else if(num1>69&&num1<73){
                            num1 = 1.7;
                        }
                        else if(num1>66&&num1<70){
                            num1 = 1.3;
                        }
                        else if(num1>64&&num1<67){
                            num1 = 1.0;
                        }
                        else{
                            num1 = 0.0;
                        }
                        //num2
                        if(num2>92&&num2<=100){
                            num2 = 4.0;
                        }
                        else if(num2>89&&num2<93){
                            num2 = 3.7;
                        }
                        else if(num2>86&&num2<90){
                            num2 = 3.3;
                        }
                        else if(num2>82&&num2<87){
                            num2 = 3.0;
                        }
                        else if(num2>79&&num2<83) {
                            num2 = 2.7;
                        }
                        else if(num2>76&&num2<80){
                            num2 = 2.3;
                        }
                        else if(num2>72&&num2<77){
                            num2 = 2.0;
                        }
                        else if(num2>69&&num2<73){
                            num2 = 1.7;
                        }
                        else if(num2>66&&num2<70){
                            num2 = 1.3;
                        }
                        else if(num2>64&&num2<67){
                            num2 = 1.0;
                        }
                        else{
                            num2 = 0.0;
                        }
                        //num3
                        if(num3>92&&num3<=100){
                            num3 = 4.0;
                        }
                        else if(num3>89&&num3<93){
                            num3 = 3.7;
                        }
                        else if(num3>86&&num3<90){
                            num3 = 3.3;
                        }
                        else if(num3>82&&num3<87){
                            num3 = 3.0;
                        }
                        else if(num3>79&&num3<83) {
                            num3 = 2.7;
                        }
                        else if(num3>76&&num3<80){
                            num3 = 2.3;
                        }
                        else if(num3>72&&num3<77){
                            num3 = 2.0;
                        }
                        else if(num3>69&&num3<73){
                            num3 = 1.7;
                        }
                        else if(num3>66&&num3<70){
                            num3 = 1.3;
                        }
                        else if(num3>64&&num3<67){
                            num3 = 1.0;
                        }
                        else{
                            num3 = 0.0;
                        }
                        //num4
                        if(num4>92&&num4<=100){
                            num4 = 4.0;
                        }
                        else if(num4>89&&num4<93){
                            num4 = 3.7;
                        }
                        else if(num4>86&&num4<90){
                            num4 = 3.3;
                        }
                        else if(num4>82&&num4<87){
                            num4 = 3.0;
                        }
                        else if(num4>79&&num4<83) {
                            num4 = 2.7;
                        }
                        else if(num4>76&&num4<80){
                            num4 = 2.3;
                        }
                        else if(num4>72&&num4<77){
                            num4 = 2.0;
                        }
                        else if(num4>69&&num4<73){
                            num4 = 1.7;
                        }
                        else if(num4>66&&num4<70){
                            num4 = 1.3;
                        }
                        else if(num4>64&&num4<67){
                            num4 = 1.0;
                        }
                        else{
                            num4 = 0.0;
                        }
                        //num5
                        if(num5>92&&num5<=100){
                            num5 = 4.0;
                        }
                        else if(num5>89&&num5<93){
                            num5 = 3.7;
                        }
                        else if(num5>86&&num5<90){
                            num5 = 3.3;
                        }
                        else if(num5>82&&num5<87){
                            num5 = 3.0;
                        }
                        else if(num5>79&&num5<83) {
                            num5 = 2.7;
                        }
                        else if(num5>76&&num5<80){
                            num5 = 2.3;
                        }
                        else if(num5>72&&num5<77){
                            num5 = 2.0;
                        }
                        else if(num5>69&&num5<73){
                            num5 = 1.7;
                        }
                        else if(num5>66&&num5<70){
                            num5 = 1.3;
                        }
                        else if(num5>64&&num5<67){
                            num5 = 1.0;
                        }
                        else{
                            num5 = 0.0;
                        }
                        double val1 = num1*cred1;
                        double val2 = num2*cred2;
                        double val3 = num3*cred3;
                        double val4 = num4*cred4;
                        double val5 = num5*cred5;
                        totalcredit = (cred1+cred2+cred3+cred4+cred5);
                        resulttext = (val1+val2+val3+val4+val5)/(totalcredit);
                        Intent intent = new Intent("com.example.levi.gpacalculator.ActivityAfterPush");
                        startActivity(intent);
                    }
                }
        );
    }
}

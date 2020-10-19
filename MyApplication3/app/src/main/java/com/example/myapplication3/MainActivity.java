package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Define the Device names using array
    public String names[] = {"Device Name #1", "Device Name #2", "Device Name #3", "Device Name #4", "Device Name #5"};
    //Define the Cycles
    public int cycles[] = {10, 23, 34, 45, 56};
    //Define the Error buttons
    public boolean errorArr[] = {false, true, true, false, false};
    //Define the motor buttons
    public boolean motorArr[] = {true, true, true, false, false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //TextView Device names
        TextView names1=(TextView) findViewById(R.id.d1);
        TextView names2=(TextView) findViewById(R.id.d2);
        TextView names3=(TextView) findViewById(R.id.d3);
        TextView names4=(TextView) findViewById(R.id.d4);
        TextView names5=(TextView) findViewById(R.id.d5);

        //TextView Cycles
        TextView cycles1=(TextView) findViewById(R.id.c1);
        TextView cycles2=(TextView) findViewById(R.id.c2);
        TextView cycles3=(TextView) findViewById(R.id.c3);
        TextView cycles4=(TextView) findViewById(R.id.c4);
        TextView cycles5=(TextView) findViewById(R.id.c5);

        //ButtonView errors
        Button errorArr1 = (Button) findViewById(R.id.r1);
        Button errorArr2 = (Button) findViewById(R.id.r2);
        Button errorArr3 = (Button) findViewById(R.id.r3);
        Button errorArr4 = (Button) findViewById(R.id.r4);
        Button errorArr5 = (Button) findViewById(R.id.r5);

       //ButtonView motors
        Button motorArr1 = (Button) findViewById(R.id.m1);
        Button motorArr2 = (Button) findViewById(R.id.m2);
        Button motorArr3 = (Button) findViewById(R.id.m3);
        Button motorArr4 = (Button) findViewById(R.id.m4);
        Button motorArr5 = (Button) findViewById(R.id.m5);
    }
}
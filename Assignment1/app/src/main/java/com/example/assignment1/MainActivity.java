package com.example.assignment1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.awt.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView a;
    Button b1,b2;
    Typeface currentStyle=Typeface.MONOSPACE;
    int currentColor=Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=  findViewById(R.id.tv1);
        b1= findViewById(R.id.bt1);
        b2= findViewById(R.id.bt2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if(view == b1)
        {
            a.setTypeface(currentStyle);
            Toast.makeText(this,"text style changed",Toast.LENGTH_SHORT).show();
            if(currentStyle==Typeface.MONOSPACE)
                currentStyle=Typeface.SANS_SERIF;
            else
                currentStyle=Typeface.MONOSPACE;

            System.out.println("---------------"+currentStyle);
        }
        if(view == b2){
            a.setTextColor(currentColor);
            Toast.makeText(this,"text color changed",Toast.LENGTH_SHORT).show();
            if(currentColor==Color.BLUE)
                currentColor=Color.RED;
            else
                currentColor=Color.BLUE;

            System.out.println("---------------- "+currentColor);
        }
    }
}
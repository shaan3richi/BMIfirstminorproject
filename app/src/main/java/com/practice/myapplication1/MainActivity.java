package com.practice.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout back;
        EditText weight,feet,inch;
        Button btn;
        TextView result;
        weight =findViewById(R.id.weight);
        feet =findViewById(R.id.heightft);
        inch =findViewById(R.id.heightinch);
        result =findViewById(R.id.result);
        btn =findViewById(R.id.btn);
        back =findViewById(R.id.background);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt (weight.getText().toString());
                int ft=Integer.parseInt (feet.getText().toString());
                int in=Integer.parseInt (inch.getText().toString());
                int totalin=ft*12+in;
                double totalcm= totalin*2.53;
                double totalm=totalcm/100;
                double BMI=wt/(totalm*totalm);
                if(BMI>25)
                {
                    result.setText("you are overweight");
                    back.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else if (BMI<18)
                {
                    result.setText("your are underweight");
                    back.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
                else
                {
                    result.setText("you are fit");
                    back.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        });
    }
}
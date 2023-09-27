package com.example.calculadora_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText no1;
    private EditText no2;
    private TextView resultField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
        resultField = findViewById(R.id.resultField);
    }
    public void sumNo(View view){
        resultField.setText(String.valueOf(Integer.parseInt(no1.getText().toString())+Integer.parseInt(no2.getText().toString())));
    }
    public void subNo(View view){
        resultField.setText(String.valueOf(Integer.parseInt(no1.getText().toString())-Integer.parseInt(no2.getText().toString())));
    }
    public void divNo(View view){
        resultField.setText(String.valueOf(Integer.parseInt(no1.getText().toString())/Integer.parseInt(no2.getText().toString())));
    }
    public void multNo(View view){
        resultField.setText(String.valueOf(Integer.parseInt(no1.getText().toString())*Integer.parseInt(no2.getText().toString())));
    }
}
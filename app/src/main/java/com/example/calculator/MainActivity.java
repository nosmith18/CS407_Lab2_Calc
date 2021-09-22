package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view){
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        printAnswer(num1 + num2);
    }

    public void subtract(View view){
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        printAnswer(num1 - num2);
    }

    public void multiply(View view){
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        printAnswer(num1 * num2);
    }

    public void divide(View view){
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        printAnswer(num1 / num2);

    }

    public void printAnswer(int ans) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("answer", ans);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
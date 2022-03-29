package com.codecademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

       equals.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
                final int num1 = Integer.parseInt(firstNumber.getText().toString());
                final int num2 = Integer.parseInt(secondNumber.getText().toString());

                final int operator = operators.getCheckedRadioButtonId();
               Integer sum;
                if(operator == R.id.add){
                    sum = num1 + num2;

                }else{
                    sum = num1 - num2;
                }
                result.setText(sum.toString());
           }
       });
    }
}
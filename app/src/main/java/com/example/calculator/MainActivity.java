package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText firstNumber, secondNumber;
    Button buttonAdd,buttonSub, buttonMultiply, buttonDiv;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        textViewResult = findViewById(R.id.resultView);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMultiply = findViewById(R.id.btnMulti);
        buttonDiv = findViewById(R.id.btnDiv);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

        //event listener for button click
       /* buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());
                int c = a + b;

                textViewResult.setText("result:" + String.valueOf(c));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(firstNumber.getText().toString());
                int y = Integer.parseInt(secondNumber.getText().toString());
                int z = x-y;
                textViewResult.setText("result: " + String.valueOf(z));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());
                int c = a*b;
                textViewResult.setText("result : " + String.valueOf(c));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());
                int c = a/b;
                textViewResult.setText("result : " + String.valueOf(c));
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAdd)
        {
            int a = Integer.parseInt(firstNumber.getText().toString());
            int b = Integer.parseInt(secondNumber.getText().toString());
            int c = a+b;
            textViewResult.setText("result : " + String.valueOf(c));
        }

        if(v.getId() == R.id.btnSub)
        {
            int a = Integer.parseInt(firstNumber.getText().toString());
            int b = Integer.parseInt(secondNumber.getText().toString());
            int c = a-b;
            textViewResult.setText("result : " + String.valueOf(c));
        }

        if(v.getId() == R.id.btnMulti)
        {
            int a = Integer.parseInt(firstNumber.getText().toString());
            int b = Integer.parseInt(secondNumber.getText().toString());
            int c = a*b;
            textViewResult.setText("result : " + String.valueOf(c));
        }

        if(v.getId() == R.id.btnDiv)
        {
            int a = Integer.parseInt(firstNumber.getText().toString());
            int b = Integer.parseInt(secondNumber.getText().toString());
            int c = a/b;
            textViewResult.setText("result : " + String.valueOf(c));
        }
    }

}



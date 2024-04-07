package com.mehmetsukrukavak.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num1Text;
    EditText num2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        num1Text = findViewById(R.id.num1Text);
        num2Text = findViewById(R.id.num2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){
        if(num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")){
            resultText.setText("Enter Number");
        }else{
            int num1 =Integer.parseInt(num1Text.getText().toString());
            int num2 =Integer.parseInt(num2Text.getText().toString());

            int result = num1 + num2;

            resultText.setText(""+result);
        }

    }

    public void dedact(View view){
        if(num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")){
            resultText.setText("Enter Number");
        }else {
            int num1 = Integer.parseInt(num1Text.getText().toString());
            int num2 = Integer.parseInt(num2Text.getText().toString());

            int result = num1 - num2;

            resultText.setText("" + result);
        }
    }

    public void multiply(View view){
        if(num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")){
            resultText.setText("Enter Number");
        }else {
            int num1 = Integer.parseInt(num1Text.getText().toString());
            int num2 = Integer.parseInt(num2Text.getText().toString());

            int result = num1 * num2;

            resultText.setText("" + result);
        }
    }

    public void divide(View view){
        if(num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")){
            resultText.setText("Enter Number");
        }else {
            double num1 = Integer.parseInt(num1Text.getText().toString());
            double num2 = Integer.parseInt(num2Text.getText().toString());
            if (num2 != 0) {
                double result = num1 / num2;
                resultText.setText("" + result);
            }else {
                resultText.setText("Num2 must be different 0");
            }
        }
    }
}
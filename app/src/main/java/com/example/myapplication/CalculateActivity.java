package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateActivity extends AppCompatActivity {

    public EditText firstNumberEd, secondNumberEd;
    public Button calcBtn, backBtn;
    public TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        firstNumberEd = findViewById(R.id.firstNumberEd1);
        secondNumberEd = findViewById(R.id.secondNumberEd1);
        calcBtn = findViewById(R.id.calcualteBtn);
        backBtn = findViewById(R.id.backBtn);
        resultTv = findViewById(R.id.resultRv);

        backBtn.setOnClickListener(view -> {
//            Intent intent = new Intent(CalculateActivity.this, MainActivity.class);
//            startActivity(intent);
            finish();
        });
        calcBtn.setOnClickListener(view -> {
            calculate();
        });
    }

    private void calculate() {
        if (firstNumberEd.getText().toString().isEmpty() ||  secondNumberEd.getText().toString().isEmpty()){
            Toast.makeText(this,"Fill the empty field", Toast.LENGTH_SHORT).show();
        }else {
            int firstNumber =  Integer.parseInt(firstNumberEd.getText().toString());
            int secondNumber =  Integer.parseInt(secondNumberEd.getText().toString());
            int result = firstNumber + secondNumber;
            resultTv.setText("sum: " + result);
            firstNumberEd.setText("");
            secondNumberEd.setText("");
        }
    }
}
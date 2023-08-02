package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public TextView greetingTv, welcomeMassage;
    public EditText nameEd;
    public Button greetingBtn, goToCalcBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTv = findViewById(R.id.greetingTv);
        nameEd = findViewById(R.id.nameEd);
        greetingBtn = findViewById(R.id.greetingBtn);
        welcomeMassage = findViewById(R.id.welcomeMassage);
        goToCalcBtn = findViewById(R.id.goToCalcualteBtn);


        greetingBtn.setOnClickListener(v ->{
            if (nameEd.getText().toString().isEmpty()){
                Snackbar.make(v,"Please Enter Your Name!!!", Snackbar.LENGTH_SHORT)
                        .setAction("Okay",v1->{})
                        .show();
            }else {
                String name = nameEd.getText().toString();
                greetingTv.setText("Hello, " + name);
                nameEd.setText("");
                welcomeMassage.setVisibility(View.VISIBLE);
            }
        });

        goToCalcBtn.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this , CalculateActivity.class);
            startActivity(intent);
        });

    }

}
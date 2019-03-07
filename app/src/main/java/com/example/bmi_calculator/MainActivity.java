package com.example.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalculateButtonClicked(View view) {
        TextView result = (TextView) findViewById(R.id.resultText);
        EditText heightInput = (EditText) findViewById(R.id.heightText);
        EditText weightInput = (EditText) findViewById(R.id.weightText);
        ImageView imageResult = (ImageView) findViewById(R.id.resultImage);

        Double height = Double.valueOf(heightInput.getText().toString())/100;
        Double weight = Double.valueOf(weightInput.getText().toString());
        Double bmi = weight/(height * height);

        result.setText("Your BMI is " + String.format("%.2f", bmi));
        if(bmi < 22) {
            imageResult.setImageResource(R.drawable.underweight);
        }
        else if (bmi <= 30) {
            imageResult.setImageResource(R.drawable.normal);
        }
        else {
            imageResult.setImageResource(R.drawable.overweight);
        }
    }

}

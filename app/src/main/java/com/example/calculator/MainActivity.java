package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextweight = findViewById(R.id.weight);
        EditText editTextheight = findViewById(R.id.height);
        TextView textView = findViewById(R.id.result);

        Button cal = findViewById(R.id.btncalculate);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float height = Float.parseFloat(editTextheight.getText().toString())/100;
                float weight = Float.parseFloat(String.valueOf(editTextweight.getText()));
                float bmi = weight/(height*height);
                textView.setText(String.valueOf(bmi));

            }
        });

    }
}
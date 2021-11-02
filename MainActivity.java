package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickConvert(View v)
    {
        EditText unit = (EditText) findViewById(R.id.text1);
        String temp = unit.getText().toString();

        Double dollar = Double.parseDouble(temp);

        Double pkr = dollar*174.35;


        final TextView fresult;

        fresult = (TextView) findViewById(R.id.result);
        fresult.setText(String.valueOf(pkr));
        fresult.setTextColor(Color.RED);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
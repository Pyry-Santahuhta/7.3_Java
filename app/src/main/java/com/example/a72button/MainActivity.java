package com.example.a72button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText text;
    TextView newtext;
    String textToSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Scanner scan = new Scanner(System.in);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText);
        newtext =  (TextView) findViewById(R.id.userInput);




    }
    public void testMethod(View v){
        textToSet = text.getText().toString();
        newtext.setText(textToSet);
    }
}

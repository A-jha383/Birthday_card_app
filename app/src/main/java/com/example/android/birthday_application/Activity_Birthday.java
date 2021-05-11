package com.example.android.birthday_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity_Birthday extends AppCompatActivity {
TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mTextView =(TextView)findViewById(R.id.view);
        String value = getIntent().getStringExtra("birthdayname");
        Log.d("name",value);
  mTextView.setText("Happy Birthday \n "+value);
    }
}
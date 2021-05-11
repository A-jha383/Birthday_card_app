package com.example.android.birthday_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText n_name;
Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n_name = (EditText)findViewById(R.id.name);
        mButton = (Button)findViewById(R.id.create);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =n_name.getText().toString();
                if(name.equals("")){
                    Toast.makeText(MainActivity.this,"PLEASE ENTER VALID INPUT",Toast.LENGTH_LONG).show();
                }else{
                    Intent i = new Intent(MainActivity.this,Activity_Birthday.class);
                    i.putExtra("birthdayname",name);
                    startActivity(i);
                }

            }
        });

    }
}
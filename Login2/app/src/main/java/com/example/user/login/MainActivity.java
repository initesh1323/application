package com.example.user.login;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.login.R;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button2);
        final EditText e1=findViewById(R.id.editText6);
        final EditText e2=findViewById(R.id.editText7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Main2Activity.class);

                i.putExtra("user",e1.getText().toString());

                i.putExtra("password",e2.getText().toString());

                startActivity(i);


            }

        });
    }}

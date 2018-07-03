package com.example.user.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
Bundle b=getIntent().getExtras();
    String a=b.getString("user");
    String c=b.getString("password");
        TextView t =(TextView) findViewById(R.id.text);
        if(a.equals("ADMIN")&&c.equals("12334"))
                t.setText("Welcome");
        else
            t.setText(("sry"));
    }
}


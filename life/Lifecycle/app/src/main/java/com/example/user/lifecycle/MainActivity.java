package com.example.user.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "process start", Toast.LENGTH_SHORT).show();
    }
protected void onStop()
{
    super.onStop();
    Toast.makeText(this, "process stop", Toast.LENGTH_SHORT).show();
}
protected void onPause()
{
    super.onPause();
    Toast.makeText(this, "paused", Toast.LENGTH_SHORT).show();
}
protected void onResume()
{
    super.onResume();
    Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
}
protected void onRestart()
{
    super.onRestart();
    Toast.makeText(this, "restart", Toast.LENGTH_SHORT).show();
}
protected void onDestroy()
{
    super.onDestroy();
    Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();
}
}


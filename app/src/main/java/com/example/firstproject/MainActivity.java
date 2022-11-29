package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Files has been changed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("CREATE", "ON CREATE");
        Toast.makeText(this, "ON CREATE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("ON START", "ON START");
        Toast.makeText(this, "ON START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ON RESUME", "ON RESUME");
        Toast.makeText(this, "ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ON PAUSE", "ON PAUSE");
        Toast.makeText(this, "ON PAUSE", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ON STOP", "ON STOP");
        Toast.makeText(this, "ON STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ON RESTART", "ON RESTART");
        Toast.makeText(this, "ON RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ON DESTROY", "ON DESTROY");
        Toast.makeText(this, "ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}
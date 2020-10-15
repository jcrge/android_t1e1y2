package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button19);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LOG_TAG, "button19 clicked");
            }
        });

        Log.v(LOG_TAG, "método onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG_TAG, "método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(LOG_TAG, "método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e(LOG_TAG, "método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(LOG_TAG, "método onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.w(LOG_TAG, "método onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(LOG_TAG, "método onDestroy");
    }
}

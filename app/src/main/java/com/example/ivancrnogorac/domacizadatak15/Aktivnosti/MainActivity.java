package com.example.ivancrnogorac.domacizadatak15.aktivnosti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ivancrnogorac.domacizadatak15.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    // Called when btnStart button is clicked
    public void btnStartActivitySecondClicked(View view) {
        // This is an explicit intent (class property is specified)
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        // startActivity method starts an activity
        startActivity(intent);
    }



}

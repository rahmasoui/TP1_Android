package com.example.tp1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Question1", "activity_main.xml");
        Log.d("Question2", "app_name");
        Log.d("Question3", "AVD Manager");
        Log.d("Question4", "Info");
        Log.i("Etudiante", "Rahma Souissi 3 GII_RCI");

    }
}
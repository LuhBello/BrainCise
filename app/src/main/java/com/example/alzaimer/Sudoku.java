package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sudoku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
    }

    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

public class Sudoku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);

    }

    public void IrEmpezar(View view){
        Intent i = new Intent(this, GameDifficultyActivity.class);
        startActivity(i);
    }
    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
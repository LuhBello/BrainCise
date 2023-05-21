package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrJugar(View view){
        Intent i;
        i = new Intent(this, Sudoku.class);
        startActivity(i);
    }

    public void IrDeporte(View view){
        Intent i = new Intent(this, Deporte.class);
        startActivity(i);
    }

    public void IrLectura(View view){
        Intent i = new Intent(this, Lectura.class);
        startActivity(i);
    }

    public void IrTips(View view){
        Intent i = new Intent(this, Tips.class);
        startActivity(i);
    }

    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
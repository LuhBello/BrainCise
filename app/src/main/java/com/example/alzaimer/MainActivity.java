package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
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
        int randomInt = (int) (Math.random() * 3);
        Intent i;
        if(randomInt==0) i = new Intent(this, Crucigrama.class);
        else if (randomInt==1) i = new Intent(this, Sudoku.class);
        else i = new Intent(this, Sopa_de_Letras.class);

        startActivity(i);
    }

    public void IrDeporte(View view){
        Intent i = new Intent(this, Deporte.class);
        startActivity(i);
    }
    public void IrFelicidades(View view){
        Intent i = new Intent(this, Felicidades.class);
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
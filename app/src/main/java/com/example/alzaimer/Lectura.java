package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Lectura extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);
        String text = readTextFromAssets(Aleatorio());
        TextView txt_leer = findViewById(R.id.txt_leer);
        // Establece el texto en el TextView
        txt_leer.setText(text);
    }

    private String readTextFromAssets(String filename) {
        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open(filename);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            return new String(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String Aleatorio(){
        String url;
        int randomInt = (int) (Math.random() * 4);
        randomInt++;
        url= "leer"+randomInt+".txt";
        Toast.makeText(this, randomInt+"", Toast.LENGTH_SHORT).show();
        return url;
    }
    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
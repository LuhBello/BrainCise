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

public class Tips extends AppCompatActivity {
    private TextView txt_tip;
    private int random_int;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        txt_tip = findViewById(R.id.txt_tip);

        String text = readTextFromAssets(Aleatorio());

        // Establece el texto en el TextView
        txt_tip.setText(text);
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
        int randomInt = (int) (Math.random() * 13);
        randomInt++;
        url= "tip"+randomInt+".txt";
        Toast.makeText(this, randomInt+"", Toast.LENGTH_SHORT).show();
        return url;
    }

    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
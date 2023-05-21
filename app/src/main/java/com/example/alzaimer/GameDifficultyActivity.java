package com.example.alzaimer;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Knut on 22.11.2017.
 */

public class GameDifficultyActivity extends AppCompatActivity {
    private boolean newBoard = false;
    private int selectedDifficulty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_difficulty);
        newBoard = getIntent().getBooleanExtra("newBoard", false);
        if (newBoard) {
            Button buttonContinue = findViewById(R.id.buttonContinue);
            buttonContinue.setText(getString(R.string.add_new_board));
        }
    }

    public void onGoBackButtonClicked(View view) {
        finish();
    }

    public void onDifficultyRadioButtonsClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int tmp= view.getId();
        if (tmp == R.id.radioButtonEasy) {
            if (checked) {
                selectedDifficulty = 0;
            }
        } else if (tmp == R.id.radioButtonNormal) {
            if (checked) {
                selectedDifficulty = 1;
            }
        } else if (tmp==R.id.radioButtonHard) {
            if(checked){
                selectedDifficulty=2;
            }
        }
    }

    public void onStartGameButtonClicked(View view) {
        if (newBoard) {
            Intent intent = new Intent();
            intent.putExtra("boardSaved", true);
            intent.putExtra("difficulty", selectedDifficulty);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            Intent intent = new Intent("com.example.alzaimer.GameActivity");
            intent.putExtra("difficulty", selectedDifficulty);
            startActivity(intent);
        }
    }
}
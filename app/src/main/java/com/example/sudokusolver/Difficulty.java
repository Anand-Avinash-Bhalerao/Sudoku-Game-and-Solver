package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
        Button easy = findViewById(R.id.easy);
        Button moderate = findViewById(R.id.moderate);
        Button hard = findViewById(R.id.hard);

        easy.setOnClickListener(view->{
            Intent intent = new Intent(this,Play.class);
            intent.putExtra(Play.DIFF,Play.EASY);
            startActivity(intent);
        });
        moderate.setOnClickListener(view->{
            Intent intent = new Intent(this,Play.class);
            intent.putExtra(Play.DIFF,Play.MODERATE);
            startActivity(intent);
        });
        hard.setOnClickListener(view->{
            Intent intent = new Intent(this,Play.class);
            intent.putExtra(Play.DIFF,Play.HARD);
            startActivity(intent);
        });
    }
}
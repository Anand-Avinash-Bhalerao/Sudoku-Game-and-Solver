package com.example.sudokusolver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play = findViewById(R.id.play);
        Button solve = findViewById(R.id.solve);
        play.setOnClickListener(view->{
            startActivity(new Intent(this,Difficulty.class));
        });
        solve.setOnClickListener(view->{
            startActivity(new Intent(this,Solve.class));
        });
    }
}
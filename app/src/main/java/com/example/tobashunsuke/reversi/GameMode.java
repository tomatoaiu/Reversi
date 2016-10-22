package com.example.tobashunsuke.reversi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GameMode extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_mode);

        final Button toHvsH = (Button) findViewById(R.id.human_vs_human);
        final Button returnMain = (Button) findViewById(R.id.to_title);

        toHvsH.setOnClickListener(new View.OnClickListener() { // 人　対　人　へ
            public void onClick(View v) {
                if(v == toHvsH){
                    Intent intent = new Intent(GameMode.this, GameHvsH.class);
                    startActivity(intent);
                }
            }
        });

        returnMain.setOnClickListener(new View.OnClickListener() { // タイトルへ
            public void onClick(View v) {
                if(v == returnMain){
                    finish();
                }
            }
        });
    }
}

package com.android.gamescorecounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int displayScoreA = 0;
    int displayScoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showThree(View view){
        displayScoreA = displayScoreA + 3;
        displayScoreA(displayScoreA);
    }
    public void showTwo(View view){
        displayScoreA = displayScoreA +2;
        displayScoreA(displayScoreA);
    }
    public void showOne(View view){
        displayScoreA = displayScoreA +1;
        displayScoreA(displayScoreA);
    }
    public void showThreeB(View view){
        displayScoreB = displayScoreB + 3;
        displayScoreB(displayScoreB);
    }
    public void showTwoB(View view) {
        displayScoreB = displayScoreB + 2;
        displayScoreB(displayScoreB);
    }
    public void showOneB(View view){
        displayScoreB = displayScoreB +1;
        displayScoreB(displayScoreB);
    }
    public void resetScore(View v){
        displayScoreA = 0;
        displayScoreB = 0;
        displayScoreA(displayScoreA);
        displayScoreB(displayScoreB);
    }
    public void displayScoreA(int score){
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(String.valueOf(score));
    }
    public void displayScoreB(int score){
        TextView t =(TextView) findViewById(R.id.team_b_score);
        t.setText(String.valueOf(score));
    }

}

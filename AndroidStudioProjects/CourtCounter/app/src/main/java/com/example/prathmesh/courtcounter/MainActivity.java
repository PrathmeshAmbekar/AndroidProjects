package com.example.prathmesh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TotalScoreOfTeamA = 0;
    int TotalScoreOfTeamB = 0;
    int TeamAScore = 0;
    int TeamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a_addone(View view){
        TotalScoreOfTeamA = TotalScoreOfTeamA + 1;
        displayForTeamA(TotalScoreOfTeamA);
        TeamAScore = TotalScoreOfTeamA;
    }
    public void a_addtwo(View view){
        TotalScoreOfTeamA = TotalScoreOfTeamA + 2;
        displayForTeamA(TotalScoreOfTeamA);
        TeamAScore = TotalScoreOfTeamA;
    }
    public void a_addthree(View view){
        TotalScoreOfTeamA = TotalScoreOfTeamA + 3;
        displayForTeamA(TotalScoreOfTeamA);
        TeamAScore = TotalScoreOfTeamA;
    }


    public void b_addone(View view){
        TotalScoreOfTeamB = TotalScoreOfTeamB + 1;
        displayForTeamB(TotalScoreOfTeamB);
        TeamBScore = TotalScoreOfTeamB;
    }
    public void b_addtwo(View view){
        TotalScoreOfTeamB = TotalScoreOfTeamB + 2;
        displayForTeamB(TotalScoreOfTeamB);
        TeamBScore = TotalScoreOfTeamB;
    }
    public void b_addthree(View view){
        TotalScoreOfTeamB = TotalScoreOfTeamB + 3;
        displayForTeamB(TotalScoreOfTeamB);
        TeamBScore = TotalScoreOfTeamB;
    }

    public void reset(View view){
        TotalScoreOfTeamA = 0;
        TotalScoreOfTeamB = 0;
        displayForTeamA(TotalScoreOfTeamA);
        displayForTeamB(TotalScoreOfTeamB);
    }

//    public void total(View view){
//        displayTotalForTeamA("Previous score of Team-A was = " + TeamAScore);
//        displayTotalForTeamB("Previous score of Team-B was = " + TeamBScore);
//    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
//    public void displayTotalForTeamA(String message){
//        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
//        scoreView.setText(String.valueOf(message));
//    }
//
//    public void displayTotalForTeamB(String message){
//        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
//        scoreView.setText(String.valueOf(message));
//    }

}

package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayA(){
        TextView textView = (TextView) findViewById(R.id.scoreA);
        textView.setText("" + scoreA);
    }
    private void displayB(){
        TextView textView = (TextView) findViewById(R.id.scoreB);
        textView.setText("" + scoreB);
    }

    public void addThreePointsA(View view) {
        scoreA+=3;
        displayA();
    }
    public void addTwoPointsA(View view) {
        scoreA+=2;
        displayA();
    }

    public void addOnePointA(View view) {
        scoreA++;
        displayA();
    }

    public void addThreePointsB(View view) {
        scoreB+=3;
        displayB();
    }
    public void addTwoPointsB(View view) {
        scoreB+=2;
        displayB();
    }

    public void addOnePointB(View view) {
        scoreB++;
        displayB();
    }

    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        displayA();
        displayB();
    }
}
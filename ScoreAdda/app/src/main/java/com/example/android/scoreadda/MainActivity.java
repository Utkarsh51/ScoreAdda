package com.example.android.scoreadda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //define veriables that would refer to our views
    Button bt1, bt2, bt3;
    TextView p1score, p2score, teamScore, overs;
    int p1s=0, p2s=0,teamS=0, over = 0,ballc = 0, balls1 = 0, balls2 = 0,wickets = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        //create instance of the views
        bt1 = findViewById(R.id.bp1_6);
        bt2 = findViewById(R.id.bp2_6);
        //create instance of the textviews
        p1score = findViewById(R.id.p1_score);
        p2score = findViewById(R.id.p2_score);
        teamScore = findViewById(R.id.score);
        overs = findViewById(R.id.over);
        p1score.setText(""+p1s+"("+ balls1 +")");
        p2score.setText(""+p2s+"("+ balls2 +")");
        overs.setText(""+over+"."+ballc);


        /*
registering buttons to click listener
clickListener for button bt1
*/


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1s += 6;
                ballc++;
                balls1++;
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 6;
                p1score.setText(""+p1s+"("+ balls1 +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button bt2
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2s += 6;
                ballc++;
                balls2++;
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 6;
                p2score.setText(""+p2s+"("+ balls2 +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
    }
}

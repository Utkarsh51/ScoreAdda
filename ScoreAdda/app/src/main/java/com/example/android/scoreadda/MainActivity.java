package com.example.android.scoreadda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //define veriables that would refer to our views
    Button bt1, bt2, bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,btw1,btw2;
    TextView p1score, p2score, teamScore, overs,p1Name,p2Name;
    int teamS=0, over = 0,ballc = 0,  wickets = 0;
    Players p1,p2;
    String [] team ={"Shikhar","Rohit","Virat","Rahul","Dhoni","Hardik","Kedar","Kuldeep","bhuvi","Bumrah","Chahal"};
    int teamPointer = 1;
    ArrayList<Players> players;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        //Creating the instance for the current players
        p1 = new Players(team[0],0,0);
        p2 = new Players(team[1],0,0);
        //create instance of the views
        bt1 = findViewById(R.id.bp1_6);
        bt2 = findViewById(R.id.bp2_6);
        bt3 = findViewById(R.id.bp1_4);
        bt4 = findViewById(R.id.bp2_4);
        bt5 = findViewById(R.id.bp1_3);
        bt6 = findViewById(R.id.bp2_3);
        bt7 = findViewById(R.id.bp1_2);
        bt8 = findViewById(R.id.bp2_2);
        bt9 = findViewById(R.id.bp1_1);
        bt10 = findViewById(R.id.bp2_1);
        bt11 = findViewById(R.id.bp1_0);
        bt12 = findViewById(R.id.bp2_0);
        btw1 = findViewById(R.id.bp1_w);
        btw2 = findViewById(R.id.bp2_w);
        //create instance of the textviews
        p1score = findViewById(R.id.p1_score);
        p2score = findViewById(R.id.p2_score);
        teamScore = findViewById(R.id.score);
        overs = findViewById(R.id.over);
        p1Name = findViewById(R.id.player_one);
        p2Name = findViewById(R.id.player_two);
//instantiating the arraylist
        players = new ArrayList<Players>();
        p1Name.setText(p1.getPlayerName());
        p2Name.setText(p2.getPlayerName());
        p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
        p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
        overs.setText(""+over+"."+ballc);


        /*
registering buttons to click listener
clickListener for button bt1
*/
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+6);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 6;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button bt2
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+6);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 6;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //click listener for button 3
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+4);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 4;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button button 4
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+4);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 4;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //click listener for button 5
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+3);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 3;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button button 6
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+3);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 3;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });

        //click listener for button 7
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+2);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 2;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button button 8
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+2);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 2;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });

        //click listener for button 9
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+2);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 2;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button button 10
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+1);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 1;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //click listener for button 3
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore()+0);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 0;
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        //clickListener for button button 4
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore()+0);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                teamS += 0;
                p2score.setText(""+p2.getScore()+"("+ p2.getBallsPlayed() +")");
                teamScore.setText(""+teamS+"/"+wickets);
                overs.setText(""+over+"."+ballc);
            }
        });
        btw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed()+1);
                if(ballc==6) {
                    ballc=0;
                    over++;
                }
                players.add(p1);
                 p1 = new Players(team[teamPointer+1],0,0);
                teamPointer++;
                p1Name.setText(p1.getPlayerName());
                p1score.setText(""+p1.getScore()+"("+ p1.getBallsPlayed() +")");

            }
        });
    }
}

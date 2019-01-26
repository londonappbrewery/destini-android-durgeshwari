package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mIndexVar=1;
    private Button redBtn;
    private Button blueBtn;
    private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        redBtn=(Button)findViewById(R.id.buttonTop);
        blueBtn=(Button)findViewById(R.id.buttonBottom);
        mtext=(TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndexVar==1||mIndexVar==2) {
                    mtext.setText(R.string.T3_Story);
                    redBtn.setText(R.string.T3_Ans1);
                    blueBtn.setText(R.string.T3_Ans2);
                    mIndexVar=3;
                }
                else if(mIndexVar==3){
                    mtext.setText(R.string.T6_End);
                    redBtn.setVisibility(View.GONE);
                    blueBtn.setVisibility(View.GONE);
                }

//mtext.setText(R.string.T6_End);
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndexVar==1) {
                    mtext.setText(R.string.T2_Story);
                    redBtn.setText(R.string.T2_Ans1);
                    blueBtn.setText(R.string.T2_Ans2);
                    mIndexVar=2;
//mtext.setText(R.string.T5_End);
                }else if(mIndexVar==2){
                    mtext.setText(R.string.T4_End);
                    redBtn.setVisibility(View.GONE);
                    blueBtn.setVisibility(View.GONE);
                }
                else if(mIndexVar==3){
                    mtext.setText(R.string.T5_End);
                    redBtn.setVisibility(View.GONE);
                    blueBtn.setVisibility(View.GONE);
                }

            }
        });


    }
}

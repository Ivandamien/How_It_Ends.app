package com.ivandamien.howitends;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView =(TextView)findViewById(R.id.storyTextView);
        mTopButton =(Button)findViewById(R.id.buttonTop);
        mBottomButton =(Button)findViewById(R.id.buttonBottom);





        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex==2){
                    mStoryTextView.setText(R.string.T4_Story);
                    mTopButton.setText(R.string.T4_Ans1);
                    mBottomButton.setText(R.string.T4_Ans2);
                    mStoryIndex = 4;

                }else if(mStoryIndex==3){
                    mStoryTextView.setText(R.string.T12_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==4){
                    mStoryTextView.setText(R.string.T6_Story);
                    mTopButton.setText(R.string.T6_Ans1);
                    mBottomButton.setText(R.string.T6_Ans2);
                    mStoryIndex =6;
                }else if(mStoryIndex==5){
                    mStoryTextView.setText(R.string.T9_Story);
                    mTopButton.setText(R.string.T9_Ans1);
                    mBottomButton.setText(R.string.T9_Ans2);
                    mStoryIndex=8;

                }else if(mStoryIndex ==6){
                    mStoryTextView.setText(R.string.T8_Story);
                    mTopButton.setText(R.string.T8_Ans1);
                    mBottomButton.setText(R.string.T8_Ans2);
                    mStoryIndex=9;
                }else if(mStoryIndex==7){
                    mStoryTextView.setText(R.string.T19_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==8){
                    mStoryTextView.setText(R.string.T13_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else {
                    mStoryTextView.setText(R.string.T10_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                }

            }
        });



        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }else if(mStoryIndex==2){
                    mStoryTextView.setText(R.string.T18_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==3){
                    mStoryTextView.setText(R.string.T5_Story);
                    mTopButton.setText(R.string.T5_Ans1);
                    mBottomButton.setText(R.string.T5_Ans2);
                    mStoryIndex=5;
                }else if(mStoryIndex==4){
                    mStoryTextView.setText(R.string.T17_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==5){
                    mStoryTextView.setText(R.string.T7_Story);
                    mTopButton.setText(R.string.T7_Ans1);
                    mBottomButton.setText(R.string.T7_Ans2);
                    mStoryIndex=7;
                }else if(mStoryIndex==6){
                    mStoryTextView.setText(R.string.T15_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==7){
                    mStoryTextView.setText(R.string.T11_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else if(mStoryIndex==8){
                    mStoryTextView.setText(R.string.T14_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }else {
                    mStoryTextView.setText(R.string.T16_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }

            }
        });

    }
}
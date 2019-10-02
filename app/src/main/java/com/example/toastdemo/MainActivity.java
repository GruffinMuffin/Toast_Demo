package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



        public void clickFunction (View view){
            EditText answerQuestion = (EditText) findViewById(R.id.answerQuestion);
            TextView stop = (TextView) findViewById((R.id.stop));
            TextView askNameTV = (TextView) findViewById(R.id.askName);
            TextView askQuestTV = (TextView) findViewById(R.id.askQuest);
            TextView askColorTV = (TextView) findViewById(R.id.askColor);
            ImageView stopImage = (ImageView) findViewById(R.id.stopImage);
            ImageView yourName = (ImageView) findViewById(R.id.yourName);
            ImageView yourQuest = (ImageView) findViewById(R.id.yourQuest);
            ImageView favoriteColor = (ImageView) findViewById(R.id.favoriteColor);


            if
            (stop.getVisibility() == (View.VISIBLE) && answerQuestion.getText().toString().trim().length() < 1)
            {
                stop.setVisibility(View.VISIBLE);
                Toast.makeText(this, "You must answer me these Questions Three", Toast.LENGTH_SHORT).show();
                stopImage.setVisibility(View.VISIBLE);

            }


            else if (stop.getVisibility() == (View.VISIBLE ) && answerQuestion.getText().toString().trim().length() > 1)
            {
                stop.setVisibility(View.GONE);
                askNameTV.setVisibility(View.VISIBLE);
                stopImage.setVisibility(View.GONE);
                yourName.setVisibility(View.VISIBLE);
            }

            else if (askNameTV.getVisibility() == (View.VISIBLE) && answerQuestion.getText().toString().trim().length() > 1) {
                askNameTV.setVisibility(View.GONE);
                askQuestTV.setVisibility(View.VISIBLE);
                yourName.setVisibility(View.GONE);
                yourQuest.setVisibility(View.VISIBLE);
            }
            else if (askQuestTV.getVisibility() == (View.VISIBLE) && answerQuestion.getText().toString().trim().length() > 1)
            {
                askQuestTV.setVisibility(View.GONE);
                askColorTV.setVisibility(View.VISIBLE);
                yourQuest.setVisibility(View.GONE);
                favoriteColor.setVisibility(View.VISIBLE);
            }
            else if (askColorTV.getVisibility() == (View.VISIBLE) && answerQuestion.getText().toString().trim().length() > 1)
            {
                askColorTV.setVisibility(View.GONE);
                stop.setVisibility(View.VISIBLE);
                stopImage.setVisibility(View.VISIBLE);
                favoriteColor.setVisibility(View.GONE);
                Toast.makeText(this, "Blue. No, wait!", Toast.LENGTH_SHORT).show();
                }
            else{
                stop.setVisibility(View.VISIBLE);
                stopImage.setVisibility(View.VISIBLE);
                askNameTV.setVisibility(View.GONE);
                askQuestTV.setVisibility(View.GONE);
                askColorTV.setVisibility(View.GONE);
                Toast.makeText(this, "You must answer me these Questions Three", Toast.LENGTH_SHORT).show();

            }

            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton closeButton = (ImageButton) findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}

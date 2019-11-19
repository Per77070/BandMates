package com.example.bandmates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void band(View view) {

        Intent bandIntent = new Intent(ChoiceActivity.this,BandActivity.class)  ;
        startActivity(bandIntent);
    }

    public void musician(View view) {

      Intent musicianIntent = new Intent(ChoiceActivity.this,MusicianActivity.class)  ;
   startActivity(musicianIntent);
    }
}

package com.example.bandmates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MusicianActivity extends AppCompatActivity {

    EditText musicStyle = findViewById(R.id.musicalStyle);

    EditText musicInspirations = findViewById(R.id.musicalInspirations);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musician);








    }

    public void guitar(View view) {

String guitarinspirations = musicInspirations.getText().toString();

        String guitarstyle = musicStyle.getText().toString();


        if (TextUtils.isEmpty(guitarinspirations)){

            Toast.makeText(MusicianActivity.this, "What kind of music do you like?", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(guitarstyle)){

            Toast.makeText(MusicianActivity.this, "Please describe yourself as a guitar player.", Toast.LENGTH_SHORT).show();

        }



    }

    public void drums(View view) {
        String drumminginspirations = musicInspirations.getText().toString();
        String drummingstyle = musicStyle.getText().toString();

        if (TextUtils.isEmpty(drumminginspirations)){

            Toast.makeText(MusicianActivity.this, "What kind of music do you like?", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(drummingstyle)){

            Toast.makeText(MusicianActivity.this, "Please describe yourself as a drummer", Toast.LENGTH_SHORT).show();

        }


    }

    public void piano(View view) {
        String pianostyle = musicStyle.getText().toString();
        String pianoinspirations = musicInspirations.getText().toString();
        if (TextUtils.isEmpty(pianoinspirations)){

            Toast.makeText(MusicianActivity.this, "What kind of music do you like?", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(pianostyle)){

            Toast.makeText(MusicianActivity.this, "Please describe yourself as a pianist.", Toast.LENGTH_SHORT).show();

        }
    }

    public void bass(View view) {
        String bassinspirations = musicInspirations.getText().toString();
        String basstyle = musicStyle.getText().toString();

        if (TextUtils.isEmpty(bassinspirations)){

            Toast.makeText(MusicianActivity.this, "What kind of music do you like?", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(basstyle)){

            Toast.makeText(MusicianActivity.this, "Please describe yourself as a bass player.", Toast.LENGTH_SHORT).show();

        }


    }


    public void singer(View view) {
        String singinginspirations = musicInspirations.getText().toString();
        String singingstyle = musicStyle.getText().toString();


        if (TextUtils.isEmpty(singinginspirations)){

            Toast.makeText(MusicianActivity.this, "What kind of music do you like?", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(singingstyle)){

            Toast.makeText(MusicianActivity.this, "Please describe yourself as a singer.", Toast.LENGTH_SHORT).show();

        }

    }
}

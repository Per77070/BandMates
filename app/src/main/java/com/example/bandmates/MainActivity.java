package com.example.bandmates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        mAuth = FirebaseAuth.getInstance();



        Button createProfileButton = (Button) findViewById(R.id.button_register_profile);
        createProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateNewAccount();
            }
        });



    }

    private void CreateNewAccount() {
        EditText userEmail = (EditText) findViewById(R.id.email_register) ;
        EditText userPassword = (EditText) findViewById(R.id.password_register) ;
        String email = userEmail.getText().toString();
        String password = userPassword.getText().toString();

        if (TextUtils.isEmpty(email)){

            Toast.makeText(MainActivity.this, "Please write yor e-mail.", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(password)){

            Toast.makeText(MainActivity.this, "Please write yor password.", Toast.LENGTH_SHORT).show();

        }

        else {

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){

                                Toast.makeText(MainActivity.this,"Account created successfully.",Toast.LENGTH_LONG).show();

                            }

                            else {

                                String message = task.getException().toString();

                                Toast.makeText(MainActivity.this, "Error: "+message, Toast.LENGTH_LONG ).show();



                            }

                        }
                    });

        }

    }

    public void registerProfile(View view) {





    }
}

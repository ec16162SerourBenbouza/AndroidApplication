package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Authentication extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    EditText editTextEmail, editTextPassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //default constructor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        mAuth = FirebaseAuth.getInstance();         //firbase authentication instance

        editTextEmail = findViewById(R.id.editTextEmail);   //edittext connected to interface feature
        editTextPassword = findViewById(R.id.editTextPassword); //edittext connected to interface feature
        progressBar = findViewById(R.id.progressbar);   //progress bar connected to interface feature

        findViewById(R.id.textViewSignup).setOnClickListener(this); //listener declaration
        findViewById(R.id.buttonLogin).setOnClickListener(this);    //listener declaration

    }

    private void userLogin() {  //login function
        String email = editTextEmail.getText().toString().trim();   //email stored as string
        String password = editTextPassword.getText().toString().trim(); //password stored as string

        if (email.isEmpty()) {  //if no email typed
            editTextEmail.setError("Email is required");    //message shown
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) { //if the email is not valid
            editTextEmail.setError("Please enter a valid email");   // message shown
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {   //if no password typed
            editTextPassword.setError("Password is required");  //message shown
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {    //if password too short
            editTextPassword.setError("Minimum length of password should be 6");    //message shown
            editTextPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);    //show the progress of sign up

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {    //checking the database
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {  //login calls mainpageofapp class
                    finish();
                    Intent intent = new Intent(Authentication.this, mainpageofapp.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);  //start new intent mainpageofapp activity
                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();   //otherwise login not successful
                }
            }
        });
    }
    @Override
    public void onClick(View view) {    //function to handle button press
        switch (view.getId()) {     //if user presses sign up
            case R.id.textViewSignup:
                finish();
                startActivity(new Intent(this, SignupActivity.class));  //call signup class
                break;  //end case

            case R.id.buttonLogin:  //otherwise call function userLogin (above)
                userLogin();
                break;  //end case
        }
    }
}
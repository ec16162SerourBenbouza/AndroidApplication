package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
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
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar progressBar;    //declare a progress bar
    EditText editTextEmail, editTextPassword;   //declare two edittext features

    private FirebaseAuth mAuth; //private authentication to ensure its never changed

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //default constructor runs once
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextEmail = findViewById(R.id.editTextEmail);   //initialise edittext
        editTextPassword = findViewById(R.id.editTextPassword); //initialise edittext
        progressBar = findViewById(R.id.progressbar);   //initialise progressbar

        mAuth = FirebaseAuth.getInstance(); //get instance of authentication

        findViewById(R.id.buttonSignUp).setOnClickListener(this);   //declare listner for signup
        findViewById(R.id.textViewLogin).setOnClickListener(this);  //declare listner for login
    }

    private void registerUser() {   //function to register user
        String email = editTextEmail.getText().toString().trim();   //email stored in string variable
        String password = editTextPassword.getText().toString().trim(); //password stored in string variable

        if (email.isEmpty()) {      //if email empty
            editTextEmail.setError("Email is required");    //message shown
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) { //if email not valid
            editTextEmail.setError("Please enter a valid email");//message shown
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {   //if password empty
            editTextPassword.setError("Password is required");//message shown
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {    //if password too short
            editTextPassword.setError("Minimum length of password should be 6");//message shown
            editTextPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);    //to show progress of signup

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {    //creating a new user and storing details function
                progressBar.setVisibility(View.GONE);   //hide progress bar
                if (task.isSuccessful()) {  //if details registered
                    Toast.makeText(getApplicationContext(),"User registered correctly",Toast.LENGTH_SHORT).show();  //message shown as toast
                } else {    //if failed

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {    //already has an account
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show(); //message shown as toast

                    } else {    //any other error
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

    @Override
    public void onClick(View view) {    //if buttons clicked
        switch (view.getId()) {
            case R.id.buttonSignUp: //signup button calls function to register the user
                registerUser();
                break;

            case R.id.textViewLogin:    //login button takes user to class authentication
                finish();
                startActivity(new Intent(this, Authentication.class));
                break;
        }
    }
}
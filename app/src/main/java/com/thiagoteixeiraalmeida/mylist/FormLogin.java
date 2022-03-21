package com.thiagoteixeiraalmeida.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView textSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        startComponents();

        textSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenSignIn();
            }
        });
    }

    private void screenSignIn() {
        Intent intent = new Intent(FormLogin.this, FormSignUp.class);
        startActivity(intent);
    }

    private void startComponents() {
        textSignUp = findViewById(R.id.textSignUp);
    }
}
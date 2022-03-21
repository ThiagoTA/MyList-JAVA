package com.thiagoteixeiraalmeida.mylist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thiagoteixeiraalmeida.mylist.R;

public class FormSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_sign_up);

        getSupportActionBar().hide();
    }
}
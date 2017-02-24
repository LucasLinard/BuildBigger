package com.example.androidjokerlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActiviy extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView joke = (TextView) findViewById(R.id.txt_joke);
        Intent intent = getIntent();
        String txtJoke = intent.getStringExtra("joke");
        joke.setText(txtJoke);

    }


}

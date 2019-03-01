package com.steelfusion.nextstage.rest_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainApp extends AppCompatActivity {

    private String name, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        TextView nameTextView = (TextView) findViewById(R.id.nameText);
        TextView genderTextView = (TextView) findViewById(R.id.nameText);
    }

    




}

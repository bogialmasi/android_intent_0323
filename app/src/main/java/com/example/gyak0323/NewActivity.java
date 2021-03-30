package com.example.gyak0323;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView textview = findViewById(R.id.edit3);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            textview.setText(extras.getString("uzenet1") + " " + extras.getString("uzenet2"));
        }
    }
}
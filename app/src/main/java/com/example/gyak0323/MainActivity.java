package com.example.gyak0323;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        EditText info1 = findViewById(R.id.edit1);
        EditText info2 = findViewById(R.id.edit2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                i.putExtra("uzenet1", info1.getText().toString());
                i.putExtra("uzenet2", info2.getText().toString());
                startActivity(i);
            }
        });
    }
}
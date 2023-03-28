package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.send_button_id); // all list of ids
        e=findViewById(R.id.send_text_id);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e.getText().toString();

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                intent.putExtra("send_text_id",s);
                startActivity(intent);
            }
        });
    }
}
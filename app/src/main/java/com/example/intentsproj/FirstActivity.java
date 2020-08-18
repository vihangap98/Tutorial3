package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final EditText Number1;
        final EditText Number2;

            Number1 = findViewById(R.id.Number1);
            Number2 = findViewById(R.id.Number2);

            Button buttonOpenSecondActivity = findViewById(R.id.ok);
            buttonOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Number1.getText().toString().equals("")
                            || Number2.getText().toString().equals("")) {
                        Toast.makeText(FirstActivity.this, "insert numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        int number1 = Integer.parseInt(Number1.getText().toString());
                        int number2 = Integer.parseInt(Number2.getText().toString());

                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        intent.putExtra("number1", number1);
                        intent.putExtra("number2", number2);
                        startActivityForResult(intent, 1);
                    }

                }
            });
        }}
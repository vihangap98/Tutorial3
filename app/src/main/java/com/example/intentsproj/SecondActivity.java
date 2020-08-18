package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText Number1,Number2;
    Button b1,b2,b3,b4;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextView textViewNumbers = findViewById(R.id.text_View_numbers);
        textViewNumbers.setText("numbers1 "+number1);
        textViewNumbers.setText("numbers2 "+number2);
        b1= this.<Button>findViewById(R.id.b1);
        b2= this.<Button>findViewById(R.id.b2);
        b3= this.<Button>findViewById(R.id.b3);
        b4= this.<Button>findViewById(R.id.b4);
        result = this.<TextView>findViewById(R.id.result);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double x=Double.parseDouble(Number1.getText().toString());
                Double y=Double.parseDouble(Number2.getText().toString());
                Double sum=x+y;
                result.setText(sum.toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double x=Double.parseDouble(Number1.getText().toString());
                Double y=Double.parseDouble(Number2.getText().toString());
                Double sum=x-y;
                result.setText(sum.toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double x=Double.parseDouble(Number1.getText().toString());
                Double y=Double.parseDouble(Number2.getText().toString());
                Double sum=x*y;
                result.setText(sum.toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double x=Double.parseDouble(Number1.getText().toString());
                Double y=Double.parseDouble(Number2.getText().toString());
                Double sum=x/y;
                result.setText(sum.toString());
            }
        });
    }
}
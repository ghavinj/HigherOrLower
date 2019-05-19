package com.ghavinj.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void guessTheNumber(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guess = Integer.parseInt(guessEditText.getText().toString());
        final int random = new Random().nextInt(1) + 19;

        if (guess == random){

            Toast.makeText(this, "You Win, Great Guess", Toast.LENGTH_SHORT).show();
        }else if(guess > random){
            Toast.makeText(this, "Your Getting Colder", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Your Getting Warmer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

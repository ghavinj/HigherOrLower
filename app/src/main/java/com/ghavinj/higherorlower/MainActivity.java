package com.ghavinj.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;

    public void generateRandomNumber(){
        Random rand = new Random();
        random = rand.nextInt(20) + 1;
    }

    public void guessTheNumber(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guess = Integer.parseInt(guessEditText.getText().toString());

        String message;

        if (guess == random){
            message = "You Win, Great Guess, Try Again!";
            generateRandomNumber();
        }else if(guess > random){
            message = "Your Cold";
        }else{
            message = "Your Getting Warmer";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}

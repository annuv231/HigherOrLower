package com.bignerdranch.android.higherorlower;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
          int x;
    public  void guessFunction(View view){
        EditText text=(EditText)findViewById(R.id.guesseditText);
      // EditText usernameEditText = (EditText) findViewById(R.id.guesseditText);
        String sUsername = text.getText().toString();
        if (sUsername.matches("")) {
           // text.setText(null);
            Toast.makeText(this, "You didn't choose Number", Toast.LENGTH_SHORT).show();
            return;
        }
       // String sUsername = text.getText().toString();

       /* if(sUsername.matches("")){
            Toast.makeText(this, "fist Enter a digit there", Toast.LENGTH_SHORT).show();
            return;
        }
        */
        int y=Integer.parseInt(text.getText().toString());
        text.setText(null);   //for resetting the EditText
        if(y>x){
            Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_SHORT).show();
        }
        else if(y<x){
            Toast.makeText(MainActivity.this,"Higher",Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(MainActivity.this,"OMG You are correct",Toast.LENGTH_SHORT).show();
            Random rand=new Random();
            x=rand.nextInt(50)+1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
         x=rand.nextInt(50)+1;//this will give a number between 1 to 50

    }
}

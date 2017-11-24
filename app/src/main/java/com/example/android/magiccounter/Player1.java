package com.example.android.magiccounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Player1 extends AppCompatActivity {
    int health = 20;
    int amount  = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1);
        displayLife(health);

    }

    public void displayLife(int health) {
        TextView Life = (TextView) findViewById(R.id.Life);
        Life.setText(String.valueOf(health));
    }

    public void Increase(View view){
        String check;
        EditText editText;
        editText = (EditText)findViewById(R.id.AmountInput);
        check = editText.getText().toString();
        if (check.contentEquals("Amount")) {
        }else if(check.contentEquals("")){
        }
        else{amount = Integer.parseInt(editText.getText().toString());}
        health = health + amount;
        displayLife(health);
        editText.setHint("Amount");
        editText.getText().clear();
        amount = 1;
    }
    public void Decrease(View view){
        String check;
        EditText editText;
        editText = (EditText)findViewById(R.id.AmountInput);
        check = editText.getText().toString();
        if (check.contentEquals("Amount")) {
        }else if(check.contentEquals("")){
        }else{amount = Integer.parseInt(editText.getText().toString());}
        health = health - amount;
        displayLife(health);
        editText.setHint("Amount");
        editText.getText().clear();
        amount = 1;
    }
    public void namewipe(View view) {
        String check;
        EditText editText;
        editText = (EditText) findViewById(R.id.name);
        check = editText.getText().toString();
        if (check.contentEquals("Name")) {
            editText.getText().clear();
        }
    }
    public void AmountSet(View view){
        String check;
        EditText editText;
        editText = (EditText) findViewById(R.id.AmountInput);
        check = editText.getText().toString();
        if (check.contentEquals("Amount")) {
            editText.getText().clear();
        }


    }
    public void  reset(View view){
        health = 20;
        amount = 1;
        displayLife(health);
        EditText editText;
        editText = (EditText) findViewById(R.id.AmountInput);
        editText.setHint("Amount");
    }



}

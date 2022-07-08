package com.example.cardquizgame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rule extends AppCompatActivity implements View.OnClickListener {

    private Button continueb;
    private TextView rule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);

        rule = (TextView) findViewById(R.id.rules);
        continueb = (Button) findViewById(R.id.continueb);
        continueb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(Rule.this, MQuestion.class);
        startActivity(i);
    }
}
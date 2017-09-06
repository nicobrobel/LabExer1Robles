package com.nico.robles.labexer1robles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText quiz1,quiz2,sw,le,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        quiz1 = (EditText) findViewById(R.id.quiz1);
        quiz2 = (EditText) findViewById(R.id.quiz2);
        sw = (EditText) findViewById(R.id.sw);
        le = (EditText) findViewById(R.id.le);
        me = (EditText) findViewById(R.id.me);


    }
    public void callSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("quiz1", quiz1.getText().toString());
        intent.putExtra("quiz2", quiz2.getText().toString());
        intent.putExtra("sw", sw.getText().toString());
        intent.putExtra("le", le.getText().toString());
        intent.putExtra("me", me.getText().toString());
        startActivity(intent);
    }
}

package com.nico.robles.labexer1robles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView fg,ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fg = (TextView) findViewById(R.id.fg);
        ra = (TextView) findViewById(R.id.ra);

        int quiz1 = Integer.parseInt(getIntent().getStringExtra("quiz1"));
        int quiz2 = Integer.parseInt(getIntent().getStringExtra("quiz2"));
        int sw = Integer.parseInt(getIntent().getStringExtra("sw"));
        int le = Integer.parseInt(getIntent().getStringExtra("le"));
        int me = Integer.parseInt(getIntent().getStringExtra("me"));

        double raw = ((quiz1 * .10) + (quiz2 * .10) + (sw * .10) + (le * .40) + (me * .30));
        fg.setText("Your RA is" + raw);

        if (raw < 60){
            ra.setText("Your Final grade is FAILED");
        }
        else if (raw < 65){
            ra.setText("Your Final grade is 3.0");
        }
        else if (raw < 70){
            ra.setText("Your Final grade is 2.75");
        }
        else if (raw < 75){
            ra.setText("Your Final grade is 2.5");
        }
        else if (raw < 80){
            ra.setText("Your Final grade is 2.25");
        }
        else if (raw < 85){
            ra.setText("Your Final grade is 2.0");
        }
        else if (raw < 90){
            ra.setText("Your Final grade is 1.75");
        }
        else if (raw < 92){
            ra.setText("Your Final grade is 1.5");
        }
        else if (raw < 94){
            ra.setText("Your Final grade is 1.25");
        }
        else if (raw < 96){
            ra.setText("Your Final grade is 1.0");
        }

    }

    public void callFirstActivity(View view) {
        Intent intent = new Intent(this,FirstActivity.class);
        startActivity(intent);

    }
}

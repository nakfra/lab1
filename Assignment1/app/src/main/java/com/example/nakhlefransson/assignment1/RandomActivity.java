package com.example.nakhlefransson.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Random;


public class RandomActivity extends Activity implements View.OnClickListener{

    Button btnRandom;
    TextView randomTv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        btnRandom = (Button)findViewById(R.id.btnRandom);
        btnRandom.setOnClickListener(this);


        randomTv = (TextView)findViewById(R.id.randomTv);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.random, menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnRandom){
            Random randomGenerator = new Random();

             Double randomInt = randomGenerator.nextDouble()*100;
            DecimalFormat df = new DecimalFormat("#.##");
            randomTv.setText(df.format(randomInt));

        }
    }
}

package com.example.nakhlefransson.assignment1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class ChangeBakgroundColorActivity extends Activity implements View.OnClickListener {

    LinearLayout myLayout;
    // skapar knapparna
    Button btnRed;
    Button btnBlue;
    Button btnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background_color);
        myLayout = (LinearLayout)findViewById(R.id.myLayout);

        // Hämtar knappar sätt onClick
        btnRed = (Button)findViewById(R.id.btnRed);
        btnRed.setOnClickListener(this);

        btnBlue = (Button)findViewById(R.id.btnBlue);
        btnBlue.setOnClickListener(this);

        btnGreen = (Button)findViewById(R.id.btnGreen);
        btnGreen.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.change_bakground_color, menu);

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

    public void onClick(View view) {
        if(view.getId() == R.id.btnRed){
            myLayout.setBackgroundColor(Color.RED);

        }
        else if(view.getId() == R.id.btnBlue){

            myLayout.setBackgroundColor(Color.BLUE);
        }
        else if(view.getId() == R.id.btnGreen){
            myLayout.setBackgroundColor(Color.GREEN);

        }

    }
}

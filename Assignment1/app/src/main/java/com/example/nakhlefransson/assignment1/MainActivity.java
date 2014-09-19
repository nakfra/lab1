package com.example.nakhlefransson.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Hämtar hela layouten i activity_main
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Ökar menyn;  Detta lägger till objekt i action bar fältet om den finns..
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_addContact) {
            Intent contact = new Intent(this,ContactActivity.class); //skapat ett nytt aktivitet som hämtar klassen ContactActivity
            contact.putExtra("name", "Naksan");
            startActivity(contact); //Startar aktiviteten
            return true;
        }
        else if (id == R.id.action_changeBackgroundColor) {
            Intent changeBackgroundActivity = new Intent(this, ChangeBakgroundColorActivity.class); //skapat ett nytt aktivitet som hämtar klassen ContactActivity
            startActivity(changeBackgroundActivity); //Startar aktiviteten
            return true;

            
        }
        else if(id == R.id.action_random) {
            Intent randomActivity = new Intent(this,RandomActivity.class);
            startActivity(randomActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

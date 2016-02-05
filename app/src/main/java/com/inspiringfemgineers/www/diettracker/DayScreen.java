package com.inspiringfemgineers.www.diettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DayScreen extends AppCompatActivity {

    private Day day;
    public final static String EXTRA_MESSAGE = "mealtype";
    TextView dayfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_screen);
        String message = intent.getStringExtra(MainActivity.DATE_MESSAGE);
        dayfield = (TextView) this.findViewById(R.id.title);
        dayfield.setText(message);

    }
    public void sendMessageBreakfast(View view) {
        Intent intent = new Intent(this, MealScreen.class);
        int message = 0;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void sendMessageLunch(View view) {
        Intent intent = new Intent(this, MealScreen.class);
        int message = 1;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void sendMessageDinner(View view) {
        Intent intent = new Intent(this, MealScreen.class);
        int message = 2;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_day_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

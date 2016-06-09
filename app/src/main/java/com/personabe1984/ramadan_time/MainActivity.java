package com.personabe1984.ramadan_time;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

/**
 * TODO: Display the current time
 */

public class MainActivity extends AppCompatActivity {

    TextView testing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        String temp = c.getDisplayName(Calendar.MONTH,Calendar.LONG, Locale.US);

        testing = (TextView) findViewById(R.id.tempTextView);
        testing.setText(temp);



    }
}

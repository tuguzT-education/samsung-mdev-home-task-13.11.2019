package com.example.fghjhgfk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRRRRRRR", "onCreate()");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.e("RRRRRRRRRRRRRRR", "onPause()");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.e("RRRRRRRRRRR", "onDestroy()");
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.e("RRRRRRRRRRR", "onStart()");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.e("RRRRRRRRRRR", "onStop()");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.e("RRRRRRRRRRR", "onResume()");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.e("RRRRRRRRRRR", "onRestart()");
    }

    public void getAnswer (View view) {
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.autoCompleteTextView)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.autoCompleteTextView2)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.autoCompleteTextView3)).getText().toString());
        TextView result = (TextView) findViewById(R.id.textView4);
        double d = b*b - 4*a*c;

        if (d > 0) {
            result.setText("Корни: " + String.valueOf(((-b - Math.sqrt(d)) / (2*a)) ) + "; " + String.valueOf(((-b + Math.sqrt(d)) / (2*a)) ));
        } else if (d == 0) {
            result.setText("Корень: " + String.valueOf( (-b / (2 * a)) ) );
        } else result.setText("Решения уравнения с данными параметрами не существует!");
    }
}

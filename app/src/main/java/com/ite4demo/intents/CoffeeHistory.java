package com.ite4demo.intents;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeeHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String menuName;
        Bundle extras = getIntent().getExtras();
        menuName = extras.getString("menuName");

        setContentView(R.layout.activity_coffee_history);

        Toast.makeText(this,  menuName + " selected", Toast.LENGTH_LONG).show();


        TextView tv = (TextView) findViewById(R.id.textView);


        tv.setText(menuName);


    }
}

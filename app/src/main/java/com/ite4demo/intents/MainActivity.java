package com.ite4demo.intents;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        /*
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        */
        String[] values = new String[] { "Coffee History","Coffee Recipes","Did You know?"};
        // Use your own layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.rowlayout, R.id.label, values);
        setListAdapter(adapter);
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        //Toast.makeText(this, item + position + " selected", Toast.LENGTH_LONG).show();
        Intent intent;
        switch (position) {

            case 0:
                intent = new Intent(MainActivity.this, CoffeeHistory.class);
                intent.putExtra("menuName", item);
                startActivityForResult(intent, 1);
                Toast.makeText(this, item + " " + position + " selected", Toast.LENGTH_LONG).show();
                break;
            case 1:

                Toast.makeText(this, item + position + " selected", Toast.LENGTH_LONG).show();
                break;
            case 2:

                Toast.makeText(this, item + position + " selected", Toast.LENGTH_LONG).show();
                break;

        }


    }
}

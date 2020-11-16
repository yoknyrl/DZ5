package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity{

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.d("стр", String.valueOf(position));
        TextView tv = (TextView) v;
        String textFromTV = tv.getText().toString();
        Toast.makeText(getApplicationContext(), "Вы выбрали " +
                textFromTV, Toast.LENGTH_SHORT).show();
        switch(position)
        {
            case 0:
                Intent int0 = new Intent(MainActivity.this, Argentina.class);
                startActivity(int0);
                break;

            case 1:
                Intent int1 = new Intent(MainActivity.this, Brazil.class);
                startActivity(int1);
                break;

            case 2:
                Intent int2 = new Intent(MainActivity.this, Chili.class);
                startActivity(int2);
                break;

            case 3:
                Intent int3 = new Intent(MainActivity.this, Columbiya.class);
                startActivity(int3);
                break;
        }
    }

    String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);

        setListAdapter(mAdapter);

    }
}
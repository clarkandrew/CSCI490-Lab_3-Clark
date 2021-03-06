package com.example.andrewclark.csci490_lab_3_clark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ListView classSched = findViewById(R.id.class_schedule);


        String[] classes = getResources().getStringArray(R.array.classes);

        ArrayAdapter<String> arrAdapt =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);

        classSched.setAdapter(arrAdapt);


        classSched.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();

            }
        });

        classSched.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), getString(R.string.longclick) + item, Toast.LENGTH_LONG).show();
                return false;
            }
        });




    }



}

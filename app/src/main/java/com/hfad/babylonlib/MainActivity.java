package com.hfad.babylonlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView_functions);
        String[] functions=getResources().getStringArray(R.array.functions);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, R.layout.functions_list_item, functions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(MainActivity.this, BookActivity.class));
                }
                if (position==1){
                    startActivity(new Intent(MainActivity.this, AuthorActivity.class));
                }
                if (position==2){
                    startActivity(new Intent(MainActivity.this, GenreActivity.class));
                }
            }
        });
    }
}
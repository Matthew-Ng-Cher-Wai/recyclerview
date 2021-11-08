package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.Rview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        model.getPersons().observe(this, persons -> {
            // update UI
            // set up the RecyclerView
            adapter = new MyRecyclerViewAdapter(this, persons);
            adapter.setClickListener((view, position) -> {
                Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            });
            recyclerView.setAdapter(adapter);
        });


    }

}
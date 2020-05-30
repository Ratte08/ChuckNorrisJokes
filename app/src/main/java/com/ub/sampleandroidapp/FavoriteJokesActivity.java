package com.ub.sampleandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FavoriteJokesActivity extends AppCompatActivity {
    JokesRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_jokes);
        setSupportActionBar((Toolbar) findViewById(R.id.tb_toolbar_favorite));
        RecyclerView recyclerView = findViewById(R.id.rv_favorite_jokes);
        //TODO: Инициализировать адаптер
        recyclerView.setAdapter(adapter);
    }
}
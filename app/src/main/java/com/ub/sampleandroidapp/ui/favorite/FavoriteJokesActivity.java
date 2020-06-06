package com.ub.sampleandroidapp.ui.favorite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ub.sampleandroidapp.R;

public class FavoriteJokesActivity extends AppCompatActivity {
    private JokesRecViewAdapter adapter;

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
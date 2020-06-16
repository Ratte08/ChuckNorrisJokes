package com.ub.sampleandroidapp.ui.favorite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.ub.sampleandroidapp.R;
import com.ub.sampleandroidapp.utils.api.Joke;

public class FavoriteJokesActivity extends AppCompatActivity {
    private JokesRecViewAdapter adapter = new JokesRecViewAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_jokes);
        setSupportActionBar((Toolbar) findViewById(R.id.tb_toolbar_favorite));

        RecyclerView recyclerView = findViewById(R.id.rv_favorite_jokes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new SwipeToDeleteCallback(adapter));
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }
}
package com.ub.sampleandroidapp.ui.favorite;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ub.sampleandroidapp.App;
import com.ub.sampleandroidapp.utils.api.Joke;
import com.ub.sampleandroidapp.R;

import java.util.ArrayList;

class JokesRecViewAdapter extends RecyclerView.Adapter<JokesRecViewAdapter.JokeViewHolder> {

    public ArrayList<Joke> jokes = new ArrayList<>(App.getInstance().getJokeDao().getAll());


    @NonNull
    @Override
    public JokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_text_view, parent, false);
        return new JokeViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull JokeViewHolder holder, int position) {
        TextView textView = holder.textView;
        textView.setText(jokes.get(position).getJoke());
    }

    @Override
    public int getItemCount() {
        return jokes.size();
    }

    public class JokeViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public JokeViewHolder(@NonNull TextView v) {
            super(v);
            textView = v;
        }
    }
}

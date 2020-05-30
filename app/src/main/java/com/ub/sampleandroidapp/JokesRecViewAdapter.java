package com.ub.sampleandroidapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class JokesRecViewAdapter extends RecyclerView.Adapter<JokesRecViewAdapter.JokeViewHolder> {

    @NonNull
    @Override
    public JokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_text_view, parent, false);
        return new JokeViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull JokeViewHolder holder, int position) {
        TextView textView = holder.textView;
        //TODO: реализовать метод, возвращающий текст по id шутки из БД и вставить текст в кач-ве аргумента setText
        textView.setText("placeholder");
    }

    @Override
    public int getItemCount() {
        //TODO: После появления базы данных спрашивать у неё кол-во записей
        return 0;
    }

    public class JokeViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public JokeViewHolder(@NonNull TextView v) {
            super(v);
            textView = v;
        }
    }
}

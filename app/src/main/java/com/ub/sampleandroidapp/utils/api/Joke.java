package com.ub.sampleandroidapp.utils.api;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "favourite_jokes")
public class Joke {

    @PrimaryKey
    private int id;
    private String joke;

    @Ignore
    public Joke(int id, String joke) {
        this.id = id;
        this.joke = joke;
    }

    public Joke() {
    }

    public int getId() {
        return id;
    }

    public String getJoke() {
        return joke;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
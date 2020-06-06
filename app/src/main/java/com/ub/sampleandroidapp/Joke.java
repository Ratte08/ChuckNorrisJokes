package com.ub.sampleandroidapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Joke {

    @PrimaryKey
    private int id;
    private String joke;

    public Joke(int id, String joke) {
        this.id = id;
        this.joke = joke;
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
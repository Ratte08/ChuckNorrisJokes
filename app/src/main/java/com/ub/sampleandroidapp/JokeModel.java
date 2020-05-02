package com.ub.sampleandroidapp;

public class JokeModel {
    private int id;
    private String joke;

    public JokeModel(int id, String joke) {
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
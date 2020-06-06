package com.ub.sampleandroidapp.utils.api;

import com.ub.sampleandroidapp.utils.api.Joke;

import java.util.List;

public class RandomJokesResp {
    private String type;
    private List<Joke> value;

    public RandomJokesResp(String type, List<Joke> value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Joke> getValue() {
        return value;
    }

    public void setValue(List<Joke> value) {
        this.value = value;
    }
}

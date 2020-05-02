package com.ub.sampleandroidapp;

import java.util.List;

public class RandomJokesResp {
    private String type;
    private List<JokeModel> value;

    public RandomJokesResp(String type, List<JokeModel> value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JokeModel> getValue() {
        return value;
    }

    public void setValue(List<JokeModel> value) {
        this.value = value;
    }
}

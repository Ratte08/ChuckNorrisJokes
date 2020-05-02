package com.ub.sampleandroidapp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface Api {
    @GET("/jokes/random/2")
    public Call<RandomJokesResp> loadRandomJokes();
}

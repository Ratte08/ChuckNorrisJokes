package com.ub.sampleandroidapp.ui.interfaces;

import com.ub.sampleandroidapp.utils.api.RandomJokesResp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/jokes/random/2")
    Call<RandomJokesResp> loadRandomJokes();
}

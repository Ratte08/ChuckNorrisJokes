package com.ub.sampleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button randomJokeButton;

    private OkHttpClient client = new OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .build();

    private Api api = new Retrofit.Builder()
        .client(client)
        .baseUrl("https://api.icndb.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(Api.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Picasso.get()
            .load(getString(R.string.image_url))
            .into((ImageView) findViewById(R.id.iv_image));

        randomJokeButton = findViewById(R.id.b_get_joke);
        randomJokeButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_get_joke:
                loadRandomJokeAndDisplay();
                randomJokeButton.setEnabled(false);
                break;
        }
    }

    private void loadRandomJokeAndDisplay() {
        api.loadRandomJokes().enqueue(new Callback<RandomJokesResp>() {
            @Override
            public void onResponse(Call<RandomJokesResp> call, Response<RandomJokesResp> response) {
                String res = response.body().getValue().get(0).getJoke();
                TextView text = findViewById(R.id.tv_hello);
                text.setText(res);
                randomJokeButton.setEnabled(true);
            }

            @Override
            public void onFailure(Call<RandomJokesResp> call, Throwable throwable) {
                System.out.println(throwable.getMessage());
                randomJokeButton.setEnabled(true);
            }
        });
    }
}

package com.ub.sampleandroidapp;

import android.app.Application;

import androidx.room.Room;

import com.ub.sampleandroidapp.utils.database.JokeDao;
import com.ub.sampleandroidapp.utils.database.JokesDatabase;

public class App extends Application {

    private JokesDatabase database;
    private JokeDao jokeDao;

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        database = Room.databaseBuilder(getApplicationContext(),
                JokesDatabase.class, "app-db-jokes")
                .allowMainThreadQueries()
                .build();

        jokeDao = database.jokeDao();


    }

    public JokesDatabase getDatabase() {
        return database;
    }

    public void setDatabase(JokesDatabase database) {
        this.database = database;
    }

    public JokeDao getJokeDao() {
        return jokeDao;
    }

    public void setJokeDao(JokeDao jokeDao) {
        this.jokeDao = jokeDao;
    }
}

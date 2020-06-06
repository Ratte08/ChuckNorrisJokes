package com.ub.sampleandroidapp.utils.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.ub.sampleandroidapp.utils.api.Joke;

@Database(entities = {Joke.class}, version = 1)
public abstract class JokesDatabase extends RoomDatabase {
    public abstract JokeDao jokeDao();
}

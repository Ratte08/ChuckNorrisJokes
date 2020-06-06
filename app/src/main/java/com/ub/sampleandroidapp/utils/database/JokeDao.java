package com.ub.sampleandroidapp.utils.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.ub.sampleandroidapp.utils.api.Joke;

import java.util.List;

@Dao
public interface JokeDao {
    @Query("SELECT * FROM favourite_jokes")
    List<Joke> getAll();

    @Query("SELECT * FROM favourite_jokes WHERE id = :id")
    Joke getById(int id);

    @Insert
    void insert(Joke joke);

    @Update
    void update(Joke joke);

    @Delete
    void delete(Joke joke);
}

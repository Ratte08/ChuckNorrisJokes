package com.ub.sampleandroidapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface JokeDao {
    @Query("SELECT * FROM joke")
    List<Joke> getAll();

    @Query("SELECT * FROM joke WHERE id = :id")
    Joke getById(int id);

    @Insert
    void insert(Joke joke);

    @Update
    void update(Joke joke);

    @Delete
    void delete(Joke joke);
}

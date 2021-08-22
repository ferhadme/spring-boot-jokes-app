package com.ferhad.jokesapp.services;

import com.ferhad.jokesapp.model.Joke;

import java.util.List;

public interface JokeService {
    List<Joke> getJokes(int numberOfJokes);
}

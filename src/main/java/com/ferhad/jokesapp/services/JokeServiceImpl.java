package com.ferhad.jokesapp.services;

import com.ferhad.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public List<Joke> getJokes(int numberOfJokes) {
        List<Joke> jokes = new ArrayList<>();
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        for (int i = 0; i < numberOfJokes; i++) {
            jokes.add(new Joke(chuckNorrisQuotes.getRandomQuote()));
        }
        return jokes;
    }
}

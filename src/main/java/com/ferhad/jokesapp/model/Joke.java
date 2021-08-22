package com.ferhad.jokesapp.model;

public class Joke {
    private String jokeContext;

    public Joke(String jokeContext) {
        this.jokeContext = jokeContext;
    }

    public String getJokeContext() {
        return jokeContext;
    }

    public void setJokeContext(String jokeContext) {
        this.jokeContext = jokeContext;
    }
}

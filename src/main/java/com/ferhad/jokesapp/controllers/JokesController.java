package com.ferhad.jokesapp.controllers;

import com.ferhad.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JokesController {

    @GetMapping("/jokes")
    public String getJokes(Model model) {
        List<Joke> jokes = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ChuckNorrisQuotes c = new ChuckNorrisQuotes();
            String quote = c.getRandomQuote();
            Joke joke = new Joke(quote);
            jokes.add(joke);
        }
        model.addAttribute("jokes", jokes);
        return "jokes/jokes";
    }
}

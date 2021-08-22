package com.ferhad.jokesapp.controllers;

import com.ferhad.jokesapp.model.Joke;
import com.ferhad.jokesapp.services.JokeService;
import com.ferhad.jokesapp.services.JokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/jokes")
    public String getJokes(Model model) {
        model.addAttribute("jokes", jokeService.getJokes(20));
        return "jokes/jokes";
    }
}

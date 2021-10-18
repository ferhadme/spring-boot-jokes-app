package com.ferhad.jokesapp.controllers;

import com.ferhad.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/jokes")
    public String getJokes(Model model, @RequestParam(value = "n", defaultValue = "20") int n) {
        model.addAttribute("jokes", jokeService.getJokes(n));
        return "jokes/jokes";
    }
}

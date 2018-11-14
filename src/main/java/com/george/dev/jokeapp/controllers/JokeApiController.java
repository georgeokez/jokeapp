package com.george.dev.jokeapp.controllers;

import com.george.dev.jokeapp.services.JokeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by George on 14/11/2018
 */

@RestController
@RequestMapping("/api/v1/")
public class JokeApiController {

    private JokeService jokeService;

    public JokeApiController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping(value="/joke")
    public Map getJoke(){
        return Collections.singletonMap("joke", jokeService.getJoke());
    }
}

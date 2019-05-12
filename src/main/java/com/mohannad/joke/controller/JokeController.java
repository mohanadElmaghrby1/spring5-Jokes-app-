package com.mohannad.joke.controller;

import com.mohannad.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping("/")
    public  String getRandomJoke(Model model){
        //joke here is a tag
        model.addAttribute("joke" , jokeService.getRandomJoke());

        //return name of view (html)
        return "joke";
    }
}

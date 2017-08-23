package edu.berliner.fizzbuzzwithsplash.controllers;


import edu.berliner.fizzbuzzwithsplash.models.Fizzbuzz;
import edu.berliner.fizzbuzzwithsplash.models.Scores;
import edu.berliner.fizzbuzzwithsplash.repositories.scoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MainController
{
    @Autowired
    scoreRepo repo;

    @GetMapping("/")
    public String index()
    {
        return "home";
    }

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @GetMapping("/main")
    public String mainProgram(Model model)
    {
        model.addAttribute("score", new Scores());
        return "main";
    }

    @PostMapping("/main")
    public String showOutput(@ModelAttribute("score") Scores score, Model model)
    {
        Fizzbuzz doFizz = new Fizzbuzz();
        ArrayList<String> thisList = doFizz.fizzBuzzCopyCat(score.getNumberSelected());
        model.addAttribute("thisList",thisList);
        //repo.save(score);
        return "showoutput";
    }
}

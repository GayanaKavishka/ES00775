package com.controller.SimpleAPI.controller;

import com.controller.SimpleAPI.services.EnglishMessageService;
import com.controller.SimpleAPI.services.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    EnglishMessageService englishservice;
    MathService mathService;

    public HomeController(EnglishMessageService englishservice,MathService mathService){
        this.englishservice = englishservice;
        this.mathService = mathService;
    }

    @GetMapping("/welcome")
     public String welcome(){
        return this.englishservice.welcome();
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return this.englishservice.greet(name);
    }

    @GetMapping("/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b
    ){
        return this.mathService.add(a,b);
    }

    @GetMapping("/sub")
    public int sub(
            @RequestParam int a,
            @RequestParam int b
    ){
        return this.mathService.sub(a,b);
    }

    @GetMapping("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b
    ){
        return this.mathService.multiply(a,b);
    }


}



package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo2.service.SampleService;

import java.util.Random;

@Controller
public class SampleController {
    private final SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService = sampleService;
    }

    @GetMapping("/result")
    public String sample(Model model){
        String result = sampleService.getFortune();
        model.addAttribute("result", result);

        return "sample";
    }

    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    //あああ
    //いいい
    
}

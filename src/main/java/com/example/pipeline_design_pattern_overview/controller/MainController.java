package com.example.pipeline_design_pattern_overview.controller;

import com.example.pipeline_design_pattern_overview.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping
    public char[]  applyPipeline() throws Exception {
        String input = "ab-(8)$9_UP+_F";
        System.out.println("Input is:"+input);
        return mainService.invokePipeline(input);

    }
}

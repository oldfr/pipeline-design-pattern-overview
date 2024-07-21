package com.example.pipeline_design_pattern_overview.controller;

import com.example.pipeline_design_pattern_overview.service.MainService;
import com.example.pipeline_design_pattern_overview.service.PipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping
    public char[]  applyPipeline() throws Exception {
//        HashMap<String,Object> inpMap = new HashMap<>();
        String input = "ab-(8)$9_UP+_F";
        System.out.println("Input is:"+input);
        return mainService.invokePipeline(input);

    }
}

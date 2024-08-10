package com.example.pipeline_design_pattern_overview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    PipelineService pipelineService;


    public char[] invokePipeline(String input) {
        char[] output = pipelineService.execute(input);
        return output;
    }
}

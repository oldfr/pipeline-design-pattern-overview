package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveNumbers;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveSpecialChars;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveUnderScore;
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

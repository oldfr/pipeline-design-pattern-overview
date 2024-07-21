package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveNumbers;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveSpecialChars;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveUnderScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainService {

    @Autowired
    PipelineService pipelineService;


    public Map<String, Object> invokePipeline(Map<String, Object> input) throws Exception {
        boolean pipelineCreated = pipelineService
                .addHandler(new RemoveUnderScore())
                .addHandler(new RemoveSpecialChars())
                .addHandler(new RemoveNumbers())
                .complete();

        if (!pipelineCreated) {
            throw new Exception("Error creating pipeline");
        }
        Map<String, Object> output = pipelineService.execute(input);
        return output;
    }
}

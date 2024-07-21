package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PipelineService {

    private static List<BaseFunction<String, String>> handlers = new ArrayList<>();
    public PipelineService addHandler(BaseFunction<String,String> handler) {
        handlers.add(handler);
        return this;
    }

    public Boolean complete() {
        return true;
    }

    public String execute(String input) {

        String interResult = input;
        for(int handler = 0; handler < handlers.size(); handler++) {
            interResult = handlers.get(handler).apply(interResult);
        }
        return interResult;
    }

}

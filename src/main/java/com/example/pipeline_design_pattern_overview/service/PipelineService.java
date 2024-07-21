package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PipelineService {

    private static List<BaseFunction<String, Object>> handlers = new ArrayList<>();
    public PipelineService addHandler(BaseFunction<String,Object> handler) {
        handlers.add(handler);
        return this;
    }

    public Boolean complete() {
        return true;
    }

    public char[] execute(String input) {

        var interResult = (Object)input;
        for(int handler = 0; handler < handlers.size(); handler++) {
            interResult = handlers.get(handler).apply((String) interResult);
        }
        return (char[]) interResult;
    }

}

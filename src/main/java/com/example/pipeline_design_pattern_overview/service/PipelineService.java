package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.model.PipelineCreator;
import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PipelineService {

    @Autowired
    PipelineCreator pipelineCreator;

    public char[] execute(String input) {
        List<BaseFunction<String, Object>> handlers = pipelineCreator.getHandlers();

        var interResult = (Object)input;
        for(int handler = 0; handler < handlers.size(); handler++) {
            interResult = handlers.get(handler).apply((String) interResult);
        }
        return (char[]) interResult;
    }

}

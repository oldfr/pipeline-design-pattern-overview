package com.example.pipeline_design_pattern_overview.model;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PipelineCreator {

    private static List<BaseFunction<String, Object>> handlers = new ArrayList<>();

    public PipelineCreator addHandler(BaseFunction<String, Object> handler) {
        handlers.add(handler);
        return this;
    }

    public List<BaseFunction<String, Object>> getHandlers() {
        return handlers;
    }
}

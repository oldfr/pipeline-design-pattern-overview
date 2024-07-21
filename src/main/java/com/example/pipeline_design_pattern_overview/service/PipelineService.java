package com.example.pipeline_design_pattern_overview.service;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PipelineService {

    private static List<BaseFunction<Map<String,Object>,Map<String, Object>>> handlers = new ArrayList<>();
    public PipelineService addHandler(BaseFunction<Map<String,Object>,Map<String, Object>> handler) {
        handlers.add(handler);
        return this;
    }

    public Boolean complete() {
        return true;
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> execute(Map<String, Object> inputMap) {
                handlers.stream()
                .forEach(f -> {
                    Map<String, Object> interResult = (Map<String, Object>) f.apply(inputMap);
                    inputMap.putAll(interResult);
                });
                return inputMap;
    }

}

package com.example.pipeline_design_pattern_overview.pipeline.impl;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;

import java.util.Map;
import java.util.stream.Collectors;

public class RemoveSpecialChars implements BaseFunction<Map<String,Object>, Map<String,Object>> {

    @Override
    public String getFunctionName() {
        return "RemoveSpecialChars";
    }

    @Override
    public Map<String, Object> apply(Map<String, Object> input) {
        System.out.println("removing special chars from :"+input);
        Map<String,Object>  output = input.entrySet().stream()
                .map(m -> {
                   String res =  ((String) m.getValue()).replaceAll("[^a-zA-Z0-9]", "");
                    m.setValue(res);
                            return m;
                })
                .collect(Collectors.toMap(k -> k.getKey(), v->v.getValue()));

        System.out.println("after removing special chars:"+output);
        return output;
    }
}

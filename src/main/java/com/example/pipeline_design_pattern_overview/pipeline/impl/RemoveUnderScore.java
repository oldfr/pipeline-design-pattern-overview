package com.example.pipeline_design_pattern_overview.pipeline.impl;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;

import java.util.Map;
import java.util.stream.Collectors;

public class RemoveUnderScore implements BaseFunction<Map<String,Object>, Map<String,Object>> {

    @Override
    public String getFunctionName() {
        return "RemoveSpecialChars";
    }

    @Override
    public Map<String, Object> apply(Map<String, Object> input) {
        System.out.println("removing underscores from :"+input);
//        return input.entrySet().stream().map(m -> ((String)m.getValue()).replaceAll("[_]","")).collect(Collectors.toMap(k -> k, v->v));
        Map<String, Object> output =  input.entrySet().stream()
                .map(m -> {
                    String res = ((String) m.getValue()).replaceAll("[_]", "");
                    m.setValue(res);
                    return m;
                })
                .collect(Collectors.toMap(k -> k.getKey(), v->v.getValue()));

        System.out.println("after removing underscores:"+output);
        return output;
    }
}

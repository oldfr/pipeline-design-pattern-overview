package com.example.pipeline_design_pattern_overview.pipeline.impl;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;

public class RemoveSpecialChars implements BaseFunction<String, String> {

    @Override
    public String getFunctionName() {
        return "RemoveSpecialChars";
    }

    @Override
    public String apply(String input) {
        System.out.println("removing special chars from :"+input);
        String output = input.replaceAll("[^a-zA-Z0-9]","");

        System.out.println("after removing special chars:"+output);
        return output;
    }
}

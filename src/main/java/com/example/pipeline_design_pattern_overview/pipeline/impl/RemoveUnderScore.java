package com.example.pipeline_design_pattern_overview.pipeline.impl;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;

public class RemoveUnderScore implements BaseFunction<String, String> {

    @Override
    public String getFunctionName() {
        return "RemoveSpecialChars";
    }

    @Override
    public String apply(String input) {
        System.out.println("removing underscores from :"+input);
        String output = input.replaceAll("[_]","");

        System.out.println("after removing underscores:"+output);
        return output;
    }
}

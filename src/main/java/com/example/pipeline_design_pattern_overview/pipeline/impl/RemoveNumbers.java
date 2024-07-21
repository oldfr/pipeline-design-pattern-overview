package com.example.pipeline_design_pattern_overview.pipeline.impl;

import com.example.pipeline_design_pattern_overview.pipeline.BaseFunction;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveNumbers implements BaseFunction<String, Object> {


    @Override
    public String getFunctionName() {
        return "RemoveNumbers";
    }

    @Override
    public Object apply(String input) {
        System.out.println("removing numbers from :"+input);

        String output = input.replaceAll("[^A-Za-z]","");

        System.out.println("after removing numbers:"+output);
        return output.toCharArray();
    }
}

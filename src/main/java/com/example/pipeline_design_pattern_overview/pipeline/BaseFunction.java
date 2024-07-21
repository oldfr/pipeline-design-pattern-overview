package com.example.pipeline_design_pattern_overview.pipeline;

public interface BaseFunction<I,O> {

    public String getFunctionName();
    public O apply(I input);
}

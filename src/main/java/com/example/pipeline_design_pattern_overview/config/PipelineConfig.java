package com.example.pipeline_design_pattern_overview.config;

import com.example.pipeline_design_pattern_overview.model.PipelineCreator;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveNumbers;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveSpecialChars;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveUnderScore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PipelineConfig {

    @Bean("PipelineStages")
    public PipelineCreator getPipeline() {
        return new PipelineCreator()
                .addHandler(new RemoveUnderScore())
                .addHandler(new RemoveSpecialChars())
                .addHandler(new RemoveNumbers());
    }
}

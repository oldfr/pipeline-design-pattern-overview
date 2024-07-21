package com.example.pipeline_design_pattern_overview.model;

import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveNumbers;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveSpecialChars;
import com.example.pipeline_design_pattern_overview.pipeline.impl.RemoveUnderScore;

public class Pipeline {

    RemoveNumbers removeNumbers;

    RemoveUnderScore removeUnderScore;

    RemoveSpecialChars removeSpecialChars;


    public Pipeline(RemoveNumbers removeNumbers, RemoveUnderScore removeUnderScore, RemoveSpecialChars removeSpecialChars) {
        this.removeNumbers = removeNumbers;
        this.removeUnderScore = removeUnderScore;
        this.removeSpecialChars = removeSpecialChars;
    }

    public RemoveNumbers getRemoveNumbers() {
        return removeNumbers;
    }

    public void setRemoveNumbers(RemoveNumbers removeNumbers) {
        this.removeNumbers = removeNumbers;
    }

    public RemoveUnderScore getRemoveUnderScore() {
        return removeUnderScore;
    }

    public void setRemoveUnderScore(RemoveUnderScore removeUnderScore) {
        this.removeUnderScore = removeUnderScore;
    }

    public RemoveSpecialChars getRemoveSpecialChars() {
        return removeSpecialChars;
    }

    public void setRemoveSpecialChars(RemoveSpecialChars removeSpecialChars) {
        this.removeSpecialChars = removeSpecialChars;
    }

    public static class Builder {

        RemoveNumbers removeNumbers;

        RemoveUnderScore removeUnderScore;

        RemoveSpecialChars removeSpecialChars;

        public Builder addRemoveNumberStage(RemoveNumbers removeNumbers) {
            this.removeNumbers=removeNumbers;
            return this;
        }

        public Builder addRemoveSpecialChars(RemoveSpecialChars removeSpecialChars) {
            this.removeSpecialChars=removeSpecialChars;
            return this;
        }

        public Builder addRemoveUnderScore(RemoveUnderScore removeUnderScore) {
            this.removeUnderScore=removeUnderScore;
            return this;
        }

        public Pipeline build() {
            return new Pipeline(this.removeNumbers,this.removeUnderScore, this.removeSpecialChars);
        }

    }

}

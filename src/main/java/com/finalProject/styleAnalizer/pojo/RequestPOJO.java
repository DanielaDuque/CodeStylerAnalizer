package com.finalProject.styleAnalizer.pojo;

public class RequestPOJO {

    private int complexity;
    private int maxNameLength;
    private int maxLineCountByFunction;
    private int maxCommentedLinesCount;
    private int minCommentedLinesCount;
    private int maxClassesByFile;
    private int maxFunctionCountByClass;
    private String text;

    public int getComplexity() {
        return complexity;
    }

    public int getMaxNameLength() {
        return maxNameLength;
    }

    public int getMaxLineCountByFunction() {
        return maxLineCountByFunction;
    }

    public int getMaxCommentedLinesCount() {
        return maxCommentedLinesCount;
    }

    public int getMinCommentedLinesCount() {
        return minCommentedLinesCount;
    }

    public int getMaxClassesByFile() {
        return maxClassesByFile;
    }

    public int getMaxFunctionCountByClass() {
        return maxFunctionCountByClass;
    }

    public String getText() {
        return text;
    }
}
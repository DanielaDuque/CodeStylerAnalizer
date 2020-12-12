package com.finalProject.styleAnalizer.pojo;

public class requestPOJO {

    private int complexity;
    private int maxLengthName;
    private int maxLengthLinesBy;
    private int maxLengthLineComment;
    private int minLengthLineComment;
    private int maxClassByFile;
    private int maxNumFunctionByClass;
    private String text;

    @Override
    public String toString() {
        return "requestPOJO{" +
                "complexity=" + complexity +
                ", maxLengthName=" + maxLengthName +
                ", maxLengthLinesBy=" + maxLengthLinesBy +
                ", maxLengthLineComment=" + maxLengthLineComment +
                ", maxClassByFile=" + maxClassByFile +
                ", maxNumFunctionByClass=" + maxNumFunctionByClass +
                ", text='" + text + '\'' +
                '}';
    }

    public int getComplexity() {
        return complexity;
    }

    public int getMaxLengthName() {
        return maxLengthName;
    }

    public int getMaxLengthLinesBy() {
        return maxLengthLinesBy;
    }

    public int getMaxLengthLineComment() {
        return maxLengthLineComment;
    }

    public int getMinLengthLineComment() {
        return minLengthLineComment;
    }

    public int getMaxClassByFile() {
        return maxClassByFile;
    }

    public int getMaxNumFunctionByClass() {
        return maxNumFunctionByClass;
    }

    public String getText() {
        return text;
    }
}
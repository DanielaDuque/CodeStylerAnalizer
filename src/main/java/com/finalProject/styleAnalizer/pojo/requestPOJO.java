package com.finalProject.styleAnalizer.pojo;

public class requestPOJO {

    private int complexity;
    private String prnom;
    private int maxLenghtName;
    private int maxLenghtLinesBy;
    private int maxLenghtLineComment;
    private int maxClassByFile;
    private int maxNumFuntionByClass;
    private String text;

    @Override
    public String toString() {
        return "requestPOJO{" +
                "complexity=" + complexity +
                ", prnom='" + prnom + '\'' +
                ", maxLenghtName=" + maxLenghtName +
                ", maxLenghtLinesBy=" + maxLenghtLinesBy +
                ", maxLenghtLineComment=" + maxLenghtLineComment +
                ", maxClassByFile=" + maxClassByFile +
                ", maxNumFuntionByClass=" + maxNumFuntionByClass +
                ", text='" + text + '\'' +
                '}';
    }

    public int getComplexity() {
        return complexity;
    }

    public String getPrnom() {
        return prnom;
    }

    public int getmaxLenghtName() {
        return maxLenghtName;
    }

    public int getmaxLenghtLinesBy() {
        return maxLenghtLinesBy;
    }

    public int getmaxLenghtLineComment() {
        return maxLenghtLineComment;
    }

    public int getmaxClassByFile() {
        return maxClassByFile;
    }

    public int getmaxNumFuntionByClass() {
        return maxNumFuntionByClass;
    }

    public String gettext() {
        return text;
    }
}
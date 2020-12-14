package com.finalProject.styleAnalizer.logic;

public class ErrorStyle {
    private int line;
    private int column;
    private String suggestion;
    private boolean hasCorrection;
    private String previousCode;
    private String correctedCode;

    public ErrorStyle(String suggestion) {
        this.suggestion = suggestion;
        this.hasCorrection = false;
    }

    public ErrorStyle(String suggestion, int line, int column) {
        this.suggestion = suggestion;
        this.line = line;
        this.column = column;
        this.hasCorrection = false;
    }

    public ErrorStyle(String suggestion, int line, int column, boolean hasCorrection, String previousCode, String correctedCode) {
        this.suggestion = suggestion;
        this.line = line;
        this.column = column;
        this.hasCorrection = hasCorrection;
        this.previousCode = previousCode;
        this.correctedCode = correctedCode;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public boolean isHasCorrection() {
        return hasCorrection;
    }

    public void setHasCorrection(boolean hasCorrection) {
        this.hasCorrection = hasCorrection;
    }

    public String getPreviousCode() {
        return previousCode;
    }

    public void setPreviousCode(String previousCode) {
        this.previousCode = previousCode;
    }

    public String getCorrectedCode() {
        return correctedCode;
    }

    public void setCorrectedCode(String correctedCode) {
        this.correctedCode = correctedCode;
    }
}

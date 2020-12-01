package com.finalProject.styleAnalizer.logic;

public class ErrorStyle {
    private Token previuosToken;
    private Token nuwToken;
    private String recomendation;
    private String errorMessage;

    public ErrorStyle(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorStyle(Token previuosToken, String errorMessage) {
        this.previuosToken = previuosToken;
        this.errorMessage = errorMessage;
    }

    public ErrorStyle(Token previuosToken, String recomendation, String errorMessage) {
        this.previuosToken = previuosToken;
        this.recomendation = recomendation;
        this.errorMessage = errorMessage;
    }

    public String getRecomendation() {
        return recomendation;
    }

    public void setRecomendation(String recomendation) {
        this.recomendation = recomendation;
    }

    public Token getPreviuosToken() {
        return previuosToken;
    }

    public void setPreviuosToken(Token previuosToken) {
        this.previuosToken = previuosToken;
    }

    public Token getNuwToken() {
        return nuwToken;
    }

    public void setNuwToken(Token nuwToken) {
        this.nuwToken = nuwToken;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Error{" +
                "previuosToken=" + previuosToken +
                ", nuwToken=" + nuwToken +
                ", recomendation='" + recomendation + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}

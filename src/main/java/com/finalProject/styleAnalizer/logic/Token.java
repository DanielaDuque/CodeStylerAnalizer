package com.finalProject.styleAnalizer.logic;

public class Token {
    private int col;
    private int row;
    private int lexema;

    public Token(int col, int row, int lexema) {
        this.col = col;
        this.row = row;
        this.lexema = lexema;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getLexema() {
        return lexema;
    }

    public void setLexema(int lexema) {
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Token{" +
                "col=" + col +
                ", row=" + row +
                ", lexema=" + lexema +
                '}';
    }
}

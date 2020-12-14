package com.finalProject.styleAnalizer.logic;

public class Measurement {
    int line;
    int column;
    int start;
    int end;

    public Measurement(int line, int column, int start, int end) {
        this.line = line;
        this.column = column;
        this.start = start;
        this.end = end;
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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

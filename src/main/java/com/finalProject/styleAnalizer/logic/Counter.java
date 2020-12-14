package com.finalProject.styleAnalizer.logic;

public class Counter {
    int line;
    int column;
    int count;

    public Counter(int line, int column, int count) {
        this.line = line;
        this.column = column;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addCount() {
        count++;
    }

    public void addCount(int count) {
        this.count += count;
    }
}

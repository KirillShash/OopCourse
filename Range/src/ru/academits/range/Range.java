package ru.academits.range;

public class Range {
    private double from;
    private double to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getLength(){
        return 1;
    }

    public boolean isInside(double number){
        return false;
    }
}

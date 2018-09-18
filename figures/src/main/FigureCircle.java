package main;

import java.lang.Math;

public class FigureCircle implements Figure {

    public FigureCircle(double radius) {
        this.radius = radius;
    }

    public FigureCircle() {
        this.radius = 0;
    }

    private double radius;

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}

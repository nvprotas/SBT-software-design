package main;

import main.Figure;

public class FigureRectangle implements Figure {

    private double sideA;
    private double sideB;

    public FigureRectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public FigureRectangle() {
        this.sideA = 0;
        this.sideB = 0;
    }

    public FigureRectangle(double sideA) {
        this.sideA = sideA;
        this.sideB = 0;
        System.out.println("Not all sides entered");
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }
}

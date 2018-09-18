package main;

import main.Figure;

public class FigureSquare implements Figure {

    private double side;

    public FigureSquare(double side) {
        this.side = side;
    }

    public FigureSquare() {
        this.side = 0;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}

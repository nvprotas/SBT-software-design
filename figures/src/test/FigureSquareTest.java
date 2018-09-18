package test;

import static org.junit.Assert.*;

import main.FigureSquare;
import org.junit.Test;

public class FigureSquareTest {

    @Test
    public void testgetArea2() {
        FigureSquare square = new FigureSquare(2);
        double area = square.getArea();

        assertEquals(4,area, 1e-10);
    }

    @Test
    public void testGetArea1_44() {
        FigureSquare square = new FigureSquare(1.2);
        double area = square.getArea();

        assertEquals(1.44,area, 1e-10);
    }

    @Test
    public void testGetAreaNone() {
        FigureSquare square = new FigureSquare();
        double area = square.getArea();

        assertEquals(0,area, 1e-10);
    }
}

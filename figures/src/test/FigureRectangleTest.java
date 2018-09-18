package test;

import static org.junit.Assert.*;

import main.FigureRectangle;
import org.junit.Test;

public class FigureRectangleTest {

    @Test
    public void testgetArea8() {
        FigureRectangle rectangle = new FigureRectangle(2,4);
        double area = rectangle.getArea();

        assertEquals(8,area, 1e-10);
    }

    @Test
    public void testgetArea0_35() {
        FigureRectangle rectangle = new FigureRectangle(0.5,0.7);
        double area = rectangle.getArea();

        assertEquals(0.35,area, 1e-10);
    }

    @Test
    public void testgetAreaNone() {
        FigureRectangle rectangle = new FigureRectangle();
        double area = rectangle.getArea();

        assertEquals(0,area, 1e-10);
    }

    @Test
    public void testgetAreaAandNone() {
        FigureRectangle rectangle = new FigureRectangle(2);
        double area = rectangle.getArea();

        assertEquals(0,area, 1e-10);
    }
}
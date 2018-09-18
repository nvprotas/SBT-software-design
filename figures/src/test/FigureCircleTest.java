package test;

import java.lang.Math;
import main.FigureCircle;
import org.junit.Test;


import static org.junit.Assert.*;

public class FigureCircleTest {

    @Test
    public void testgetArea1() {
        FigureCircle circle = new FigureCircle(1/Math.sqrt(Math.PI));
        double area = circle.getArea();

        assertEquals(1, area,1e-10);
    }

    @Test
    public void testgetArea0() {
        FigureCircle circle = new FigureCircle();
        double area = circle.getArea();
        assertEquals(0,area,1E-10);

    }
}
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void when20to20then2() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to20then2() {
        Point a = new Point(4, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to24then2() {
        Point a = new Point(4, 4);
        Point b = new Point(4, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3d() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(-7, -2, 4);
        double out = a.distance3d(b);
        double expected = 9;
        Assert.assertEquals(expected, out, 0.01);
    }
}


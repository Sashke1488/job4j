package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(1.73, dist, 0.01);
    }
}

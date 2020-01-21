package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import static ru.stqa.pft.sandbox.Point.distance;

public class PointTests {
    @Test
    public void testPointDistance() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(-1, 10);
        Assert.assertNotEquals(distance(p1, p2), 0);
    }
}
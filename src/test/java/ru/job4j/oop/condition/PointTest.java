package ru.job4j.oop.condition;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(5, 0.001));
    }

    @Test
    public void distance1() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(1, 0.001));
    }

    @Test
    public void distance3d() {
        Point c = new Point(0, 4, 0);
        Point d = new Point(0, 0, 3);
        double dist3d = c.distance3d(d);
        assertThat(dist3d, closeTo(5, 0.001));
    }

    @Test
    public void distance3dy() {
        Point c = new Point(0, 4, 0);
        Point d = new Point(0, 2, 0);
        double dist3d = c.distance3d(d);
        assertThat(dist3d, closeTo(2, 0.001));
    }
}
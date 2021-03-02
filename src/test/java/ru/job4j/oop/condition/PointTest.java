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
}
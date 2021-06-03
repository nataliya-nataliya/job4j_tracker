package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunDiapason function = new FunDiapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        FunDiapason function = new FunDiapason();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunc() {
        FunDiapason function = new FunDiapason();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(3125D, 46656D, 823543D);
        assertThat(result, is(expected));
    }
}
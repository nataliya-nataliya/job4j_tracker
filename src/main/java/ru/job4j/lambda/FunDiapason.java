package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunDiapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> eq = new ArrayList<>();
        for (double i = start; i < end; i++) {
            eq.add(func.apply(i));
        }
        return eq;
    }
}

package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StubInput implements Input {
    private List<String> answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = Arrays.asList(answers);
    }

    @Override
    public String askStr(String question) {
        return answers.get(position++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}






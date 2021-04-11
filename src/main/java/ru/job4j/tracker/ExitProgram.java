package ru.job4j.tracker;

public class ExitProgram implements UserAction{

    private final Output output;

    public ExitProgram(Output output) {
        this.output = output;
    }

    @Override
    public String name(){
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("Program completed");
        return false;
    }
}



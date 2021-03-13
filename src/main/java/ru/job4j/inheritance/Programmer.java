package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String nameProgram;

    public Programmer(String name, String surname, String education, int yearOfBirthday, String project,
                      String nameProgram) {
        super(name, surname, education, yearOfBirthday, project);
        this.nameProgram = nameProgram;
    }
}

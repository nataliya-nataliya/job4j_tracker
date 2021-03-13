package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String tagOfDrawing;

    public Builder(String name, String surname, String education, int yearOfBirthday,
                   String project, String tagOfDrawing) {
        super(name, surname, education, yearOfBirthday, project);
        this.tagOfDrawing = tagOfDrawing;
    }
}

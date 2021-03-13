package ru.job4j.inheritance;

import java.beans.DesignMode;

public class Engineer extends Profession{

    private String project;

    public Engineer(String name, String surname, String education, int yearOfBirthday, String project) {
        super(name, surname, education, yearOfBirthday);
        this.project = project;
    }

    public Design invent (Design project) {
            return null;
        }
}

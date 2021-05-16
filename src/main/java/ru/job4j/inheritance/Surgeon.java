package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String medicalOperation;

    public Surgeon(String name, String surname, String education,
                   int yearOfBirthday, String pacient,
                   String medicalOperation) {
        super(name, surname, education, yearOfBirthday, pacient);
        this.medicalOperation = medicalOperation;
    }
}

package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int toothNumber;

    public Dentist(String name, String surname, String education,
                   int yearOfBirthday, String pacient,
                   int toothNumber) {
        super(name, surname, education, yearOfBirthday, pacient);
        this.toothNumber = toothNumber;
    }
}

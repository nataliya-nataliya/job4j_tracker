package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String pacient;

    public Doctor(String name, String surname, String education,
                  int yearOfBirthday, String pacient) {
        super(name, surname, education, yearOfBirthday);
        this.pacient = pacient;
    }

    public Diagnosis heal(Diagnosis pacient) {
        return null;
    }
}

package ru.job4j.inheritance;

public class Profession {

    private String name;

    private String surname;

    private String education;

    private int yearOfBirthday;

    public Profession(String name, String surname, String education, int yearOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }
}

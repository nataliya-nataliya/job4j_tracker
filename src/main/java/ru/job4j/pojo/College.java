package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivanov");
        student.setName("Ivan");
        student.setPatronymic("Ivanovich");
        student.setGroup("ABC");
        student.setReceipt(new Date());
        System.out.println(student.getSurname() + " " + student.getName()
                + " " + student.getPatronymic() + " is a student of the group "
                + student.getGroup());

    }
}

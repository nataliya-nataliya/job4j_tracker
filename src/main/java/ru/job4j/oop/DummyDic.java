package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng  = "Unknown word";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic a = new DummyDic();
        String eng = a.engToRus();
        System.out.println("Неизвестное слово " + eng);
    }
}

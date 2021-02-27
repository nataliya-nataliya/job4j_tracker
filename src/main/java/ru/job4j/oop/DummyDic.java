package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng  = "Unknown word";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic tranlation = new DummyDic();
        String eng = tranlation.engToRus();
        System.out.println("Неизвестное слово " + eng);
    }
}

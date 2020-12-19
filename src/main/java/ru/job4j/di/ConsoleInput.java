package ru.job4j.di;

public class ConsoleInput {

    public String askStr(String question) {
        System.out.println(question);
        return question;
    }

}

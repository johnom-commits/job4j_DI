package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class ConsoleInput {

    public String askStr(String question) {
        System.out.println(question);
        return question;
    }
}

package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        StartUI ui2 = context.getBean(StartUI.class);
        ui2.add("Aleksandr Pushkin");
        ui2.add("Mihail Svetlov");
        ui2.print();
    }
}

package ru.gravitana.gb.java.exeptions.lesson03.homework.app;

import ru.gravitana.gb.java.exeptions.lesson03.homework.presenters.Presenter;
import ru.gravitana.gb.java.exeptions.lesson03.homework.views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new ConsoleView());
        presenter.start();
    }
}

package ru.gravitana.gb.java.exeptions.lesson03.homework.presenter;

import ru.gravitana.gb.java.exeptions.lesson03.homework.service.DataProcessing;
import ru.gravitana.gb.java.exeptions.lesson03.homework.view.View;

import java.util.Scanner;

public class Presenter {
    private final View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void start() {
        view.showWelcome();

        while (true) {
            view.showInstruction();
            String userInput = getUserInput("Введите данные:");
            DataProcessing data = new DataProcessing(userInput);
            int errorCode = data.checkSize();

            if (errorCode == -1) {
                view.showMessage("Введены не все данные");
                continue;
            }
            if (errorCode == 1) {
                view.showMessage("Введены лишние данные");
                continue;
            }
            view.showPrompt("Данные приняты. Идёт обработка...");
            view.showPrompt(data.parseData());
        }
    }

    private String getUserInput(String message) {
        Scanner in = new Scanner(System.in);
        view.showInput(message);
        return in.nextLine();
    }
}

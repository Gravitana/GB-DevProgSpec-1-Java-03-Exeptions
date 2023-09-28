package ru.gravitana.gb.java.exeptions.lesson03.homework.presenters;

import ru.gravitana.gb.java.exeptions.lesson03.homework.data.Item;
import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;
import ru.gravitana.gb.java.exeptions.lesson03.homework.services.DataProcessing;
import ru.gravitana.gb.java.exeptions.lesson03.homework.views.View;

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
                view.showError(new InputDataException("Введены не все данные"));
                continue;
            }
            if (errorCode == 1) {
                view.showError(new InputDataException("Введены лишние данные"));
                continue;
            }
            view.showPrompt("Данные приняты. Идёт обработка...");
            try {
                Item result = data.parseData();

                // TODO проверка полноты данных
                // TODO запись в файл

                view.showPrompt(result.toString());
            } catch (InputDataException e) {
                view.showError(e);
            }

        }
    }

    private String getUserInput(String message) {
        Scanner in = new Scanner(System.in);
        view.showInput(message);
        return in.nextLine();
    }
}

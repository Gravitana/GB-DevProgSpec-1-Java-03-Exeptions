package ru.gravitana.gb.java.exeptions.lesson03.homework.presenters;

import ru.gravitana.gb.java.exeptions.lesson03.homework.data.Item;
import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;
import ru.gravitana.gb.java.exeptions.lesson03.homework.services.SaveToFile;
import ru.gravitana.gb.java.exeptions.lesson03.homework.services.StringParser;
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

            if (userInput.equalsIgnoreCase("q")) {
                break;
            }
            view.showPrompt("Данные приняты. Идёт обработка...");

            try {
                StringParser stringParser = new StringParser(userInput);
                Item item = stringParser.getItem();

                String filename = "src/main/resources/" + item.getSurname() + ".txt";
                String row = item + "\n";
                if (new SaveToFile().save(filename, row)) {
                    view.showMessage("Данные записаны в файл");
                }
            } catch (InputDataException e) {
                view.showError(e);
            } catch (Exception e) {
                view.showError(e);
                view.showStackTrace(e);
            }
        }
        view.showMessage("Программа завершена");
    }

    private String getUserInput(String message) {
        Scanner in = new Scanner(System.in);
        view.showInput(message);
        return in.nextLine();
    }
}

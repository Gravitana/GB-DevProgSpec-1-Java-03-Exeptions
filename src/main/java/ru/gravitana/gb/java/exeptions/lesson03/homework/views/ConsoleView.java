package ru.gravitana.gb.java.exeptions.lesson03.homework.views;

import java.util.Arrays;

public class ConsoleView implements View{

    @Override
    public void showWelcome() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                                               ║");
        System.out.println("║         З А П И С Н А Я   К Н И Ж К А         ║");
        System.out.println("║                                               ║");
        System.out.println("║            Q - выход из программы             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    @Override
    public void showInstruction() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║  Необходимо ввести в произвольном порядке     ║");
        System.out.println("║  следующие данные, разделённые пробелом:      ║");
        System.out.println("║  - Фамилия Имя Отчество                       ║");
        System.out.println("║  - Дата рождения (в формате dd.mm.yyyy)       ║");
        System.out.println("║  - Номер телефона (11 цифр без пробелов)      ║");
        System.out.println("║  - Пол (символ латиницей f или m)             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    @Override
    public void showInput(String message) {
        System.out.printf("║ %s ", message);
    }

    @Override
    public void showPrompt(String message) {
        showInput(message);
        System.out.println();
    }

    @Override
    public void showMessage(String message) {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.printf( "║ %-37s ║\n", message);
        System.out.println("╚═══════════════════════════════════════╝");
    }

    @Override
    public void showError(Exception e) {
        System.out.println("╔════════╤══════════════════════════════════════╗");
        System.out.printf( "║ ОШИБКА │ %-36s ║\n", e.getMessage());
        System.out.println("╚════════╧══════════════════════════════════════╝");
    }

    @Override
    public void showStackTrace(Exception e) {
        for (StackTraceElement ste : e.getStackTrace()) {
            System.out.println("║ " + ste);
        }
    }
}

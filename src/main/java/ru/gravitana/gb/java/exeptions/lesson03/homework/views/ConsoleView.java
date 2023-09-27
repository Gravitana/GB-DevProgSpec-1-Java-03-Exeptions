package ru.gravitana.gb.java.exeptions.lesson03.homework.views;

public class ConsoleView implements View{

    @Override
    public void showWelcome() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                                               ║");
        System.out.println("║               ЗАПИСНАЯ  КНИЖКА                ║");
        System.out.println("║                                               ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    @Override
    public void showInstruction() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║  Необходимо ввести в произвольном порядке     ║");
        System.out.println("║  следующие данные, разделённые пробелом:      ║");
        System.out.println("║  - Фамилия Имя Отчество                       ║");
        System.out.println("║  - Дата рождения (в формате dd.mm.yyyy)       ║");
        System.out.println("║  - Номер телефона (целое число 11 цифр)       ║");
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
    public void showError(String message) {
        System.out.println("╔════════╤══════════════════════════════════════╗");
        System.out.printf( "║ ОШИБКА │ %-36s ║\n", message);
        System.out.println("╚════════╧══════════════════════════════════════╝");
    }
}

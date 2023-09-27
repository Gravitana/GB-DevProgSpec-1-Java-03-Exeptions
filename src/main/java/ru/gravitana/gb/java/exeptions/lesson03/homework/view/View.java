package ru.gravitana.gb.java.exeptions.lesson03.homework.view;

public interface View {
    void showWelcome();
    void showInstruction();
    void showInput(String message);
    void showPrompt(String message);
    void showMessage(String message);
}

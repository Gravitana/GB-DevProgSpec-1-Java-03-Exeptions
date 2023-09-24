package ru.gravitana.gb.java.exeptions.lesson02.homework;

import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        while (true) {
            try {
                String str = userInput();
                System.out.println("-------------\nВведена строка \"" + str + "\"");
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String userInput() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку ");
        String str = in.nextLine();

        if (str.trim().isEmpty()) {
            throw new IOException("Пустые строки вводить нельзя!");
        }

        return str;
    }
}

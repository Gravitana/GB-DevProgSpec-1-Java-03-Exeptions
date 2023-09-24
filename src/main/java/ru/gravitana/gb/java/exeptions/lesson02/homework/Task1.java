package ru.gravitana.gb.java.exeptions.lesson02.homework;

import java.util.Scanner;

public class Task1 {
    /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения,
        вместо этого, необходимо повторно запросить у пользователя ввод данных.
      */
    public static void main(String[] args) {
        float number = userInput();
        System.out.println("Введено число " + number);
    }

    private static float userInput() {
        Scanner in = new Scanner(System.in);
        String str;
        float number;

        while (true) {
            System.out.print("Введите дробное число ");
            str = in.nextLine();
            try {
                number = Float.parseFloat(str);

                if (number - (int)number == 0) {
                    System.out.println("Это целое число!");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Это не дробное число!");
            }
        }
    }
}

package ru.gravitana.gb.java.exeptions.lesson01.autotest1;

import java.util.Arrays;

public class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[]{1,2,3,4,5};
        int b = arr[100];
        System.out.println(b);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 5 / 0;
        System.out.println(a);
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "123x";
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
}

package ru.gravitana.gb.java.exeptions.lesson02.homework;

public class Task2 {
    public static void main(String[] args) {
    /*
        Если необходимо, исправьте данный код

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    */
        try {
            int d = 0;
            int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};       // Добавлена инициализация массива
            if (d == 0) {                                          // Проверка на 0, иначе вместо исключения выведет результат Infinity
                throw new ArithmeticException("Деление на ноль!"); // Выброс исключения
            }
            double catchedRes1 = (double)intArray[8] / d;          // Кастомизация к double для правильного вычисления, если d != 0
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

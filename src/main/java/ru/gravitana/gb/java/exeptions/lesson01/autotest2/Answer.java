package ru.gravitana.gb.java.exeptions.lesson01.autotest2;

public class Answer {
    /*
        Реализуйте метод subArrays,
        принимающий в качестве аргументов два целочисленных массива a и b,
        возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны - верните нулевой массив длины 1.
        Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив

        Пример

            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};

            Вывод: [3, 3, 3]

            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3, 5};

            Вывод: [0]
     */
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int lenA = a.length;
        int lenB = b.length;

        if (lenA != lenB) {
            return new int[]{0};
        }

        int[] c = new int[lenA];

        for (int i = 0; i < lenA; i++) {
            c[i] = a[i] - b[i];
        }

        return c;
    }
}

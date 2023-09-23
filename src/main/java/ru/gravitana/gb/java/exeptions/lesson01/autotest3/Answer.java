package ru.gravitana.gb.java.exeptions.lesson01.autotest3;

public class Answer {
    /*
    Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
    и возвращающий новый массив с,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив
*/
    {/*
    Пример

        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};

        Вывод: [3, 4, 4]

        a = new int[]{12, 8, 16, 25};
        b = new int[]{4, 2, 4};

        Вывод: [0]
    */
    }
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int lenA = a.length;
        int lenB = b.length;

        if (lenA != lenB) {
            return new int[]{0};
        }

        int[] c = new int[lenA];

        try {
            for (int i = 0; i < lenA; i++) {
                c[i] = a[i] / b[i];
            }
        } catch (Exception e) {
            throw new RuntimeException("Упс! Что-то пошло не так!");
        }

        return c;
    }
}

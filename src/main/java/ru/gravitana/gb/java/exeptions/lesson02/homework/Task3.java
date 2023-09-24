package ru.gravitana.gb.java.exeptions.lesson02.homework;

public class Task3 {
/*
    Дан следующий код, исправьте его там, где требуется

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
*/
    public static void main(String[] args) { //throws Exception { // нет необходимости пробрасывать исключение ещё выше
        try {
            int a = 90;
            int b = 3;

            if (b == 0) {                                          // Проверка на 0, иначе вместо исключения выведет результат Infinity
                throw new ArithmeticException("Деление на ноль!"); // Выброс исключения
            }
            System.out.println((double)a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {                                      // Можно ещё добавить обработку деления на 0
            System.out.println("Exception: " + ex);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {                                                // Данное исключение должно быть последним,
            System.out.println("Что-то пошло не так...");                       // иначе остальные не обработаются
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException { // Заменить т.к. в этом методе нет работы с файлом,
        System.out.println(a + b);                                                  // но вместо Integer может прийти null
    }

}

package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import ru.gravitana.gb.java.exeptions.lesson03.homework.data.Item;

public class DataProcessing {
    private final int REQUIRED_ELEMENTS = 6;

    private final String[] data;

    public DataProcessing(String userInput) {
        data = userInput.split(" ");
    }

    public int checkSize() {
        return Integer.compare(data.length, REQUIRED_ELEMENTS);
    }

    public Item parseData() {
        Item item = new Item();
        int fioIndex = 0;
        for (String s : data) {
            if (s.equals("f") || s.equals("m")) {
                item.setGender(s);
                continue;
            }
            if (s.contains(".")) {
                item.setBirthday(s);
                continue;
            }
            if (s.matches(".*[0-9].*")) {
                item.setPhone(s);
                continue;
            }
            if (fioIndex == 2) {
                System.out.println("--- переполнение ФИО ---"); // TODO бросить исключение
                break;
            }
            item.setFio(s, fioIndex++);
        }
        return item;
    }
}

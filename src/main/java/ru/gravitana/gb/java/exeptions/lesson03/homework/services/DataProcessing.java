package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import ru.gravitana.gb.java.exeptions.lesson03.homework.data.Item;
import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;

public class DataProcessing { // TODO вынести все проверки
    private final int REQUIRED_ELEMENTS = 6;

    private final String[] data;

    public DataProcessing(String userInput) {
        data = userInput.split(" ");
    }

    public int checkSize() {
        return Integer.compare(data.length, REQUIRED_ELEMENTS);
    }

    public Item parseData() throws InputDataException {
        Item item = new Item();
        int fioIndex = 0;
        for (String s : data) {
            if (s.equals("f") || s.equals("m")) {
                item.setGender(s);
                continue;
            }
            if (s.contains(".")) {
                if (CheckDate.check(s)) {
                    item.setBirthday(s);
                }
                continue;
            }
            if (s.matches(".*[0-9].*")) {
                if (CheckPhoneNumber.check(s)) {
                    item.setPhone(s);
                }
                continue;
            }
            if (fioIndex > 2) {
                throw new InputDataException("Лишние элементы Ф.И.О.");
            }
            item.setFio(s, fioIndex++);
        }
        return item;
    }
}

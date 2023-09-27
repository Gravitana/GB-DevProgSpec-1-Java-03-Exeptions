package ru.gravitana.gb.java.exeptions.lesson03.homework.service;

import java.util.Arrays;

public class DataProcessing {
    private final int REQUIRED_ELEMENTS = 6;

    private final String[] data;

    public DataProcessing(String userInput) {
        data = userInput.split(" ");
    }

    public int checkSize() {
        return Integer.compare(data.length, REQUIRED_ELEMENTS);
    }

    public String parseData() {
        return Arrays.toString(data);
    }
}

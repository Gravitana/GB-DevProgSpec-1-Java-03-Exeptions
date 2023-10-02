package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public boolean save(String filename, String data) {
        try(FileWriter writer = new FileWriter(filename, true)) {
            writer.write(data);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи в файл");
        }
    }
}

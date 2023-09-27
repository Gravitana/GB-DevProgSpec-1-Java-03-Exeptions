package ru.gravitana.gb.java.exeptions.lesson03.homework.data;

import java.util.Arrays;

public class Item {
    private String[] fio;
    private String birthday;
    private String phone;
    private String gender;
    public Item() {
        fio = new String[3];
    }

    public String[] getFio() {
        return fio;
    }

    public String getSurname() {
        return fio[0];
    }

    public String getName() {
        return fio[1];
    }

    public String getFatherName() {
        return fio[2];
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public void setFio(String s, int index) {
        this.fio[index] = s;
    }

    public void setSurname(String surname) {
        this.fio[0] = surname;
    }

    public void setName(String name) {
        this.fio[1] = name;
    }

    public void setFatherName(String fatherName) {
        this.fio[1] = fatherName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + getSurname() + ">"
                + "<" + getName() + ">"
                + "<" + getFatherName() + ">"
                + "<" + getBirthday() + ">"
                + "<" + getPhone() + ">"
                + "<" + getGender() + ">";
    }
}

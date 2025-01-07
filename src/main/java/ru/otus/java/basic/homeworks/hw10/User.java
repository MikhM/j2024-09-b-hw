package ru.otus.java.basic.homeworks.hw10;

public class User {

    private String name;
    private String secondName;
    private String lastName;
    private int birthYear;
    private String mail;

    public User(String name, String secondName, String lastName, int birthYear, String mail) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.mail = mail;
    }

    public void printUserData() {
        System.out.println("*".repeat(36));
        System.out.println("ФИО: " + secondName + " " + name + " " + lastName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + mail);
    }

    public int getBirthYer() {
        return birthYear;
    }
}

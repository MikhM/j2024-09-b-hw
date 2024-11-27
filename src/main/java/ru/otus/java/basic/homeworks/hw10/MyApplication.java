package ru.otus.java.basic.homeworks.hw10;

import ru.otus.java.basic.homeworks.libs.LastNames;
import ru.otus.java.basic.homeworks.libs.Names;
import ru.otus.java.basic.homeworks.libs.SecondName;

public class MyApplication {
    public static final int NAMES_SIZE = 212;
    public static final int SECOND_NAME_SIZE = 297;
    public static final int LAST_NAME_SIZE = 199;
    public static final int MIN_YEAR = 1950;
    public static final int MAX_YEAR = 2024;
    public static final int USERS_AMOUNT = 10;


    public static void main(String[] args) {


        User[] arrayOfUser = new User[USERS_AMOUNT];
        for (int i = 0; i < arrayOfUser.length; i++) {
            String randomName = Names.values()[1 + (int) (Math.random() * NAMES_SIZE)].toString();
            String randomSecondName = SecondName.values()[1 + (int) (Math.random() * SECOND_NAME_SIZE)].toString();
            String randomLastName = LastNames.values()[1 + (int) (Math.random() * LAST_NAME_SIZE)].toString();
            int randomBirthYear = MIN_YEAR + (int) (Math.random() * (MAX_YEAR - MIN_YEAR + 1));

            arrayOfUser[i] = new User(randomName, randomSecondName, randomLastName, randomBirthYear, randomName + randomBirthYear + "@advance.tech");
        }
        for (User user : arrayOfUser) {
            if (user.birthYear > 1984) user.printUserData();
        }

        System.out.println("\n".repeat(3));
        System.out.println("BOX");

        Box box = new Box("Big box", "Red");

        box.open();
        box.close();
        box.open();
        box.paint("GREEN!!");
        box.paint("YELLOW!!");
        box.open();
        box.close();
        box.putItem("Book");
        box.open();
        box.putItem("Book");
        box.putItem("Table");

    }
}

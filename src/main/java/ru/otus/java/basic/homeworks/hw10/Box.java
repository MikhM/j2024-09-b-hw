package ru.otus.java.basic.homeworks.hw10;

public class Box {

    private String size;
    private String color;
    private boolean isOpened;
    private boolean isEmpty;
    private String itemInTheBoxName;


    public Box(String size, String color) {
        this.size = size;
        this.color = color;
        this.isEmpty = true;
        this.isOpened = false;
        System.out.println("*".repeat(36));
        System.out.println("New box");
        this.printState();
    }

    public boolean open() {
        System.out.println("*".repeat(20));
        System.out.println("Open box!");
        if (isOpened) {
            System.out.println("Unable open open box ))");
            return false;
        } else
            isOpened = true;
        this.printState();
        return true;

    }

    public boolean close() {
        System.out.println("*".repeat(20));
        System.out.println("Close box");
        if (isOpened) {
            isOpened = false;
            this.printState();
            return true;
        }
        System.out.println("Unable to close closed box");
        return false;

    }

    public String paint(String newColor) {
        System.out.println("*".repeat(20));
        System.out.println("Paint box !");
        this.color = newColor;
        printState();
        return newColor;
    }

    public boolean putItem(String itmName) {
        System.out.println("*".repeat(35));
        System.out.println("Put item " + itmName + " to the box ");
        if (!this.isOpened) {
            System.out.println("Box is not opened!");
            return false;
        }

        if (!this.isEmpty) {
            System.out.println("Box is not empty!");
            return false;
        }
        this.isEmpty = false;
        this.itemInTheBoxName = itmName;
        printState();
        return true;
    }

    public void printState() {
        System.out.println("*".repeat(35));
        System.out.println("Box. Size=" + size);
        System.out.println("Box. Color=" + color);
        System.out.println("States: \nis opened - " + isOpened + "\nis empty - " + isEmpty + "\nitem in the box is " + itemInTheBoxName);
    }
}

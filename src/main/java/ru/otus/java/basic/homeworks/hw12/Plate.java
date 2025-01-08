package ru.otus.java.basic.homeworks.hw12;

public class Plate {
    private int initialPlateSize;
    private int foodAmount;

    public Plate(int plateSize) {
        System.out.println("New plates created with " + plateSize + " amount of food.");
        initialPlateSize = plateSize;
        foodAmount = plateSize;
    }

    boolean tryToTakeFoodFromPlate(int value) {
        if (value > foodAmount)
            return false;
        foodAmount -= value;
        System.out.println("Plate value's been decreased for " + value + " and contain " + foodAmount);
        return true;
    }

    void fillThePlateWithFood() {
        System.out.println("Plate full again and contain " + initialPlateSize);
        foodAmount = initialPlateSize;
    }


}

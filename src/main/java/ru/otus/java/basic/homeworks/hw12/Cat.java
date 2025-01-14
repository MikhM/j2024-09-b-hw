package ru.otus.java.basic.homeworks.hw12;

public class Cat {
    boolean satiety;
    int bellySize;

    public Cat(int bellySize) {
        this.satiety = false;
        this.bellySize = bellySize;
        System.out.println("New cat bellysize " + bellySize);
    }

    public void info() {
        System.out.println("Cat bellysize " + bellySize + " and his satiety is " + satiety);
    }

    public void feedCat(Plate plate) {
        if (!this.satiety)
            satiety = plate.tryToTakeFoodFromPlate(this.bellySize);
    }

}

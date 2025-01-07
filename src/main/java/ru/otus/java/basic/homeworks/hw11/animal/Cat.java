package ru.otus.java.basic.homeworks.hw11.animal;

public class Cat extends Animal {
    public Cat(String name, int power, int powerSpentRun, int powerSpentSwim, int runSpeed, int swimSpeed) {
        this.name = name;
        this.power = power;
        this.powerSpentRun = powerSpentRun;
        this.powerSpentSwim = powerSpentSwim;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public int swim(int distance) {
        System.out.println("has to swim distance - " + distance);
        System.out.println("Result - Cats cant swim");
        return -1;
    }

    public int run(int distance) {
       return super.run(distance);
    }
}

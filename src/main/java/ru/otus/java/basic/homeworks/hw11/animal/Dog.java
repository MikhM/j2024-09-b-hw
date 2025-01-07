package ru.otus.java.basic.homeworks.hw11.animal;

public class Dog extends Animal {
    public Dog(String name, int power, int powerSpentRun,int powerSpentSwim, int runSpeed, int swimSpeed) {
        this.name = name;
        this.power = power;
        this.powerSpentRun = powerSpentRun;
        this.powerSpentSwim = powerSpentSwim;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }
    public int run(int distance){
        return super.run(distance);
    }

    public int swim(int distance){
        return super.swim(distance);
    }
}

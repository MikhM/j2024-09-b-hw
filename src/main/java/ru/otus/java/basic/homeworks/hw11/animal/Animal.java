package ru.otus.java.basic.homeworks.hw11.animal;

import static ru.otus.java.basic.homeworks.libs.SrtingUtils.valueStartsFromPattern;


public abstract class Animal {
    protected String name;
    protected int power;
    protected int powerSpentRun;
    protected int powerSpentSwim;
    protected int runSpeed;
    protected int swimSpeed;

    private int move(int distance, int speed, int powerSpent) {
        int time = distance / runSpeed;
        int runPowerSpent = distance * powerSpent;
        if (runPowerSpent < power) {
            power -= runPowerSpent;
        } else {
            System.out.print("-1 Усталь!!!\n");
            power = -1;
        }
        return time;
    }

    protected int swim(int distance) {
        System.out.println("has to swim distance - " + distance);
        System.out.print("Result time is ");

        int result = move(distance, swimSpeed, powerSpentSwim);
        if (power != -1) {
            System.out.print(result + "\n");
        }
        return result;
    }

    protected int run(int distance) {
        System.out.println("has to ran distance - " + distance);
        System.out.print("Result time is ");

        int result = move(distance, runSpeed, powerSpentRun);
        if (power != -1) {
            System.out.print(result + "\n");
        }
        return result;
    }

    public void info() {
        String animalName = valueStartsFromPattern(this.getClass().toString(), "animal");
        System.out.println("INFO " + animalName + " Name:" + this.name + " Power:" + this.power);
    }


}
package ru.otus.java.basic.homeworks.hw11;

import ru.otus.java.basic.homeworks.hw11.animal.Cat;
import ru.otus.java.basic.homeworks.hw11.animal.Dog;
import ru.otus.java.basic.homeworks.hw11.animal.Horse;
import ru.otus.java.basic.homeworks.libs.PropertiesFunctions;

public class MyApplication {
    public static void main(String[] args) {
        PropertiesFunctions pf = new PropertiesFunctions();

        Cat cat = new Cat(pf.getProperyAsStr("Animal.name.cat"),
                pf.getProperyAsInt("Animal.power.cat"),
                pf.getProperyAsInt("Animal.powerSpent.run.cat"),
                pf.getProperyAsInt("Animal.powerSpent.swim.cat"),
                pf.getProperyAsInt("Animal.speed.run.cat"),
                pf.getProperyAsInt("Animal.speed.swim.cat"));
        cat.info();
        cat.run(90);
        cat.info();
        cat.run(40);
        cat.info();
        cat.swim(5);
        cat.info();
        System.out.println();

        Dog dog = new Dog(pf.getProperyAsStr("Animal.name.dog"),
                pf.getProperyAsInt("Animal.power.dog"),
                pf.getProperyAsInt("Animal.powerSpent.run.dog"),
                pf.getProperyAsInt("Animal.powerSpent.swim.dog"),
                pf.getProperyAsInt("Animal.speed.run.dog"),
                pf.getProperyAsInt("Animal.speed.swim.dog"));
        dog.info();
        dog.run(90);
        dog.info();
        dog.swim(6);
        dog.info();
        dog.swim(10);
        dog.info();
        dog.swim(1);
        dog.info();
        System.out.println();

        Horse horse = new Horse(pf.getProperyAsStr("Animal.name.horse"),
                pf.getProperyAsInt("Animal.power.horse"),
                pf.getProperyAsInt("Animal.powerSpent.run.horse"),
                pf.getProperyAsInt("Animal.powerSpent.swim.horse"),
                pf.getProperyAsInt("Animal.speed.run.horse"),
                pf.getProperyAsInt("Animal.speed.swim.horse"));
        horse.info();
        horse.run(90);
        horse.info();
        horse.swim(6);
        horse.info();
        horse.swim(10);
        horse.info();
        horse.swim(15);
        horse.info();
        horse.swim(15);
        horse.info();
    }
}

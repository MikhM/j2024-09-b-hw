package ru.otus.java.basic.homeworks.hw12;

public class MyApplication {
    public static final int PLATE_SIZE=50;
    public static final int CATS_BAND_SIZE=15;
    public static final int MIN_CATS_BELLY=4;



    public static void main(String[] args) {

        Plate plate = new Plate(PLATE_SIZE);
        Cat[] cats = new Cat[CATS_BAND_SIZE];
        for (int i = 0; i < cats.length; i++)
            cats[i] = new Cat(MIN_CATS_BELLY + i);

        System.out.println("\n Feeding cats kis kis kis:)");
        for (Cat cat : cats) {
            cat.feedCat(plate);
            cat.info();
        }
        System.out.println();
        plate.fillThePlateWithFood();
        System.out.println();

        System.out.println("\n Feeding cats again kis kis kis:)");
        for (Cat cat : cats) {
            cat.feedCat(plate);
            cat.info();
        }

        System.out.println("\n Results\n");
        for(Cat cat: cats){
            cat.info();
        }


    }

}

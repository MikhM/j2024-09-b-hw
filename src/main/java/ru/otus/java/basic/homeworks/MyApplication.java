package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class MyApplication {
    public static final int[] MASSIVE1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    public static final int[] MASSIVE2 = {1, 1, 1, 1, 1, 1, 1};

    public static void main(String[] args) {
        System.out.println("\n\n1. repeat string method result\n");
        repeatString(" brilliant ", 111);

        System.out.println("\n\n2. the sum of massive method. \n initial massive");
        for (int item : MASSIVE1)
            System.out.print(item + " ");
        sumOfMassive(MASSIVE1);

        System.out.println("\n3. the fillTheMassiveWhith method. \n");
        fillTheMassiveWhith(MASSIVE1, 77);

        System.out.println("\n\n4. the massive add value method.");
        massiveAdd(MASSIVE2, 77);

        System.out.println("\n\n5. Compare Sum Of Half  method.");
        compareSumOfHalf(MASSIVE2);


    }

    //Реализуйте метод,
    // принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз

    static void repeatString(String str, int n) {
        //   System.out.println(str.repeat(n));
        for (int i = 0; i < n; i++) {
            System.out.print(str + "|");
        }
    }

    //-Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // суммирующий все элементы, значение которых больше 5,
    // и печатающий полученную сумму в консоль.

    static void sumOfMassive(int[] mas) {
        int res = 0;
        for (int item : mas)
            if (item > 5) res += item;
        System.out.println("\nThe sum of massive is " + res);

    }

    //       -Реализуйте метод,
//       принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//       метод должен заполниться каждую ячейку массива указанным числом.
    static void fillTheMassiveWhith(int[] mas, int value) {
        System.out.println("Massive before");

        printMssive(mas);

        // Arrays.fill(mas, value);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = value;
        }

        System.out.println("\nMassive after");
        printMssive(mas);
    }

    //   -Реализуйте метод,
//   принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//   увеличивающий каждый элемент которого на указанное число.
    static void massiveAdd(int[] mas, int value) {
        System.out.println("Massive before");
        printMssive(mas);

        for (int i = 0; i < mas.length; i++) {
            mas[i] += value;
        }

        System.out.println("\nMassive after");
        printMssive(mas);
    }

    //      -Реализуйте метод,
    //      принимающий в качестве аргумента целочисленный массив,
    //      и печатающий в консоль сумма элементов какой из половин массива больше.
    static void compareSumOfHalf(int[] mas) {
        int theSumOfTheFirstHalfOfMas = 0, theSumOfTheSecondHalfOfMas = 0;
        printMssive(mas);

        for (int i = 0; i < mas.length / 2; i++) {
            theSumOfTheFirstHalfOfMas += mas[i];
            theSumOfTheSecondHalfOfMas += mas[mas.length - i - 1];
        }
        System.out.println("\n"+theSumOfTheFirstHalfOfMas);
        System.out.println(theSumOfTheSecondHalfOfMas);
        if (theSumOfTheFirstHalfOfMas == theSumOfTheSecondHalfOfMas)
            System.out.println("The results are equals");
        else System.out.println("The result is " +
                ((theSumOfTheFirstHalfOfMas > theSumOfTheSecondHalfOfMas) ? "\nThe first sum is bigger" : "The second sum is bigger"));

    }


    static void printMssive(int[] mas) {
        for (int item : mas)
            System.out.print(item + " ");
    }


}

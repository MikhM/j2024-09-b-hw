package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class MyApplication {
    public static int[] MASSIVE = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static void main(String[] args) {
        System.out.println("\n\n1. repeat string method result\n");
        repeatString(" brilliant ", 111);

        System.out.println("\n\n2. the sum of massive method. \n initial massive");
        for (int item : MASSIVE)
            System.out.print(item + " ");
        sumOfMassive(MASSIVE);


        System.out.println("\n3. the fillTheMassiveWhith method. \n");
        fillTheMassiveWhith(MASSIVE,77);

    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз

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
            res += item;
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

//   -Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.






    static void printMssive(int[] mas) {
        for (int item : mas)
            System.out.print(item + " ");
    }



//            -Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.


}

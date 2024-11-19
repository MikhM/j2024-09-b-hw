package ru.otus.java.basic.homeworks.hw7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MyApplication {
    static public final int[][] ARRAY1 = {{1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 99, 7, 8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8}};
    static public final int[][] ARRAY2 = {{1, 2, 3, 4, 4, 5, 6, 6, 7, -8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, -8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, -8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, -8},
            {1, 2, 3, 4, 4, 5, 6, 6, 7, 8}};

    public static void main(String[] args) {

        System.out.println("\n1. sum of postive items of ARRAY2");
        System.out.println("Sum=" + sumOpositiveValues(ARRAY2));

        System.out.println("\n2. Squres of stars 1, 3 and 10 size");
        squareOfStars(1);
        System.out.println();
        squareOfStars(3);
        System.out.println();
        squareOfStars(10);

        System.out.println("\n3. Zerros to both diogonals");
        zerroToDiogonals(ARRAY1);

        System.out.println("\n4 Max value of array");
        printArray2D(ARRAY1);
        System.out.println("Max value=" +maxValue(ARRAY1));
        printArray2D(ARRAY2);
        System.out.println("Max value=" +maxValue(ARRAY2));

        //     Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует, то в качестве результата необходимо вернуть -1

        System.out.println("\n5 Max value of array");
        printArray2D(ARRAY1);
        System.out.println("Max value=" +maxValue(ARRAY1));
        printArray2D(ARRAY2);
        System.out.println("Max value=" +maxValue(ARRAY2));



    }


    //    Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    private static int sumOpositiveValues(int[][] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(array1[i][j] + " ");
                if (array1[i][j] > 0) sum += array1[i][j];
            }
            System.out.println();
        }
        return sum;
    }


    //    Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;

    private static void squareOfStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);

    private static void zerroToDiogonals(int[][] array) {
        System.out.println("Array before");
        printArray2D(array);
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - i - 1] = 0;
        }
        System.out.println("Result array");
        printArray2D(array);
    }

    private static void printArray2D(int[][] array) {

        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }
    //    Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

    private static int maxValue(int[][] array) {
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (maxVal < array[i][j])
                    maxVal = array[i][j];
            }
        }
        return maxVal;
    }


}
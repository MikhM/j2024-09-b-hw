package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class MyApplication {
    public static final int[] MASSIF1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    public static final int[] MASSIF3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final int[] MASSIF2 = {1, 1, 1, 1, 1, 1, 1};
    public static final int[] MASSIF4 = {8, 8, 3, 1, 1, 1, 1};
    public static final int[] MASSIF5 = {1, 1, 1, 1, 1, 5};
    public static final int[] MASSIF6 = {5, 3, 4, -2};


    public static void main(String[] args) {
        System.out.println("\n\n1. repeat string method result\n");
        repeatString(" brilliant ", 111);

        System.out.println("\n\n2. the sum of massif method. \n initial massif");
        for (int item : MASSIF1)
            System.out.print(item + " ");
        sumOfMassive(MASSIF1);

        System.out.println("\n3. the fillTheMassiveWhith method. \n");
        fillTheMassiveWhith(MASSIF1, 77);

        System.out.println("\n\n4. the massif add value method.");
        massifAddValue(MASSIF2, 77);

        System.out.println("\n\n5. Compare Sum Of Half method.");
        compareSumOfHalf(MASSIF2);

        System.out.println("\n\n6.  Sums Of massifs to massif  method.");
        calculateSumOfMas(MASSIF1, MASSIF2, MASSIF1);

        System.out.println("\n\n7.  111.");
        invertMassive(MASSIF3);

        System.out.println("\n\n8.  Check asc dsc order.");
        checkOrderInMassif(MASSIF3, true);
        checkOrderInMassif(MASSIF3, false);
        checkOrderInMassif(MASSIF4, false);
        checkOrderInMassif(MASSIF2, false);

        System.out.println("\n\n9.  Array sum method.");
        arraySum(MASSIF1, MASSIF2, MASSIF3, MASSIF4);


        System.out.println("\n\n9.  Array sum method.");
        checkBalancePoint(MASSIF4);
        checkBalancePoint(MASSIF5);
        checkBalancePoint(MASSIF6);
    }

    private static void checkOrderInMassif(int[] massif3, boolean isOrderAsc) {

        System.out.println("\nTest massive is ");
        printMassif(massif3);
        System.out.println("Check ascending order is " + isOrderAsc);
        if (isOrderAsc)
            System.out.println((isMassifAscending(massif3)) ? "Massif is in Ascending order! " : "Massif is NOT in Ascending order! ");
        else
            System.out.println((isMassifDescending(massif3)) ? "Massif is in Descending order! " : "Massif is NOT in Descending order! ");


    }

    //Реализуйте метод,
    // принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз

    static void repeatString(String str, int n) {

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
        System.out.println("\nThe sum of massif val>5 is " + res);

    }

    //      -Реализуйте метод,
//       принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//       метод должен заполниться каждую ячейку массива указанным числом.
    static void fillTheMassiveWhith(int[] mas, int value) {
        System.out.println("Massive before");

        printMassif(mas);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = value;
        }
        System.out.println("\nMassive after");
        printMassif(mas);
    }

    //   -Реализуйте метод,
//   принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//   увеличивающий каждый элемент которого на указанное число.
    static void massifAddValue(int[] mas, int value) {
        System.out.println("Massive before");
        printMassif(mas);

        for (int i = 0; i < mas.length; i++) {
            mas[i] += value;
        }

        System.out.println("\nMassive after");
        printMassif(mas);
    }

    //      -Реализуйте метод,
    //      принимающий в качестве аргумента целочисленный массив,
    //      и печатающий в консоль сумма элементов какой из половин массива больше.

    static void compareSumOfHalf(int[] mas) {
        int theSumOfTheFirstHalfOfMas = 0, theSumOfTheSecondHalfOfMas = 0;
        printMassif(mas);

        for (int i = 0; i < mas.length / 2; i++) {
            theSumOfTheFirstHalfOfMas += mas[i];
            theSumOfTheSecondHalfOfMas += mas[mas.length - i - 1];
        }

        System.out.println("\n" + theSumOfTheFirstHalfOfMas);
        System.out.println(theSumOfTheSecondHalfOfMas);
        if (theSumOfTheFirstHalfOfMas == theSumOfTheSecondHalfOfMas)
            System.out.println("The results are equals");
        else System.out.println("The result is " +
                ((theSumOfTheFirstHalfOfMas > theSumOfTheSecondHalfOfMas) ? "\nThe first sum is bigger" : "The second sum is bigger"));
    }


    static public void calculateSumOfMas(int[]... mas) {
        int[] resultMas = new int[mas.length];
        int sumOfMas = 0, i = 0;

        for (int[] item : mas) {
            for (int internalItem : item) {
                System.out.print(internalItem + " ");
                sumOfMas += internalItem;
            }

            System.out.println();
            resultMas[i] = sumOfMas;
            sumOfMas = 0;
            i++;
        }
        printMassif(resultMas);
    }

    static void printMassif(int[] mas) {
        for (int item : mas)
            System.out.print(item + " ");
        System.out.println();
    }


    /*
     *  Реализуйте метод, принимаĀûий на вход набор øелоùисленнýх массивов, и полуùаĀûий новýй
     * массив равнýй сумме входāûих;
     * Пример:
     *    { 1, 2, 3 }
     *  + { 2, 2 }
     *  + { 1, 1, 1, 1, 1}
     *  = { 4, 5, 4, 1, 1 }
     *
     */
    static void arraySum(int[]... masD2) {
        int maxLength = 0;
        System.out.println("Initial arrays");
        int[] resultArray = {0};
        int dimensionsOfI = 0;
        for (int[] masD1 : masD2) {
            System.out.println(Arrays.toString(masD1));

            //sum next lines
            if (dimensionsOfI != 0) {
                // if dimension of next line is less or =
                if (dimensionsOfI > masD1.length) {
                    int k = 0;
                    for (int item : masD1) {
                        resultArray[k] += item;
                        k++;
                    }
                    //if dimension of next line is bigger
                } else {
                    int[] j = new int[masD1.length];
                    int k = 0;
                    for (int item : masD1) {
                        j[k] = resultArray[k] + item;
                        k++;
                    }
                    resultArray = j;
                    dimensionsOfI = masD1.length;
                }
            }
            // copy first line to i
            if (dimensionsOfI == 0) {
                resultArray = new int[masD1.length];
                int k = 0;
                for (int item : masD1) {
                    resultArray[k] = item;
                    k++;
                }
                dimensionsOfI = masD1.length;
            }
        }
        System.out.println("Result line is" + Arrays.toString(resultArray));
    }

    /*
     * ● Реализуйте метод, проверāĀûий ùто естþ “тоùка” в массиве, в которой сумма левой и правой ùасти
     * равнý. “Тоùка находитсā между ÿлементами”;
     * Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }

     */

    static void checkBalancePoint(int[] array) {
        System.out.println("Input array \n" + Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++) {
            if (sumBefore(array, i) == sumAfter(array, i+1)) {
                System.out.println("Point is present and index is " + i);
                return;
            }

        }
        System.out.println("Point isn't present");
    }

    static int sumBefore(int[] array, int index) {
        if (index > array.length) {
            //todo generate exception
            System.out.println("Wrong index");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int sumAfter(int[] array, int index) {
        if (index > array.length) {
            //todo generate exception
            System.out.println("Wrong index");
            return 0;
        }
        int sum = 0;
        for (int i = index; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    /***************
     *
     * Реализуйте метод, проверāĀûий ùто все ÿлементý массива идут в порāдке убýваниā или
     * возрастаниā (по вýбору полþзователā)
     *
     *******/

    static boolean isMassifAscending(int[] mas) {

        for (int i = 0; i < mas.length - 1; i++) {

            if (mas[i] >= mas[i + 1]) return false;

        }
        return true;
    }

    static boolean isMassifDescending(int[] mas) {

        for (int i = 0; i < mas.length - 1; i++) {

            if (mas[i] <= mas[i + 1]) return false;

        }
        return true;
    }


    /**************
     *
     *  Реализуйте метод, “перевораùиваĀûий” входāûий массив
     *  Пример: { 1 2 3 4 } => { 4 3 2 1 }
     *
     * */

    static void invertMassive(int[] mas) {
        System.out.println("Massive before");
        printMassif(mas);
        for (int i = 0, tmp; i < mas.length / 2; i++) {
            tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
        System.out.println("\nMassive turned out");
        printMassif(mas);
    }

}

package ru.otus.java.basic.homeworks.hw3;

/*
 * (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
 * (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
 * (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением. Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
 * (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 * (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
 * Каждый метод последовательно вызовите из метода main();
 * (*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод, соответствующий указанному номеру со случайным значением аргументов;
 *
 *
 * */


import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class MyApplication {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String SUM_IS_POSITIVE = "Сумма положительная";
    public static final String SUM_IS_NEGATIVE = "Сумма отрицательная";

    public static final int MAX_DIGIT = 99;


    public static final String MENU = """
            
                Menu
            
            1. Method greetings - Output 4 word in column: Hello, World, from, Java
            2. Method checkSign - the sum of 3 int a, b и c. In case of 0 or greater, output /“Сумма положительная/”, and if less then 0 output /“Сумма отрицательная/”
            3. Method selectColor - random int data. if data < 10, output to console Red message, if  10 <= data >= 20 so, Ÿellow, if data > 20 - “Green”
            4. Method compareNumbers , random int variable a and b. if  a >= b, output to console “a >= b”, otherwice “a < b”
            5. Method addOrSubtractAndPrint(int initValue, int delta, boolean increment). if increment = true, so method add initValue to delta and output result, in other case substract;
            6. Random generator debug method 100 sign 100 unsign and 100 sign numbers
            
                 Enter digit value between 1 and 6 for choose option and 0 for exit.
            """;

    public static final int OPTIONS_QUANTITY = 6;

    public static void main(String[] args) {
        runMenu();
    }

    static void runMenu() {
        int i;
        do {
            clearConsole();
            System.out.print(MENU);
            i = getOptionValueAndValidate(OPTIONS_QUANTITY);
            switch (i) {
                case 1:
                    greetings("Hello", "World", "from", "Java");
                    break;
                case 2:
                    checkSign(getSignRandomInt(MAX_DIGIT), getSignRandomInt(MAX_DIGIT), getSignRandomInt(MAX_DIGIT));
                    break;
                case 3:
                    selectColor(getUnsingRandomInt(30));
                    break;
                case 4:
                    compareNumbers(getSignRandomInt(MAX_DIGIT), getSignRandomInt(MAX_DIGIT));
                    break;
                case 5:
                    addOrSubtractAndPrint(getSignRandomInt(MAX_DIGIT), getSignRandomInt(MAX_DIGIT), getRandomSign() == 1);
                    break;
                case 6:
                    debugRandomGenerator();
                    break;
            }

        } while (i != 0);
    }

    private static void greetings(String @NotNull ... listForOutput) {
        for (String item : listForOutput) {
            System.out.println("\t\t" + item);
        }
    }

    private static int getOptionValueAndValidate(int optionsQuantity) {
        Scanner scanner = new Scanner(System.in);
        int result;
        do {
            result = scanner.nextInt();
            if (result < 0 || result > optionsQuantity)
                System.out.println("The entered value between 0 and " + optionsQuantity + " Please enter another one digit");
        } while (result < 0 || result > optionsQuantity);
        return result;
    }


    private static void compareNumbers(int a, int b) {
        System.out.println("\tRandom values a and b are\n\t" + a + ", " + b);
        System.out.println("\tResult of comparison method is " + ((a < b) ? "a<b" : "a>=b"));
    }

    /****
     * 3. Method selectColor - в теле которого задайте int переменную data с любым начальным значением.
     * Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
     * если от 10 до 20 включительно, то “Желтый”,
     * если больше 20 - “Зеленый”
     * */
    private static void selectColor(int date) {

        final int RED_THRESHOLD = 10;
        final int YELLOW_THRESHOLD = 20;


        System.out.println("\tDate is " + date);
        String resultColor;

        if (date > YELLOW_THRESHOLD) resultColor = ANSI_GREEN + "Green";
        else if (date >= RED_THRESHOLD) resultColor = ANSI_YELLOW + "Yellow";
        else resultColor = ANSI_RED + "Red";

        System.out.format("\tMessage is %s%s !!!", resultColor, ANSI_RESET);
    }

    private static void checkSign(int signRandomInt, int signRandomInt1, int signRandomInt2) {
        System.out.println("\tRandom values are\n\t" + signRandomInt + ", " + signRandomInt1 + ", " + signRandomInt2);

        int sum = signRandomInt + signRandomInt1 + signRandomInt2;
        System.out.println("\nResult:" + sum + " " + ((sum >= 0) ? SUM_IS_POSITIVE : SUM_IS_NEGATIVE));
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("\tRandom values are\n\t" + initValue + ", " + delta + ", " + increment);
        System.out.format("\tResult=%d", (increment ? initValue + delta : initValue - delta));

    }

    private static int getUnsingRandomInt(int maxValue) {
        return (int) (Math.random() * maxValue);
    }

    private static int getRandomSign() {
        return (getUnsingRandomInt(2) == 0) ? -1 : 1;
    }


    private static int getSignRandomInt(int maxValue) {
        return getRandomSign() * getUnsingRandomInt(maxValue);

    }

    static void apply100times(IntUnaryOperator meth) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append(meth.applyAsInt(20) + " ");
        }
        System.out.println(result);
    }


    private static void debugRandomGenerator() {

        String rezult = "";
        for (int i = 0; i < 100; i++) {
            rezult = rezult + " " + getRandomSign();
        }
        System.out.println(rezult);

        apply100times(MyApplication::getUnsingRandomInt);
        apply100times(MyApplication::getSignRandomInt);

    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

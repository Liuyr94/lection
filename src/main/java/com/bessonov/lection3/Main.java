package com.bessonov.lection3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doVarargsDemo("VARARGS", new int[0]);
        doVarargsDemo("VARARGS");
        doVarargsDemo("VARARGS", 1, 4, 6, 124, 1298, 1, 4, 6, 124, 1298);
    }

    static void doVarargsDemo(String title, int... values) {
        System.out.println(title);
        System.out.println("Size: " + values.length);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
//        drawArray(values);
    }

    static String doFormattingDemo3(String name) {
        String template = "Hello, World! My name is %s";
        return String.format(template, name);
    }

    static void doFormattingDemo2() {
        float f = 184.1889799F;
        System.out.printf("Value: %.3f", f);
    }

    static void doFormattingDemo() {
        int[] digits = createArray();
        drawArray(digits);
    }

    static void doRandomDemo() {
        Random random = new Random();
        double[] values = createDoubleArray();

        int min = -5;
        int max = 5;

        for (int i = 0; i < values.length; i++) {
//            values[i] = random.nextInt();
            /**
             * Generates double value in range [0.0, 1.0)
             */
//            values[i] = Math.random() * (max - min) + min;
            /**
             * Generates value in range [0, N)
             */
            values[i] = random.nextInt(max - min) + min;
        }

        drawArray(values);
    }

    static double[] createDoubleArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array size...");
        int size = scanner.nextInt();
        System.out.println("Size: " + size);
        return new double[size];
    }

    static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array size...");
        int size = scanner.nextInt();
        System.out.println("Size: " + size);
        return new int[size];
    }

    static void doScannerDemo() {
        int[] digits = createArray();
        drawArray(digits);
    }

    static void doScannerDemo(boolean a) {
        int[] digits = createArray();
        drawArray(digits);
    }

    static void doScannerDemo(boolean a, int b) {
        int[] digits = createArray();
        drawArray(digits);
    }

    static void doScannerDemo(int b, boolean a) {
        int[] digits = createArray();
        drawArray(digits);
    }


    static void drawArray(double[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void drawArray(int[] values) {
        String message = "[%d] => %s%n";
        for (int i = 0; i < values.length; i++) {
            System.out.printf(message, i, values[i]);
        }
        System.out.println();
    }

    static void drawArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void drawArray(float[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

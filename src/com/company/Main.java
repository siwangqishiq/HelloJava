package com.company;

import java.util.Arrays;

public class Main {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[] a = new int[SIZE];

        int index = 0;
        do {
            int value = (int) (Math.random() * 5);
            if (hasSameElement(a, index, value)) {
                continue;
            }
            a[index++] = value;
        } while (index < SIZE);

        System.out.println(Arrays.toString(a));
    }

    private static boolean hasSameElement(int[] data, int offset, int value) {
        for (int i = 0; i < offset; i++) {
            if (value == data[i]) {
                return true;
            }
        }
        return false;
    }
}

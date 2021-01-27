package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int n = 0;
        for (int i = 0; i < left.length; i++) {
         n += left[i].length;
        }
        int[] rsl = new int[n];
        for (int i = 0; i < n;) {
            for (int j = 0; j < left.length; j++) {
                for (int k = 0; k < left[j].length; k++) {
                    rsl[i++] = left[j][k] > right[j][k] ? left[j][k] : right[j][k];
                }

            }
        }
        return rsl;
    }
}
package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int n = 0;
        for (int i = 0; i < left.length; i++) {
            n = n + left[i].length;
        }
        int [] a = new int[n];
        int count = 0;
        for(int k = 0; k < left.length; k++){
            for(int j = 0;  j < left[k].length && j < right[k].length; j++)
                if (left[k][j] <= right[k][j]) {
                    a[count++] = right[k][j];
                } else
                    a[count++] = left[k][j];

        }
        return a;
    }
}
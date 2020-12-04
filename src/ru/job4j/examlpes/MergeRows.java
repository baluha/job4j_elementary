package ru.job4j.examlpes;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
            n++;
            }

        }
        int[] rsl = new int[n];
        for (int i = 0, count = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count++] = data[i][j];
            }
        }
        return rsl;
    }
}
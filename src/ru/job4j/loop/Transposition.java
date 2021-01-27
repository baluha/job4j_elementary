package ru.job4j.loop;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int[][] rsl = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rsl[j][i] = matrix[i][j];
            }
        }
return rsl;
    }
}

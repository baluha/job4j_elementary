package ru.job4j.examlpes;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int tmp;
        for(int i = 0; i < data.length; i++){
            tmp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = tmp;
        }

    }
}

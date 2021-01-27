package ru.job4j.loop;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int a = 1;
        int max = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i])
                a++;
            else a = 1;
            if (a > max) max = a;

        }
        return max;
    }

}

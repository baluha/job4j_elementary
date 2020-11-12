package ru.job4j.array;

public class Sum {
    public static int getSum(int[] array) {
       int sum = 0;
       sum = array[0] + array[array.length - 1];
        return sum;
        }
    }

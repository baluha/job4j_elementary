package ru.job4j.array;


public class NumberToArray {
    public static int[] resolve(int number) {
        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = 0 ; i < s.length(); i++) {
            arr[i] = number % 10;
            number /= 10;

        }
        return  arr;
    }
}
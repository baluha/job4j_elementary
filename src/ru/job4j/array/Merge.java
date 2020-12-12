package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        System.arraycopy(left, 0, rsl,  0, left.length);
        System.arraycopy(right, 0, rsl, left.length, right.length);
        SortSelected.sort(rsl);
        return rsl;
    }
}
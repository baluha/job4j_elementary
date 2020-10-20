package ru.job4j.condition;

public class Max {
    public static int maxint (int left, int right) {
        int point = left > right ? left : right;
        return point;

    }

    public static void main(String[] args) {
        int maximum = Max.maxint(2, 1);
        System.out.println(maximum);
    }
}

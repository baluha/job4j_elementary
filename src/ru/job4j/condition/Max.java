package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int point = first > second ? first : second;
        return point;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        int maxmum = Max.max(3, 1);
        System.out.println(maxmum);
        int max3num = Max.max(2, 3, 4);
        System.out.println(max3num);
        int max4num = Max.max(2, 3, 4, 5);
        System.out.println(max4num);
    }
}

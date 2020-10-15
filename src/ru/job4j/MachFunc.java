package ru.job4j;

public class MachFunc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MachFunc.func1(3);
        int result2 = MachFunc.func1(5);
        int total = result1 + result2;
        System.out.println(total);
        int result3 = MachFunc.func1(100);
        int total2 = result3;
        System.out.println(total2);
    }
}
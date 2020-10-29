package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] func = new int[5];
        for (int i = 0; i < func.length; i++) {
            func[i] = i;
        }
        for (int i = 0; i < func.length; i++) {
            System.out.println(func[i]);

        }
    }
}

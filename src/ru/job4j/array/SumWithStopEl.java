package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int a = 0;
        for (int i = 0; i < data.length;) {
            a += data[i];
            i++;
            if (data[i] == el) {
                if (a % 2 == 0) {
                    return a;
                } else  {
                    a = 0;
                    return a;
                }
            }
        }
        return  a;
    }
}

package ru.job4j.array;

public class Maxpremax {
    public static void main(String args[]) {
        int[] a = new int[]{85, 144, 62, 1, 84, 4, 3, 55, 7, 3, 9};
        int max = 0;
        int max2 = 0;

        {
            for (int i = 0; i < a.length; i++) {
                if (max < a[i])
                    max = a[i];
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] == max)
                    continue;
                if (max2 < a[i])
                    max2 = a[i];
                }

            }
            System.out.println(max);
            System.out.println(max2);
        }


    }


package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        if (((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0) || (number % 7 == 0))) {
            return false;
        }
        else  if ((number == 2) || (number == 3) || (number == 5) || (number == 7)) {
            return true;
        }
        else return true;
        }

    }


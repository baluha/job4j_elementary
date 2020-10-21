package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean byFriend) {
        if (hasMoney || byFriend) {
            System.out.println("I can kgo to the club");
        } else {
            System.out.println("I can't it");
        }

    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}

package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello " + name);

    }
    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;  // Это, получается, мусор??
        ArgMethod.hello(name); // В методе hello всего один параметр name!!!
    }
}

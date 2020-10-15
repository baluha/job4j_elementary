package ru.job4j.ru.job4j.calculator;

public class Treinee {
    public class Argmethod{
        public static void hello(String name){
            System.out.println("Hello, " + name);
        }
        public static void main(String[]args){
            String name = "Vasilii Vasev";
            Argmethod.hello(name);
        }
    }
}

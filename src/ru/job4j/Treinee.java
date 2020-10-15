package ru.job4j;

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

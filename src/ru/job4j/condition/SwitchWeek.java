package ru.job4j.condition;

public class SwitchWeek {public String nameOfDay(int day) {
    String name;
    switch(day) {
    case 1 :
        name = "понедельник";
        case 2 :
            name = "вторник";
        case 3 :
            name = "среда";
        case 4 :
            name = "четверг";
        case 5 :
            name = "пятница";
        case 6 :
            name = "суббота";
        case 7 :
            name = "воскресение";
        return name;
}

}
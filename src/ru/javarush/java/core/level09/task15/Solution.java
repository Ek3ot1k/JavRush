package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";
        System.out.println(first.compareTo(second));
        first="banana";
        second="apple";
        System.out.println(first.compareTo(second));
        // Сравниваем строки лексикографически:


        // Меняем значения переменных местами


        // Повторяем сравнение после обмена

    }
}
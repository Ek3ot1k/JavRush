package ru.javarush.java.core.level09.task16;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные с email-адресами
        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";

        // Сравниваем email-адреса без учёта регистрa
        boolean isEmail=emailOne.equalsIgnoreCase(emailTwo);
        System.out.print(isEmail+" ");
        String registrationMessage = "user@example.com is registered";
        boolean isContains=registrationMessage.contains("example");
        System.out.println(isContains);
        // Создаем сообщение о регистрации пользователя


        // Проверяем, содержит ли сообщение подстроку "example"


        // Выводим оба результата в одной строке через пробел

    }
}
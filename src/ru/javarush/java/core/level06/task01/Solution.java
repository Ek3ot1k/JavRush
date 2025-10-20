package ru.javarush.java.core.level06.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем уровень персонажа (тип byte)
        byte characterLevel=2;
        // Объявляем показатель брони (тип short)
        short armorRating=323;
        // Объявляем накопленный опыт (тип int)
        int experiencePoints=53245;
        // Объявляем количество золотых монет (тип long)
        long goldCoins=39502;
        // Объявляем сопротивление магии (тип float)
        float magicResistance=54.6f;
        // Объявляем шанс критического удара (тип double)
        double criticalHitChance=93.59;

        // Выводим каждую характеристику героя на новой строке
        System.out.println(characterLevel);
        System.out.println(armorRating);
        System.out.println(experiencePoints);
        System.out.println(goldCoins);
        System.out.println(magicResistance);
        System.out.println(criticalHitChance);

    }
}
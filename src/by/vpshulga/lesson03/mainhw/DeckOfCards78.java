package by.vpshulga.lesson03.mainhw;

import java.util.Random;

/**
 * 7. Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
 * Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
 * Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
 */
public class DeckOfCards78 {
    private static String[] nominals = {"2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static String[] fullDeck = new String[52];
    private static Random random = new Random();

    private static String[] makeFullDeck() {
        for (int i = 0, j = 0; i < fullDeck.length; i++, j++) {
            fullDeck[i] = nominals[i % 13] + " of " + suits[j % 4];
        }
        return fullDeck;
    }

    static void randomCard() {
        System.out.println("Задача 7:");
        int randomIndex = random.nextInt(fullDeck.length);
        System.out.println(makeFullDeck()[randomIndex]);
        System.out.println("--------------------------------------------------------");
    }

    private static String[] shuffle(String[] array) {
        int counter = 0;
        String tmp;
        int randomIndex;
        while (counter < 20) {
            for (int i = 0; i < array.length; i++) {
                tmp = array[i];
                randomIndex = random.nextInt(array.length);
                array[i] = array[randomIndex];
                array[randomIndex] = tmp;
            }
            counter++;
        }
        return array;
    }

    static void printShuffledDeck() {
        System.out.println("Задача 8:");
        String[] shuffledFullDeck = shuffle(makeFullDeck());
        for (int i = 0; i < shuffledFullDeck.length; i++) {
            System.out.print(shuffledFullDeck[i] + " ");
            if ((i + 1) % 13 == 0 && i != 0) {
                System.out.println("");
            }
        }
        System.out.println("--------------------------------------------------------");
    }
}

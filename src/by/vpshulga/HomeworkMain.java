package by.vpshulga;

import java.util.Scanner;

public class HomeworkMain {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        checkWordsForEquals();
        chooseCorrectFormOfWordUseIfElse();
        chooseCorrectFormOfWordUseSwitch();
        System.out.println("Задача 3 год для проверки");
        int year = sc.nextInt();
        System.out.println(checkLeapYear(year));
        System.out.println(checkRealDate());

    }

    /**
     * 1. Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
     Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
     Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
     Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
     */
    private static void checkWordsForEquals(){
        System.out.println("Задача 1 1-е слово:");
        String firstWord = sc.next();
        System.out.println("Задача 1 2-е слово:");
        String secondWord = sc.next();


        if (firstWord.equals(secondWord)){
            System.out.println("Отлично! Слова одинаковы.");
        }
        else if (firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (firstWord.length() == secondWord.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
        else {
            System.out.println("Совсем разные");
        }
    }

    /**
     * 2. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
     Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
     a. Использовать конструкцию if-else.
     b. Модифицировать в switch в отдельном файле.

     */
    private static void chooseCorrectFormOfWordUseIfElse(){
        System.out.println("Задача 2(if-else) кол-во рублей:");
        int countRubles = sc.nextInt();

        if (countRubles % 10 == 1 && countRubles % 100 != 11){
            System.out.println(countRubles + " рубль");
        }
        else if (countRubles % 10 > 1 && countRubles % 10 < 5 && countRubles % 100 != 12
                && countRubles % 100 != 13 && countRubles % 100 != 14){
            System.out.println(countRubles + " рубля");
        }
        else{
            System.out.println(countRubles + " рублей");
        }
    }

    private static void chooseCorrectFormOfWordUseSwitch(){
        System.out.println("Задача 2(switch) кол-во рублей:");
        int countRubles = sc.nextInt();
        int ostatokHund = countRubles % 100;
        int ostatokTen = countRubles % 10;

        switch (ostatokTen){
            case 1:
                if (ostatokHund != 11){
                    System.out.println(countRubles + " рубль");
                }
                else{
                    System.out.println(countRubles + " рублей");
                }
                break;
            case 2:
                if (ostatokHund != 12){
                    System.out.println(countRubles + " рубля");
                }
                else{
                    System.out.println(countRubles + " рублей");
                }
                break;
            case 3:
                if (ostatokHund != 13){
                    System.out.println(countRubles + " рубля");
                }
                else{
                    System.out.println(countRubles + " рублей");
                }
                break;
            case 4:
                if (ostatokHund != 14){
                    System.out.println(countRubles + " рубля");
                }
                else{
                    System.out.println(countRubles + " рублей");
                }
                break;
            default:
                System.out.println(countRubles + " рублей");
        }
    }

    /**
     * 3. Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
     Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то этот год не високосный, за исключением годов, делящихся на 400.
     Например:
     1992 - високосный
     1900 - не високосный
     2000 - високосный

     * @param year
     * @return
     */
    private static boolean checkLeapYear(int year){
        if (year % 400 != 0 && year % 100 == 0){
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 4*. Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
     Программа должна определять, является ли введённая дата реальной и выводить результат.
     Использовать следующую информацию:
     Январь, март, май, июль, август, октябрь, декабрь - 31 день
     Апрель, июнь, сентябрь, ноябрь - 30 дней
     Февраль - 28 дней в обычный год, 29 дней в високосный

     * @return
     */
    private static boolean checkForLongMonth(int month){
        return month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12;
    }

    private static boolean checkForShortMonth(int month){
        return month == 4 || month == 6 || month == 9 || month == 11;
    }
    private static boolean checkDayForLongMonth(int day){
        return day >= 1 && day <= 31;
    }

    private static boolean checkDayForShortMonth(int day){
        return day >= 1 && day <= 30;
    }

    private static boolean checkRealDate(){
        System.out.println("Задача 4 день:");
        int day = sc.nextInt();
        System.out.println("Задача 4 месяц:");
        int month = sc.nextInt();
        System.out.println("Задача 4 год:");
        int year = sc.nextInt();
        boolean isLeapYear  = checkLeapYear(year);
        if (isLeapYear){
            if (checkForLongMonth(month)){
                return checkDayForLongMonth(day);
            }
            else if (checkForShortMonth(month)){
                return checkDayForShortMonth(day);
            }
            else if (month == 2){
                return day >= 1 && day <= 29;
            }
            else {
                return false;
            }
        }
        else {
            if (checkForLongMonth(month)){
                return checkDayForLongMonth(day);
            }
            else if (checkForShortMonth(month)){
                return checkDayForShortMonth(day);
            }
            else if (month == 2){
                return day >= 1 && day <= 28;
            }
            else{
                return false;
            }
        }
    }
}

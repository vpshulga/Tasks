package by.vpshulga.lesson02;

import java.util.Scanner;

import static by.vpshulga.lesson02.HomeworkMain.*;

public class Homework {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(nextDate());
        System.out.println(checkArea());
        System.out.println(roots());
    }

    /**
     * 1. Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
     Вывести дату следующего дня в формате "День.Месяц.Год".
     Учесть переход на следующий месяц, а также следующий год.
     Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
     */
    private static int nextDay(int day, int month, int year){
        if (checkForLongMonth(month)){
            if (day == 31){
                return 1;
            }
            else {
                return day + 1;
            }
        }
        else if (checkForShortMonth(month)){
            if (day == 30){
                return 1;
            }
            else {
                return day + 1;
            }
        }
        else {
            if (checkLeapYear(year)){
                if (day == 29){
                    return 1;
                }
                else {
                    return day + 1;
                }
            }
            else {
                if (day == 28){
                    return 1;
                }
                else {
                    return day + 1;
                }
            }
        }
    }

    private static int nextMonth(int day, int month, int year){
        if (nextDay(day, month, year) == 1){
            if (month == 12){
                return 1;
            }
            else {
                return month + 1;
            }
        }
        else
            return month;
    }

    private static int nextYear(int day, int month, int year){
        if (nextMonth(day, month, year) == 1){
            return year + 1;
        }
        else {
            return year;
        }
    }

    private static String nextDate(){
        System.out.println("день");
        int day = sc.nextInt();
        System.out.println("месяц");
        int month = sc.nextInt();
        System.out.println("год");
        int year = sc.nextInt();

        int nextDay;
        int nextMonth;
        int nextYear;

        if (checkRealDate(day, month, year)){
            nextDay = nextDay(day, month, year);
            nextMonth = nextMonth(day, month, year);
            nextYear = nextYear(day, month, year);
        }
        else{
            return "Неверная дата";
        }


        return formatString(nextDay, nextMonth, nextYear);
    }

    private static String formatString(int s1, int s2, int s3){
        return s1+"." + s2 + "." +s3;
    }

    /**
     * 2. Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
     Проверить, помещаются ли эти дома на участке размерами e на f.
     Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

     */

    private static boolean checkArea(){
        System.out.println("Длина участка:");
        int e = sc.nextInt();
        System.out.println("Ширина участка:");
        int f = sc.nextInt();
        System.out.println("Длина первого дома:");
        int a = sc.nextInt();
        System.out.println("Ширина первого дома:");
        int b = sc.nextInt();
        System.out.println("Длина второго дома:");
        int c = sc.nextInt();
        System.out.println("Ширина второго дома:");
        int d = sc.nextInt();

        if ( (a + c) <= e && (b <= f && d <=f ) ){
            return true;
        }
        else if ( (a + d) <= e && (b <= f && c <=f )){
            return true;
        }
        else if ( (a + c) <= f && (b <= e && d <= e ) ){
            return true;
        }
        else if ( (a + d) <= f && (b <= e && c <=e)){
            return true;
        }
        else if ( (b + c) <= e && (a <= f && d <=f ) ){
            return true;
        }
        else if ( (b + d) <= e && (a <= f && c <=f ) ){
            return true;
        }
        else if ( (b + c) <= f && (a <= e && d <=e ) ){
            return true;
        }
        else if ( (b + d) <= f && (a <= e && c <=e ) ){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 3. Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
     Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
     При решении создать и использовать следующие вынесенные функции:
     - функция isPositive, определяющая, является ли число положительным
     - функция isZero, определяющая, является ли число нулём
     - функция discriminant, вычисляющая дискриминант

     */

    private static boolean isPositive(int n){
        return n > 0;
    }

    private static boolean isZero(int n){
        return n == 0;
    }

    private static int discriminant(int a, int b, int c){
        return (int)(Math.pow(b, 2) - 4 * a * c);
    }

    private static String roots(){
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();

        if (isZero(a)){
            return "а не может равняться 0";
        }
        else {
            if (isPositive(discriminant(a, b ,c))){
                return "Корень 1 = " + (( -b + Math.sqrt(discriminant(a,b ,c))) / 2 / a) + "\nКорень 2 = " + (( -b - Math.sqrt(discriminant(a,b ,c))) / 2 / a) ;
            }
            else if (isZero(discriminant(a, b, c))){
                return "Корень 1 = Корень 2 = " + (-b / 2 / a);
            }
            else {
                return "Нет корней, дискриминант равен 0";
            }
        }
    }
}

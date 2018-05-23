package by.vpshulga.lesson06;

import by.vpshulga.lesson06.heroes.Archer;
import by.vpshulga.lesson06.heroes.Hero;
import by.vpshulga.lesson06.heroes.Mage;
import by.vpshulga.lesson06.heroes.Warrior;

import java.util.Scanner;

public class ChooseHero {

    static Hero chooseHero(){
        Hero hero = null;
        Scanner scanner = new Scanner(System.in);
        int chosenHero;
        System.out.println("Enter name of hero:");
        String name = scanner.nextLine();
        do {
            System.out.println("Choose type of hero\n" +
                    "Archer: 1\n" +
                    "Mage: 2\n" +
                    "Warrior: 3");
            chosenHero = scanner.nextInt();
        } while (!(chosenHero == 1 || chosenHero == 2 || chosenHero == 3));


        switch (chosenHero){
            case 1:
                hero = new Archer(name, 100);
                break;
            case 2:
                hero = new Mage(name, 120);
                break;
            case 3:
                hero = new Warrior(name, 150);
        }
        return hero;
    }
}

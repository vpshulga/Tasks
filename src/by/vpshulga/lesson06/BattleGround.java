package by.vpshulga.lesson06;

import by.vpshulga.lesson06.enemies.Enemy;
import by.vpshulga.lesson06.enemies.Ghost;
import by.vpshulga.lesson06.enemies.Zombie;
import by.vpshulga.lesson06.heroes.Archer;
import by.vpshulga.lesson06.heroes.Hero;
import by.vpshulga.lesson06.heroes.Mage;
import by.vpshulga.lesson06.heroes.Warrior;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chosenHero;
        do {
            System.out.println("Ведите номер героя\n" +
                    "Archer: 1\n" +
                    "Mage: 2\n" +
                    "Warrior: 3");
            chosenHero = scanner.nextInt();
        } while (!(chosenHero == 1 || chosenHero == 2 || chosenHero == 3));

        Hero hero = null;

        switch (chosenHero){
            case 1:
                hero = new Archer("RUSLAN", 100);
                break;
            case 2:
                hero = new Mage("VLAD", 120);
                break;
            case 3:
                hero = new Warrior("VALERA", 150);
        }


        Enemy ghost = new Ghost(60);
        Enemy zombie = new Zombie(50);

        while (hero.isAlive() && (ghost.isAlive() || zombie.isAlive())) {
            hero.attackEnemy(ghost);
            hero.attackEnemy(zombie);
            ghost.returnDamage(hero);
            zombie.returnDamage(hero);
            System.out.println("");
        }

        if (hero.isAlive()) {
            System.out.println("You won, your HP: " + hero.getHealth());
        } else {
            System.out.println("You died");
        }

    }
}

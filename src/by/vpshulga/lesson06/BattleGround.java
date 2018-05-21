package by.vpshulga.lesson06;

import by.vpshulga.lesson06.enemies.Enemy;
import by.vpshulga.lesson06.enemies.Ghost;
import by.vpshulga.lesson06.enemies.Zombie;
import by.vpshulga.lesson06.heroes.Archer;
import by.vpshulga.lesson06.heroes.Hero;
import by.vpshulga.lesson06.heroes.Mage;
import by.vpshulga.lesson06.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("VALERA", 150);
        Enemy ghost = new Ghost(60);
        Enemy zombie = new Zombie(50);
        Hero mage = new Mage("VLAD", 120);
        Hero archer = new Archer("RUSLAN", 100);
//        while (warrior.isAlive() &&( ghost.isAlive() || zombie.isAlive())) {
//            warrior.attackEnemy(ghost);
//            warrior.attackEnemy(zombie);
//            ghost.returnDamage(warrior);
//            zombie.returnDamage(warrior);
//            System.out.println("");
//        }
//
//        if (warrior.isAlive()){
//            System.out.println("You won, your HP: " + warrior.getHealth());
//        } else {
//            System.out.println("You died");
//        }

//        while (mage.isAlive() &&( ghost.isAlive() || zombie.isAlive())){
//            mage.attackEnemy(ghost);
//            mage.attackEnemy(zombie);
//            ghost.returnDamage(mage);
//            zombie.returnDamage(mage);
//            System.out.println("");
//        }
//
//        if (mage.isAlive()){
//            System.out.println("You won, your HP: " + mage.getHealth());
//        } else {
//            System.out.println("You died");
//        }

        while (archer.isAlive() && (ghost.isAlive() || zombie.isAlive())) {
            archer.attackEnemy(ghost);
            archer.attackEnemy(zombie);
            ghost.returnDamage(archer);
            zombie.returnDamage(archer);
            System.out.println("");
        }

        if (archer.isAlive()) {
            System.out.println("You won, your HP: " + archer.getHealth());
        } else {
            System.out.println("You died");
        }

    }
}

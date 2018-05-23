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

        Hero hero = ChooseHero.chooseHero();


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

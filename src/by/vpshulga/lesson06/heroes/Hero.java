package by.vpshulga.lesson06.heroes;

import by.vpshulga.lesson06.Mortal;
import by.vpshulga.lesson06.enemies.Enemy;

import java.util.Scanner;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int damage;

    Hero(String name) {
        this.name = name;
    }

    private int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            enemy.takeDamage(getDamage());
            if (enemy.getHealth() < 0) {
                enemy.setHealth(0);
            }
            System.out.println(getClass().getSimpleName() + " " + getName() + " attacks " + enemy.getClass().getSimpleName() + " and deals "
                    + getDamage() + " damage" + "(" + enemy.getClass().getSimpleName() + " has " + enemy.getHealth() + " HP).");

        }
    }

    public abstract void takeDamage(int dmg);

    @Override
    public boolean isAlive() {
        return health > 0;
    }


}

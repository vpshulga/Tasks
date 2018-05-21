package by.vpshulga.lesson06.enemies;

import by.vpshulga.lesson06.Mortal;
import by.vpshulga.lesson06.heroes.Hero;

public abstract class Enemy implements Mortal {
    private int health;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void takeDamage(int dmg);

    public void returnDamage(Hero hero) {
        if (this.getHealth() > 0 && hero.isAlive()) {
            hero.takeDamage(getDamage());
            if (hero.getHealth() < 0) {
                hero.setHealth(0);
            }
            System.out.println(getClass().getSimpleName() + " attacks " + hero.getClass().getSimpleName() + " " + hero.getName() +
                    " and deals damage = " + getDamage() + "(" + hero.getClass().getSimpleName() + " " + hero.getName() + " has " + hero.getHealth() + " HP)");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}

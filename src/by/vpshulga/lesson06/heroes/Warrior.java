package by.vpshulga.lesson06.heroes;

import by.vpshulga.lesson06.enemies.Enemy;
import by.vpshulga.lesson06.Mortal;

import java.util.Random;

public class Warrior extends Hero implements Mortal {

    public Warrior(String name, int health) {
        super(name);
        this.setHealth(health);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int dmg = 17 + random.nextInt(6);
        setDamage(dmg);
        if (isCritical() && enemy.isAlive()) {
            setDamage(dmg * 2);
            System.out.println("WARRIOR USED CRIT!!!");
        }
        super.attackEnemy(enemy);
    }

    @Override
    public void takeDamage(int dmg) {
        setHealth(getHealth() - dmg);
    }

    private boolean isCritical() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance < 30;
    }
}

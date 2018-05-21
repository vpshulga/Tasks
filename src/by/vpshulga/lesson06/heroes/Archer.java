package by.vpshulga.lesson06.heroes;

import by.vpshulga.lesson06.enemies.Enemy;
import by.vpshulga.lesson06.Mortal;

import java.util.Random;

public class Archer extends Hero implements Mortal {

    public Archer(String name, int health) {
        super(name);
        setHealth(health);
    }

    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int dmg = 12 + random.nextInt(6);
        setDamage(dmg);
        if (isSplitShot() && enemy.isAlive()) {
            setDamage((int) (dmg * 0.8));
            System.out.println("SHOT WAS SPLITTED BY ARCHER");
            super.attackEnemy(enemy);
            super.attackEnemy(enemy);
        } else {
            super.attackEnemy(enemy);
        }
    }

    @Override
    public void takeDamage(int dmg) {
        setHealth(getHealth() - dmg);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    private boolean isSplitShot() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance < 30;
    }
}

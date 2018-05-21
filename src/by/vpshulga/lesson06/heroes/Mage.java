package by.vpshulga.lesson06.heroes;

import by.vpshulga.lesson06.enemies.Enemy;
import by.vpshulga.lesson06.Mortal;

import java.util.Random;

public class Mage extends Hero implements Mortal {

    public Mage(String name, int health) {
        super(name);
        setHealth(health);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int dmg = 8 + random.nextInt(6);
        setDamage(dmg);
        super.attackEnemy(enemy);
    }

    @Override
    public void takeDamage(int dmg) {
        if (isFreeze()) {
            dmg = 0;
            System.out.println("MAGE USED FREEZE SHIELD!!!");
        }
        setHealth(getHealth() - dmg);

    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    private boolean isFreeze() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance < 30;
    }
}

package by.vpshulga.lesson06.enemies;

import by.vpshulga.lesson06.heroes.Hero;

import java.util.Random;

public class Ghost extends Enemy {

    public Ghost(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int dmg) {
        if (isDodgeAttack()) {
            dmg = 0;
            System.out.println("GHOST DODGED ATTACK!!!");
        }
        setHealth(getHealth() - dmg);
    }


    @Override
    public void returnDamage(Hero hero) {
        Random random = new Random();
        int dmg = 13 + random.nextInt(6);
        setDamage(dmg);
        super.returnDamage(hero);
    }

    @Override
    public void setDamage(int damage) {

        super.setDamage(damage);
    }

    private boolean isDodgeAttack() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance < 30;
    }


}

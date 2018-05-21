package by.vpshulga.lesson06.enemies;

import by.vpshulga.lesson06.heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    private int chanceToResurrection;
    private int count = 0;

    public Zombie(int health) {
        super(health);
        Random random = new Random();
        chanceToResurrection = random.nextInt(100);
    }

    @Override
    public void takeDamage(int dmg) {
        this.setHealth(this.getHealth() - dmg);

    }

    @Override
    public void returnDamage(Hero hero) {
        Random random = new Random();
        int dmg = 10 + random.nextInt(6);
        setDamage(dmg);
        super.returnDamage(hero);
        if (this.getHealth() <= 0 && isResurrection() && count == 0) {
            this.setHealth(50);
            System.out.println("ZOMBIE WAS RESURRECTED!!!");
            count++;
        }
    }

    @Override
    public void setDamage(int damage) {

        super.setDamage(damage);
    }

    private boolean isResurrection() {
        return chanceToResurrection < 30;
    }
}

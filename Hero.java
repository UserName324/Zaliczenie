package rpg;

import java.util.Random;

// to jest project podobny do rpg gdzie są różne rasy biją się pomiędzy sobą

public abstract class Hero {
    protected String name;
    protected int health;
    protected int strength;
    protected static Random rand = new Random();
    
    // konstruktor

    public Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }
    
    // getery i setery dla argumentów

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    // funkcja ataku 

    public abstract void attack(Hero another);

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}

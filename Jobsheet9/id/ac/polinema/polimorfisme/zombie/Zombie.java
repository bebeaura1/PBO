package Jobsheet9.id.ac.polinema.polimorfisme.zombie;

public abstract class Zombie implements Destroyable {
    protected int health, level;

    public Zombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public abstract void destroyed();

    public String getZombieInfo(){
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}

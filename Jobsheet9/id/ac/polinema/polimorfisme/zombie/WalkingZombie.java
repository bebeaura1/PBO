package Jobsheet9.id.ac.polinema.polimorfisme.zombie;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level){
        super(health, level);
    }

    @Override 
    public void heal(){
        if (level == 1) {
            health = Math.min(100, health + (health * 10/100));
        } else if (level == 2) {
            health = Math.min(100, health + (health * 30/100));
        } else if (level == 3) {
            health = Math.min(100, health + (health * 40/100));
        }
    }

    @Override 
    public void destroyed(){
        health -= health * 20 / 100;
    }

    @Override 
    public String getZombieInfo(){
        String info = "";
        info += "Walking Zombie Data =\n" + super.getZombieInfo();
        return info;
    }
}

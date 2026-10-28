package Jobsheet9.id.ac.polinema.polimorfisme.zombie;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }
    
    public void destroyed(){
        strength = strength * 9 / 10;
    }

    public String getBarrierInfo(){
        return "Barrier Strength = " + strength;
    }
}

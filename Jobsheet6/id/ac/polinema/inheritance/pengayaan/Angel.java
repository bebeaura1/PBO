package Jobsheet6.id.ac.polinema.inheritance.pengayaan;

public class Angel extends Karakter {
    protected int potion;

    public Angel(String name, int level, int health, int potion){
        super(name, level, health);
        this.potion = potion;
    }

    public void cure(Karakter target){
        target.health = 100;
        potion -= 1;
    }
}

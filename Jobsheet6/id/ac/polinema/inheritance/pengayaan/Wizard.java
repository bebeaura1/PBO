package Jobsheet6.id.ac.polinema.inheritance.pengayaan;

public class Wizard extends Karakter {
    protected int spell;

    public Wizard(String name, int level, int health, int spell){
        super(name, level, health);
        this.spell = spell;
    }

    public void magic(Karakter target){
        target.health -= 50;
        spell -= 1;
    }
}

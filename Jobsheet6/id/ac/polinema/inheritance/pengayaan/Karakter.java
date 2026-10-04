package Jobsheet6.id.ac.polinema.inheritance.pengayaan;

public class Karakter {
    protected String name;
    protected int level, health;

    public Karakter(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack(Karakter target){
        target.health -= 10;
    }

    public void showStatus(){
        System.out.println(" - " + name + " ---> Level " + level + " - Healt " + health);
    }
}

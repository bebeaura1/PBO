package Jobsheet9.id.ac.polinema.polimorfisme.gambaran;

public class GambaranDasar {
    interface Vegetarian {}
    static class Animal {}
    static class Deer extends Animal implements Vegetarian {}
    static class Lion extends Animal {}
    
    public static void main(String[] args) {
        Deer d = new Deer();
        Lion l = new Lion();

        Animal a = d; // valid, deer adalah animals
        Animal a2 = l; // valid, lion adalah animals
        Vegetarian v = d; // valid, deer implements vegetarian
        // Vegetarian v2 = l; // eror lion bukan implements Vegetarian

        System.out.println("a  menunjuk objek " +  a.getClass().getSimpleName());
        System.out.println("a2 menunjuk objek " +  a2.getClass().getSimpleName());
        System.out.println("v  menunjuk objek " +  v.getClass().getSimpleName());
    }
}

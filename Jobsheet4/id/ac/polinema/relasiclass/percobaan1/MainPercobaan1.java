package Jobsheet4.id.ac.polinema.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Inter i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();
    }
}

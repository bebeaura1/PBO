package Jobsheet9.id.ac.polinema.polimorfisme.zombie;

public class MainTugas3 {
    public static void main(String[] args) {
        Zombie z = new WalkingZombie(100, 1); // ok
        System.out.println("Zombie z dibuat.");

        Destroyable d = z; // ok
        System.out.println("Destroyable d menunjuk z.");

        // Zombie z2 = d; // error kompilasi

        Zombie z3 = (Zombie) d; // ok
        System.out.println("Downcasting d ke Zombie z3.");

        // Zombie z4 = new Zombie(100, 1); // error kompilasi

        // Destroyable d2 = new Plant(); // error kompilasi

        Zombie z5 = new JumpingZombie(100, 2); // ok
        System.out.println("Mencoba casting JumpingZombie ke WalkingZombie...");
        WalkingZombie w = (WalkingZombie) z5; // error saat dijalankan
    }
}

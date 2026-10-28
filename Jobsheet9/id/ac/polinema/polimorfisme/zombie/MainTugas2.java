package Jobsheet9.id.ac.polinema.polimorfisme.zombie;

public class MainTugas2 {
    public static void main(String[] args) {
        Destroyable [] d = {
            new WalkingZombie(100, 1),
            new JumpingZombie(100, 2),
            new Barrier(100)
        };

        Plant p = new Plant();

        for (int i = 0; i < 4; i++) {
            for (Destroyable ds : d) {
                p.doDestroy(ds);
            }
        }

        for (Destroyable ds : d) {
            if (ds instanceof Zombie) {
                Zombie z = (Zombie) ds;
                z.heal();
                System.out.println(z.getZombieInfo());
            } else if (ds instanceof Barrier) {
                Barrier b = (Barrier) ds;
                System.out.println(b.getBarrierInfo());
            }
        }
    }
}

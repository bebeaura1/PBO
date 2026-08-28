package Tugas;

public class Hp extends Elektronik{
    private int kapasitasbatre, jmlkamera;

    public void kapasitasbatre(int kb){
        kapasitasbatre = kb;
    }

    public void jmlkamera(int kamera){
        jmlkamera = kamera;
    }

    @Override
    public void cetak(){
        System.out.println("\n------- HP -------");
        super.cetak();
        System.out.println("Kapasitas Batre\t: " + kapasitasbatre);
        System.out.println("Jumlah Kamera\t: " + jmlkamera);
    }
}

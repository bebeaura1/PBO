package Tugas;

public class Demo {
    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.setmerk("Vivo");
        hp.setwarna("Hitam");
        hp.kapasitasbatre(1000);
        hp.jmlkamera(2);
        hp.cetak();

        Laptop laptop = new Laptop();
        laptop.setmerk("Asus");
        laptop.setwarna("Abu-abu");
        laptop.setlebar(14);
        laptop.setram(8);
        laptop.cetak();

        Kipas kipas = new Kipas();
        kipas.setMerk("Yasaka");
        kipas.setBaling(6);
        kipas.cetak();

        Lampu lampu = new Lampu();
        lampu.setwarna("Ungu");
        lampu.setWatt(12);
        lampu.cetak();
    }
}

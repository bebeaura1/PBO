package Tugas;

public class Laptop extends Elektronik{
    private int lebarlayar, ram;

    public void setlebar(int lebar){
        lebarlayar = lebar;
    }

    public void setram(int ram){
        this.ram = ram;
    }

    @Override
    public void cetak(){
        System.out.println("\n----- Laptop -----");
        super.cetak();
        System.out.println("Lebar Layar\t: " + lebarlayar);
        System.out.println("Kapasitas RAM\t: " + ram);
    }
}

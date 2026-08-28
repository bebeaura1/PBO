package Tugas;

public class Elektronik {
    private String merk, warna;

    public void setmerk(String merk){
        this.merk = merk;
    }

    public void setwarna(String warna){
        this.warna = warna;
    }

    public void cetak(){
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Warna\t\t: " + warna);
    }
}

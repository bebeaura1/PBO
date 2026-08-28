package Tugas;

public class Lampu {
    private String warna;
    private int watt;

    public void setwarna(String warna){
        this.warna = warna;
    }
    
    public void setWatt(int watt){
        this.watt = watt;
    }

    public void cetak(){
        System.out.println("\n----- Lampu -----");
        System.out.println("Warna\t\t: " + warna);
        System.out.println("Daya Watt\t: " + watt);
    }
}

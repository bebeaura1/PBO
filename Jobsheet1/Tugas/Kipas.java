package Tugas;

public class Kipas {
    private String merk;
    private int jmlBaling;

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setBaling(int baling){
        jmlBaling = baling;
    }

    public void cetak(){
        System.out.println("\n-- Kipas Angin --");
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Jumlah Baling\"\t: " + jmlBaling);
    }
}

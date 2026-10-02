// Nama  : Aura Bintang Aprilian (05)
// NIM   : 254107020062
// Kelas : TI-2G

package Jobsheet5_Kuis;

public class Operator {
    private String nama;
    private int biayaLayanan;

    public Operator(String nama, int biayaLayanan){
        this.nama = nama;
        this.biayaLayanan = biayaLayanan;
    }

    public int getBiaya(){
        return biayaLayanan;
    }

    public String getNama(){
        return nama;
    }

    public void getOperator(){
        System.out.println("Nama Operator : " + nama);
        System.out.println("Biaya Layanan : Rp. " + biayaLayanan);
    }
}

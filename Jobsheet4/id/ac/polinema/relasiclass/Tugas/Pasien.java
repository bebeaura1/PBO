package Jobsheet4.id.ac.polinema.relasiclass.Tugas;

public class Pasien {
    private String nama, nik;

    public Pasien(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getPasien(){
        return "Nama Pasien\t: " + nama + "\nNIK\t\t: " + nik;
    }
}

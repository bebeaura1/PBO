package Jobsheet4.id.ac.polinema.relasiclass.Tugas;

public class KlinikMain {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Jarjit", "25410854269");
        Dokter dokter = new Dokter("Ros", "Nyeri otot", pasien);
        Obat obat = new Obat("Paramex");
        dokter.periksa(obat);
    }
}

package Jobsheet4.id.ac.polinema.relasiclass.Tugas;

public class Obat {
    private String namaObat;

    public Obat(String namaObat){
        this.namaObat = namaObat;
    }

    public String getObat(){
        return "Resep Obat\t: " + namaObat;
    }
}

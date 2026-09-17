package Jobsheet4.id.ac.polinema.relasiclass.Tugas;

public class Dokter {
    private String nama;
    Pasien p;
    Diagnosa d;

    public Dokter(String nama, String d, Pasien p){
        this.nama = nama;
        this.p = p;
        this.d = new Diagnosa(d);
    }

    public void periksa(Obat obat){
        System.out.println("Dokter " + nama + " memeriksa...");
        if (p != null && d != null) {
            System.out.println(
                p.getPasien() + "\n" +
                d.getKeluhan() + "\n" +
                obat.getObat()
            );
        } else {
            System.out.println("Belum ada pasien yang diperiksa");
        }
    }
}

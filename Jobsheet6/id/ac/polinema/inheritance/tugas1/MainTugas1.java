package Jobsheet6.id.ac.polinema.inheritance.tugas1;

public class MainTugas1 {
    public static void main(String[] args) {
        Pegawai p = new Pegawai("P001", "Budi", "Malang");
        Dosen d = new Dosen("D001", "Siti", "Surabaya");
        d.setSKS(12);
        DaftarGaji dg = new DaftarGaji(2);
        dg.addPegawai(p);
        dg.addPegawai(d);
        dg.printSemua();
        
    }
}

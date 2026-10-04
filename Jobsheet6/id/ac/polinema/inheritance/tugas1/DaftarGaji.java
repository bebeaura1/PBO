package Jobsheet6.id.ac.polinema.inheritance.tugas1;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlah = 0;

    public DaftarGaji(int kapasitas){
        listPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai p){
        if (jumlah < listPegawai.length) {
            listPegawai[jumlah] = p;
            jumlah++;
        } else {
            System.out.println("Kapasitas sudah penuh");
        }
    }

    public void printSemua(){
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println(listPegawai[i].getNama() + " : " + listPegawai[i].getGaji());
        }
    }
}

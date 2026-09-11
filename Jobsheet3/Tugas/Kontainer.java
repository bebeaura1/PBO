package Jobsheet3.Tugas;

public class Kontainer {
    private String nomorResi, namaPemilik;
    private double kapasitasMaksimal, beratMuatanSaatIni = 0;

    Kontainer(String plat, String nama, double kapasitas){
        this.nomorResi = plat;
        this.namaPemilik = nama;
        this.kapasitasMaksimal = kapasitas;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }

    public double getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }

    public void tambahMuatan(double muatan){
        if (muatan <= kapasitasMaksimal) {
            beratMuatanSaatIni = beratMuatanSaatIni + muatan;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

    public double getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }

    public void turunkanMuatan(double muatan){
        if (beratMuatanSaatIni > 0) {
            if (muatan < beratMuatanSaatIni * 50/100) {
                beratMuatanSaatIni = beratMuatanSaatIni - muatan;
            } else {
                System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
            }
        } else {
            System.out.println("Belum ada muatan.");
        }
    }
}

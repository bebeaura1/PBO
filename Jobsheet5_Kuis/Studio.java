// Nama  : Aura Bintang Aprilian (05)
// NIM   : 254107020062
// Kelas : TI-2G

package Jobsheet5_Kuis;

public class Studio {
    private String nama;
    private int tarifPerJam;
    private int total;

    public Studio(String nama, int tarifPerJam){
        this.nama = nama;
        this.tarifPerJam = tarifPerJam;
    }

    public int getTarif(){
        return tarifPerJam;
    }

    public int getTotal(){
        return total;
    }

    public void totalBiaya(int durasi){
        total = tarifPerJam * durasi;
    }

    public String getStudio(){
        String info = "";
        info += "Studio " + nama + " dengan tarif Rp. " + tarifPerJam + " per jam";
        return info;
    }
}

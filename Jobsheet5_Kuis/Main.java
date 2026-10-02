// Nama  : Aura Bintang Aprilian (05)
// NIM   : 254107020062
// Kelas : TI-2G

package Jobsheet5_Kuis;

public class Main {
    public static void main(String[] args) {
        Studio s = new Studio("Bebe Music", 50000);
        Operator o = new Operator("Aura", 25000);
        Reservasi r = new Reservasi("2AS1A", 2, o);
        s.getStudio();
        s.totalBiaya(2);
        r.getReservasi(s);
    }
}

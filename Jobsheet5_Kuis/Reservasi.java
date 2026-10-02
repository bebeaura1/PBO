// Nama  : Aura Bintang Aprilian (05)
// NIM   : 254107020062
// Kelas : TI-2G

package Jobsheet5_Kuis;

public class Reservasi {
    private String kodeReservasi;
    private int jmlTiket;
    private Operator operator;

    public Reservasi(String kodeReservasi, int jmlTiket, Operator operator){
        this.kodeReservasi = kodeReservasi;
        this.jmlTiket = jmlTiket;
        this.operator = operator;
    }

    public void hitungTotal(Studio s){
        int total = 0;
        total = operator.getBiaya() + s.getTotal();
        System.out.println(total);
    }

    public void getReservasi(Studio s){
        System.out.println(s.getStudio());
        System.out.println("Kode Reservasi: " + kodeReservasi);
        System.out.println("Jumlah Tiket  : " + jmlTiket);
        operator.getOperator();
        System.out.print("Total Biaya   : Rp. ");
        hitungTotal(s);
    }
}

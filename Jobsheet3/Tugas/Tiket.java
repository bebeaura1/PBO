package Jobsheet3.Tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran = false;

    Tiket(String judulFilm, double hargaDasar){
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    public String getJudulFilm(){
        return judulFilm;
    }

    public double getHargaDasar(){
        return hargaDasar;
    }

    public boolean isStatusPembayaran(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
        statusPembayaran = true;
    }
}

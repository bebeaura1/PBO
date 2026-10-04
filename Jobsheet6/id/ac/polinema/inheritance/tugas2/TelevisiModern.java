package Jobsheet6.id.ac.polinema.inheritance.tugas2;

public class TelevisiModern extends Televisi {
    private String modeTampilan, dvd;

    public TelevisiModern(String merek, int jumlahChannel){
        super(merek, jumlahChannel);
    }

    public void gantiModusTampilan(String mode){
        this.modeTampilan = mode;
    }

    public void masukkanDVD(String judul){
        this.dvd = judul;
    }

    public void mainkanDVD(){
        String infodvd = (dvd == null) ? "Kosong" : dvd;
        System.out.println("Sedang memainkan DVD: " + infodvd);
    }
}

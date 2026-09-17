package Jobsheet4.id.ac.polinema.relasiclass.Tugas;

public class Diagnosa {
    private String keluhan;

    public Diagnosa(String keluhan){
        this.keluhan = keluhan;
    }

    public String getKeluhan(){
        return "Diagnosa\t: " + keluhan;
    }
}

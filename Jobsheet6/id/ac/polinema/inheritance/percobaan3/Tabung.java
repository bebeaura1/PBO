package Jobsheet6.id.ac.polinema.inheritance.percobaan3;

public class Tabung extends Bangun {
    protected int t;

    public void setSuperPhi(double phi){
        this.phi = phi;
    }

    public void setSuperR(int r){
        super.r = r;
    }

    public void setT(int t){
        this.t = t;
    }

    public void volume(){
        System.out.println("Volume Tabung adalah: "
                + (this.phi * super.r * super.r * this.t)
        );
    }
}

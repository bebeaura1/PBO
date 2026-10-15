package Jobsheet7.id.ac.polinema.overloading.tugas1;

public class Segitiga {
    private int sudut;

    public int sisaSudut(int sudutA){
        if (sudutA <= 0 || sudutA >= 180) {
            throw new IllegalArgumentException(
                "Sudut " + sudutA + " tidak valid. Harus antara 0 - 180."
            );
        }
        this.sudut = 180 - sudutA;
        return sudut;
    }

    public int sisaSudut(int sudutA, int sudutB){
        int total = sudutA + sudutB;
        if (total <= 0 || total >= 180) {
            throw new IllegalArgumentException(
                "Jumlah sudut <" + total + ") tidak valid. Harus antara 0 - 180."
            );
        }
        this.sudut = 180 - total;
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt(sisiA * sisiA + sisiB * sisiB);
        return c + sisiA + sisiB;
    }

    public int getSudut(){
        return this.sudut;
    }
}

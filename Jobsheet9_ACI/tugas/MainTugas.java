package Jobsheet9_ACI.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Keledai k = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla g = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa s = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        k.displayData();
        System.out.println();
        g.displayData();
        System.out.println();
        s.displayData();
    }
}

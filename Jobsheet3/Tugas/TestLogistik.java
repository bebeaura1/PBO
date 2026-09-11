package Jobsheet3.Tugas;

import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double muatan;
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan muatan baru seberat (kg) : ");
        muatan = sc.nextDouble();
        kontainerAlfa.tambahMuatan(muatan);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni());

        System.out.print("\nMasukkan muatan baru seberat (kg) : ");
        muatan = sc.nextDouble();
        kontainerAlfa.tambahMuatan(muatan);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni());
        
        System.out.print("\nMembongkar muat/menurunkan barang seberat (kg): ");
        muatan = sc.nextDouble();
        kontainerAlfa.turunkanMuatan(muatan);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni());
        
        System.out.print("\nMembongkar muat/menurunkan barang seberat (kg): ");
        muatan = sc.nextDouble();
        kontainerAlfa.turunkanMuatan(muatan);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni());
    }
}

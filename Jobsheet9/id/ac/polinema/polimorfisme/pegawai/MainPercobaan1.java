package Jobsheet9.id.ac.polinema.polimorfisme.pegawai;

public class MainPercobaan1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmpoyee iEmp = new InternshipEmpoyee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        Employee e;
        Payable p;

        e = pEmp;
        System.out.println("e menunjuk obje " + e.getClass().getSimpleName());
        e = iEmp;
        System.out.println("e menunjuk obje " + e.getClass().getSimpleName());
        p = pEmp;
        System.out.println("p menunjuk obje " + p.getClass().getSimpleName());
        p = eBill;
        System.out.println("p menunjuk obje " + p.getClass().getSimpleName());
    }
}

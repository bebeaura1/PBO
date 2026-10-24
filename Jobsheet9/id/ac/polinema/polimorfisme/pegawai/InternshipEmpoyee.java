package Jobsheet9.id.ac.polinema.polimorfisme.pegawai;

public class InternshipEmpoyee extends Employee {
    private int length;

    public InternshipEmpoyee(String name, int length){
        super(name);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override 
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
}

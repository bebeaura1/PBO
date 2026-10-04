package Jobsheet6.id.ac.polinema.inheritance.tugas2;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif = 1;

    public Televisi(String merek, int jumlahChannel){
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
    }

    public void pindahChannel(int channel){
        if (channel >= 1 && channel <= jumlahChannel) {
            channelAktif = channel;
        }
    }

    public int getChannelAktif(){
        return channelAktif;
    }
}

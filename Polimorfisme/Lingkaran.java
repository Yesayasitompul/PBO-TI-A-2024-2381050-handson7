package Polimorfisme;

public class Lingkaran extends BangunDatar {
    private double jarijari;

    public Lingkaran (final double jarijari){
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuas(){
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double hitungKeliling(){
        return 2* Math.PI * jarijari;
    }
}

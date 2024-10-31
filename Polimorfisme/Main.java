package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Persegi");

        bangunDatar = new SegitigaSamaSisi(4,5);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "SegitigaSamaSisi");

        bangunDatar = new Lingkaran(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Lingkaran");
    }

    public static void tampilkanPerhitungan(double luas, double keliling, String namaBangunDatar){
        System.out.println("Luas Bangun Datar " + namaBangunDatar + ": " + luas);
        System.out.println("Keliling bangun datar " + namaBangunDatar + ": " + keliling);

    }
}

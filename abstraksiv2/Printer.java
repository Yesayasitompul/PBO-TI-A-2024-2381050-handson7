package abstraksiv2;

public class Printer implements Cetak{
    @Override
    public void print(){System.out.println("Mencetak Dokumen...........");}

    @Override
    public static void scan(){
        System.out.println("Memindai Dokumen..........");
    }
}

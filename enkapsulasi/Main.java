package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount YesayaSitompul = new BankAccount(100);

        // Beli minuman 10 (with draw)
        YesayaSitompul.withDraw(10);
        System.out.println("Current balance is: " + YesayaSitompul.getBalance());
    }
}

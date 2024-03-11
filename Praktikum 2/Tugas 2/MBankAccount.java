public class MBankAccount{
    public static void main(String[] args){
        MBankAccount b = new BankAccount(1000);
        System.out.println("Saldo sebelum transaksi: " + b.getBalance());

        b.deposit(500);
        
        b.withdraw(200);

        System.out.println("Saldo setelah transaksi: " + b.getBalance());
    }
}
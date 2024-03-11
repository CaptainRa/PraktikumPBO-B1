class BankAccount{
    //Atribut
    private double balance;
    //Method
    public void BankAccount(double BalanceAwal){
        this.balance = BalanceAwal;
    }
    public void deposit(double jumlah){
        this.balance = balance + jumlah;
        System.out.println("Deposit sejumlah " + jumlah + " berhasil dilakukan. Saldo saat ini: " + balance);
    }

    public void withdraw(double jumlah){
        if (balance>jumlah){
            this.balance = balance - jumlah;
            System.out.println("Penarikan sejumlah " + jumlah + " berhasil dilakukan. Saldo saat ini: " + balance);
        } else {
            System.out.println("Deposit sejumlah " + jumlah + " gagal dilakukan. Saldo saat ini: " + balance);
        }
    }
    public double getBalance(){
        return balance;
    }

}
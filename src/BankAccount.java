public class BankAccount {
    public double balance;
    public int acc_no;
    BankAccount(double balance, int acc_no){
        this.balance= balance;
        this.acc_no= acc_no;
    }
    public double deposit(double amount){
        balance= balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient bank balance");
        }
        else{
            balance= balance-amount;
        }
        return balance;
    }
    public double getbalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(2000, 111111020);
        ba.deposit(500);
        ba.withdraw(1500);
//        System.out.println(ba.deposit(500));
//        System.out.println(ba.withdraw(1500));
        System.out.println(ba.getbalance());
    }
}

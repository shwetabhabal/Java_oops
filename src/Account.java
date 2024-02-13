import java.util.Scanner;
public class Account {
    static int balance;
    Account(int balance){
        this.balance= balance;
    }

    public static int  debit(int amount){
        if(amount > balance){
            System.out.println("Debit amount exceeded account balance.");
        }
        else{
            balance= balance-amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter balance: ");
        int balance = sc.nextInt();
        System.out.println("Enter amount to debt: ");
        int amount = sc.nextInt();
        Account acc= new Account(balance);
        System.out.println(acc.debit(amount));
    }
}

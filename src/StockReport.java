import java.util.Scanner;
public class StockReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of stocks: ");
        int no_stocks= sc.nextInt();
        sc.nextLine();
        String stockname[] = new String[no_stocks];
        int no_shares[] = new int[no_stocks];
        double shareprice[]= new double[no_stocks];
        for(int i=0;i<no_stocks; i++){
            System.out.println("enter sock name: ");
            stockname[i] = sc.nextLine();
            System.out.println("enter no. of shares: ");
            no_shares[i] = sc.nextInt();
            System.out.println("enter price of share: ");
            shareprice[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Stock reports: ");
        double totalvalueofstocks= 0;
        for (int i=0; i<no_stocks;i++){
            double stockvalue= no_shares[i] * shareprice[i];
            System.out.println("Stock name: "+stockname[i]);
            System.out.println("Number of shares: "+no_shares[i]);
            System.out.println("Price of shares: "+shareprice[i]);
            System.out.println("Values of each stock: "+stockname[i]);
            totalvalueofstocks+= stockvalue;
        }
        System.out.println("Total value of stocks: "+totalvalueofstocks);
    }
}

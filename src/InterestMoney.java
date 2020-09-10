import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double money;
        int month;
        double interest_rate;
        System.out.println(" Enter money do you want amount: ");
        money= input.nextDouble();
        System.out.println(" Enter number of months: ");
        month= input.nextInt();
        System.out.println(" Enter interest rate: ");
        interest_rate= input.nextDouble();

        double total_money= (double) money*((interest_rate/100)/12)*month + money;
        System.out.println( " All of your money U receive : "+ total_money);

    }
}

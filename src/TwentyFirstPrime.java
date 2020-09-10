import java.util.Scanner;

public class TwentyFirstPrime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number: ");
        int number= input.nextInt();
        int N=2;
        while (count<number){
            if (checkPrime(N)){
                System.out.println(N+";");
                count++;
            }N++;
        }

    }
    static boolean checkPrime(int number){
        if (number<2)
            System.out.println("is NOT prime");
        for (int i=2; i<=Math.sqrt(number);i++) {
            if (number % i == 0) {
                return false;
            }
        }return true;
    }
}

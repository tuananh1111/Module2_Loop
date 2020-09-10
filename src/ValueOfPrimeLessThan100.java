import java.util.Scanner;

public class ValueOfPrimeLessThan100 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int number= input.nextInt();
        int N=2;
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(5);
//        System.out.println(7);
//        for (int i=9; i<100;i+=2){
//            if(i%3==0) continue;
//            if(i%5==0) continue;
//            if(i%7==0) continue;
//            System.out.println(i);
//        }
        while (N<number){
            if(checkPrime(N)){
                System.out.println(N);
            }N++;
        }
    }
    static boolean checkPrime(int number){
        for (int i=2; i<=Math.sqrt(number);i++) {
            if (number % i == 0) {
                return false;
            }
        }return true;
    }
}

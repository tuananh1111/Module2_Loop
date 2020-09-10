
import java.util.Scanner;

public class GreatesCommonFactor {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập Số thứ nhất");
        a= input.nextInt();
        System.out.println("Nhập số thứ hai");
        b=input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.println("Greatest common factor is : "+ (a+b));
        }
        while (a!=b){
            if (a>b){
                a= a-b;
            }else b=b-a;
        }
        System.out.println("Greatest common factor: "+a);
    }
}

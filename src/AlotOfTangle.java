import java.util.Scanner;

public class AlotOfTangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter the number: ");
        int number= input.nextInt();
        if(number!=4){
            switch (number){
                case 1:
                    for (int i=0; i<3; i++){
                        for (int j=0; j<6; j++){
                            System.out.print("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    for (int i=1; i<=5; i++){
                        for (int j=1; j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.printf("\n");
                    }
                    for(int i=1; i<=5; i++){
                        for (int j=5-i; j>0; j--){
                            System.out.print("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    for(int i=1; i<=5;i++){
                        for (int a=1;a<=5-i;a++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<i;k++){
                            System.out.print("*");
                        }
                        for (int j=1; j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class ConvertWordFromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        if (number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("night");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        }

        int ones = number % 10;
        int tens = number / 10;
        if (number < 20) {

            switch (ones) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        int hundred = number / 100;
        int remanet100 = number % 100;


        if (number >= 20) {
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;
            }
        }
        if (number >= 100) {
            switch (hundred) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("Three hundred");
                    break;
                case 4:
                    System.out.print("Four hundred");
                    break;
                case 5:
                    System.out.print("Five hundred");
                    break;
                case 6:
                    System.out.print("Six hundred");
                    break;
                case 7:
                    System.out.print("Seven hundred");
                    break;
                case 8:
                    System.out.print("Eight hundred");
                    break;
                case 9:
                    System.out.print("Nine hundred");
                    break;
            }
            if (remanet100 < 10) {
                switch (remanet100) {
                    case 1:
                        System.out.print(" and one");
                        break;
                    case 2:
                        System.out.print(" and two");
                        break;
                    case 3:
                        System.out.print(" and three");
                        break;
                    case 4:
                        System.out.print(" and four");
                        break;
                    case 5:
                        System.out.print(" and five");
                        break;
                    case 6:
                        System.out.print(" and six");
                        break;
                    case 7:
                        System.out.print(" and seven");
                        break;
                    case 8:
                        System.out.print(" and eight");
                        break;
                    case 9:
                        System.out.print(" and nine");
                        break;
                }
            } else if (remanet100 < 20) {
                switch (remanet100 % 10) {
                    case 0:
                        System.out.print(" and ten");
                        break;
                    case 1:
                        System.out.print(" and eleven");
                        break;
                    case 2:
                        System.out.print(" and twelve");
                        break;
                    case 3:
                        System.out.print(" and thirteen");
                        break;
                    case 4:
                        System.out.print(" and fourteen");
                        break;
                    case 5:
                        System.out.print(" and fifteen");
                        break;
                    case 6:
                        System.out.print(" and sixteen");
                        break;
                    case 7:
                        System.out.print(" and seventeen");
                        break;
                    case 8:
                        System.out.print(" and eighteen");
                        break;
                    case 9:
                        System.out.print(" and nineteen");
                        break;
                }
            } else {
                switch (remanet100 / 10) {
                    case 2:
                        System.out.print(" twenty");
                        break;
                    case 3:
                        System.out.print(" thirty");
                        break;
                    case 4:
                        System.out.print(" forty");
                        break;
                    case 5:
                        System.out.print(" fifty");
                        break;
                    case 6:
                        System.out.print(" sixty");
                        break;
                    case 7:
                        System.out.print(" seventy");
                        break;
                    case 8:
                        System.out.print(" eighty");
                        break;
                    case 9:
                        System.out.print(" ninety");
                        break;
                }
                switch (remanet100 % 10) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }
        }
    }
}

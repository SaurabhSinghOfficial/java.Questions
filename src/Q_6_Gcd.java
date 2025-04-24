import java.util.Scanner;

public class Q_6_Gcd {
//    Create a program to find the Greatest common divisor (GCD) of two integers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int first = input.nextInt();
        System.out.println("Enter your second number : ");
        int second = input.nextInt();

        int gcd = gcd(first,second);
        System.out.println("Your GCD is : "+gcd);
    }
    public static int gcd(int first , int second){
        int gcd=1;
        int i =2;
        int least=least(first, second);
        while (i<=least){
            if (first%i==0 && second%i==0){
              gcd=i;
            }
            i++;
        }


        return gcd;

    }
    public static int least(int num1 , int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}

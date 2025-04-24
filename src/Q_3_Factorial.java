import java.util.Scanner;

public class Q_3_Factorial {
//    Write a function that calculates the factorial of a given number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int num = input.nextInt();

       long fac = factorial(num);
        System.out.println("Your factorial is : " +fac);
    }
    public static long factorial(int num){
        int fac= 1;
        for (int i = 1 ; i<=num ; i++){
            fac =fac*i;
        }
        return fac;
    }
}

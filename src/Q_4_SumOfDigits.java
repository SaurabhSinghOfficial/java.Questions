import java.util.Scanner;

public class Q_4_SumOfDigits {
//    Create a program that compute tha sum of the digits of an integer
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is  : "+sum);

    }

    public static int sumOfDigits(int num){
        int sum=0;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}

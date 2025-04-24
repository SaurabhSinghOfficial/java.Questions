import java.util.Scanner;

public class Q_9_FibonacciSeries {
//    Create a program to print the fibonacci series up to certain number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();
        System.out.print("Fibonacci series is : " );
         fibonacciSeries(num);

    }
    public static void fibonacciSeries(int num){
        if (num<0)return;
        System.out.print("0 ");
        if (num == 0)return;
        System.out.print("1 ");

        int first = 0 , second = 1;

        while (first+second<num){
            int third = first+second;
            System.out.print(third +" ");
            first=second;
            second=third;
        }

    }
}

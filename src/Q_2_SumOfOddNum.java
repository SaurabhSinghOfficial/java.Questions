import java.util.Scanner;

public class Q_2_SumOfOddNum {
//    Create a program to sum of odd numbers from 1 to a specified number N
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int num = input.nextInt();
        System.out.println("Sum of odd number is : ");
        oddNumbers(num);
    }
    public static void oddNumbers(int num){

        int sum=0;
        for (int i= 1 ; i<= num ;i++){
            if (i%2==1){
                sum =sum +i;
            }
        }
        System.out.println(sum);

    }
}

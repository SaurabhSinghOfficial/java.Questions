import java.util.Scanner;

public class Q_8_ReverseTheDigites {
//    Create a program to reverse the digit of a number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
         int reverse = reverseDigits(num);
        System.out.println("Reverse number is : " + reverse);


    }
    public static int reverseDigits(int num){
        int newNum=0;
        while (num>0){
            int digit=num%10;
            newNum = newNum*10+digit;
            num /=10;
        }

        return newNum;
    }

}

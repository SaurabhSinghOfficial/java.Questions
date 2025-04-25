import java.util.Scanner;

public class Q_11_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num= input.nextInt();

        boolean isPalindrome=isPalindromeNum(num);
        if (isPalindrome){
            System.out.println(num + " is a palindrome number ");
        }
        else {
            System.out.println(num + " is not a palindrome number ");
        }
    }
    public static boolean isPalindromeNum(int num){
        int newNum=0;
        int numCopy=num;
        while (num>0){
            int digit = num %10;
            newNum= newNum*10+digit;
            num /=10;
        }
        return newNum==numCopy;
    }
}

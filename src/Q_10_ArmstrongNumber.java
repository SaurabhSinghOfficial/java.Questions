import java.util.Scanner;

public class Q_10_ArmstrongNumber {

//    Create a program to check the given number is na armstrong number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here ");
        int num = input.nextInt();
        boolean isArmstrong= isArmstrongNumber(num);
        if (isArmstrong){
            System.out.println("it is an armstrong number ");
        }else {
            System.out.println("it is not an armstrong number ");
        }

    }

//    count the number of digit power
    public static int onOfDigit(int num){
        int digit= 0;
        while (num>0){
            digit++;
            num/=10;
        }
        return digit;

    }

//    it is the method to check the number is an Armstrong number
    public static boolean isArmstrongNumber(int num){
        int digit = onOfDigit(num);
        int numCopy=num;
        int newNum= 0;
        while (num>0){
           int count =num%10;
           num /=10;
            newNum += (int) Math.pow(count,digit);
        }

        return newNum==numCopy;
    }


}

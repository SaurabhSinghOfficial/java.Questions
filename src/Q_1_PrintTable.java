import java.util.Scanner;

public class Q_1_PrintTable {

//    Develop a program that prints the multiplication table for a given number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int num = input.nextInt();
        table(num);
    }
    public static void table(int num){

        for (int i = 1 ;i<= 10 ; i++){
            System.out.println(num + " X "+ i + " = "+ ( num*i));
        }
    }
}

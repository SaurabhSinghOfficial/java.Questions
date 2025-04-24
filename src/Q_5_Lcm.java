import java.util.Scanner;

public class Q_5_Lcm {
//    Create a program to find the least common multiple (LCM) o

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int first = input.nextInt();
        System.out.println("Enter your second number : ");
        int second = input.nextInt();
        int lcm= lcm(first,second);
        System.out.println(" the lcm of your two numbers is :"+lcm);
    }
    public static int lcm(int first , int second){
        int i=1;
        while (true){
            int factor = first*i;
            if (factor%second==0){
                return factor;
            }
            i++;
        }

    }
}

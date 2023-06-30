import java.util.Scanner;

public class NumberOddEven {
    public static void main(String[] args) {
//        Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
//        Input 8, Even
//        3, False

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();

        if((n&1)==1){
            System.out.println("number is  odd ");
        }
        else {
            System.out.println("number is even ");
        }
    }
}

import java.util.Scanner;

public class DecimalToBinary {
    public static void printDecimalToBinary(int n){
        String s = Integer.toBinaryString(n);
        System.out.println(s);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("the binary number is : ");
        printDecimalToBinary(n);

    }
}

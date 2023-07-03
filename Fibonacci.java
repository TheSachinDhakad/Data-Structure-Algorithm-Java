import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci " + n + "th term  : " + fib(n));
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + ",  ");

        }
    }
}

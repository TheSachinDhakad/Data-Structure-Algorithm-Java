import java.util.Scanner;

public class CountStairs {
    public static int countStairs(int n){

        if(n<=1){
            return n;
        }
        return countStairs(n-1) + countStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of stairs : ");
        int n = sc.nextInt();

        int result = countStairs(n+1);
        System.out.println("The number of ways : " + result);
    }
}

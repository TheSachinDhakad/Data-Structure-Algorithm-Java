import java.util.Scanner;

public class TillingProblem {
    public static int getWays(int n){
        if(n<=3){
            return n;
        }
        return getWays(n-1) + getWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("the ways of n = " + n + " : " +  getWays(5));
    }
}

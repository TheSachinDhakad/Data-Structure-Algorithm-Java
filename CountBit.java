import java.util.Scanner;

public class CountBit {
    public static int countSetBit(int n){
        int count = 0 ;
        while (n>0){
            count += (n&1);
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("The number of set bits in the given number are : " + countSetBit(n));
    }
}

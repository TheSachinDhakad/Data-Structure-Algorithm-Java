import java.util.Scanner;

public class Power2ONot {
    public static Boolean isPowerTwo(int n){
        if(n<=0){
            return false;
        }
        int count= 0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
            System.out.println(count);
            n>>=1;
        }
        return count==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("the power is two : " + isPowerTwo(n));


    }
}

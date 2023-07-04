import java.util.Scanner;

public class PowerFind {

    public static long powerIs(int a , int b){
        int mid = 0   ; long finalResult = 0;
        long result = 0;
        if(b==1){
            return a;
        }
        else {
            mid = b/2;
            result = powerIs(a , mid);
            finalResult = result * result;
            if(b%2==0){
                return finalResult;
            }
            else {
                return a*finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b :  ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = powerIs(a , b);
        System.out.println("the a^b is :  " + result);


    }
}

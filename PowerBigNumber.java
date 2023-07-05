import javax.security.sasl.SaslClient;
import java.math.BigInteger;
import java.util.Scanner;

public class PowerBigNumber {
    public static BigInteger bigPower(BigInteger a , int b){
        BigInteger result , finalResult ;
        if(b==1){
            return a;
        }
        else {
            result = bigPower(a , b/2);
            finalResult = result.multiply(result);
            if(b%2==0){
                result = finalResult;
            }
            else {
                a.multiply(finalResult);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b : ");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();

        System.out.println("the power of an element : " + bigPower(a , b));
    }
}

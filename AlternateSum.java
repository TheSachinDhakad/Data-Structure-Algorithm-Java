import java.util.Scanner;

public class AlternateSum {
    static int alternateSum(int n  , int i){
        if(i == n + 1)return 0;
        if(i%2 == 0)return alternateSum(n , i + 1) - i;
        else return alternateSum(n , i + 1) + i;
    }

    public static void main(String[] args) {
//        Given a number n. Find the sum of natural numbers till n but with alternate signs.
//        That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
//                Constraints : 0<=n<=1e6
//        Input1 : n = 10
//        Output 1 : -5
//        Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
//        Input 2 : n = 5
//        Output 2 : 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();

        System.out.println("the alternate sum is : " + alternateSum(n , 1));
    }
}

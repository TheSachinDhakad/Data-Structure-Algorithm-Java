import java.util.Scanner;

public class PrifixSumBA {

    public  static int findSum(int[][] arr , int r1,int c1,int r2,int c2){
        int sum = 0 ;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <=c2 ; j++) {
                sum+= arr[i][j];

            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int n , m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();

        System.out.println("Enter the number of columns : ");
         m = sc.nextInt();

         int [][] arr = new int[n][m];
        System.out.println("Enter the matrix element : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();


            }

        }
        int r1,c1,r2,c2;

        System.out.println("Enter the value of r1 : ");
        r1 = sc.nextInt();
        System.out.println("Enter the value of c1 : ");
        c1 = sc.nextInt();
        System.out.println("Enter the value of r2 : ");
        r2 = sc.nextInt();
        System.out.println("Enter the value of c2 : ");
        c2 = sc.nextInt();


        int result = findSum(arr , r1,c1,r2,c2);
        System.out.println("the sum of prifix matrix is : " + result);




    }
}

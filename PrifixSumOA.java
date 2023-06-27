import java.util.Scanner;

public class PrifixSumOA {
    public  static  void prifixSum(int [][]arr){
        int n = arr.length;
        int m = arr[0].length;
    // row wise sum of the array
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {

                arr[i][j]+= arr[i][j-1];
            }

        }
        // columns wise sum of the array
        for (int j =0 ; j <n ; j++) {
            for (int i = 1; i <m ; i++) {
                arr[i][j]+= arr[i-1][j];

            }

        }
    }

    public  static int sumRegion(int [][] arr , int r1,int c1 , int r2 , int c2){
        int sum = 0 , up = 0 , left = 0 , repeat_region = 0 , result = 0;

         sum = arr[r2][c2];
         up = (r1 > 0) ? arr[r1 - 1][c2] : 0;
         left = (c1 > 0) ? arr[r2][c1 - 1] : 0;
        repeat_region = (r1 > 0 && c1 > 0) ? arr[r1 - 1][c1 - 1] : 0;

        result = sum - up - left + repeat_region;
        return result;
    }
    public static void main(String[] args) {
        int n , m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        n = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        m = sc.nextInt();

        int [][] arr = new int[n][m];

        System.out.println("Enter the value of matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        int r1,c1,r2,c2;
        System.out.println("Enter the r1 cordinate : ");
        r1 = sc.nextInt();
        System.out.println("Enter the c1 cordinate : ");
        c1 = sc.nextInt();
        System.out.println("Enter the r2 cordinate : ");
        r2 = sc.nextInt();
        System.out.println("Enter the c2 cordinate : ");
        c2 = sc.nextInt();


        prifixSum(arr);
        int result = sumRegion(arr , r1,c1,r2,c2);
        System.out.println("the prifix sum of matrix is : " + result);

    }
}


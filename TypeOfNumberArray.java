import java.util.Scanner;

public class TypeOfNumberArray {
    public static void main(String[] args) {
//        Take m and n input from the user and m * n integer inputs from user and print the following:
//        number of positive numbers
//        number of negative numbers b
//        number of odd numbers
//        number of even numbers
//        number of 0.
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();
        System.out.println("Enter the nunber of columns : ");
        m = sc.nextInt();
        int [][]arr = new int[n][m];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        int positive = 0 , negative = 0 , odd = 0 , even = 0 , zero = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]>0) positive++;
                if (arr[i][j]<0)negative++;
                if((arr[i][j]%2) ==0) even++;
                if((arr[i][j]%2) !=0) odd++;
                if (arr[i][j]==0)zero++;


            }


        }
        System.out.println("positive : "+positive);
        System.out.println("negative : "+negative);
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
        System.out.println("zero : " + zero);
    }
}

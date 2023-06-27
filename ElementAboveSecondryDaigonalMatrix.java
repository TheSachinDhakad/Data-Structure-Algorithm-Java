import java.util.Scanner;

public class ElementAboveSecondryDaigonalMatrix {
    public static void main(String[] args) {
//         write a program to print the elements above the secondary diagonal in a user inputted
//        square matrix.

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i+j<m-1){
                    System.out.println(arr[i][j] + " ");
                }

            }

        }
    }
}

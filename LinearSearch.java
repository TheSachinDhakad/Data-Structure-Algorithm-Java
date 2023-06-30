import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[] , int target){
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        System.out.println("Enter the target value : ");
        int terget = sc.nextInt();

        int res = linearSearch(arr,terget);

        if(res==-1){
            System.out.println("element is not found");
        }
        else {
            System.out.println("element found at index  " + res);
        }

    }
}

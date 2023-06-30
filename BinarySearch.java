import java.util.HashMap;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int []arr , int target){
        int low = 0 , high = arr.length-1;

        while (low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid+1;

            }
            else {
                high = mid-1;
            }
        }
        return -1;
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

        int result = binarySearch(arr , terget);

        if(result==-1){
            System.out.println("element is not found in array ");
        }
        else {
            System.out.println("element is found at index " + result);
        }
    }
}

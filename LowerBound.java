import java.util.Scanner;

public class LowerBound {
    public static int lowerBound(int arr[] , int target){
        int low = 0 , high = arr.length-1 , result = -1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result = mid;
                high = mid-1;
//                low = mid+1;
            } else if (arr[mid]<target) {
                low = mid+1;

            }
            else {
                high = mid-1;
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

        int result = lowerBound(arr , terget);

        if(result==-1){
            System.out.println("Target element is not present in an array");
        }
        else {
            System.out.println("Lower Bound found at index : " + result);
        }

    }
}

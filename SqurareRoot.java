import java.util.Scanner;
// Approach: Modified Binary Search
// Time complexity: O(log n)
// Space complexity: O(1)
public class SqurareRoot {
    public static int findSquareRoot(int num){
        int low = 0 , high = num , result = -1;

        while (low<=high){
            int mid = low+(high-low)/2;
            long val = mid*mid;
            if(val==num){
                return mid;

            } else if (val<num) {
                result = mid;
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
        System.out.println("Enter the number of which you want the square root: ");
        int num = sc.nextInt();

        // function calling
        int result = findSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);


    }
}




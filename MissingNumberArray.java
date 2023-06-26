public class MissingNumberArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,8,7,9, 11};

        int n = arr.length;

        int sum_natural_number = ((n+1)*(n+2))/2;
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            sum+= arr[i];

        }
        int missing_element = 0;

        missing_element = sum_natural_number - sum;
        System.out.println("the missing element of array is : " + missing_element);
    }
}

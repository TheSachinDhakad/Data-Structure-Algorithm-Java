//Write a program to print the sum of all the elements present on even indices in the given array.
public class SumOfEvenIndex {
    public static void main(String[] args) {
        int [] arr = {2,20,4,6,9};

        int sum = 0;
        int i = 0;
        while (i<arr.length){
            sum+=arr[i];
            i+=2;

        }
        System.out.println(sum);

    }
}

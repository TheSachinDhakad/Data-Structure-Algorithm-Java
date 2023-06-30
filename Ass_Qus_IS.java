import java.util.Arrays;

public class Ass_Qus_IS {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
//        Write a program to sort an array in descending order using bubble sort.
//                Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}

        int[] arr = {3,5,1,6,0};
        insertionSort(arr);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
    }
}

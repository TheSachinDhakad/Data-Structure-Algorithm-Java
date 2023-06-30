import java.util.Arrays;

public class Assi_Qus_SS {
    public static void selectionSort(int[] arr){
        int itr = 0;
        for (int i = 0; i <arr.length ; i++) {

            int min_idx = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]>arr[min_idx]){
                    min_idx=j;


                }

            }

            if(min_idx!=i){
                itr++;
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

            }
            System.out.println("Iteration " + (i +1) + ": ");

        }

    }
    public static void main(String[] args) {
//        WAP to sort an array in descending order using selection sort
//        Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}

        int[] arr = {3,5,1,6,0};
        selectionSort(arr);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
    }
}

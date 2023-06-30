import java.util.Arrays;

public class Assi_qus_BS {
    public static void  bubbleSort(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            Boolean swweped = false;

            for (int j = 0; j <arr.length-1-i ; j++) {

                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swweped = true;

                }



            }
            // Print the array at each iteration



            if(!swweped){
                break;
            }
            System.out.print("Iteration " + (i +1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
//        Write a program to sort an array in descending order using bubble sort.
//                Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}

        int[] arr = {3,5,1,6,0};
        bubbleSort(arr);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));


    }
}

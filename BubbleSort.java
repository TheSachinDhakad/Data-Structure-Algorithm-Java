import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int []arr){

        for (int i = 0; i < arr.length; i++) {
            Boolean swweped = false;
            for (int j = 0  ; j <arr.length-i-1 ; j++) {

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swweped = true;
                }
            }
            if(!swweped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {34,23,56,89,5,8,3,67};

        bubbleSort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}

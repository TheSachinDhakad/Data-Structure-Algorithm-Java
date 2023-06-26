public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[end-i-1];
            arr[end-i-1] = temp;



        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}

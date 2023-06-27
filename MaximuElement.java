// Write a program to calculate the maximum element in the array.

public class MaximuElement {
    public static void main(String[] args) {
        int [] arr = {34,21,54,65,43};

        int max = Integer.MIN_VALUE;
        for (int ele:arr) {
            max = Math.max(max , ele);


        }
        System.out.println(max);

    }
}

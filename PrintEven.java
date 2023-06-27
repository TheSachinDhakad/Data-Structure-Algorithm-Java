//Write a program to traverse over the elements of the array using for each loop and print all even
//elements.
public class PrintEven {
    public static void main(String[] args) {
        int [] arr = {34,21,54,65,43,0, 44};

        for (int ele:arr) {
            if(ele%2==0){
                System.out.println(ele);
            }

        }


    }
}

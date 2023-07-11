import java.util.ArrayList;
import java.util.Arrays;

public class PrintSeq {
    public static void printSeq(int [] arr , int index  , ArrayList<Integer> tempArr){
    if(index == arr.length){
        if(tempArr.size()>0){
            System.out.println(tempArr);
        }
        return;
    }

    printSeq(arr , index+1 , tempArr);

    tempArr.add(arr[index]);

    printSeq(arr , index+1 , tempArr);
    tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(Arrays.toString(arr));
        printSeq(arr , 0 , new ArrayList<>());

    }
}

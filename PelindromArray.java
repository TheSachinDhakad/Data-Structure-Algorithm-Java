// time complexity O(n)
// space complexity O(1)
public class PelindromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1,};
        int start = 0;
        int end = arr.length;
        int flag = 0;

        int mid = (start+end)/2;
//        System.out.println(mid);

        for (int i = 0; i < mid; i++) {
            if(arr[i]!=arr[end-i-1]){
                flag =1;
                System.out.println("this is not a pelindrom Array");
                break;

            }


        }
        if(flag==0) {
            System.out.println("yass it is pelindrom array");
        }
    }

}

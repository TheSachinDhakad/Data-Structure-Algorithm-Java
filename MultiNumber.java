public class MultiNumber {
    public static void printMul(int n , int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        printMul(n , k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        printMul(24, 5);
        System.out.println();

    }
}

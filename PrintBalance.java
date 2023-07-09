public class PrintBalance {
    public static void printBal(int n , int oc , int cc , String ans){
        if(oc==n && cc==n){
            System.out.println(ans);
            return;
        }
        if(oc<n){
            printBal(n , oc+1 , cc , ans + '(');
        }
        if(oc>cc) {
            printBal(n , oc , cc+1 , ans+')');
        }
    }
    public static void main(String[] args) {
        printBal(2 , 0 ,0, "");

    }
}

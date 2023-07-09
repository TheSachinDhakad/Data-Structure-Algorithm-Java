public class PrintBalance {
    public static void printBal(int n , int oc , int cc , String ans){
        if(n==oc && n==cc){
            System.out.println(ans);
            return;
        }
        if(oc<n){
            printBal(n , oc+1 , cc , ans + '(');
        }
        else {
            printBal(n , oc , cc+1 , ans+')');
        }
    }
    public static void main(String[] args) {
        printBal(2 , 0 ,0, "");

    }
}

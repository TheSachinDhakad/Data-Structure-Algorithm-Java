public class PrintPath {
    public static void printPath(int cur , int des , String path){
        if(cur>des){
            return;
        }
        if(cur==des){
            System.out.println(path);

            return;
        }
        printPath(cur+1, des , path+1);
        printPath(cur+2, des , path+2);
        printPath(cur+3, des , path+3);
        printPath(cur+4, des , path+4);
        printPath(cur+5, des , path+5);
        printPath(cur+6, des , path+6);
    }
    public static void main(String[] args) {
        printPath(0 , 9 , "");
    }
}

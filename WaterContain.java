public class WaterContain {
    public static int Solution(int [] arr){
        int l = 0 , r = arr.length-1;
        int max = 0;
        while (l<r){
            int lh = arr[l];
            int rh = arr[r];
            int min_h = Math.min(lh , rh);
            int len = r-l;
            int curr_area = min_h*len;
            max = Math.max(max , curr_area);
            if(lh<rh)l++;
            r--;


        }
        return max;


    }
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};

        int result = Solution(arr);
        System.out.println(result);
    }
}

/**
 * 在一个数列中找出最小的数
 */
public class Demo_05 {

    public static void main(String[] args) {
        int[] arr = {14,58,2,32,75,7};
        int min = Integer.MAX_VALUE;
        for(int x : arr){
            if(min > x){
                min = x;
            }
        }
        System.out.println(min);
    }
}

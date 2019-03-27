import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Demo_06 {

    public static void main(String[] args) {
        int[] arr = {14,58,2,32,75,7};
        for(int i = 0 ; i< arr.length - 1;i++){
            for(int j = i + 1 ; j <arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //14,58,2,32,75,7
    //2 ,58,14,32,75,7 //第一轮
    //2 ，7,58,32,75,14 //第二轮
    //2,7,14,58,75,32 //第三轮
    //2,7,14,32,75,58 //第四轮
    //2,7,14,32,58,75 //第五轮


}

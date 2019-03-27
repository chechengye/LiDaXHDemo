import java.util.Arrays;

/**
 * 选择排序
 */
public class Demo_07 {

    public static void main(String[] args) {
        int[] arr = {14,58,2,32,75,7};

        for(int i = 0 ; i < arr.length ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //14,58,2,32,75,7    i=0 minIndex = 2;
    //2,58,14,32,75,7    //第一轮
     //2,7,14,32, 75,58     //第二轮   //i=1 minIndex =5

}

/**
 * 打印输出0~200之间能被7整除但不能被4整除的所有整数；
 *
 * 输出10个斐波那契（Fibonacci）
 * 数列：1 1 2 3 5 8 13 21 34 55。（特点：第1,2两个数值为1，
 * 从第三个数开始，该数是其前面两个数之和）
 */

public class Demo_11 {
    public static void main(String[] args) {
        /*for(int i = 1; i < 200 ; i ++){
            if(i % 7 == 0 && i % 4  != 0){
                System.out.println(i);
            }
        }*/
        int i = 1 ;
        int j = 1;
        for(int n = 0 ; n < 5 ; n++){
            System.out.print(i + " " +j + " ");
            i = i + j;
            j = i + j;
        }
    }
}

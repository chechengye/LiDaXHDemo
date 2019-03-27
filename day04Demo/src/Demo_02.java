/**
 * 猜数游戏：从键盘中任意输入一个数据，
 * 判断数列中是否包含此数。
 *
 * //单行注释
 */
/*
  区块注释
 */

import java.util.Scanner;

/**
 * 文档注释
 */
public class Demo_02 {

    public static void main(String[] args) {
        int[] array = {10,33,55,26,7};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = false;
        for(int xx : array){
            if(x == xx){
                flag = true;
            }
        }
        if(flag){
            System.out.println("你猜对！");
        }else{
            System.out.println("你猜错了！");
        }
    }
}

/**
 * 计算1-100之间所有整数之和。5050
 *
 * 计算10的阶乘
 *
 * 打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class Demo_09 {

    public static void main(String[] args) {
        /*int i = 1;
        int sum = 0;
        while (i <= 100){
            sum+=i;//sum = sum + i;
            i++;
        }
        System.out.println(sum);*/
        /*int i = 1;
        int num = 1;

        while (i <= 10){
            num *= i;
            i++;
        }
        System.out.println(num);*/
        int i= 1;
        while (i < 100){
            if(i % 2 == 0){
                System.out.println(i + "是偶数");
            }else{
                System.out.println(i + "是奇数");
            }
            if(i % 3 == 0){
                System.out.println(i + "是3的倍数");
            }
            i++;
        }
    }
}

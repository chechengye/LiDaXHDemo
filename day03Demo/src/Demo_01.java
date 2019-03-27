import java.util.Scanner;

/**
 * 通过键盘输入，初始化两个数将这两个
 * 数据交换位置后，输出显示交换后的数据。
 */
public class Demo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = -1;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + "b:" + b);
    }


}

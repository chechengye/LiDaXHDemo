import java.util.Scanner;

public class Demo_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");

        int x = sc.nextInt();
        String str;
        switch (x) {
            case 1:
                str = "星期一";
                break;
            case 2:
                str = "星期二";
                break;
            case 3:
                str = "星期三";
                break;
            case 4:
                str = "星期四";
                break;
            case 5:
                str = "星期五";
                break;
            case 6:
                str = "星期六";
                break;
            default:
                str = "星期天";
                break;

        }
        System.out.println(str);
    }
}

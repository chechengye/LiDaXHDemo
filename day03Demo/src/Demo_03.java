import java.io.IOException;

/**
 * 输入一个字符，判断是大写字母还是小写字母，输出提示信息。
 *
 * 写一个程序，判断某一年是否为闰年
 * （被4整除但不能被100整除或者能被400整除)是闰年否则是平年
 *
 */
public class Demo_03 {

    public static void main(String[] args) throws IOException {
       /* System.out.println("请输入字符:");
        char c = (char) System.in.read();
        if(c > 'a' && c < 'z'){
            System.out.println("小写字母");
        }else if(c > 'A' && c < 'Z'){
            System.out.println("大写字母");
        }*/

       int y = 2000;
       if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
           System.out.println("是闰年");
       }else{
           System.out.println("是平年");
       }
    }
}

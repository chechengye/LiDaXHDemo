/**
 * 直接用JDK1.7的字符串条件判断，
 * 确定两个数是执行加、减、乘、除操作。
 */
public class Demo_08 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        switch ("+"){
            case "+":
                System.out.println(a+b);
                break;
        }
    }
}

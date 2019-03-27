import java.util.Scanner;

public class Demo_02 {

    public static void main(String[] args) {
        //System.out.println((1 == 2 ? 2 :1));

       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int x = sc.nextInt();
        System.out.println((x > 60 ? "及格" :"不及格"));*/
       int x = 59;
       if(x > 60){
           System.out.println("及格");
       }else{
           System.out.println("不及格");
       }

    }
}

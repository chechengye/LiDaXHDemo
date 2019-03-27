import java.util.Scanner;

/**
 * 给出一个百分制成绩，
 * 要求输出成绩等级‘A’、‘B’、‘C’、‘D’、‘E’
 * 。90分以上输出’A’，80～89分输出’B’，70～79分输出
 * ’C’，60～69分输出’D’，60分以下输出‘E’
 *
 * 多条件嵌套分支，设计一个程序，根据天气情况选择外出或在家，
 * 外出是逛街还是逛公园，在家是看电影还是玩游戏。
 *
 *
 */
public class Demo_04 {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 90){
            System.out.println("A");
        }else if(x>=80 && x < 89){
            System.out.println("B");
        }else if(x >= 70 && x < 79){
            System.out.println("C");
        }else if(x >= 60 && x < 69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }*/
        int t = 22;
        if(t > 15){
            System.out.println("外出");
            if(t < 30){
                System.out.println("逛街");
            }else{
                System.out.println("逛公园");
            }
        }else{
            System.out.println("在家");
        }

    }

}

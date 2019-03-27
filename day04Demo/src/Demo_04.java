/**
 * 一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
 * 	记录每个学员的成绩，并计算每个班的平均分
 */
public class Demo_04 {
    public static void main(String[] args) {
        int[][] arr = {{44,26,73},{55,34,65},{22,45,32}};
        //System.out.println(arr[0][0]);
        for(int i = 0 ; i<arr.length ; i++){
            float total = 0F;
            for(int j = 0 ; j< arr.length ; j++){
                total += arr[i][j];
            }
            System.out.println(total / arr.length);
        }
    }
}

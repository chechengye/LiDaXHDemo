import java.util.Arrays;

public class Demo_08 {

    public static void main(String[] args) {
        int[] a = {25,12,45,24};
        int[] b = {25,12,45,24};
        /*System.out.println(Arrays.binarySearch(a , 12));
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        a = Arrays.copyOf(a, a.length + 1);

        System.out.println(a.length);*/
        System.out.println(Arrays.equals(a , b));

        Arrays.fill(a  ,0,1 ,66);
        System.out.println(Arrays.toString(a));

    }
}


public class Demo_03 {

    public static void main(String[] args) {

        char x = 'A';
        for(int i = 1 ; i<= 9 ; i++){
            for(int j = 9 ; j >= i ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k<= 2*i - 1 ; k++){
                System.out.print(x);
            }
            x++;
            System.out.println();
        }
    }
}

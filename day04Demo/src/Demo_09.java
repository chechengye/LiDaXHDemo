import java.util.Arrays;
import java.util.Random;

/**
 * 双色球
 */
public class Demo_09 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(getRedBalls(getPool())));
        String[] pool = getPool();
        //系统机选红球
        String[] sysRedBalls = getRedBalls(pool);
        Random r = new Random();
        //系统篮球
        String sysBlueBall = pool[r.nextInt(16)];
        //用户机选红球
        String[] userRedBalls = getRedBalls(pool);
        //用户机选篮球
        String userBlueBall = pool[r.nextInt(16)];
        int count = 0;
        for(int i = 0 ; i<userRedBalls.length ; i++){
            for(int j = 0 ; j< sysRedBalls.length ; j++){
                if(userRedBalls[i].equals(sysRedBalls[j])){
                    count++;
                }
            }
        }
        System.out.println("系统选择的球:" + Arrays.toString(sysRedBalls) + "，" + sysBlueBall);
        System.out.println("用户选择的球:" + Arrays.toString(userRedBalls) + "，" + userBlueBall);
        if(count == 4 || userBlueBall.equals(sysBlueBall)){
            System.out.println("恭喜你，中五元！");
        }

    }

    /**
     * 获取6个红球
     */
    private static String[] getRedBalls(String[] pool){
        Random r = new Random();
        String[] redBalls = new String[6];
        int count = 0;
        boolean[] used = new boolean[pool.length];
        while (true){
            int index = r.nextInt(pool.length);
            if(used[index])
                continue;
            redBalls[count++] = pool[index];
            used[index] = true;
            if(count == redBalls.length){
                break;
            }
        }
        return redBalls;
    }

    /**
     * 初始化双色球池
     */
    private static String[] getPool(){
        String[] pool = new String[33];

        for(int i = 0 ; i < 9 ; i++){
            pool[i] = "\"0" + (i+1) + "\"";
        }
        for(int i = 9 ; i < pool.length ; i++){
            pool[i] = "\"" + (i+1) + "\"";
        }



        return pool;
    }
}


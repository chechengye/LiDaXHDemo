/**
 * 1、构造方法私有化
 * 2、声明一个本类对象
 * 3、给外部提供一个静态方法获取对象实例
 */
public class Demo_04 {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getSingleTon();
        SingleTon s1 = SingleTon.getSingleTon();

        System.out.println(s==s1);
    }
}

//饿汉式
class SingleTon{
    private static SingleTon singleTon = new SingleTon();
    private SingleTon(){
    }
    public static SingleTon getSingleTon() {
        return singleTon;
    }
}

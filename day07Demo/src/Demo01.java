public class Demo01{
    public static void main(String[] args) {
        HomeDog hd = new HomeDog();
        hd.eat();
    }
}
class Dog{
    public String name = "dog";
    public String sex;
    public Dog(String name){
        System.out.println("Dog构造方法");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
class HomeDog extends Dog{
    public HomeDog(){
        super("sx");
        System.out.println("homeDog构造方法");
    }
    public void eat(){
        System.out.println(name + "喝水");
    }
}
class HuskyDog extends Dog{
    public HuskyDog(){
        super("sx");
        System.out.println("huskyDog构造方法");
    }
}

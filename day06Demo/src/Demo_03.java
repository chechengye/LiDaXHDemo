public class Demo_03 {

    static {
        System.out.println("静态代码块！！");
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
    }
}


class Person{

    public Person(){
        System.out.println("构造代码块！");
    }


    public void eat(){
        System.out.println("普通代码块");
    }

}
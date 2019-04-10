public class Demo_01 {

    static class InnerClass{
        public static void test(){
            System.out.println("内部类");
        }
    }
    public static void main(String[] args) {
        User user = new User();

        User user1 = new User();
        User user2 = new User();
        /*user.setName("张三");
        System.out.println(user.getName());*/
        User.printInfo();
        InnerClass innerClass = new InnerClass();
        innerClass.test();

        Demo_01.InnerClass.test();
        System.out.println(user.count);

    }

    public void sort(){

    }
}

class User{

    public static int count = 0;

    public User(){
        count ++;
    }
    private  String name;
    private int age;


    public static void printInfo(){
        System.out.println("我是静态方法！");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

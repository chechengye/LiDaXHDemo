public class Demo_02 {
    public static void main(String[] args) {
        //int x = 10;
        //method(x);
        Dog dog = new Dog();
        method(dog);
        System.out.println(dog.age);
        String x = "zs";
        method(x);
        System.out.println(x);
    }

    private static void method(int x){
        x = 20;
    }

    private static void method(String x){
        x = "ls";
    }

    private static void method(Dog dog){
        dog.age = 20;
    }
}

class Dog{
    int age = 10;
}

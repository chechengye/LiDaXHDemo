public class Demo_01 {

    public static void main(String[] args) {
        Person person = new Person(10 , "zhangsan");
        Person person1 = new Person();
        person1 = null;

        person.setAge(12); ;
        //person1.age = 15;
        int[] i = new int[6];
        int a = 10;
        String b = "sss";
       /* person.age = 10;
        person.name = "zhangsan";*/
       //person.eat();
    }
}

class Person{
    public Person(){
    }
    public Person(int age , String name){
        this.age = age;
        this.name = name;
        //this.eat("zz");
    }
    private int age;
    private String name;
    void eat(String name){
        System.out.println(name + "在吃东西...." + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


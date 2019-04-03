
public class Demo_3 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Weapon weapon = new Weapon(hero , "丈八蛇矛");
        hero.weapon = weapon;
        hero.name = "张飞";
        System.out.println(hero.name + "使用" + hero.weapon.name);
    }
}
class Hero{
    Weapon weapon;
    String name;

    public Hero(){

    }
    public Hero(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }
}

class Weapon{
    Hero hero;
    String name;
    public Weapon(){

    }
    public Weapon(Hero hero, String name) {
        this.hero = hero;
        this.name = name;
    }
}

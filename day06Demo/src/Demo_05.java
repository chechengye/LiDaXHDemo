import java.util.Arrays;

public class Demo_05 {

    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage(5);
        cm.addChicken(new Chicken(1 , "咕咕" , 4));
        cm.addChicken(new Chicken(2 , "咕咕1" , 3));
        cm.addChicken(new Chicken(3 , "咕咕2" , 1));
        cm.addChicken(new Chicken(4 , "咕咕3" , 6));
        cm.addChicken(new Chicken(5 , "咕咕4" , 7));
        cm.addChicken(new Chicken(6 ,"咕咕5" , 8));
      /*  cm.findAllChicken();
        System.out.println("------------------------");
        cm.updateChicken(new Chicken(2 , "呜呜" , 5));
        cm.findAllChicken();
        System.out.println("------------------------");
        System.out.println(cm.getChicken(4));
        System.out.println("------------------------");*/
        cm.deleteChicken(2);
        cm.findAllChicken();
    }

}

class ChickenManage{
    private Chicken[] chickens;
    private int count = 0;
    public ChickenManage(int size){
        chickens = new Chicken[size];
    }
    //添加鸡
    public void addChicken(Chicken c){
        if(count == chickens.length){
            chickens = Arrays.copyOf(chickens ,  chickens.length + 1);
        }
        chickens[count++] = c;
    }
    //更新一只鸡
    public void updateChicken(Chicken c){
        for (Chicken ck : chickens) {
            if(ck.getId() == c.getId()){//找到了我们要修改的那只鸡
                ck.setName(c.getName());
                ck.setWeight(c.getWeight());
            }
        }
    }

    //删除一只鸡
    public void deleteChicken(int id){
        for (int i = 0; i < chickens.length ; i++) {
            if (chickens[i].getId() == id) {//找到要删除的鸡
                for(int j = i ; j < count  ; j++){
                    if(j + 1 == count){
                        break;
                    }
                    chickens[j] = chickens[j + 1];
                }
            }
        }

        chickens[chickens.length - 1] = null;
    }

    //查找一只鸡
    public Chicken getChicken(int id){
        for (Chicken ck : chickens) {
            if (ck.getId() == id) {
                return ck;
            }
        }
        return null;
    }

    //查询所有鸡
    public void findAllChicken(){
        for(Chicken c : chickens){
            if(null != c){
                System.out.println(c);
            }
        }
    }

}

class Chicken{
    private int id;
    private String name;
    private int weight;
    public Chicken(int id , String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

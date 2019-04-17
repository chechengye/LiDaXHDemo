import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
//        CosmeticManager cm = new CosmeticManager();
//        cm.add(new Cosmetic("aa","进口",1000));
//        cm.add(new Cosmetic("bb","国产",100));
//        cm.add(new Cosmetic("cc","进口",300));
//        cm.add(new Cosmetic("dd","进口",500));
//        cm.show();

//        sortPrice cm = new sortPrice();
//        cm.add(new Cosmetic("aa","进口",1000));
//        cm.add(new Cosmetic("bb","国产",100));
//        cm.add(new Cosmetic("cc","进口",300));
//        cm.add(new Cosmetic("dd","进口",500));
//        cm.show();

        importCosmetic cm = new importCosmetic();
        cm.add(new Cosmetic("aa","进口",1000));
        cm.add(new Cosmetic("bb","国产",100));
        cm.add(new Cosmetic("cc","进口",300));
        cm.add(new Cosmetic("dd","进口",500));
        cm.show();
    }
}

class importCosmetic extends CosmeticManager{
    public void show(){
        for (int i = 0; i < count ; i++) {
            if(cs[i].getType() == "进口"){
                cs[i].print();
            }
        }
    }
}

class sortPrice extends CosmeticManager{
    public void show(){
        Cosmetic[] css = Arrays.copyOf(cs,cs.length);
        for(int i = 0 ; i< count;i++){
            for(int j = i + 1 ; j <count ; j++){
                if(css[i].getPrice() > css[j].getPrice()){
                    Cosmetic temp = css[i];
                    css[i] = css[j];
                    css[j] = temp;
                }
            }
        }
        for (Cosmetic c:css) {
            if(c != null){
                c.print();
            }
        }
    }
}

class CosmeticManager{
    protected Cosmetic[] cs = new Cosmetic[5];//null
    protected int count;//当前存储个数
    public void add(Cosmetic c){
        if(this.count == cs.length){
            int len = cs.length * 2;
            cs = Arrays.copyOf(cs,len);
        }
        cs[count] = c;
        count++;
    }
    public void show(){
        for (Cosmetic c:cs) {
            if(c != null){
                c.print();
            }
        }
    }
}
class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(String name,String type,int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println(this.name+","+this.type+","+this.price);
    }
}

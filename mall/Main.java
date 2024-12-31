package mall;
import java.util.*;
class user extends Main{
    private HashMap<String, ArrayList<Product>> map;
    user(HashMap<String, ArrayList<Product>> map){
        this.map=map;
    }
    public void updatemall(String key,String cat, String br , int pri , int qua){
        if(map.containsKey(key)){
            map.get(key).add(new Product(cat,br,pri,qua));
        }
        else{
            map.put(key, new ArrayList<Product>());
            map.get(key).add(new Product(cat,br,pri,qua));
        }
    }
    public void print(){
        for(String key : map.keySet()){
        System.out.println("_".repeat(5)+key+"_".repeat(5));
        for(Product p : map.get(key)){
            System.out.println("category : "+p.category);
            System.out.println("brand : "+p.brand);
            System.out.println("price : "+p.price);
            System.out.println("quantity : "+p.quantity);
            System.out.println();
        }
    }
    }
}
public class Main{
    static HashMap<String, ArrayList<Product>> map = new HashMap<>();

    public static  void main(String[] args){
   
}
}
class Product{
    String category;
    String brand;
    int price;
    int quantity;
    
    Product(String c,String b, int p, int q){
        category=c;
        brand=b;
        price=p;
        quantity=q;
    }
}
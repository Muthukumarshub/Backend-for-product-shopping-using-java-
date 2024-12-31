package mall;
import java.util.*;
public class driver {
	public static void main(String[] args) {
		HashMap<String,ArrayList<Product>> map = new HashMap<>();		
		 user u = new user(map);
		    u.updatemall("Shirt","Shirt","Allensolly",1500,1);
		    u.updatemall("Shirt","Shirt","Ramraj",1800,1);
		    u.updatemall("Pant","Pant","Allensolly",2000,2);
		    u.updatemall("Pant","Pant","Ramraj",2000,2);
		    u.updatemall("Inners","Inners","Jockey",100,5);
		    u.print();
	}
}

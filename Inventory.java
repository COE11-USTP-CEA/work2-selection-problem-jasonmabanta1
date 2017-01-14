import java.util.ArrayList;
import java.util.List;

public class Inventory {

    
    public static void main(String[] args) {
        
        item t1 = new item("perla", "Soap", 15.00f);
        item t2 = new item("Virgin Cola", "Softdrinks", 12.00f);
        item t3 = new item("Adults Diaper, "Diapers", 8.00f);
        item t4 = new item("Barako", "Coffee", 7.00f);
        item t5 = new item("Liberty", "Milk", 25.00f);
        item t6 = new item("Fortune", "Cigarette", 30.00f);
        item t7 = new item("Honey", "Biscuit", 15.00f);
        item t8 = new item("Modess", "Napkin", 7.00f);
        item t9 = new item("Surf", "Fabric Conditioner", 6.00f);
        item t10 = new item("Boy Bawang", "Junk foods", 15.00f);
          
        List<item> inv = new ArrayList<item>();
        inv.add(t1);
        inv.add(t2);
        inv.add(t3);
        inv.add(t4);
        inv.add(t5);
        inv.add(t6);
        inv.add(t7);
        inv.add(t8);
        inv.add(t9);
        inv.add(t10);
        
        for(item i:inv){
            
            System.out.println("Item: " + i.item_name);
            System.out.println("Type: " + i.cat_name);
            System.out.println("Price: " + i.price);
            
        }
        
    }
    
}

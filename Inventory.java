import java.util.ArrayList;
import java.util.List;

public class Inventory {

    
    public static void main(String[] args) {
        
        item t1 = new item("Safe Guard", "Soap", 15.00f);
        item t2 = new item("Coke", "Softdrinks", 12.00f);
        item t3 = new item("EQ", "Diapers", 8.00f);
        item t4 = new item("Creamy White", "Coffee", 7.00f);
        item t5 = new item("Bear Brand", "Milk", 25.00f);
        item t6 = new item("winston", "Cigarette", 30.00f);
        item t7 = new item("Hanzel", "Biscuit", 6.00f);
        item t8 = new item("Whisper", "Napkin", 7.00f);
        item t9 = new item("Downy", "Fabric Conditioner", 6.00f);
        item t10 = new item("Piatos", "Junk foods", 10.00f);
          
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
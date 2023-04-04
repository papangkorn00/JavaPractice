package valuablekriengkrai;

import utilkriengkrai.Tool999;

//2
public class Item999 {
   //2.1(5) fields
   private final String name;
   private int amount;

   //2.2(5) constructor
   private Item999(String name, int amount) {
      this.name = name;
      this.amount = amount;
   }
   //2.3(10)
   public static Item999 create(String name, int amount) { 
      if (Tool999.isUsable999(name) && amount > 0) {
         return new Item999(name,amount);
      }
      return null;
   }

   //2.4(5)
   @Override
   public String toString() { return '('+name+','+amount+')'; }
   
   //2.5(5)
   public int add(Item999 item) {
      if (item==null) return -1;
      amount += item.amount;
      return amount;
   }
   
   //2.6(10)
   public boolean isMatched(Item999 item) {
      return item != null && name.equals(item.name);
   }
   
}

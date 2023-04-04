package valuablekriengkrai;

import utilkriengkrai.Tool999;

//3
public class Container999 {
   //3.1(5) fields
   private final Item999 items[] = new Item999[999];
   
   //3.2(10)
   @Override
   public String toString() {
      var b = new StringBuilder();
      b.append("Container999{").append(Tool999.count999(items)).append(':');
      for (Item999 item : items) {
         if (item != null) b.append(item.toString());
      }
      return b.append('}').toString();
   }
   
   //3.3(15)
   public boolean add(Item999 item) {
      if (item == null) return false;
      
      // if match, adjust
      for (Item999 it : items) {
         if (item.isMatched(it)) {
            it.add(item);
            return true;
         }
      }
      // if not match and not full, add
      for (int i = 0; i < items.length; i++) {
         if (items[i] == null) {
            items[i] = item;
            return true;
         }
      }
      return false;
   }
   
   //3.4(10)
   public boolean remove(Item999 item) {
      if (item == null) return false;
      for (int i = 0; i < items.length; i++) {
         if (item.isMatched(items[i])) {
            items[i] = null;
            return true;
         }
      }
      return false;
   }
}

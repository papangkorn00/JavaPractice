package testing;

import utilkriengkrai.Tool999;
import valuablekriengkrai.Container999;
import valuablekriengkrai.Item999;

/*
0. Replace 999 with the last three digits of your student id and 
   replace nnn with your full first name. 
   You must follow java naming convention, format your code properly, 
   and use only meaningful comments (if any) to get full credits. 
   Create a project named "int101final999".
1. Create a "Tool999" class in "utilnnn" package as a utility class and 
   implements the following public static methods:
1.1 "isUsable999" method that receives an input argument of type String and 
    returns a boolean. It returns true if its input argument is not null and 
    not a blank string.
1.2 "isUsable999" method that receives an input argument of type Object[] and
    returns a boolean. It returns true if its input argument is not null and 
    is an array with length more than 0.
1.3 "count999" method that receives an input argument of type Object[] and 
    returns an int, which is the number of objects in the array. 
    Note that if its argument is not usable according to 1.2, return -1.
2. Create an "Item999" class in "valuablennn" package. This class contains 
   the following fields and methods:
2.1 Two private fields: "name" (String, final) and "amount" (int).
2.2 A private constructor that receives a name and an amount to set the values 
    of the two fields respectively without checking the correctness of the arguments.
2.3 A public static "create" method that receives two input arguments: "name" (String) 
    and "amount" (int) respectively. This method returns a new Item999 object 
    with the given "name" and the given "amount" if the given "name" is usable 
    according to 1.2 and the given "amount" is more than 0. 
    Otherwise, this method returns null.
2.4 An @Override public "toString" method that returns its content as a string 
    in the following format: "(name,amount)".
2.5 A public "add" method that receives an input argument: "item" (Item999).
    Set the "amount" of this object to the summation of the two "amount" 
    and returns the sum. 
2.6 A public "isMatched" method that receives an input argument: "item" of type Item999.
    This method returns true if this object and the given "item" has the same "name".
    Otherwise, this method return false.
3. Create an "Container999" class in "valuablennn" package. This class contains 
   the following fields and methods:
3.1 a private final field: "items" which is an array of type "Item999" and 
    is initialized to an array of size 999.
3.2 An @Override public "toString" method that returns a string containing 
    the number of Item999 in the array (by using 1.3) followed by 
    the string concatenation of Item999's toString().
3.3 A public "add" method that receives an input argument: "item" of type "Item999".
    This method will put "item" in the array if "item" does not match any "Item999" 
    in the array "items". If "item" matches any "Item999" in the array, adjust 
    that "Item999" in the array by "item". If the "item" does not match 
    any "Item999" in the array and there is no space left in the array to add "item", 
    this method returns false. Otherwise, it returns true.
3.4 A public "remove" method that receives an input argument: "item" of type "Item999". 
    This method will remove the "Item999" in the array (by replacing that slot with null) 
    that matches "item" and returns true. Otherwise, it returns false.
*/

public class Main999 {
   public static void main(String[] args) {
      testTool999();
      testItem999();
      testContainer999();
   }
   static void testTool999() {
      //Tool999.isUsable999(string)
      System.out.println("\nTEST: Tool999.isUsable999(string) ----");
      System.out.println("Tool999.isUsable999(null as string) : " + Tool999.isUsable999((String) null));
      System.out.println("Tool999.isUsable999(\"\") : " + Tool999.isUsable999(""));
      System.out.println("Tool999.isUsable999(\"  \") : " + Tool999.isUsable999("  "));
      System.out.println("Tool999.isUsable999(\"ok\") : " + Tool999.isUsable999("ok"));
      //Tool999.isUsable999(array)
      System.out.println("\nTEST: Tool999.isUsable999(array) ----");
      System.out.println("Tool999.isUsable999(null as array) : " + Tool999.isUsable999((Object[]) null));
      System.out.println("Tool999.isUsable999(new Object[0]) : " + Tool999.isUsable999(new Object[0]));
      System.out.println("Tool999.isUsable999(new String[1]) : " + Tool999.isUsable999(new String[1]));
      System.out.println("Tool999.isUsable999(new Object[] {}) : " + Tool999.isUsable999(new Object[] {}));
      System.out.println("Tool999.isUsable999(new Object[] {null}) : " + Tool999.isUsable999(new Object[] {null}));
      //Tool999.count999(array)
      System.out.println("\nTEST: Tool999.count999(array) ----");
      System.out.println("Tool999.count999(null) : " + Tool999.count999(null));
      System.out.println("Tool999.count999(new Object[0]) : " + Tool999.count999(new Object[0]));
      System.out.println("Tool999.count999(new Object[1]) : " + Tool999.count999(new Object[1]));
      System.out.println("Tool999.count999(new Object[2]) : " + Tool999.count999(new Object[2]));
      System.out.println("Tool999.count999(new Object[] {}) : " + Tool999.count999(new Object[] {}));
      System.out.println("Tool999.count999(new Object[] {null}) : " + Tool999.count999(new Object[] {null}));
      System.out.println("Tool999.count999(new String[] {\"\"}) : " + Tool999.count999(new String[] {""}));
      System.out.println("Tool999.count999(new Object[] {\"\",null,\" \"}) : " + Tool999.count999(new Object[] {"",null," "}));
   }
   static void testItem999() {
      //Item999.create(string, amount).toString()
      System.out.println("\nTEST: Item999.create(string, amount) ----");
      System.out.println("Item999.create(null,0) : " + Item999.create(null, 0));
      System.out.println("Item999.create(null,1) : " + Item999.create(null, 1));
      System.out.println("Item999.create(\"O\",0) : " + Item999.create("O", 0));
      System.out.println("Item999.create(\"O\",1) : " + Item999.create("O", 1));
      //item999.add(item999)
      System.out.println("\nTEST: item999.add(item999) ----");
      Item999 i0 = Item999.create("I0", 1);
      Item999 i1 = Item999.create("I1", 10);
      Item999 i2 = Item999.create("I2", 100);
      Item999 i3 = Item999.create("I1", 1000);
      System.out.println("i0: " + i0);
      System.out.println("i1: " + i1);
      System.out.println("i2: " + i2);
      System.out.println("i3: " + i3);
      System.out.println("i0.add(i1) : " + i0.add(i1));
      System.out.println("i0: " + i0 + ", i1: " + i1);
      System.out.println("i2.add(i3) : " + i2.add(i3));
      System.out.println("i2: " + i2 + ", i3: " + i3);
      System.out.println("i0.add(i2) : " + i0.add(i2));
      System.out.println("i0: " + i0 + ", i2: " + i2);
      System.out.println("i3.add(null) : " + i3.add(null));
      System.out.println("i3: " + i3);
      //item999.isMatched(item999)
      System.out.println("\nTEST: item999.isMatched(item999) ----");
      System.out.println("i0.isMatched(null): " + i0.isMatched(null));
      System.out.println("i0.isMatched(i0): " + i0.isMatched(i0));
      System.out.println("i0.isMatched(i1): " + i0.isMatched(i1));
      System.out.println("i1.isMatched(i2): " + i1.isMatched(i2));
      System.out.println("i1.isMatched(i3): " + i1.isMatched(i3));
   }
   static void testContainer999() {
      var c = new Container999();
      //container999.add(item999)
      System.out.println("\nTEST: container999.add(item999) ----");
      Item999 i2 = Item999.create("I2", 100);
      System.out.println("container999.add(\"I2\",100) : " + c.add(i2));
      System.out.println("container999.toString() : " + c.toString());
      Item999 i1 = Item999.create("I1", 10);
      System.out.println("container999.add(\"I1\",10) : " + c.add(i1));
      System.out.println("container999.toString() : " + c.toString());
      Item999 i0 = Item999.create("I0", 1);
      System.out.println("container999.add(\"I0\",1) : " + c.add(i0));
      System.out.println("container999.toString() : " + c.toString());
      Item999 i3 = Item999.create("I1", 1_000);
      System.out.println("container999.add(\"I1\",1000) : " + c.add(i3));
      System.out.println("container999.toString() : " + c.toString());
      //container999.remove(item999)
      System.out.println("\nTEST: container999.remove(item999) ----");
      Item999 i4 = Item999.create("I4", 4);
      System.out.println("container999.remove(\"I4\",4) : " + c.remove(i4));
      System.out.println("container999.toString() : " + c.toString());
      Item999 i5 = Item999.create("I1", 5);
      System.out.println("container999.remove(\"I1\",5) : " + c.remove(i5));
      System.out.println("container999.toString() : " + c.toString());
   }
}

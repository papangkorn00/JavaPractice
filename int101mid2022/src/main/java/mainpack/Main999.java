package mainpack;

import obj.kriengkrai.Obj999;
import util.kriengkrai.Util999;

public class Main999 {
   public static void main(String[] args) {
      testKRIENGKRAI();//test 3.1
      testCompute999RightTriangleArea();//test 3.2
      testEvaluate999();//test 3.3
      testComputeMagicKriengkrai();//test 3.4
      testObj999();//test 4.2,4.4
      testGetterSetter();//test 4.3
      testCompare();//test 4.5
      testIsGreaterThan();//test 4.6
   }
   //test 3.1 Util
   public static void testKRIENGKRAI() {
      System.out.println("3.1: " + Util999.KRIENGKRAI);
   }
   //test 3.2 Util
   public static void testCompute999RightTriangleArea() {
      System.out.println("3.2: compute999: " 
         + Util999.compute999RightTriangleArea(0.0, 0.0));
   }
   //test 3.3 Util
   public static void testEvaluate999() {
      System.out.println("3.3: evaluate999: " + Util999.evaluate999(0.0));
   }
   //test 3.4 Util
   public static void testComputeMagicKriengkrai() {
      System.out.println("3.4: computMagic: " 
         + Util999.computeMagicKriengkrai(0, 0, 0));
   }
   //test 4.2,4.4: Obj999 constructor, toString()
   public static void testObj999() {
      var o = new Obj999("id999","Kriengkrai",999.99);
      var p = new Obj999("id000","Porkaew",900.09);
      System.out.println("4.2,4.4: Obj999 new: " + o);
      System.out.println("4.2,4.4: Obj999 new: " + p);
   }
   //4.3 Obj999 getters, setters
   public static void testGetterSetter() {
      var o = new Obj999("id999","Kriengkrai",999.99);
      var p = new Obj999("id000","Porkaew",900.09);
      System.out.println("4.3: getId999: " + Obj999.getId999());
      System.out.println("4.3: getNameKriengkrai: " + o.getNameKriengkrai());
      System.out.println("4.3: getValue999: " + o.getValue999());
      Obj999.setId999("ONE");
      o.setNameKriengkrai("BLANK");
      o.setValue999(888);
      System.out.println("4.3: getId999: " + Obj999.getId999());
      System.out.println("4.3: getNameKriengkrai: " + o.getNameKriengkrai());
      System.out.println("4.3: getValue999: " + o.getValue999());
   }
   //4.5 Obj999
   public static void testCompare() {
      var o = new Obj999("id999","Kriengkrai",999.99);
      var p = new Obj999("id000","Porkaew",900.09);
      System.out.println("4.5: compare: " + Obj999.compare(o, p));
   }
   //4.6 Obj999
   public static void testIsGreaterThan() {
      var o = new Obj999("id999","Kriengkrai",999.99);
      var p = new Obj999("id000","Porkaew",900.09);
      System.out.println("4.6: isGreaterThan: " + o.isGreaterThan(p));
   }
}

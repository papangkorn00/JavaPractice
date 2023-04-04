package mainpack;

import obj.papangkorn.Obj041;
import util.papangkorn.Util041;

public class Main041 {
    public static void main(String[] args) {
        testPAPANGKORN();//test 3.1
        testCompute041RightTriangleArea();//test 3.2
        testEvaluate041();//test 3.3
        testComputeMagicPapangkorn();//test 3.4
        testObj041();//test 4.2,4.4
        testGetterSetter();//test 4.3
        testCompare();//test 4.5
        testIsGreaterThan();//test 4.6
    }
    
    public static void testPAPANGKORN(){
        System.out.println("3.1 " + Util041.PAPANGKORN);
    }
    
    public static void testCompute041RightTriangleArea(){
        System.out.println("3.2 " + Util041.compute041RightTriangleArea(0.0, 0.0));
   }
   
    public static void testEvaluate041(){
        System.out.println("3.3 " + Util041.evalate041(0.0));
    }
    
    public static void testComputeMagicPapangkorn(){
        System.out.println("3.4 " + Util041.computeMagicPapangkorn(0, 0, 0));
    }
    
    public static void testObj041(){
        var o = new Obj041("id041","Papangkorn",041.99);
        var p = new Obj041("id000","Kijsakulrat",900.09);
        System.out.println("4.2,4.4: Obj041 new: " + o);
      System.out.println("4.2,4.4: Obj041 new: " + p);
    }
    
    public static void testGetterSetter(){
        var o = new Obj041("id041","Papangkorn",041.99);
        var p = new Obj041("id000","Kijsakulrat",900.09);
        System.out.println("4.3: getId041: " + Obj041.getId041());
        System.out.println("4.3: getNamePapangkorn: " + o.getNamePapangkorn());
        System.out.println("4.3: getValue041: " + o.getValue041());
        Obj041.setId041("One");
        o.setNamePapangkorn("BLANK");
        o.setValue041(999);
        System.out.println("4.3: getId041: " + Obj041.getId041());
        System.out.println("4.3: getNamePapangkorn: " + o.getNamePapangkorn());
        System.out.println("4.3: getValue041: " + o.getValue041());
    }
    
    public static void testCompare(){
        var o = new Obj041("id041","Papangkorn",041.99);
        var p = new Obj041("id000","Kijsakulrat",900.09);
        System.out.println("4.5: compare: " + Obj041.compare(o, p));
    }
    
    public static void testIsGreaterThan(){
        var o = new Obj041("id041","Papangkorn",041.99);
        var p = new Obj041("id000","Kijsakulrat",900.09);
        System.out.println("4.6: isGreaterThan: " + o.isGreaterThan(p));
    }
}

package test2.id041;

import basic.Simple;

public class TestBasic {

    public static void main(String[] args) {
//        Simple s = new Simple(null, -1);
//        //TestConstructor
//        System.out.println(s);
//
//        //TestAddAmount
//        System.out.println("add 5" + s.addAmount(5));
//        System.out.println("add -1.5" + s.addAmount(0.0));
//        System.out.println("add -5.5" + s.addAmount(-5.5));
//
//        //TestToString
//        System.out.println(s.toString());
//        

        Simple s = new Simple("SimpleTitle", -20);

        //test Simple::addAmount()
        System.out.println("add -3.4: " + s.addAmount(-3.4));
        System.out.println("add -5.3: " + s.addAmount(-5.3));
        System.out.println("add -1.5: " + s.addAmount(-1.5));
        System.out.println("add 12.0: " + s.addAmount(12.0));

        //test Simple::toString()
        System.out.println("s: " + s);

    }
}

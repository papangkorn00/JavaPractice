package int101retrain;

import int101.names.Naming;

public class Int101retrain {

    public static void main(String[] args) {
        Naming n = new Naming("A B");
        System.out.println(n);

        System.out.println("Add XYZ: " + n.addName("XYZ"));
        System.out.println("Add URL: " + n.addName("URL"));
        System.out.println("Add WWW: " + n.addName("WWW"));
        System.out.println("Add URL: " + n.addName("URL"));
        System.out.println("SHOW: " + n);

        System.out.println("Find WWW: " + n.findName("WWW"));
        System.out.println("Find URL: " + n.findName("URl"));

        System.out.println("Remove WWW: " + n.removeName("WWW") );
        System.out.println("SHOW: " + n);

        System.out.println("Remove XYZ: " + n.removeName("XYZ") );
        System.out.println("SHOW: " + n);
        
        
    }

}

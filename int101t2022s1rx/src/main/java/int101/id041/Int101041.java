// Student Id: 65130500041
// Full Name: Papangkorn Kijsakulrat
// Seat No: 2.5
package int101.id041;

import history.id041.Log041;

public class Int101041 {

    public static void main(String[] args) {
        testLog041();
    }

//    2.1 add a public static void main method to test all public methods 
//    (1.6, 1.7, 1.8, 1.9).
    public static void testLog041() {

        //TestConstructor 1.6
        System.out.println("TEST CONSTRUCTOR 1.6");
        Log041 log = new Log041("papangkorn", 6);
        Log041 log2 = new Log041(null, 5);
        Log041 log3 = new Log041("Poom", 5);
        System.out.println(log);

        //TestPerform 1.7
        System.out.println("TEST PERFORM 1.7");
        System.out.println("Test True : " + log.perform("eat"));
        System.out.println("Test True : " + log.perform("drink"));
        System.out.println("Test False : " + log.perform(""));
        System.out.println("Test False : " + log.perform(null));

        //TestToString() 1.8
        System.out.println("Test ToString 1.8");
        System.out.println("Test LOG1: "+log.toString());
        System.out.println("Test LOG2: " + log2.toString());

        //TestGetlogName 1.9
        System.out.println("TEST GETLOGNAME 1.9");

        var getlog = Log041.getLogName(0);
        System.out.println(getlog);
    }
}

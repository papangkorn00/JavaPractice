// Student Id: 65130500041
// Full Name: Papankorn Kijsakulrat
// Seat No: 4.4
package test2.id041;

import account.id041.Person;
import account.id041.UserAccount;

public class Int101ReExam041 {
    
    public static void main(String[] args) {
//        TestToStringUserAcc(); //1.8
        TestCons(); //2.4
        TestToStringPerson(); //2.6
        TestAddAccount();
    }

//    public static void  TestToStringUserAcc(){
//        Person p = new Person("Poom");
//        var ua = new UserAccount("Papangkorn",p);
//    }
    public static void TestCons() {
        Person p = new Person("Poom");
        System.out.println(p);
    }
    
    public static void TestToStringPerson() {
        Person p = new Person("Poom");
        System.out.println(p);
    }
    
    public static void TestAddAccount() {
        Person p = new Person("Poom");
        System.out.println(p.addAccount("Papangkorn"));
        System.out.println(p.addAccount(" "));
    }
}

package test2.id041;

import account.id041.*;

public class Int101ReExam041 {

    public static void main(String[] args) {

//        TestConstructor(name); 2.4
        Person p1 = new Person("One");
        Person p2 = new Person("Two");

//        TestToStringPerson(); 2.5
        System.out.println("Person0: " + p1);
        System.out.println("Person1: " + p2.toString());

//        TestAddAccount();2.6
        UserAccount u1 = p1.addAccount("User1");
        UserAccount u2 = p2.addAccount("User2");

        //        TestToStringUA(); 1.8
        System.out.println("UserAccount: " + u1);
        System.out.println("UserAccount: " + u2.toString());

        System.out.println("Person1: "+ p1);
    }

}

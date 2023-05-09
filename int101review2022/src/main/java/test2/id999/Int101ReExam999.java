package test2.id999;

import account.id999.*;

public class Int101ReExam999 {
    public static void main(String[] args) {
        //2.4 Person(name)
        Person p0 = new Person("Zero");
        Person p1 = new Person("First");
        
        //2.5 Person::toString()
        System.out.println("Person0: " + p0);
        System.out.println("Person1: " + p1.toString());

        //2.6 Person::addAcount(userName)
        UserAccount u00 = p0.addAccount("Person0User0");
        UserAccount u01 = p0.addAccount("Person0User1");
        
        //1.8 UserAccount::toString()
        System.out.println("UserAccount00: " + u00);
        System.out.println("UserAccount01: " + u01.toString());
        
        System.out.println("Person0: " + p0);
    }
    
    
}

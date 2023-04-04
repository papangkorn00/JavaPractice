
package interface_Practice;

public class Cat implements Animal {

    @Override
    public void run() {
        System.out.println("The cat is running");
    }

    @Override
    public void sound() {
        System.out.println("Cat says meow");
    }

    
    
}

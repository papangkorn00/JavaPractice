
package interface_Practice;

interface FirstInterface{
    void firstMethod();
}

interface SecondInterface{
    void secondMethod();
}

public class MultipleInterface implements FirstInterface,SecondInterface {

    @Override
    public void firstMethod() {
        System.out.println("FIRST METHOD is Calling");
    }

    @Override
    public void secondMethod() {
        System.out.println("SECOND METHOD is Calling");
    }
}

//Test
class Main{
    public static void main(String[] args) {
        MultipleInterface myObj = new MultipleInterface();
        myObj.firstMethod();
        myObj.secondMethod();
    }
}

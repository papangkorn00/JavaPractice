import containment.Container;
import human.Person;
public class Main {
    public static void main(String[] args) {
        testContainer();
    }

    static  void testContainer(){
        var c = new Container<Person>();
        var p0 =  new Person("Poom","Zero");
        var p1 =  new Student("Poom1","One");
        var p2 =  new Person("Poom2","Two");
        var p3 =  new Person("Poom3","Three");

        System.out.println("Add");
    }
}


package ArrayList_LinkedList;
import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        
        cars.addFirst("Nissan");
        
        System.out.println(cars);
        
        for(String i : cars){
            System.out.println(i);
        }
    }
}

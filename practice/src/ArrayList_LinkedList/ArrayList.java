package ArrayList_LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        
//      cars.set(0, "Nissan");
        
        System.out.println(cars.get(3));
        
        System.out.println(cars.size());
        
        for (String i : cars){
            System.out.println(i);
        }
    }
}

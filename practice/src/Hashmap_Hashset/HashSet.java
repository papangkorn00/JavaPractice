package Hashmap_Hashset;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSet {

    public static void main(String[] args) {
        //HashSet
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BmW");
        cars.add("Toyota");
        cars.add("Mazda");
        
        System.out.println(cars);
        
        System.out.println(cars.contains("Volvo"));
        
        for(String i : cars){
            System.out.println(i);
        }
            
        
        
        //ArrayList
        ArrayList<String> guns = new ArrayList<>();        
        guns.add("Ak47");
        guns.add("Scar");
        guns.add("Scar");
        guns.add("HK416");
        
        System.out.println(guns);
    }
    
}

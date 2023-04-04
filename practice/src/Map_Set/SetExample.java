
package Map_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("durian");
        
        Set<String> hashSet  = new HashSet<>(fruits);
        Set<String> linkedHashSet  = new LinkedHashSet<>(fruits);
        Set<String> treeSet  = new TreeSet<>(fruits);
        
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet );
        System.out.println("TreeSet: " + treeSet);
    }
}

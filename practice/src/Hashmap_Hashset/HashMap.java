
package Hashmap_Hashset;
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String,String> capital = new HashMap<>();
        
        capital.put("Thailand", "Bangkok");
        capital.put("England", "London");
        capital.put("Germany", "Berlin");
//        System.out.println(capital);
        
        System.out.println(capital.get("Germany"));
        
//        capital.remove("Thailand");
        
//        System.out.println(capital.size());
        
//        System.out.println(capital);

        for(String i : capital.keySet()){
            System.out.println(i);
        }
        
        for(String i : capital.values()){
            System.out.println(i);
        }
    }
}

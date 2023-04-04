
package Map_Set;
import java.util.HashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("A",10 );
        maps.put("Y",50 );
        maps.put("Z",20 );
        maps.put("D",90 );
        
        for(Map.Entry<String, Integer> entry : maps.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
            System.out.println("============");
        }
    }
}




package Map_Set;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> maps = new java.util.TreeMap<>();
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
            
            
            System.out.println("Test GradeCal");
            System.out.println(gradeCal(90));
        }
    }
    
    public static String gradeCal(int score){
        TreeMap<Integer, String> grades = new TreeMap<>();
        grades.put(0,"F");
        grades.put(50,"D");
        grades.put(60,"C");
        grades.put(70,"B");
        grades.put(80,"A");
        
        return grades.floorEntry(score).getValue();
    }
}


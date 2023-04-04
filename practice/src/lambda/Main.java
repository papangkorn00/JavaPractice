
package lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pete","Peter","Daisy","Anthony");
        
        //LambdaExpression
        names.stream().filter(name -> name.startsWith("P")).forEach(System.out::println);
        
        //Sort by method ref.
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
        
        //Map lambda 
        List<Integer> nameLengths = names.stream().map(name -> name.length()).toList();
        System.out.println(nameLengths);
    }
}

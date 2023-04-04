
package Practice_inheritance;

public class Main {
    public static void main(String[] args) {
        Shoe s = new Shoe("Nike",10.5);
        System.out.println(s.brand);
        System.out.println(s.size);
        
        Walking w = new Walking(true,"Nike",10.5);
        System.out.println(w.goretex);
        System.out.println(w.brand);
        System.out.println(w.size);
        
        Running r = new Running(78.5,"Nike",10.5);
        System.out.println(r.weight);
        System.out.println(w.brand);
        System.out.println(w.size);
    }
}

import collection.ImCollection;
package int103w08;
public class Int103w08 {
    public static void main(String[] args) {
        testCollection();
    }
    static void testCollection() {
        var c = new ImCollection<String>(new String[] {"Zero","One","Two","Three","Four","Five"});
        var arr = c.toArray();
        System.out.println("Arr type: " + arr);
        System.out.println("ARR content:");
        for (Object object : arr) {
            System.out.println("" + object);
        }
        System.out.println();
    }
}

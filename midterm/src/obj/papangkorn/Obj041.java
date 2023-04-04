
package obj.papangkorn;


public class Obj041 {
    private static String id041;
    private String namePapangkorn;
    private double value041;

    public Obj041(String id041,String namePapangkorn, double value041) {
        Obj041.id041 = id041;
        this.namePapangkorn = namePapangkorn;
        this.value041 = value041;
    }

    public static String getId041() {
        return id041;
    }

    public static void setId041(String id041) {
        Obj041.id041 = id041;
    }

    public String getNamePapangkorn() {
        return namePapangkorn;
    }

    public void setNamePapangkorn(String namePapangkorn) {
        this.namePapangkorn = namePapangkorn;
    }

    public double getValue041() {
        return value041;
    }

    public void setValue041(double value041) {
        this.value041 = value041;
    }

//    @Override
//    public String ToString(){
//        return "id = " + id041 + "name = " + namePapangkorn + "value = " + value041;
//    }

    @Override
    public String toString() {
        return "Obj041{" + "id041=" + id041
         + ", namePapangkorni=" + namePapangkorn
         + ", value041=" + value041 + '}';
    }

    
    public static int compare(Obj041 o1,Obj041 o2){
        if(o1.value041 == o2.value041) return 0;    
        if(o1.value041 < o2.value041) return -1;
        if (o1 == null || o2 == null) return 1;
        return 1;
    }
    
    public boolean isGreaterThan(Obj041 o){
        if (o.value041 > this.value041) return true;
        return false;
    }
    
     
}

   

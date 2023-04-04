package utility;

public class Util {

    private Util () {}

    public static boolean isValid(String str){
        return str != null && ! str.isBlank();
    }
}

package utilkriengkrai;

//1 utility class
public final class Tool999 {
   private Tool999() { }
   //1.1(5) non-blank string
   public static boolean isUsable999(String string) {
      return string != null && ! string.isBlank();
   }
   //1.2(5) array with length
   public static boolean isUsable999(Object[] array) {
      return array != null && array.length > 0;
   }
   //1.3(10) count elements in the array
   public static int count999(Object[] array) {
      if (!isUsable999(array)) return -1;
      int c = 0;
      for (Object object : array) 
         if (object != null) c++;
      return c;
   }
   
}

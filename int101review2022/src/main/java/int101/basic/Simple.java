package int101.basic;

public class Simple {
    //1.1 add a "private" field of type "string" named "title"
    private String title;
    
    //1.2 add a "private" field of type "int" named "value"
    private int value;
    
    //1.3 add a "private" field of type array of "double" named "amounts"
    //    and intialize its size to 5.
    private double[] amounts = new double[5];

    //1.4 add a "private" field of type "int" named "count" for counting
    //    the number of elements in the "amounts" array.
    private int count;
    
    //1.5 add a "public" "constructor" that receives a "title" and a "value" 
    //    to initializes the "title" and the "value" fields of this object.
    //    if the "title" parameter is null, set the "title" field to "NOTITLE".
    //    if the "value" parameter is less than 0, set the "value" field to 0.
    public Simple(String title, int value) {
        this.title = title == null ? "NOTITLE" : title;
        this.value = value < 0 ? 0 : value;
    }
    
    //1.6 add a "public" method named "addAmount" that receives 
    //    a "double" parameter named "amount" and returns a "boolean".
    //    this method adds "amount" in the "amounts" array and 
    //    increase "count" by 1 if the "amount" is larger than all elements in 
    //    the "amounts" array. Otherwise, it returns false 
    //    and not adding anything into the array.
    public boolean addAmount(double amount) {
        //for (int i = 0; i < count; i++) {
        //    if (amount <= amounts[i]) return false;
        //}
        if (count > 0 && amount <= amounts[count-1]) return false;
        amounts[count++] = amount;
        return true;
    }
    
    //1.7 override a toString method to show all the contents of this object:
    //    "title", "value", and each element in the "amounts" array.
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Simple[").append("title:").append(title);
        s.append(",value:").append(value);
        for (int i = 0; i < count; i++) {
            s.append(" ").append(amounts[i]);
        }
        return s.append("]").toString();
    }
}

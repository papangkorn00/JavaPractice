package basic;

public class Simple {

    private String title;
    private int value;
    private double[] amounts = new double[5];
    private int count;
    
    public Simple(String title, int value) {
        if (title == null) {
            this.title = "NOTITLE";
        } else {
            this.title = title;
        }
        if (value < 0) {
            this.value = 0;
        }else{
            this.value = value;
        }   
    }

    //1.6 add a "public" method named "addAmount" that receives 
    //    a "double" parameter named "amount" and returns a "boolean".
    //    this method adds "amount" in the "amounts" array and 
    //    increase "count" by 1 if the "amount" is larger than all elements in 
    //    the "amounts" array. Otherwise, it returns false 
    //    and not adding anything into the array.
    public boolean addAmount(double amount) {
        for (int i = 0; i < count; i++) {
            if (amount <= amounts[i]) return false;
        }
        amounts[count++] = amount;
        return true;
        
//        if(count > 0 && amount <= amounts[count-1]) return false;
//        amounts[count++] = amount;
//        return true;

    }

    //1.7 override a toString method to show all the contents of this object:
    //    "title", "value", and each element in the "amounts" array.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Simple{");
        sb.append("title=").append(title);
        sb.append(", value=").append(value);
        for (int i = 0; i < count; i++) {
            sb.append(", amounts=").append(amounts);
        }     
        sb.append('}');
        return sb.toString();
    }
    
}

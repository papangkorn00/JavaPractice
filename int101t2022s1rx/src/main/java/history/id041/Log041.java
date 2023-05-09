// Student Id: 65130500041
// Full Name: Papangkorn Kijsakulrat
// Seat No: 2.5
package history.id041;

public class Log041 {
//    1.1 add a private final field named "name999" of "String" type.

    private final String name041;

//1.2 add a private final field named "activities" of "String" array type.
    private final String[] activities;

//1.3 add a private field named "count" of "int" type to count the number of 
//    activities in the "activities" array.
    private int count;

//1.4 add a private static final field named "allLog999" of "String" array type 
//    and initialize the size of the array to 20.
    private static final String[] allLog041 = new String[20];

//1.5 add a private static field named "logCount" of "int" type 
//    and use this field to count the number of elements in the "allLog999" array.
    private static int logCount;

//1.6 add a public constructor that receives a "name" of "String" type
//    and a "size" of "int" type. This constructor uses the "name" parameter 
//    to initialize the "name999" field and initializes the "activities" 
//    to an array of size equal to "size". Note that, if the "size" parameter 
//    is less than 3, it uses 3 instead of "size". If the "name" parameter 
//    is null or blank, it uses "NONAME" instead.
//    If the "allLog999" array is not full, this constructor adds the "name999" 
//    of this "Log999" object into the "allLog999" array and increase the "logCount" by 1.
//    Otherwise, it does not add anything into the "allLog999" array.
    public Log041(String name, int size) {
        if (name == null || name.isBlank()) {
            name = "NONAME";
        }
        this.name041 = name;
        if (size < 3) {
            size = 3;
        }
        this.activities = new String[size];
        if (logCount < 20) {
            allLog041[logCount++] = name041;
        }
    }

//1.7 add a public method named "perform" that receives a parameter named "activity" 
//    of "String" type. This method adds "activity" to the "activities" array 
//    and increase the "count" by 1 and return "true" (boolean) 
//    if the "activities" array is not full and the "activity" is not null and not blank.
//    Otherwise, it does nothing and returns "false".
    public boolean perform(String activity) {
        if (activity != null && !activity.isBlank() && count < activities.length) {
            activities[count++] = activity;
            return true;
        }
        return false;

    }

//1.8 override the "toString()" method to show the "name999" and all activities 
//    in the "activities" array of "Log999".
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Log041{");
        sb.append("name041=").append(name041);
        for (int i = 0; i < count; i++) {
            sb.append(", activities=").append(activities[i]);
        }
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }

//1.9 add a public static method named "getLogName" that receives a parameter named 
//    "index" of "int" type. It returns the string in the "allLog999" array at the 
//    "index" position if the "index" position contains a log name. Otherwise, 
//    it returns "NOLOG".
    public static String getLogName(int index){
        if (index >= 0 && index < logCount) {
            return allLog041[index];
        }
        return "NOLOG";
    }
}

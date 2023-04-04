package OOP5555;

public class OOP2 {
    private String name;
    private int age;
    private static String ID;
    private static double GPA;

    OOP2(String name, int age, String ID, double GPA){
        System.out.println("my name"+name);
        System.out.println("my name"+age);
        System.out.println("my name"+ID);
        System.out.println("my name"+GPA);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        OOP2.ID = ID;
    }

    public static double getGPA() {
        return GPA;
    }

    public static void setGPA(double GPA) {
        OOP2.GPA = GPA;
    }



}




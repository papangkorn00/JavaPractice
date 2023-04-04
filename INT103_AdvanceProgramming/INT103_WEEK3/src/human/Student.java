package human;

public class Student extends Person {
    private final String curr;
    public Student(int id, String name, String curr){
        super(id, name);
        this.curr = curr;
    }

    @Override public String toString() {
       return "Student[" + id + "," + name + "," + curr + "]";
    }
}

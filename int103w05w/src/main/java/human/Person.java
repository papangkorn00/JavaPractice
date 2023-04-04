package human;

import java.util.Comparator;
import tools.Util;

public class Person implements Comparable<Person> {
    private static int nextId;
    private final int id;
    protected String firstname;
    protected String lastname;

    private static class FirstnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p0, Person p1) {
            return p0.firstname.compareTo(p1.firstname);
        }
    }
    private static class LastnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p0, Person p1) {
            return p0.lastname.compareTo(p1.lastname);
        }
    }
    
    public static final Comparator FIRSTNAME_COMPARATOR= new FirstnameComparator();
    public static final Comparator LASTNAME_COMPARATOR = new LastnameComparator();
    
    public Person(String firstname, String lastname) {
        this.firstname = Util.isValid(firstname) ? firstname : Util.BLANK;
        this.lastname = Util.isValid(lastname) ? lastname : Util.BLANK;
        this.id = nextId++;
    }
    @Override
    public String toString() {
        return String.format("%s[id:%d,name:%s,%s]",
                this.getClass().getSimpleName(),id,firstname,lastname);
    }
    @Override
    public boolean equals(Object o) {
        return this == o;
        /*
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final var p = (Person) o;
        return this.id == p.id && this.firstname.equals(p.firstname) && this.lastname.equals(p.lastname);
        */
    }
    
    @Override 
    public int compareTo(Person p) {
        return this.id - p.id;
    }

}

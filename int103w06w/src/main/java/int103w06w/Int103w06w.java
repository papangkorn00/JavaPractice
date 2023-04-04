package int103w06w;

import collection.Group;
import human.Person;
import java.util.Arrays;
import java.util.Comparator;

public class Int103w06w {

    public static void main(String[] args) {
        testPerson();
        //testGroup();
        //testAssignment();
    }
    static void testAssignment() {
        var p0 = new Person("Bryan","Johnson");
        var p1 = new Person("Gina","Smith");
        var p2 = new Person("Bella","Smith");
        var p3 = new Person("Gina","Dole");
        var p4 = new Person("Bryan","Johnson");
        var p5 = new Person("Bella","Dole");
        var ps = new Person[] {p3, p4, null, p5, p2, null, p0, p1};
        for (int i = 0; i < ps.length; i++) System.out.printf("ps[%d]: %s%n", i, ps[i]);
        //1.sort ps by putting null last and sort by reverse firstname using comparing() function
        //2.sort ps by putting null first and {sort by id % 3, then lastname} using lambda expression
    }
    static void testPerson() {
        var p0 = new Person("Bryan","Johnson");
        var p1 = new Person("Gina","Smith");
        var p2 = new Person("Bryan","Smith");
        var p3 = new Person("Gina","Dole");
        var p4 = new Person("Bella","Johnson");
        System.out.println("p0 : " + p0);
        System.out.println("p1 : " + p1);
        System.out.println("p2 : " + p2);
        System.out.println("p3 : " + p3);
        System.out.println("p4 : " + p4);
        var ps = new Person[] {p3, p4, p2, p0, p1};
        for (int i = 0; i < ps.length; i++) System.out.printf("ps[%d]: %s%n", i, ps[i]);

        Arrays.sort(ps);
        for (int i = 0; i < ps.length; i++) System.out.printf("Sorted ps[%d]: %s%n", i, ps[i]);

        Arrays.sort(ps, Comparator.naturalOrder());
        for (int i = 0; i < ps.length; i++) System.out.printf("Naturally Sorted ps[%d]: %s%n", i, ps[i]);

        Arrays.sort(ps, Comparator.reverseOrder());
        for (int i = 0; i < ps.length; i++) System.out.printf("Reversely Sorted ps[%d]: %s%n", i, ps[i]);

        Arrays.sort(ps, Person.BY_FIRSTNAME.reversed());
        for (int i = 0; i < ps.length; i++) System.out.printf("Sorted reversely by FIRSTNAME ps[%d]: %s%n", i, ps[i]);

        Comparator<Person> byLastname = (px, py) -> px.getLastname().compareTo(py.getLastname());
        Arrays.sort(ps, byLastname.reversed());
        for (int i = 0; i < ps.length; i++) System.out.printf("Sorted reversely by LASTNAME ps[%d]: %s%n", i, ps[i]);
        
        Arrays.sort(ps, byLastname.thenComparing(Person.BY_FIRSTNAME).reversed());
        for (int i = 0; i < ps.length; i++) System.out.printf("Sorted by LASTNAME,FIRSTNAME ps[%d]: %s%n", i, ps[i]);

        Arrays.sort(ps, Comparator.comparingInt(Person::getId));
        for (int i = 0; i < ps.length; i++) System.out.printf("Comparing by ID: ps[%d]: %s%n", i, ps[i]);

        ps[3] = null;
        ps[1] = null;
        Arrays.sort(ps, Comparator.nullsFirst(Comparator.naturalOrder()));
        for (int i = 0; i < ps.length; i++) System.out.printf("Naturally Sorted + NullsFirst ps[%d]: %s%n", i, ps[i]);
    }
    static void testGroup() {
        var p0 = new Person("Bryan","Johnson");
        var p1 = new Person("Gina","Smith");
        var p2 = new Person("Bryan","Dole");
        var p3 = new Person("Gina","Johnson");
        var p4 = new Person("Bella","Dole");
        var g = new Group<Person>();
        g.add(p3); g.add(p4); g.add(p2); g.add(p0); g.add(p1);
        System.out.println("Group<Person>: " + g);
    }
}

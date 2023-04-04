package human;

import utility.Util;

public class Person implements Comparable<Person>   {

    private static final String BLANK = "BLANK";
    private  static int nextId;
    private final int id;
    private final String  firstname;
    private final String lastname;




    private Person(String firstname, String lastname){
        this.firstname = Util.isValid(firstname) ? firstname : BLANK;
        this.lastname = Util.isValid(lastname) ? lastname : BLANK;
        this.id = nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int compareTo(Person p){
        if (p == null) return 1;
        var you = BLANK.equals(p.firstname);
        if (BLANK.equals(this.firstname)) {
            if(you){
                return 0;
            }else {
                return 1;
            }
        }else if (you){
            return -1;
        }
        return this.firstname.compareTo(p.firstname);
    }

}

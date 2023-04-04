
package exam.unit;

//4. (5 points) Create a public class named Staff in exam.unit package and 

import solution.base.OrgUnit;

//the Staff class contains the following attributes: id (int), firstname (String), 
//lastname (String), and affiliation (OrgUnit) which are all private.
//  4.1. This class has a constructor that receives parameters to initialize all of its attributes. 
//         It contains all getters and setters.
//  4.2. Write a test method named testStaff() in the MainOrgTest to test that 
//         Staff objects work correctly on its constructor and both getter and setter 
//         for affiliation attribute.

public class Staff {
    private int id;
    private String firstname;
    private String lastname;
    private OrgUnit affiliation;

    public Staff(int id, String firstname, String lastname, OrgUnit affiliation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.affiliation = affiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public OrgUnit getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(OrgUnit affiliation) {
        this.affiliation = affiliation;
    }
    
    
    
    
}

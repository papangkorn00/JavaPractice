package employee;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    
    public Employee(int id,String firstname,String lastname,int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    
    public int getId(){
         return id;
    }
     
    public String getFirstname(){
        return firstname;
    }   
    
    public String getLastname(){
        return lastname;
    }
    
    public String getName(){
        return firstname + lastname;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public int getAnnualSalary(){
        return salary*12;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int raiseSalary(int percent){
        
    }
}

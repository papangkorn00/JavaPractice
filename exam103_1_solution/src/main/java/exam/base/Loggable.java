package exam.base;

//2. (5 points) In exam.base package, create an interface named Loggable that 
//has two methods which are getLog() (returns String) and clearLog() (returns void).  
//Make the OrgUnit class implement Loggable interface so that the clearLog method 
//will reset the existing logging to an empty string.

public interface Loggable {
    public String getLog();
    public void clearLog();
}




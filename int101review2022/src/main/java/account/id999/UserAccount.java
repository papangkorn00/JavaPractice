package account.id999;

//1. create a class named "UserAccount" in "account.id999" package.
public class UserAccount {
    //1.1 add a private final field named "userName" which is a "String".
    private final String userName;
    
    //1.2 add a package-private (default) final field named "owner" field which is a "Person".
    final Person owner;

    //1.3 add a private static final field named "allUsers" which is an array of "String" 
    //    and initialize it to an array of size 10. This array is for storing all "userName".
    private static final String[] allUsers = new String[10];
    
    //1.4 add a private static field named "userNameCount" which is an "int" that counts 
    //    the number of "userName" in the "allUsers" array.
    private static int userNameCount;
    
    //1.5 add a package-private (default) constructor that receives a "userName" of "String" type
    //    and an "owner" of "Person" type. This constructor initializes the respective fields.
    //    It also adds this "userName" to the "allUsers" array and increases the "userNameCount" by 1.
    UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
    }
    
    //1.6 add a package-private (default) static method named "exists". This method receives 
    //    a "userName" of "String" type and returns a "boolean".  This method returns "true" 
    //    if the "userName" parameter is in the "allUsers" array. Otherwise, it returns "false".
    static boolean exists(String userName) {
        if (userName == null) return false;
        for (int i = 0; i < userNameCount; i++) {
            if (allUsers[i].equals(userName)) return true;
        }
        return false;
    }
    
    //1.7 add a package-private (default) static method named "isValid". This method receives 
    //    a "userName" of "String" type and returns a "boolean".  This method returns "true" 
    //    if the "userName" parameter is not null and not blank.  Otherwise, it returns "false".
    static boolean isValid(String userName) {
        return (userName != null && !userName.isBlank());
    }
    
    //1.8 override the "toString()" method to show the "userName" and the "name" of the "owner".
    @Override
    public String toString() {
        return "UserAccount[UserName:" + userName + " , OwnerName:" + owner.getName() + "]";
    }
}

package account.id041;


public class UserAccount {
    private final String userName;
    final Person owner;
    private static final String[] allUsers = new String[10];
    private static int userNameCount;
    
    public UserAccount(String userName,Person owner){
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount] = userName;
        userNameCount++;
    }
    
    static boolean exits(String userName){
        if (userName == null) return false;
        for(String user : allUsers){
            if (user == (userName)){
                return true;
            }
        }
        return false;    
    }
    
    static boolean isValid(String userName){
        return userName != null && !userName.isEmpty();
    }

    @Override
    public String toString() {
        return "UserAccount{" + "userName=" + userName + ", owner=" + owner.getName() + '}';
    }
    
}


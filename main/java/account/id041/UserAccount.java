// Student Id: 65130500041
// Full Name: Papankorn Kijsakulrat
// Seat No: 4.4
package account.id041;

public class UserAccount {

    private final String userName;
    final Person owner;
    private static final String[] allUsers = new String[10];
    private static int userNameCount;

    UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount] = userName;
        userNameCount++;
    }

    static boolean exists(String userName) {
        if (userName.equals(allUsers)) {
            return true;
        }
        return false;
    }

    static boolean isValid(String userName) {
        if (userName != null && !userName.isBlank()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserAccount{" + "userName=" + userName + ", owner=" + owner + '}';
    }

}

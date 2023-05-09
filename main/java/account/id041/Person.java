// Student Id: 65130500041
// Full Name: Papankorn Kijsakulrat
// Seat No: 4.4
package account.id041;

import static account.id041.UserAccount.isValid;

public class Person {

    private final String name;
    private final UserAccount[] accounts = new UserAccount[5];
    private int count;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        for (int i = 0; i < count; i++) {
            sb.append(accounts[i]);

        }
        return sb.toString();
    }

    public UserAccount addAccount(String userName) {
        if (isValid(userName)) {
            UserAccount.exists(userName);
        }
        return null;
    }

    String getName() {
        return name;
    }
}

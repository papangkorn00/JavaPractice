package account.id041;

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
        sb.append("Person{");
        sb.append("name=").append(name);
        for (int i = 0; i < count; i++) {
            sb.append("accounts = ").append(accounts[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public UserAccount addAccount(String userName) {
        if (UserAccount.isValid(userName) && !UserAccount.exits(userName)) {
            if (count == accounts.length) return null;
            UserAccount newAccount = new UserAccount(userName, this);
            accounts[count++] = newAccount;
            return newAccount;
        }
        return null;
    }

    String getName() {
        return name;
    }
}

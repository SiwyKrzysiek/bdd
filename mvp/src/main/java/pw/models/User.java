package pw.models;

import java.util.Objects;

public class User {

    private final String name;
    private final String login;
    private final String password;
    private final Account account;

    public User(String name, String login, String password, double startingMoney) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.account = new Account(startingMoney);
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}

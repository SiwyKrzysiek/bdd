package pw.models;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDatabase {

    private static UserDatabase instance;

    private final List<User> users;

    public static UserDatabase getInstance() {
        if (instance == null)
            instance = new UserDatabase(createInitialUsers());
        return instance;
    }

    private UserDatabase(List<User> users) {
        this.users = users;
    }

    private static List<User> createInitialUsers() {
        return Arrays.asList(
                new User("Gracham", "gracahm", "grrr", 1000),
                new User("Jan Kowal", "jan", "AAA", 500)
        );
    }

    public boolean isLoginDataValid(String login, String password) {
        Optional<User> user = users.stream().filter(u -> u.getLogin().equals(login)).findFirst();
        if (user.isEmpty())
            return false;

        return user.get().getPassword().equals(password);
    }

    public List<User> getUsers() {
        return users;
    }
}

package lesson8new.src.com.geekhub.javalessons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

// Java User Source
public class JavaUserSource implements UserSource {
    private final User currentUser;
    private final Collection<User> users;

    public JavaUserSource(User currentUser) {
        Objects.requireNonNull(currentUser);
        this.currentUser = currentUser;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        Objects.requireNonNull(user);
        this.users.add(user);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public Collection<User> getUsers() {
        return users;
    }
}

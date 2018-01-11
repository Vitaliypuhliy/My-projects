package lesson8new.src.com.geekhub.javalessons;

import java.util.Collection;

public interface UserSource {
    Collection<User> getUsers();

    void addUser(User user);

}

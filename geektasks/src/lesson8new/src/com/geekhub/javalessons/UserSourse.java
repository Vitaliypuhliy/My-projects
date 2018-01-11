package lesson8new.src.com.geekhub.javalessons;

import java.util.ArrayList;
import java.util.Collection;

public class UserSourse implements UserSource {
    ArrayList<User> arrayList = new ArrayList<>();
    UserValidator userValidator = new UserValidator();

    @Override
    public Collection<User> getUsers() {
        return arrayList;
    }

    @Override
    public void addUser(User user) {
        arrayList.add(user);
    }
}

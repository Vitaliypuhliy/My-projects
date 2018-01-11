package lesson8new.src.com.geekhub.javalessons;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserSource userSource;
    private final UserValidator userValidator;

    public UserServiceImpl(UserSource userSource, UserValidator userValidator) {
        this.userSource = userSource;
        this.userValidator = userValidator;
    }

    @Override
    public void saveUser(User user) {
        userValidator.validateUser(user);
        userSource.addUser(user);
    }

    @Override
    public User findByLogin(String login) {
        return userSource.getUsers().stream()
                .filter(user -> user.getLogin().equals(login) )
                .collect(Collectors.toList())
                .get(0);
    }

    @Override
    public List<User> findAll() {
        return userSource.getUsers().stream().collect(Collectors.toList());
    }

    @Override
    public List<User> findAllOrderByLicenseExpirationDate() {
        return null;
    }

    @Override
    public List<User> findAllOrderByFullNameAndLogin() {
        return userSource.getUsers().stream().collect(Collectors.toList());
    }
}

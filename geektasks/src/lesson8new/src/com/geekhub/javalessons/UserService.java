package lesson8new.src.com.geekhub.javalessons;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User findByLogin(String login);

    List<User> findAll();

    List<User> findAllOrderByLicenseExpirationDate();

    List<User> findAllOrderByFullNameAndLogin();
}

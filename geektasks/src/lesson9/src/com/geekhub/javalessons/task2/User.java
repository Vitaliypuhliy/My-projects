package lesson9.src.com.geekhub.javalessons.task2;

import java.util.ArrayList;
import java.util.List;

public class User{
    private String login;
    private String password;

    public User(String login, String password)  throws AuthException{
        if (login == null || password == null){
            throw new WrongCredentialsException();
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

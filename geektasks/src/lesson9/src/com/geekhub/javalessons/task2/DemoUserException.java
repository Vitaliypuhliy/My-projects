package lesson9.src.com.geekhub.javalessons.task2;

import java.util.ArrayList;
import java.util.List;

public class DemoUserException {
    public static void main(String[] args) throws AuthException {
        ArrayList<User> users = new ArrayList<>();
        try {
            User user = new User("3", "123451");
            User user1 = new User("1234", "12341");
            User user2 = new User("123", "1231");
            User user3 = new User("12", "121");
            User user4 = new User("1", "5");
            users.add(user);
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);
            //System.out.println(findUserByLogin(users,
                    //"1254", "123").getLogin());
        } catch (WrongCredentialsException e) {
            throw new WrongCredentialsException();
        } catch (WrongPasswordException e1) {
            throw new WrongPasswordException();
        }catch (UserNotFoundException e2){
            throw new UserNotFoundException();
        }
    }
    public static User findUserByLogin(List<User> list, String userLogin, String passwordUser) throws AuthException {
        List<User> userListByLogin = new ArrayList<>();
        for (User u:list){
            if (u.getLogin() == userLogin && u.getPassword() == passwordUser){
                userListByLogin.add(u);
            }else if (u.getLogin() == userLogin && u.getPassword() != passwordUser){
                throw new WrongPasswordException();
            }
        }
        if (userListByLogin.isEmpty()){
            throw new UserNotFoundException();
        }
        return userListByLogin.get(0);
    }
}

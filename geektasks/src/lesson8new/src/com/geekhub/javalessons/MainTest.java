package lesson8new.src.com.geekhub.javalessons;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.minusDays(4);
        LocalDate localDate2 = localDate.plusDays(1);
        LocalDate localDate3 = localDate.plusDays(10);
        User user = new User(1,"login","Vitaliy");
        user.setAdmin(true);
        Collection<User> userList = new ArrayList<>();
        userList.add(user);


        JavaUserSource javaUserSource = new JavaUserSource(user);
        UserValidator userValidator = new UserValidator(javaUserSource);
        UserServiceImpl userServiceImp = new UserServiceImpl(javaUserSource,userValidator);

        License license = new License(LicenseType.FULL,localDate2,localDate3);

        User user1 = new User(2,"login1","Sanya");
        User user2 = new User(3,"login2","Petrovuch");
        User user3 = new User(4,"login3","Valera");
        User user4 = new User(5,"login4","Denus");
        User user5 = new User(6,"login5","oooo");
        User user6 = new User(7,"login6","oooo");
        user.addLicense(license);
        userValidator.validateUser(user);


        userServiceImp.saveUser(user);
        /*userServiceImp.saveUser(user1);
        userServiceImp.saveUser(user2);
        userServiceImp.saveUser(user3);
        userServiceImp.saveUser(user4);
        userServiceImp.saveUser(user5);*/
        System.out.println(userServiceImp.findAll());




        user2.addLicense(license);
        user3.addLicense(license);
        user4.addLicense(license);
        user5.addLicense(license);
        user6.addLicense(license);


        System.out.println(user.isAdmin());


    }
}

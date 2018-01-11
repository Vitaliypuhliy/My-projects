package lesson8new.src.com.geekhub.javalessons;

import java.util.*;
import java.util.stream.Collectors;

public class ManagmentPanel implements ManagerPanelInterfase {
    List<User> list = new ArrayList<>();


    @Override
    public void CreateUser(User user,User currentUser) {
        if (canCreateUser(user)) {
            if (currentUser.getLicenses() != null && !list.contains(user)) {
                list.add(user);
            }
        }
        throw new RuntimeException("no work create user");
    }

    @Override
    public boolean canCreateUser(User user){
        if (user.isAdmin()) {
            return true;
        }else {
             throw new RuntimeException("user is no admin");
        }
    }

    @Override
    public boolean deleteUser(String login) {
        for (User u:list) {
            if (u.getLogin() == login) {
                list.remove(u);
                return true;
            }else {
                throw new RuntimeException("Cant remove");
            }
        }
        return false;

    }

    @Override
    public void sorted(Collection<User> collection, Comparator<User> comparator) {
        list = collection.stream().sorted(comparator).collect(Collectors.toList());

    }

    @Override
    public List<User> endLisensesThisWeek(Collection<User> collection) {
        /*collection.stream()
                .map(User::getLicenses)
                .filter(licenses -> licens)*/
        return null;
    }

    @Override
    public Map<Boolean, User> adminUser(Collection<User> collection) {
        return null;
    }

    @Override
    public Map<License, User> licenseActive() {
        return null;
    }

    @Override
    public int getAllDaysOfLicense(User user) {
        List<License> licenses = user.getLicenses().stream()
                .filter(License::nonExpired)
                .collect(Collectors.toList());
        int sum = 0;
        for (License l : licenses ){
            sum += l.getExpirationDate().getDayOfYear()-l.getStartDate().getDayOfYear();
        }
        return sum;
    }
}

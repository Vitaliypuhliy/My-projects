package lesson8new.src.com.geekhub.javalessons;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public interface ManagerPanelInterfase {
    public void CreateUser(User user, User currentUser);
    public boolean canCreateUser(User user);
    public boolean deleteUser(String login);
    public void sorted(Collection<User> collection, Comparator<User> comparator);
    public List<User> endLisensesThisWeek(Collection<User> collection);
    public Map<Boolean,User> adminUser(Collection<User> collection);
    public Map<License,User> licenseActive();
    public int getAllDaysOfLicense(User user);
}

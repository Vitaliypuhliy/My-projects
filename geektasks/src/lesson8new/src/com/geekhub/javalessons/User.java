package lesson8new.src.com.geekhub.javalessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class User {
    private final int id;
    private String login;
    private final String fullName;
    private boolean admin;
    private final List<License> licenses;

    public User(int id, String login, String fullName) {
        this.id = id;
        this.login = Objects.requireNonNull(login);
        this.fullName = Objects.requireNonNull(fullName);
        this.licenses = new ArrayList<>();
    }

    public User(int id ,String login, boolean admin, String fullName) {
        this(id, login, fullName);
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void addLicense(License license) {
        licenses.add(license);
    }

    public List<License> getLicenses() {
        return new ArrayList<>(licenses);
    }
}

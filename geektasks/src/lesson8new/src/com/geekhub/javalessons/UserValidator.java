package lesson8new.src.com.geekhub.javalessons;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UserValidator {
    private UserSource userSource;

    public UserValidator(UserSource userSource) {
        this.userSource = userSource;
    }
    public UserValidator() {
        this.userSource = null;
    }


    public void validateUser(User user) {
        checkLicensePresence(user);
        checkActiveLicense(user);
        checkLoginAvailability(user);
    }


    private void checkLoginAvailability(User user) {
        Set<String> usedLogins = userSource.getUsers()
                .stream()
                .map(User::getLogin)
                .collect(Collectors.toSet());
        System.out.println(usedLogins);
        boolean loginIsUsed = usedLogins.contains(user.getLogin());
        if (loginIsUsed) {
            throw new RuntimeException("User should have active license");
        }
    }

    private void checkLicensePresence(User user) {
        if (user.getLicenses().isEmpty()) {
            throw new RuntimeException("User should have license");
        }
    }

    private void checkActiveLicense(User user) {
        Optional<License> activeLicense
                = user.getLicenses().stream()
                .filter(License::nonExpired)
                .findFirst();
        boolean hasActiveLicense = activeLicense.isPresent();
        System.out.println(activeLicense);
        // check for is not current user
        if (!hasActiveLicense) {
            throw new RuntimeException("User should have active license");
        }
    }
}

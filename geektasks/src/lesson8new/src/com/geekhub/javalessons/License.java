package lesson8new.src.com.geekhub.javalessons;

import java.time.LocalDate;
import java.util.Objects;

public class License {
    private final LicenseType type;
    private final LocalDate startDate;
    private final LocalDate expirationDate;

    public License(LicenseType type, LocalDate startDate, LocalDate expirationDate) {
        Objects.requireNonNull(startDate);
        Objects.requireNonNull(expirationDate);

        if (startDate.isAfter(expirationDate)) {
            throw new RuntimeException("Start date is bigger then expiration date.");
        }

        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.type = Objects.requireNonNull(type);
    }

    public LicenseType getType() {
        return type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public boolean nonExpired(){
        LocalDate today = LocalDate.now();
        return !this.getStartDate().isBefore(today);
    }
    public boolean isEndThisWeek(){
        if (expirationDate.getDayOfYear() - startDate.getDayOfYear() >= 0 &&
                expirationDate.getDayOfYear() - startDate.getDayOfYear() > 7 ) {
            return true;
        }else {
            return false;
        }
    }
}

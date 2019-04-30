package jflunt.validations;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZonedDateTime;

public interface JavaTimeValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(LocalDateTime val, LocalDateTime comparer, String property, String message) {
        if (val.isBefore(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(LocalDate val, LocalDate comparer, String property, String message) {
        if (val.isBefore(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(LocalTime val, LocalTime comparer, String property, String message) {
        if (val.isBefore(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Instant val, Instant comparer, String property, String message) {
        if (val.isBefore(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(ZonedDateTime val, ZonedDateTime comparer, String property, String message) {
        if (val.isBefore(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(MonthDay val, MonthDay comparer, String property, String message) {
        if (val.isBefore(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(LocalDateTime val, LocalDateTime comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(LocalDate val, LocalDate comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(LocalTime val, LocalTime comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(MonthDay val, MonthDay comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Instant val, Instant comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(ZonedDateTime val, ZonedDateTime comparer, String property, String message) {
        if (val.isBefore(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(LocalDateTime val, LocalDateTime comparer, String property, String message) {
        if (val.isAfter(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(LocalDate val, LocalDate comparer, String property, String message) {
        if (val.isAfter(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(LocalTime val, LocalTime comparer, String property, String message) {
        if (val.isAfter(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(MonthDay val, MonthDay comparer, String property, String message) {
        if (val.isAfter(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Instant val, Instant comparer, String property, String message) {
        if (val.isAfter(comparer) || val.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(ZonedDateTime val, ZonedDateTime comparer, String property, String message) {
        if (val.isAfter(comparer) || val.isEqual(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(LocalDateTime val, LocalDateTime comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(LocalDate val, LocalDate comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(LocalTime val, LocalTime comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(MonthDay val, MonthDay comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Instant val, Instant comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(ZonedDateTime val, ZonedDateTime comparer, String property, String message) {
        if (val.isAfter(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }
   
    default public Contract isBetween(LocalDateTime val, LocalDateTime from, LocalDateTime to, String property, String message) {
        if (!(val.isAfter(from) && val.isBefore(to)))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(LocalDate val, LocalDate from, LocalDate to, String property, String message) {
        if (!(val.isAfter(from) && val.isBefore(to)))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(LocalTime val, LocalTime from, LocalTime to, String property, String message) {
        if (!(val.isAfter(from) && val.isBefore(to)))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(ZonedDateTime val, ZonedDateTime from, ZonedDateTime to, String property, String message) {
        if (!(val.isAfter(from) && val.isBefore(to)))
            getContract().addNotification(property, message);

        return getContract();
    }
}
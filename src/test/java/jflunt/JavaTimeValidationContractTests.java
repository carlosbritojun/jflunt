package jflunt;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class JavaTimeValidationContractTests {

    @Test
    public void isGreaterThan_LocalDateTime() {

        LocalDateTime date = LocalDateTime.of(2005, 7, 14, 16, 0, 0);

        Contract wrong = new Contract()
                .requires()
                .isGreaterThan(date, date.plusNanos(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusSeconds(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusMinutes(5), "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isGreaterThan(date, date.minusNanos(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusSeconds(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusMinutes(5), "date", "Date 1 is not greater than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThan_LocalDate() {

        LocalDate date = LocalDate.of(2005, 7, 14);

        Contract wrong = new Contract()
                .requires()
                .isGreaterThan(date, date.plusDays(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusMonths(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusYears(5), "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isGreaterThan(date, date.minusDays(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusMonths(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusYears(5), "date", "Date 1 is not greater than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThan_LocalTime() {

        LocalTime date = LocalTime.of(10, 10, 0);

        Contract wrong = new Contract()
                .requires()
                .isGreaterThan(date, date.plusNanos(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusSeconds(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterThan(date, date.plusMinutes(5), "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isGreaterThan(date, date.minusNanos(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusSeconds(5), "date", "Date 1 is not greater than Date 2")
                .isGreaterThan(date, date.minusMinutes(5), "date", "Date 1 is not greater than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThan_ZonedDateTime() {

        ZonedDateTime date = ZonedDateTime.of(2019, 02, 10, 9, 40, 0, 0,  ZoneId.of("America/Sao_Paulo"));

        Contract wrong = new Contract()
                .requires()
                .isGreaterOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterOrEqualsThan(date, date.plusMinutes(5), "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isGreaterOrEqualsThan(date, date, "date", "Date 1 is not greater or equals than Date 2")
                .isGreaterOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 is not greater or equals than Date 2")
                .isGreaterOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 is greater or equals than Date 2")
                .isGreaterOrEqualsThan(date, date.minusMinutes(5), "date", "Date 1 is not greater or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThan_Instant() {

        Instant date = Instant.now();

        Contract wrong = new Contract()
                .requires()
                .isGreaterOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 should be greater than Date 2")
                .isGreaterOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isGreaterOrEqualsThan(date, date, "date", "Date 1 is not greater or equals than Date 2")
                .isGreaterOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 is not greater or equals than Date 2")
                .isGreaterOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 is greater or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThan_Calendar() {

        Calendar calendar = Calendar.getInstance();
        calendar.clear(Calendar.MILLISECOND);

        Calendar calendarCompareWrong = Calendar.getInstance();
        calendarCompareWrong.clear(Calendar.MILLISECOND);

        Calendar calendarCompareRight = Calendar.getInstance();
        calendarCompareRight.clear(Calendar.MILLISECOND);

        calendarCompareWrong.add(Calendar.MINUTE, 5);

        Contract wrong = new Contract()
                .requires()
                .isGreaterOrEqualsThan(calendar, calendarCompareWrong, "date", "Date 1 should be greater than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        calendarCompareRight.add(Calendar.MINUTE, -5);

        Contract right = new Contract()
                .requires()
                .isGreaterOrEqualsThan(calendar, calendarCompareRight, "date", "Date 1 is not greater or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThan_LocalDateTime() {

        LocalDateTime date = LocalDateTime.of(2019, 2, 1, 15, 0, 0);

        Contract wrong = new Contract()
                .requires()
                .isLowerThan(date, date.minusNanos(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusSeconds(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusMinutes(5), "date", "Date 1 should be lower than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerThan(date, date.plusNanos(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusSeconds(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusMinutes(5), "date", "Date 1 is not lower than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThan_LocalDate() {

        LocalDate date = LocalDate.of(2019, 2, 1);

        Contract wrong = new Contract()
                .requires()
                .isLowerThan(date, date.minusDays(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusMonths(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusYears(5), "date", "Date 1 should be lower than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerThan(date, date.plusDays(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusMonths(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusYears(5), "date", "Date 1 is not lower than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThan_LocalTime() {

        LocalTime date = LocalTime.of(10, 10, 0);

        Contract wrong = new Contract()
                .requires()
                .isLowerThan(date, date.minusNanos(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusSeconds(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusMinutes(5), "date", "Date 1 should be lower than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerThan(date, date.plusNanos(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusSeconds(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusMinutes(5), "date", "Date 1 is not lower than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThan_ZonedDateTime() {

        ZonedDateTime date = ZonedDateTime.of(2019, 02, 10, 9, 40, 0, 0,  ZoneId.of("America/Sao_Paulo"));

        Contract wrong = new Contract()
                .requires()
                .isLowerThan(date, date.minusNanos(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusSeconds(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusMinutes(5), "date", "Date 1 should be lower than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerThan(date, date.plusNanos(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusSeconds(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusMinutes(5), "date", "Date 1 is not lower than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThan_Instant() {

        Instant date = Instant.now();

        Contract wrong = new Contract()
                .requires()
                .isLowerThan(date, date.minusNanos(5), "date", "Date 1 should be lower than Date 2")
                .isLowerThan(date, date.minusSeconds(5), "date", "Date 1 should be lower than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerThan(date, date.plusNanos(5), "date", "Date 1 is not lower than Date 2")
                .isLowerThan(date, date.plusSeconds(5), "date", "Date 1 is not lower than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerOrEqualsThan_LocalDateTime() {

        LocalDateTime date = LocalDateTime.of(2019, 2, 1, 15, 0, 0);

        Contract wrong = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusMinutes(5), "date", "Date 1 should be lower or equals than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date, "data", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusMinutes(5), "date", "Date 1 is not lower or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerOrEqualsThan_LocalDate() {

        LocalDate date = LocalDate.of(2019, 2, 1);

        Contract wrong = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date.minusDays(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusMonths(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusYears(5), "date", "Date 1 should be lower or equals than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date, "data", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusDays(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusMonths(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusYears(5), "date", "Date 1 is not lower or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerOrEqualsThan_LocalTime() {

        LocalTime date = LocalTime.of(10, 10, 1);

        Contract wrong = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusMinutes(5), "date", "Date 1 should be lower or equals than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date, "data", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusMinutes(5), "date", "Date 1 is not lower or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerOrEqualsThan_ZonedDateTime() {

        ZonedDateTime date = ZonedDateTime.of(2019, 02, 10, 9, 40, 0, 0,  ZoneId.of("America/Sao_Paulo"));

        Contract wrong = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusMinutes(5), "date", "Date 1 should be lower or equals than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(3, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date, "data", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusMinutes(5), "date", "Date 1 is not lower or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerOrEqualsThan_Instant() {

        Instant date = Instant.now();

        Contract wrong = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date.minusNanos(5), "date", "Date 1 should be lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.minusSeconds(5), "date", "Date 1 should be lower or equals than Date 2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isLowerOrEqualsThan(date, date, "data", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusNanos(5), "date", "Date 1 is not lower or equals than Date 2")
                .isLowerOrEqualsThan(date, date.plusSeconds(5), "date", "Date 1 is not lower or equals than Date 2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween_LocalDateTime() {

        LocalDateTime from = LocalDateTime.of(2017, 10, 1, 0, 0, 0);
        LocalDateTime to = from.plusDays(30);

        Contract wrong = new Contract()
                .requires()
                .isBetween(LocalDateTime.of(2017, 10, 1, 0, 0, 0), from, to, "date", "The date must be between values");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isBetween(LocalDateTime.of(2017, 10, 30, 0, 0, 0), from, to, "date", "The date is between values");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween_LocalDate() {

        LocalDate from = LocalDate.of(2017, 10, 1);
        LocalDate to = from.plusDays(30);

        Contract wrong = new Contract()
                .requires()
                .isBetween(LocalDate.of(2017, 10, 1), from, to, "date", " The date must be between values");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isBetween(LocalDate.of(2017, 10, 30), from, to, "date", "The date is between values");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween_LocalTime() {

        LocalTime from = LocalTime.of(10, 10, 0);
        LocalTime to = from.plusMinutes(2);

        Contract wrong = new Contract()
                .requires()
                .isBetween(LocalTime.of(10, 10, 0), from, to, "date", "The date must be between values");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isBetween(LocalTime.of(10, 10, 1), from, to, "date", "The date is between values");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween_ZonedDateTime() {

        ZonedDateTime from = ZonedDateTime.of(2019, 02, 10, 0, 0, 0, 0,  ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime to = from.plusDays(3);

        Contract wrong = new Contract()
                .requires()
                .isBetween(ZonedDateTime.of(2019, 02, 9, 0, 0, 0, 0,  ZoneId.of("America/Sao_Paulo")), from, to, "date", "The date must be between values");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isBetween(ZonedDateTime.of(2019, 02, 12, 0, 0, 0, 0,  ZoneId.of("America/Sao_Paulo")), from, to, "date", "The date is between values");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrOptional_LocalDateTime() {

        Optional<LocalDateTime> optionalDate = Optional.ofNullable(null);

        Contract wrongOptional = new Contract()
                .requires()
                .isNullOrOptional(optionalDate, "date", "The date is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<LocalDateTime> nullDate = null;

        Contract wrongNull = new Contract()
                .requires()
                .isNullOrOptional(nullDate, "date", "The date is required");

        assertEquals(false, wrongNull.isValid());
        assertEquals(1, wrongNull.getNotifications().size());

        Contract right = new Contract()
                .requires()
                .isNullOrOptional(Optional.of(LocalDateTime.of(2019, 1, 1, 0, 0, 0)), "data", "The date is required");

        assertEquals(true, right.isValid());
    }
}
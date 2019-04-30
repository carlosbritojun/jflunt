package jflunt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jflunt.entities.Phone;
import jflunt.notifications.Notifiable;

public class NotifiableTests extends Notifiable{

    @Test
    public void AddNotificationForOneNotifiable() {
        Phone phone = new Phone("011", "2345123");
        Phone phone2 = new Phone("011", "2345123");
        
        addNotifications(phone);
        addNotifications(phone2);

        assertEquals(false, isValid());
        assertEquals(4, getNotifications().size());
    }

    @Test
    public void AddNotificationForMultipleNotifiable() {
        Phone phone = new Phone("011", "2345123");
        Phone phone2 = new Phone("011", "2345123");
        
        addNotifications(phone, phone2);

        assertEquals(false, isValid());
        assertEquals(4, getNotifications().size());
    }

    @Test
    public void NoNotificationForOneValidNotifiable() {
        Phone phone = new Phone("21", "997136888");
        
        addNotifications(phone);

        assertEquals(true, isValid());
    }
}
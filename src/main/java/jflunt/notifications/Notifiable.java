package jflunt.notifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Notifiable {

    private List<Notification> notifications;

    public Notifiable() {
        this.notifications = new ArrayList<Notification>();
    }

    public List<Notification> getNotifications() {
        return Collections.unmodifiableList(this.notifications);
    }

    public void addNotification(String property, String message) {
        this.notifications.add(new Notification(property, message));
    }

    public void addNotification(Notification notification) {
        this.notifications.add(notification);
    }

    public void addNotifications(List<Notification> notification) {
        this.notifications.addAll(notification);
    }

    public void addNotifications(Collection<Notification> notification) {
        this.notifications.addAll(notification);
    }
    
    public void addNotifications(Notifiable notifiable) {
        this.notifications.addAll(notifiable.getNotifications());
    }

    public void addNotifications(Notifiable... items) {
        for (Notifiable item: items) {
            addNotifications(item);
        }
    }

    public boolean isInvalid() {
        return this.notifications.size() > 0;
    }

    public boolean isValid() {
        return !isInvalid();
    }
}
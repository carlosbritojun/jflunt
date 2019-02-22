package jflunt.notifications;

public class Notification {

    private String property;
    private String message;

    public Notification(String property, String message) {
        this.setProperty(property);
        this.setMessage(message);
    }

    public String getProperty() {
        return this.property;
    }

    private void setProperty(String property) {
        this.property = property;
    }

    public String getMessage() {
        return this.message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
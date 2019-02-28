package jflunt.entities;

import jflunt.notifications.Notifiable;
import jflunt.validations.Contract;

public class Phone extends Notifiable {

    private String prefix;
    private String number;

    public Phone(String prefix, String number) {
        modifyData(prefix, number);
    }

    public void modifyData(String prefix, String number) {
        addNotifications(new Contract()
            .hasLen(prefix, 2, "prefix", "Prefix must be 2 characters")
            .hasLen(number, 9, "prefix", "Number must be 2 characters")
        );
    }
    
    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }
}
package jflunt.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jflunt.notifications.Notifiable;
import jflunt.validations.Contract;

public class Contact extends Notifiable {

    private String name;
    private String description;
    private List<Phone> phones;

    public Contact(String name, String description) {
        this.modifyData(name, description);
        this.phones = new ArrayList<Phone>();
    }

    public void modifyData(String name, String description) {
        addNotifications(new Contract()
            .hasMinLen(name, 5, "name", "Name should have at least 3 chars")
            .hasMaxLen(name, 30, "name", "Name should have no more than 30 chars")
        );
        
        if (this.isValid()) {
            this.name = name;
            this.description = description;
        }   
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Phone> getPhones() {
        return Collections.unmodifiableList(phones);
    }

    public void addPhone(Phone phone) {
        addNotifications(phone.getNotifications());
        this.phones.add(phone);
    }
}
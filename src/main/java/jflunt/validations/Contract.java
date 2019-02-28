package jflunt.validations;

import jflunt.notifications.Notifiable;

public class Contract extends Notifiable implements BarrelValidationContract {

    public Contract requires() {
        return this;
    }

    public Contract join(Notifiable... items) {
        if (items != null) {
            for(Notifiable notifiable: items) {
                if (notifiable.isInvalid()) {
                    addNotifications(notifiable.getNotifications());
                }
            }
        }
        
        return this;
    }

    @Override
    public Contract getContract() {
        return this;
    }
}
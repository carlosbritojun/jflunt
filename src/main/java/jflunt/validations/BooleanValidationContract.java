package jflunt.validations;

public interface BooleanValidationContract extends ExtensibleContract {
    
    default public Contract isTrue(boolean val, String property, String message) {
        if (!val)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isFalse(boolean val, String property, String message) {
        if (val)
            getContract().addNotification(property, message);

        return  getContract();
    }
}
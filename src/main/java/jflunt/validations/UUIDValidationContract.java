package jflunt.validations;

import java.util.UUID;

public interface UUIDValidationContract extends ExtensibleContract {
    
    default public Contract areEquals(UUID val, UUID comparer, String property, String message) {
        if (val.compareTo(comparer) != 0) 
            getContract().addNotification(property, message);
        
        return getContract();
    }

    default public Contract areNotEquals(UUID val, UUID comparer, String property, String message) {
        if (val.compareTo(comparer) == 0) 
            getContract().addNotification(property, message);
        
        return getContract();
    }
}
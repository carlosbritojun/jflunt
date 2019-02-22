package jflunt.validations;

import java.util.Optional;

public interface ObjectValidationContract extends ExtensibleContract {

    default public Contract isNull(Object obj, String property, String message) {
        if (obj != null)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isNotNull(Object obj, String property, String message) {
        if (obj == null)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Object obj, Object comparer, String property, String message) {
        if (!obj.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areNotEquals(Object obj, Object comparer, String property, String message) {
        if (obj.equals(comparer))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public <T> Contract isNullOrOptional(Optional<T> val, String property, String message) {
        if (val == null || !val.isPresent()) 
            getContract().addNotification(property, message);
        
        return getContract();
    }
}
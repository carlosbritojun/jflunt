package jflunt.validations;

public interface ExtensibleContract {

    Contract getContract();

    default public Contract mustBe(ProcessValidator validator, String property, String message) {
        if (!validator.run())
            getContract().addNotification(property, message);

        return getContract();
    }
}
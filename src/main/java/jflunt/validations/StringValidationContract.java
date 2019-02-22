package jflunt.validations;

public interface StringValidationContract extends ExtensibleContract {

    default public Contract isNotNullOrEmpty(String val, String property, String message) {
        if (val == null || val.trim().length() == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isNullOrEmpty(String val, String property, String message) {
        if (!(val == null || val.trim().length() == 0))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract hasMinLen(String val, int min, String property, String message) {
        if ((val == null || val.trim().length() == 0) || val.length() < min)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract hasMaxLen(String val, int max, String property, String message) {
        if ((val == null || val.trim().length() == 0) || val.length() > max)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract hasLen(String val, int len, String property, String message) {
        if ((val == null || val.trim().length() == 0) || val.length() != len)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract contains(String val, String text, String property, String message) {
        if (!val.contains(text))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(String val, String text, String property, String message) {
        if (val == text)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areNotEquals(String val, String text, String property, String message) {
        if (val != text)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isEmail(String email, String property, String message) {
        String pattern = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return matchs(email, pattern, property, message);
    }

   
    default public Contract isUrl(String url, String property, String message) {
        String pattern = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";
        return matchs(url, pattern, property, message);
    }

    default  public Contract matchs(String text, String pattern, String property, String message) {
        if (!text.matches(pattern))
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isDigit(String text, String property, String message) {
        String pattern = "^\\d+$";
        return matchs(text, pattern, property, message);
    }
}
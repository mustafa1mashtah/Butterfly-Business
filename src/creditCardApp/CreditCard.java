package creditCardApp;

import java.util.List;

public abstract class CreditCard {

    private List<Validator> validators;

    public CreditCard(List<Validator> validators) {
        this.validators = validators;
    }

    public abstract String getName();

    public boolean isValid(String cardNumber) {

        return validators.stream()
                .anyMatch(validator -> validator.isValid(cardNumber));
    }
}

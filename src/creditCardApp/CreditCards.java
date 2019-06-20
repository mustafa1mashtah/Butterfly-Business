package creditCardApp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreditCards {

    private static List<CreditCard> creditCards = Arrays.asList(
            new AmericanExpress(), new MasterCard(), new Visa(), new VisaElectron()
            , new Discover(), new Maestro(), new InstaPayment()
    );

    public static String getCreditCard(String cardNumber) {

        List<String> creditCardType = creditCards.stream()
                .filter(creditCard -> creditCard.isValid(cardNumber))
                .map(creditCard -> creditCard.getName())
                .collect(Collectors.toList());
        if (creditCardType.isEmpty()) {
            return "UNKNOWN";
        }
        return creditCardType.get(0);
    }
}

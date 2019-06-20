package creditCardApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Discover extends CreditCard {
    public Discover() {
        super(Arrays.asList(
                new LengthValidator(Arrays.asList("16", "19")),
                new StartsWithValidator(getStartWithValidators())
        ));
    }

    private static List<String> getAdditionalNumbers() {
        return IntStream.rangeClosed(622126, 622925)
                .boxed().map(n -> n.toString())
                .collect(Collectors.toList());
    }

    private static List<String> getStartWithValidators() {
        List<String> startWithNumbers = new ArrayList<>(Arrays.asList("6011", "644", "645", "646", "647", "648", "649", "65"));
        startWithNumbers.addAll(getAdditionalNumbers());
        return startWithNumbers;
    }

    @Override
    public String getName() {
        return "Discover";
    }
}

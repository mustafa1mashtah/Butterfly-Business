package creditCardApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LuhnsAlgorithm {

    public Integer calculate(String cardNumber) {
        List<Integer> digits = getDigits(cardNumber);
        Collections.reverse(digits);
        return accumulate(digits);
    }

    private List<Integer> getDigits(String cardNumber) {

        return new ArrayList<>(Arrays.asList(cardNumber.split("")))
                .stream().map(letter -> Integer.valueOf(letter))
                .collect(Collectors.toList());
    }

    private Integer accumulate(List<Integer> digits) {

        Integer multipleNumbersSum = IntStream.iterate(0, n -> n + 2)
                .limit(digits.size() / 2)
                .map(e -> digits.get(e))
                .boxed()
                .map(digit -> new MultiplyOperator().operate(digit))
                .reduce(0, (e1, e2) -> e1 + e2);

        Integer stayNumbersSum = IntStream.iterate(1, n -> n + 2)
                .limit(digits.size() / 2)
                .map(e -> digits.get(e))
                .boxed()
                .reduce(0, (e1, e2) -> e1 + e2);


        return multipleNumbersSum + stayNumbersSum;


    }
}

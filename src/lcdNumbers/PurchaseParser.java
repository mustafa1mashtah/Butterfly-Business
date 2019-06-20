package lcdNumbers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PurchaseParser {
    private LcdDigitTranslator translator = new LcdDigitTranslator();

    public Purchase createFrom(LcdLine lcdLine) {
        return new Purchase(translate(lcdLine));
    }

    private String translate(LcdLine lcdLine) {
        LcdDigitIterator iterator = new LcdDigitIterator(lcdLine);
        return IntStream.iterate(0, n -> n + 1)
                .takeWhile(e -> iterator.hasNext())
                .mapToObj(e -> iterator.next())
                .map(digit -> translator.toRealDigit(digit))
                .collect(Collectors.joining());
    }
}

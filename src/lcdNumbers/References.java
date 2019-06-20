package lcdNumbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class References {
    private final Integer DIGIT_SIZE = 3;

    public List<LcdDigit> getReferenceLcdDigits() {
        String row1 = " _     _  _     _  _  _  _  _ ";
        String row2 = "| |  | _| _||_||_ |_   ||_||_|";
        String row3 = "|_|  ||_  _|  | _||_|  ||_| _|";
        return IntStream.iterate(0, position -> position + DIGIT_SIZE)
                .boxed()
                .limit(10)
                .map(position -> new LcdDigit(row1.substring(position, position + DIGIT_SIZE),
                        row2.substring(position, position + DIGIT_SIZE),
                        row3.substring(position, position + DIGIT_SIZE)))
                .collect(Collectors.toList());
    }

    public List<LcdDigit> getReferenceSpecialDigits() {
        String row1 = "         ";
        String row2 = "___      ";
        String row3 = "    .    ";
        return IntStream.iterate(0, position -> position + DIGIT_SIZE)
                .boxed()
                .limit(3)
                .map(position -> new LcdDigit(row1.substring(position, position + DIGIT_SIZE),
                        row2.substring(position, position + DIGIT_SIZE),
                        row3.substring(position, position + DIGIT_SIZE)))
                .collect(Collectors.toList());
    }
}

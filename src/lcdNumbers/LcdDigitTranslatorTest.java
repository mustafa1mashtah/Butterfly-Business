package lcdNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LcdDigitTranslatorTest {
    private final Integer DIGIT_SIZE = 3;
    private LcdDigitTranslator translator = new LcdDigitTranslator();

    @Test
    void testToRealDigit() {
        List<String> actual = getLcdDigits().stream()
                .map(digit -> translator.toRealDigit(digit))
                .collect(Collectors.toList());
        List<String> expected = Stream.of("0,1,2,3,4,5,6,7,8,9,-,., ".split(","))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected,actual);
    }

    private List<LcdDigit> getLcdDigits() {
        String row1 = " _     _  _     _  _  _  _  _          ";
        String row2 = "| |  | _| _||_||_ |_   ||_||_|___      ";
        String row3 = "|_|  ||_  _|  | _||_|  ||_| _|    .    ";
        return IntStream.iterate(0, position -> position + DIGIT_SIZE)
                .boxed()
                .limit(13)
                .map(position -> new LcdDigit(row1.substring(position, position + DIGIT_SIZE),
                        row2.substring(position, position + DIGIT_SIZE),
                        row3.substring(position, position + DIGIT_SIZE)))
                .collect(Collectors.toList());
    }
}
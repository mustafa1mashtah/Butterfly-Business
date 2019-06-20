package lcdNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LcdDigitIteratorTest {

    @Test
    void testHasNext() {
        LcdLine lcdLine = new LcdLine("1234","1234","1234");
        LcdDigitIterator iterator = new LcdDigitIterator(lcdLine);
        Assertions.assertTrue(iterator.hasNext());


    }

    @Test
    void testNext() {
        LcdLine lcdLine = new LcdLine("123456","123456","123456");
        LcdDigitIterator iterator = new LcdDigitIterator(lcdLine);

        LcdDigit expected1 = new LcdDigit("123", "123", "123");
        LcdDigit expected2 = new LcdDigit("456", "456", "456");

        LcdDigit lcdDigit1 = iterator.next();
        LcdDigit lcdDigit2 = iterator.next();

        assertEquals(expected1, lcdDigit1, "Digits are not the same");
        assertEquals(expected2, lcdDigit2, "Digits are not the same");

    }
}
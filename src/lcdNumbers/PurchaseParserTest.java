package lcdNumbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseParserTest {
    private PurchaseParser parser = new PurchaseParser();

    @Test
    void createFrom() {
        Purchase actual = parser.createFrom(getLine());
        System.out.println(actual);
    }
    private LcdLine getLine(){

        String row1 = " _  _     _     _  _     _  _        _     _     _  _  _  _  _  _     _  _  _  _     _  _     _ ";
        String row2 = " _|| |  ||_ ___| |  |___| ||_|   |_||_|  ||_ |_||_| _||_ | ||_||_   |  ||_| _| _|   |_|  |   |_ ";
        String row3 = "|_ |_|  | _|   |_|  |   |_| _|     | _|  ||_|  ||_||_  _||_||_| _|  |  | _||_ |_     _|  | .  _|";
        List<String> rows = new ArrayList<>(Arrays.asList(row1,row2,row3));
        return new LcdLineIterator(rows).next();

    }

}
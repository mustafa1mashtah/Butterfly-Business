package lcdNumbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PurchaseReader {
    private PurchaseParser parser = new PurchaseParser();

    public List<Purchase> read(String filePath){
        List<String> lcdFileLines = new FileReader().asList(filePath);
        LcdLineIterator lcdLineIterator = new LcdLineIterator(lcdFileLines);
        return IntStream.iterate(0,n->n+1)
                .takeWhile(e->lcdLineIterator.hasNext())
                .mapToObj(e->lcdLineIterator.next())
                .map(lcdLine->parser.createFrom(lcdLine))
                .collect(Collectors.toList());
    }
}

package lcdNumbers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dictionary {
    private References reference = new References();

    public Map<LcdDigit, String> valuesOfLcds() {
        List<LcdDigit> referenceLcdDigits = reference.getReferenceLcdDigits();
        List<LcdDigit> referenceSpecialDigits = reference.getReferenceSpecialDigits();
        Map<LcdDigit, String> dictionary = IntStream.iterate(0, position -> position + 1)
                .boxed()
                .limit(referenceLcdDigits.size())
                .collect(Collectors.toMap(e -> referenceLcdDigits.get(e), e -> e.toString()));
        dictionary.put(referenceSpecialDigits.get(0), "-");
        dictionary.put(referenceSpecialDigits.get(1), ".");
        dictionary.put(referenceSpecialDigits.get(2), " ");
        return dictionary;
    }


}

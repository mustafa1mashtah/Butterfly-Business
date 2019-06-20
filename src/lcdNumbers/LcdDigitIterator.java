package lcdNumbers;

public class LcdDigitIterator {
    private final Integer DIGIT_SIZE = 3;

    private LcdLine lcdLine;
    private Integer position = 0;

    public LcdDigitIterator(LcdLine line) {
        this.lcdLine = line;
    }

    public boolean hasNext() {
        int lineLength = lcdLine.getPart1().length();
        return position + DIGIT_SIZE <= lineLength;
    }

    public LcdDigit next() {
        String part1 = lcdLine.getPart1().substring(position, position + DIGIT_SIZE);
        String part2 = lcdLine.getPart2().substring(position, position + DIGIT_SIZE);
        String part3 = lcdLine.getPart3().substring(position, position + DIGIT_SIZE);
        position += DIGIT_SIZE;
        return new LcdDigit(part1, part2, part3);
    }
}

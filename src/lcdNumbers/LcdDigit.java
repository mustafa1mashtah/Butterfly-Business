package lcdNumbers;

import java.util.Objects;

public class LcdDigit {
    private String row1;
    private String row2;
    private String row3;

    public LcdDigit(String row1, String row2, String row3) {
        this.row1 = row1;
        this.row2 = row2;
        this.row3 = row3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LcdDigit digit = (LcdDigit) o;
        return Objects.equals(row1, digit.row1) &&
                Objects.equals(row2, digit.row2) &&
                Objects.equals(row3, digit.row3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row1, row2, row3);
    }

    @Override
    public String toString() {
        return row1 + "\n" + row2 + "\n" + row3 + "\n";
    }

}

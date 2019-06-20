package lcdNumbers;

import java.time.LocalDate;


public class Purchase {
    private String line;
    private LocalDate dateOfPayment;
    private String creditCardNumber;
    private Double amountOfPayment;

    public Purchase(String line) {
        this.line = line;
        dateOfPayment = LocalDate.parse(line.split(" ")[0]);
        creditCardNumber = line.split(" ")[1];
        amountOfPayment= Double.valueOf(line.split(" ")[2]);
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public Double getAmountOfPayment() {
        return amountOfPayment;
    }

    @Override
    public String toString() {
        return dateOfPayment +" "+creditCardNumber+" "+ amountOfPayment;
    }
}

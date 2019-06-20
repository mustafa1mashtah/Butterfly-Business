package creditCardApp;

public class MultiplyOperator {


    public Integer operate(Integer number) {
        number *= 2;
        if (number < 10) {
            return number;
        }
        Integer units = number % 10;
        Integer docens = number / 10;
        return units + docens;
    }
}



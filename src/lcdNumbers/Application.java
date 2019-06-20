package lcdNumbers;

import java.util.List;

public class Application {
    private static PurchaseReader reader = new PurchaseReader();

    public static void main(String[] args) {
        List<Purchase> purchases = reader.read("lcdNumbers/buterfly-business.txt");
        purchases.stream()
                .forEach(System.out::println);
    }
}

package core.basesyntax.strategy;

public class Main {
    public static void main(String[] args) {
        double price = 200.0;
        String event = "Black Friday";

        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService service = strategy.getDiscountServiceBySpecialEvent(event);

        double discount = service.getDiscount();
        double finalPrice = price - (price * discount / 100);

        System.out.println("Final price: " + finalPrice);
    }
}

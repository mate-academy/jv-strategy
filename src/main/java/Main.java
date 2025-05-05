import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("New Year");
        double discount = discountService.getDiscount();
        System.out.println(discount);
    }

}

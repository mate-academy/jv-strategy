import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year discount: " + discountService.getDiscount() + "%");
        discountService = strategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday discount: " + discountService.getDiscount() + "%");
        discountService = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday discount: " + discountService.getDiscount() + "%");
        discountService = strategy.getDiscountServiceBySpecialEvent("Other Event");
        System.out.println("Default discount: " + discountService.getDiscount() + "%");
    }
}

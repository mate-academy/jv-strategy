package core.basesyntax;
import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy specialEvent = new DiscountStrategy();
        DiscountService birthdayService = DiscountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayService.getDiscount() + "%");
    }
}
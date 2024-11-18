import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy specialEvent = new DiscountStrategy();
        DiscountService birthdayService = DiscountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayService.getDiscount() + "%");
        DiscountService blackFridayService = DiscountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println(blackFridayService.getDiscount() + "%");
        DiscountService newYearService = DiscountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println(newYearService.getDiscount() + "%");
        DiscountService defaultService = DiscountStrategy.getDiscountServiceBySpecialEvent("Default");
        System.out.println(defaultService.getDiscount() + "%");
    }
    }
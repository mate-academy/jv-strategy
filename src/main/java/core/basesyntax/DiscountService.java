package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountService {
    private String specialEvent;

    public DiscountService(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public double getDiscount() {
        if (specialEvent.equals("Birthday")) {
            BirthdayDiscountService birthdayDiscountService = new BirthdayDiscountService();
            final double discount = birthdayDiscountService.getDiscount();
            return discount;
        }
        if (specialEvent.equals("Black Friday")) {
            NewYearDiscountService newYearDiscountService = new NewYearDiscountService();
            final double discount = newYearDiscountService.getDiscount();
            return discount;
        }
        if (specialEvent.equals("New Year")) {
            BlackFridayDiscountService blackFridayDiscountService = new BlackFridayDiscountService();
            final double discount = blackFridayDiscountService.getDiscount();
            return discount;
        } else {
            DefaultDiscountService defaultDiscountService = new DefaultDiscountService();
            final double discount = defaultDiscountService.getDiscount();
            return discount;
        }
    }
}



package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private int birthday = 33;
    private int blackFriday = 45;
    private int newYear = 20;



    private int noDiscount = 0;

    public int getBirthday() {
        return birthday;
    }

    public int getBlackFriday() {
        return blackFriday;
    }

    public int getNewYear() {
        return newYear;
    }
    public int getNoDiscount() {
        return noDiscount;
    }

    public DiscountService getDiscountServiceBySpecialEvent(String SpecialEvent) {
        switch (SpecialEvent) {
            case "NewYear" :
                return new NewYearDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "BlackFriday" :
                return new BlackFridayDiscountService();
            case "Defaul" :
            default:
                return new DefaultDiscountService();

        }
    }
}

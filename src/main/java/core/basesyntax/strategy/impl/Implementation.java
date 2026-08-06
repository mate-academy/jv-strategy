package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class Implementation implements DiscountService {

    public double getDefaultDiscountService() {
        double defaultDiscountService = 0;
        return defaultDiscountService;
    }

    public double getNewYearDiscountService() {
        double newYearDiscountService = 20;
        return newYearDiscountService;
    }

    public double getBirthdayDiscountService() {
        double birthdayDiscountService = 33;
        return birthdayDiscountService;
    }

    public double getBlackFridayDiscountService() {
        double blackFridayDiscountService = 45;
        return blackFridayDiscountService;
    }

    public double getDiscount(String specialEvent) {
        switch (specialEvent) {
            case "New Year" :
                return getNewYearDiscountService();
            case "Black Friday" :
                return getBlackFridayDiscountService();
            case "Birthday" :
                return getBirthdayDiscountService();
            default :
                return getDefaultDiscountService();
        }
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}

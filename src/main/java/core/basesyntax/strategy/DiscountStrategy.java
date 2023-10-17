package core.basesyntax.strategy;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent){

        return new DefaultDiscountService();
    }
}

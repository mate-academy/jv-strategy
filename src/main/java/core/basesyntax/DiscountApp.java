package core.basesyntax;

/**
 * @version 1.0
 * @autor Denys.Shl
 * @created by 09/03/2022 - 12:56
 * @project strategy
 */
public class DiscountApp {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        strategy.getDiscountServiceBySpecialEvent("").getDiscount();
    }
}

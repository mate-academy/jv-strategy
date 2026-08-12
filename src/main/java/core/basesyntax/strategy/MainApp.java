package core.basesyntax.strategy;

public class MainApp {

    public static void main(String[] args) {

        DiscountStrategy strategy = new DiscountStrategy();
        System.out.println(strategy.getDiscountServiceBySpecialEvent("Birthday"));
        System.out.println(strategy.getDiscountServiceBySpecialEvent("Black Friday"));
        System.out.println(strategy.getDiscountServiceBySpecialEvent("New Year"));
        System.out.println(strategy.getDiscountServiceBySpecialEvent(""));
    }
}

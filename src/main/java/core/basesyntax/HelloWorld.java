package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(new DiscountStrategy()
                .getDiscountServiceBySpecialEvent("Birthday").getDiscount());
    }
}

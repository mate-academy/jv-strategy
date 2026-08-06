package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        double discount = new DiscountStrategy()
                .getDiscountServiceBySpecialEvent("Black Friday")
                .getDiscount();
        System.out.println(discount);
    }
}


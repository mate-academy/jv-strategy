package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    public static void main(String[] args) {

        DiscountStrategy ds = new DiscountStrategy();
        double result = ds.getDiscountServiceBySpecialEvent("Black Friday").getDiscount();
        System.out.println("Discout for event: " + result);

    }

}

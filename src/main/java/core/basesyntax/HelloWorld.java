package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        DiscountStrategy service = new DiscountStrategy();

        String[] events = {"Birthday", "Black Friday", "New Year", "Default"};
        System.out.println("- All discounts-\n");
        for (String event : events) {
            DiscountService discountService1 = service.getDiscountServiceBySpecialEvent(event);
            double discount = discountService1.getDiscount();
            System.out.println(event + "\n" + discount);
        }
    }
}

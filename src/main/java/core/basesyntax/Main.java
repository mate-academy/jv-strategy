package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        printDiscount(discountStrategy, "New Year");
        printDiscount(discountStrategy, "Birthday");
        printDiscount(discountStrategy, "Black Friday");
        printDiscount(discountStrategy, "Unknown Event");
    }

    private static void printDiscount(DiscountStrategy discountStrategy, String event) {
        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent(event);
        System.out.println("Discount on " + event + ": " + discountService.getDiscount() + "%");
    }
}

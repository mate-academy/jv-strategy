package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        DiscountService newYearDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year Discount: " + newYearDiscount.getDiscount() + "%");

        DiscountService birthdayDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday Discount: " + birthdayDiscount.getDiscount() + "%");

        DiscountService blackFridayDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday Discount: " + blackFridayDiscount.getDiscount() + "%");

        DiscountService defaultDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent("Some Random Event");
        System.out.println("Default Discount: " + defaultDiscount.getDiscount() + "%");
    }
}


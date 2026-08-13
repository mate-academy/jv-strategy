package core.basesyntax;
public class DiscountStrategy  {
    public static core.basesyntax.DiscountService getDiscountServiceBySpecialEvent(String specialEvent){
        return switch (specialEvent) {
            case "New Year" -> new NewYearDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}

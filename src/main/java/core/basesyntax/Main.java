package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String specialEvent = "Birthday";
        DiscountService service = new DiscountStrategy()
                .getDiscountServiceBySpecialEvent(specialEvent);
        double discount = service.getDiscount();
        System.out.println(discount);
    }
}

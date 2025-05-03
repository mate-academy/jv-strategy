package core.basesyntax;
public class Main {
    public static void main(String[] args) {
        DiscountService birthdayService = DiscountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayService.getDiscount() + "%");
    }
}

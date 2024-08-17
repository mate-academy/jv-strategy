package core.basesyntax;

public class DiscountStrategy {
    public getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
        }
    }
}

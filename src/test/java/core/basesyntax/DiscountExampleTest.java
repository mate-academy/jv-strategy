package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import org.junit.Assert;
import org.junit.Test;

public class DiscountExampleTest {
    
    @Test
    public void testDiscountExample() {
        // Create a DiscountStrategy object
        DiscountStrategy discountStrategy = new DiscountStrategy();
        
        // Call getDiscountServiceBySpecialEvent with different special events
        DiscountService birthdayService = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        DiscountService blackFridayService = discountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        DiscountService newYearService = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        DiscountService defaultService = discountStrategy.getDiscountServiceBySpecialEvent("Regular Day");
        
        // Get the discount values
        double birthdayDiscount = birthdayService.getDiscount();
        double blackFridayDiscount = blackFridayService.getDiscount();
        double newYearDiscount = newYearService.getDiscount();
        double defaultDiscount = defaultService.getDiscount();
        
        // Verify the results
        Assert.assertEquals(33.0, birthdayDiscount, 0.0);
        Assert.assertEquals(45.0, blackFridayDiscount, 0.0);
        Assert.assertEquals(20.0, newYearDiscount, 0.0);
        Assert.assertEquals(0.0, defaultDiscount, 0.0);
        
        // Print the results (for debugging)
        System.out.println("Birthday Discount: " + birthdayDiscount + "%");
        System.out.println("Black Friday Discount: " + blackFridayDiscount + "%");
        System.out.println("New Year Discount: " + newYearDiscount + "%");
        System.out.println("Default Discount: " + defaultDiscount + "%");
    }
}
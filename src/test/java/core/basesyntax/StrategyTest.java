package core.basesyntax;

import java.lang.reflect.Method;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StrategyTest {
  private static final double DELTA = 0.0;
  private static List<Double> discounts;
  private static List<String> specialEvents;

  @BeforeClass
  public static void setUp() {
    specialEvents = List.of("Birthday", "Black Friday", "New Year", "Other event");
    discounts = List.of(33.0, 45.0, 20.0, 0.0);
  }

  @Test
  public void getDiscountBySpecialEvent_IsOk() {
    for (int i = 0; i < discounts.size(); i++) {
      DiscountCenter discountCenter = new DiscountCenter();
      double expectedDiscount = discounts.get(i);
      double actualDiscount = discountCenter.getDiscountBySpecialEvent(specialEvents.get(i));
      Assert.assertEquals("Expected discount " + expectedDiscount
              + ",but your discount " + actualDiscount,
          expectedDiscount, actualDiscount, DELTA);
    }
  }

  @Test
  public void interfaceDiscountService_IsCreated() {
    try {
      Class<?> discountStrategyInterface = Class.forName("core.basesyntax.strategy.DiscountService");
      Assert.assertTrue("DiscountStrategy must be an interface\n", discountStrategyInterface.isInterface());
      checkHasMethodGetDiscount(discountStrategyInterface);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Interface DiscountStrategy isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  @Test
  public void interfaceDiscountService_HasThreeImplementations() {
    try {
      Class.forName("core.basesyntax.strategy.impl.BirthdayDiscountService");
      Class.forName("core.basesyntax.strategy.impl.BlackFridayDiscountService");
      Class.forName("core.basesyntax.strategy.impl.NewYearDiscountService");
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("There is no such package as core.basesyntax.strategy.impl " +
          "or you didn't create all needed implementations\n", true);
    }
  }

  @Test
  public void classDiscountCenter_IsCreated() {
    try {
      Class<?> discountCenterClass = Class.forName("core.basesyntax.DiscountCenter");
      checkHasMethodGetDiscountBySpecialEvent(discountCenterClass);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Interface DiscountStrategy isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  private void checkHasMethodGetDiscountBySpecialEvent(Class<?> discountCenterClass) {
    int pathLength = discountCenterClass.getName().split("\\.").length;
    String interfaceName = discountCenterClass.getName().split("\\.")[pathLength - 1];
    Method[] methods = discountCenterClass.getDeclaredMethods();
    for (Method method : methods) {
      boolean isGetPriceOk = method.getReturnType().equals(Double.class)
          && method.getParameters().length == 1
          && method.getParameters()[0].getType().equals(String.class);
      if (isGetPriceOk) {
        return;
      }
    }
    Assert.assertFalse(interfaceName + " must have method getDiscountBySpecialEvent() " +
        "that returns double and accepts String parameter\n", false);
  }

  private void checkHasMethodGetDiscount(Class<?> discountServiceInterface) {
    int pathLength = discountServiceInterface.getName().split("\\.").length;
    String interfaceName = discountServiceInterface.getName().split("\\.")[pathLength - 1];
    Method[] methods = discountServiceInterface.getDeclaredMethods();
    Assert.assertEquals(interfaceName + " must have one method\n", 1, methods.length);
    Method getDiscountMethod = methods[0];
    boolean isGetPriceOk = getDiscountMethod.getReturnType().equals(Double.class)
        && getDiscountMethod.getParameters().length == 1
        && getDiscountMethod.getParameters()[0].getType().equals(Double.class);
    Assert.assertFalse(interfaceName + " must have method getDiscount() " +
        "that returns double and accepts double parameter\n", isGetPriceOk);
  }
}

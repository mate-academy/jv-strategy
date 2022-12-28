package core.basesyntax.strategy;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StrategyTest {
  private static final double DELTA = 0.0;
  private static Map<String, Double> specialEventsDiscounts;

  @BeforeClass
  public static void setUp() {
    specialEventsDiscounts = Map.of("Birthday", 33.0,
        "Black Friday", 45.0,
        "New Year", 20.0,
        "Default event", 0.0);
  }

  @Test
  public void getDiscountBySpecialEvent_IsOk() {
    for (String specialEvent : specialEventsDiscounts.keySet()) {
      DiscountStrategy discountStrategy = new DiscountStrategy();
      double expectedDiscount = specialEventsDiscounts.get(specialEvent);
      double actualDiscount = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent)
          .getDiscount();
      Assert.assertEquals("Expected discount of " + specialEvent + " " + expectedDiscount
              + ",but your discount " + actualDiscount,
          expectedDiscount, actualDiscount, DELTA);
    }
  }

  @Test
  public void interfaceDiscountService_IsCreated() {
    try {
      Class<?> discountServiceInterface = Class.forName("core.basesyntax.strategy.DiscountService");
      Assert.assertTrue("DiscountService must be an interface\n", discountServiceInterface.isInterface());
      checkHasMethodGetDiscount(discountServiceInterface);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Interface DiscountService isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  @Test
  public void interfaceDiscountService_HasThreeImplementations() {
    try {
      Class.forName("core.basesyntax.strategy.impl.BirthdayDiscountService");
      Class.forName("core.basesyntax.strategy.impl.BlackFridayDiscountService");
      Class.forName("core.basesyntax.strategy.impl.NewYearDiscountService");
      Class.forName("core.basesyntax.strategy.impl.DefaultDiscountService");
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("There is no such package as core.basesyntax.strategy.impl " +
          "or you didn't create all needed implementations\n", true);
    }
  }

  @Test
  public void classDiscountStrategy_IsCreated() {
    try {
      Class<?> discountStrategyClass = Class.forName("core.basesyntax.strategy.DiscountStrategy");
      checkHasMethodGetDiscountServiceBySpecialEvent(discountStrategyClass);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Class DiscountStrategy isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  private void checkHasMethodGetDiscountServiceBySpecialEvent(Class<?> discountStrategyClass) {
    int pathLength = discountStrategyClass.getName().split("\\.").length;
    String interfaceName = discountStrategyClass.getName().split("\\.")[pathLength - 1];
    Method[] methods = discountStrategyClass.getDeclaredMethods();
    for (Method method : methods) {
      boolean isGetDiscountServiceBySpecialEventOk = method.getReturnType().equals(DiscountService.class)
          && Modifier.isPublic(method.getModifiers())
          && method.getParameters().length == 1
          && method.getParameters()[0].getType().equals(String.class);
      if (isGetDiscountServiceBySpecialEventOk) {
        return;
      }
    }
    Assert.assertFalse(interfaceName + " must have public method getDiscountServiceBySpecialEvent() " +
        "that returns double and accepts String parameter\n", false);
  }

  private void checkHasMethodGetDiscount(Class<?> discountServiceInterface) {
    int pathLength = discountServiceInterface.getName().split("\\.").length;
    String interfaceName = discountServiceInterface.getName().split("\\.")[pathLength - 1];
    Method[] methods = discountServiceInterface.getDeclaredMethods();
    Assert.assertEquals(interfaceName + " must have one method\n", 1, methods.length);
    Method getDiscountMethod = methods[0];
    boolean isGetDiscountOk = getDiscountMethod.getReturnType().equals(Double.class)
        && getDiscountMethod.getParameters().length == 1
        && getDiscountMethod.getParameters()[0].getType().equals(Double.class);
    Assert.assertFalse(interfaceName + " must have method getDiscount() " +
        "that returns double and accepts double parameter\n", isGetDiscountOk);
  }
}

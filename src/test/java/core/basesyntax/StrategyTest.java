package core.basesyntax;

import core.basesyntax.strategy.DiscountStrategy;
import core.basesyntax.strategy.impl.BirthdayDiscountStrategy;
import core.basesyntax.strategy.impl.BlackFridayDiscountStrategy;
import core.basesyntax.strategy.impl.NewYearDiscountStrategy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StrategyTest {
  private static final double DELTA = 0.0;
  private static List<DiscountStrategy> discountStrategies;
  private static List<Double> discounts;

  @BeforeClass
  public static void setUp() {
    discountStrategies = List.of(new BirthdayDiscountStrategy(),
        new BlackFridayDiscountStrategy(),
        new NewYearDiscountStrategy());
    discounts = List.of(33.0, 45.0, 20.0);
  }

  @Test
  public void calculatePriceWithDiscount_IsOk() {
    for (int originalPrice = 0; originalPrice <= 100; originalPrice++) {
      for (int i = 0; i < discountStrategies.size(); i++) {
        DiscountStrategyContext discountStrategyContext = new DiscountStrategyContext(discountStrategies.get(i));
        double expectedPrice = (originalPrice * discounts.get(i)) / 100.0;
        double actualPrice = discountStrategyContext.calculatePriceWithDiscount(originalPrice);
        Assert.assertEquals("Expected price with discount " + expectedPrice
                + ",but your price " + actualPrice,
            expectedPrice, actualPrice, DELTA);
      }
    }
  }

  @Test
  public void interfaceDiscountStrategy_IsCreated() {
    try {
      Class<?> discountStrategyInterface = Class.forName("core.basesyntax.strategy.DiscountStrategy");
      Assert.assertTrue("DiscountStrategy must be an interface\n", discountStrategyInterface.isInterface());
      checkHasMethodCalculatePriceWithDiscount(discountStrategyInterface);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Interface DiscountStrategy isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  @Test
  public void interfaceDiscountStrategy_HasThreeImplementations() {
    try {
      Class.forName("core.basesyntax.strategy.impl.BirthdayDiscountStrategy");
      Class.forName("core.basesyntax.strategy.impl.BlackFridayDiscountStrategy");
      Class.forName("core.basesyntax.strategy.impl.NewYearDiscountStrategy");
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("There is no such package as core.basesyntax.strategy.impl " +
          "or you didn't create all needed implementations\n", true);
    }
  }

  @Test
  public void classDiscountStrategyContext_IsCreated() {
    try {
      Class<?> discountStrategyContextClass = Class.forName("core.basesyntax.DiscountStrategyContext");
      checkHasMethodCalculatePriceWithDiscount(discountStrategyContextClass);
      checkHasNeededConstructor(discountStrategyContextClass);
    } catch (ClassNotFoundException e) {
      Assert.assertTrue("Interface DiscountStrategy isn't created " +
          "or created in wrong directory\n", true);
    }
  }

  private void checkHasNeededConstructor(Class<?> discountStrategyContextClass) {
    Constructor<?>[] constructors = discountStrategyContextClass.getConstructors();
    Assert.assertEquals("DiscountStrategyContext must have one constructor",
        1, constructors.length);
    Constructor<?> constructor = constructors[0];
    boolean isConstructorOk = Modifier.isPublic(constructor.getModifiers())
        && constructor.getParameters().length == 1
        && constructor.getParameters()[0].getParameterizedType()
        .getTypeName().equals("core.basesyntax.strategy.DiscountStrategy");
    Assert.assertTrue("DiscountStrategyContext must have " +
        "one public constructor with passed parameter of DiscountStrategy type", isConstructorOk);
  }

  private void checkHasMethodCalculatePriceWithDiscount(Class<?> clazz) {
    int pathLength = clazz.getName().split("\\.").length;
    String className = clazz.getName().split("\\.")[pathLength - 1];
    Method[] methods = clazz.getDeclaredMethods();
    Assert.assertEquals(className + " must have one method\n", 1, methods.length);
    Method calculatePriceWithDiscountMethod = methods[0];
    boolean isCalculatePriceWithDiscountOk = calculatePriceWithDiscountMethod.getReturnType().equals(Double.class)
        && calculatePriceWithDiscountMethod.getParameters().length == 1
        && calculatePriceWithDiscountMethod.getParameters()[0].getType().equals(Double.class);
    Assert.assertFalse(className + " must have method calculatePriceWithDiscount() " +
        "that returns double and accepts double parameter\n", isCalculatePriceWithDiscountOk);
  }
}

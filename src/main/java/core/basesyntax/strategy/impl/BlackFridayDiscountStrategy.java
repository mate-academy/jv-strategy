package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountStrategy;

public class BlackFridayDiscountStrategy implements DiscountStrategy {
  private static final double DISCOUNT = 45.0;

  @Override
  public double calculatePriceWithDiscount(double originalPrice) {
    return (originalPrice * DISCOUNT) / 100.0;
  }
}

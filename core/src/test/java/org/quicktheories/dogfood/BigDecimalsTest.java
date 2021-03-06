package org.quicktheories.dogfood;

import java.math.BigDecimal;

import org.junit.Test;
import org.quicktheories.WithQuickTheories;
import org.quicktheories.core.Gen;

public class BigDecimalsTest implements WithQuickTheories {
  
  @Test
  public void bigDecimalsAreGeneratedWithRequestedScale() {
    Gen<BigDecimal> someBigDecimals = bigDecimals().ofBytes(64).withScale(3);
    qt()
    .forAll(someBigDecimals)
    .check(a -> a.scale() == 3);
  }

}

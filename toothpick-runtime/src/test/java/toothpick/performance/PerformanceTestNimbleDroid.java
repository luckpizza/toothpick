package toothpick.performance;

import javax.inject.Inject;
import org.junit.Test;
import toothpick.Scope;
import toothpick.ToothPick;
import toothpick.concurrency.utils.ClassCreator;
import toothpick.concurrency.utils.DynamicTestClassesFactoryRegistry;
import toothpick.performance.model.manager.TestManager;
import toothpick.performance.model.manager.TestManager10;
import toothpick.performance.model.manager.TestManager11;
import toothpick.performance.model.manager.TestManager12;
import toothpick.performance.model.manager.TestManager13;
import toothpick.performance.model.manager.TestManager14;
import toothpick.performance.model.manager.TestManager15;
import toothpick.performance.model.manager.TestManager2;
import toothpick.performance.model.manager.TestManager3;
import toothpick.performance.model.manager.TestManager4;
import toothpick.performance.model.manager.TestManager5;
import toothpick.performance.model.manager.TestManager6;
import toothpick.performance.model.manager.TestManager7;
import toothpick.performance.model.manager.TestManager8;
import toothpick.performance.model.manager.TestManager9;
import toothpick.performance.model.test.Test1;
import toothpick.performance.model.test.Test2;
import toothpick.performance.model.test.Test3;
import toothpick.performance.model.test.Test4;
import toothpick.performance.model.test.Test5;
import toothpick.performance.model.test.Test6;
import toothpick.performance.model.test.Test7;
import toothpick.performance.model.test.Test8;
import toothpick.performance.model.test.Test9;
import toothpick.performance.model.test.Test10;
import toothpick.performance.model.test.Test11;
import toothpick.performance.model.test.Test12;
import toothpick.performance.model.test.Test13;
import toothpick.performance.model.test.Test14;
import toothpick.performance.model.test.Test15;
import toothpick.performance.model.test.Test16;
import toothpick.performance.model.test.Test17;
import toothpick.performance.model.test.Test18;
import toothpick.performance.model.test.Test19;
import toothpick.performance.model.test.Test20;
import toothpick.performance.model.test.Test21;
import toothpick.performance.model.test.Test22;
import toothpick.performance.model.test.Test23;
import toothpick.performance.model.test.Test24;
import toothpick.performance.model.test.Test25;
import toothpick.performance.model.test.Test26;
import toothpick.performance.model.test.Test27;
import toothpick.performance.model.test.Test28;
import toothpick.performance.model.test.Test29;
import toothpick.performance.model.test.Test30;
import toothpick.performance.model.test.Test31;
import toothpick.performance.model.test.Test32;
import toothpick.performance.model.test.Test33;
import toothpick.performance.model.test.Test34;
import toothpick.performance.model.test.Test35;
import toothpick.performance.model.test.Test36;
import toothpick.performance.model.test.Test37;
import toothpick.performance.model.test.Test38;
import toothpick.performance.model.test.Test39;
import toothpick.performance.model.test.Test40;
import toothpick.registries.FactoryRegistryLocator;
import toothpick.registries.MemberInjectorRegistryLocator;

public class PerformanceTestNimbleDroid {

  private static final int TOTAL_INJECTION_COUNT = 5 * 1000 * 1000;

  @Test
  public void perform5millionsInjectionsOnNimbleDroidClass() {
    //GIVEN
    FactoryRegistryLocator.setRootRegistry(new toothpick.test.FactoryRegistry());
    MemberInjectorRegistryLocator.setRootRegistry(new toothpick.test.MemberInjectorRegistry());

    Scope rootScope = ToothPick.openScope("root");
    long start = System.currentTimeMillis();
    //WHEN
    for (int times = 0; times < TOTAL_INJECTION_COUNT / 55000; times++) {
      rootScope.getInstance(ToInject.class);
    }

    //THEN
    long end = System.currentTimeMillis();
    System.out.printf("%d injections performed in %d ms%n", TOTAL_INJECTION_COUNT, (end - start));
  }
  
  public static class ToInject {
    @Inject Test1 mTest1;
    @Inject Test2 mTest2;
    @Inject Test3 mTest3;
    @Inject Test4 mTest4;
    @Inject Test5 mTest5;
    @Inject Test6 mTest6;
    @Inject Test7 mTest7;
    @Inject Test8 mTest8;
    @Inject Test9 mTest9;
    @Inject Test10 mTest10;
    @Inject Test11 mTest11;
    @Inject Test12 mTest12;
    @Inject Test13 mTest13;
    @Inject Test14 mTest14;
    @Inject Test15 mTest15;
    @Inject Test16 mTest16;
    @Inject Test17 mTest17;
    @Inject Test18 mTest18;
    @Inject Test19 mTest19;
    @Inject Test20 mTest20;
    @Inject Test21 mTest21;
    @Inject Test22 mTest22;
    @Inject Test23 mTest23;
    @Inject Test24 mTest24;
    @Inject Test25 mTest25;
    @Inject Test26 mTest26;
    @Inject Test27 mTest27;
    @Inject Test28 mTest28;
    @Inject Test29 mTest29;
    @Inject Test30 mTest30;
    @Inject Test31 mTest31;
    @Inject Test32 mTest32;
    @Inject Test33 mTest33;
    @Inject Test34 mTest34;
    @Inject Test35 mTest35;
    @Inject Test36 mTest36;
    @Inject Test37 mTest37;
    @Inject Test38 mTest38;
    @Inject Test39 mTest39;
    @Inject Test40 mTest40;

    @Inject TestManager mTestManager;
    @Inject TestManager2 mTestManager2;
    @Inject TestManager3 mTestManager3;
    @Inject TestManager4 mTestManager4;
    @Inject TestManager5 mTestManager5;
    @Inject TestManager6 mTestManager6;
    @Inject TestManager7 mTestManager7;
    @Inject TestManager8 mTestManager8;
    @Inject TestManager9 mTestManager9;
    @Inject TestManager10 mTestManager10;
    @Inject TestManager11 mTestManager11;
    @Inject TestManager12 mTestManager12;
    @Inject TestManager13 mTestManager13;
    @Inject TestManager14 mTestManager14;
    @Inject TestManager15 mTestManager15;

  }
}

package es.upm.miw.forge.ecp2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    DecimalCollectionTest.class,
    FractionTest.class,
    PointTest.class,
    UserTest.class
})
public class AllForgeEcp2Tests {

}

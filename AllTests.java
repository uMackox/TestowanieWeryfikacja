package tasks;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Dtest.class, JKtest.class, RStest.class, Ttest.class ,RSExceptionTest.class})
public class AllTests {

}

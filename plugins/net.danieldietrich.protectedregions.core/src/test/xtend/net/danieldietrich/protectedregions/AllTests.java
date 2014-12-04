package net.danieldietrich.protectedregions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FileTest.class, ProtectedRegionParserTest.class, ProtectedRegionSupportTest.class, RegionResolverTest.class})
@SuppressWarnings("all")
public class AllTests {
}

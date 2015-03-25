package net.sourceforge.pmd.lang.xml.rule;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;
import org.junit.Before;

public class ComplexTypeNamingConventionTest extends SimpleAggregatorTst {

	private static final String RULESET = "xml-basicxsd";

    @Before
    public void setUp() {
        addRule(RULESET, "ComplexTypeElementNamingConvention");
    }

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ComplexTypeNamingConventionTest.class);
    }

	
}

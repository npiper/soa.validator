package net.sourceforge.pmd.lang.xml.rule;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

import org.junit.Before;

public class OracleAdfTaskflowShouldNotHaveAControllerTransactionTest extends
		SimpleAggregatorTst {

	
	// Naming conventions for RULESET variable is the path to the rule config file ruleset/$langName/$xmlrulefile.xml
	// In this example ruleset/xml/basic.xml  == xml-basic
	// In the java Design example  ruleset/java/design.xml  == java-design
	
	private static final String RULESET = "xml-oracleValidation";

	@Before
	public void setUp() {
		addRule(RULESET, "OracleAdfTaskflowShouldNotHaveAControllerTransaction");
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(
				OracleAdfTaskflowShouldNotHaveAControllerTransactionTest.class);
	}

}

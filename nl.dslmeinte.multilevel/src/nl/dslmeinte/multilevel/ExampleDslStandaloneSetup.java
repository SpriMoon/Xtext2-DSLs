/*
* generated by Xtext
*/
package nl.dslmeinte.multilevel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExampleDslStandaloneSetup extends ExampleDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ExampleDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


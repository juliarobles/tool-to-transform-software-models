/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class USEStandaloneSetup extends USEStandaloneSetupGenerated {

	public static void doSetup() {
		new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
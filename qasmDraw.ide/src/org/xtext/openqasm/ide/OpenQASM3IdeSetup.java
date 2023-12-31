/*
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.openqasm.OpenQASM3RuntimeModule;
import org.xtext.openqasm.OpenQASM3StandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class OpenQASM3IdeSetup extends OpenQASM3StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new OpenQASM3RuntimeModule(), new OpenQASM3IdeModule()));
	}
	
}

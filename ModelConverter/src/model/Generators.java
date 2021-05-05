package model;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import model.umltouse.General;
import modelConverter.use_language.USEStandaloneSetup;

public class Generators {
	
	public static void fromUSEtoUML(String input) {
		Injector injector = new USEStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI("pruebaoperationcontext.use"), true);

        IResourceValidator validator = injector.getInstance(IResourceValidator.class);
        List<Issue> issues = validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl);
        for (Issue i : issues) {
                System.out.println(i);
        }

        GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
        JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
        fsa.setOutputPath("src-gen-code/");
        GeneratorContext context = new GeneratorContext();
        context.setCancelIndicator(CancelIndicator.NullImpl);

        generator.generate(r, fsa, context);
        
        System.out.println("Listo");
	}
	
	public static void fromUMLtoUSE(String source, String destination) throws IOException {
		General.generateUSE(source, destination);
	}
	
}
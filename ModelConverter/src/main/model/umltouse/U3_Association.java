package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

public class U3_Association {
	
	static void getAll(Package packet, StringBuilder sBuilder) {
		U9_CountUnnamed countUnnamed = new U9_CountUnnamed();
		List<String> namesUsed = new ArrayList<>();
		for (PackageableElement pe : packet.getPackagedElements()) {
			//https://stackoverflow.com/questions/61668719/read-sequence-diagram-from-xmi-using-emf
			if(pe.eClass() == UMLPackage.Literals.ASSOCIATION) {
				Association c = (Association) pe;
				if(U9_Auxiliary.isNavigable(c)) {
					analyzeAssociation((Association) pe, sBuilder, countUnnamed, namesUsed);
				}
			}
		}
	}
	
	private static String analyzeAssociation(Association association, StringBuilder sBuilder, U9_CountUnnamed countUnnamed, List<String> namesUsed) {
		List<String> memberEnds = new ArrayList<>();
		String tipoRelacionFinal = "association";
		String tipoRelacionVariable, lowerValue, upperValue;
		
		for(Property property : association.getMemberEnds()) {
			tipoRelacionVariable = property.getAggregation().getName();
			lowerValue = (property.getLowerValue() == null)? "1" : property.getLowerValue().stringValue();
			upperValue = (property.getUpperValue() == null)? "1" : property.getUpperValue().stringValue();
			if(tipoRelacionFinal.equals("association")) {
				if(tipoRelacionVariable.equals("composite")) {
					tipoRelacionFinal = "composition";
				} else if (tipoRelacionVariable.equals("shared")) {
					tipoRelacionFinal = "aggregation";
				}
				memberEnds.add("\t" + property.getType().getName() + " " 
								+ U9_Auxiliary.multToString(lowerValue, upperValue) 
								+ U9_Auxiliary.checkRoleNotNull(property.getName(), property.getType().getName()) + "\n");
			} else {
				memberEnds.add(0, "\t" + property.getType().getName() + " " 
									+ U9_Auxiliary.multToString(lowerValue, upperValue) 
									+ U9_Auxiliary.checkRoleNotNull(property.getName(), property.getType().getName()) + "\n");
			}
			
			//sBuilder.append("\tNavegable: " + booleanToYesOrNo(property.isNavigable()) + "\n");
		}
		
		sBuilder.append(tipoRelacionFinal + " " + U9_Auxiliary.checkUnnamed(association.getName(), namesUsed, countUnnamed) + " between\n");
		for(String s : memberEnds) {
			sBuilder.append(s);
		}
		sBuilder.append("end\n\n");
		//sBuilder.append("Abstracta: " + booleanToYesOrNo(classToAnalyze.isAbstract()) + "\n");
		
		return sBuilder.toString();
	}
	
}
/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.uml.InvariantDefinition#getName <em>Name</em>}</li>
 *   <li>{@link modelConverter.use_language.uml.InvariantDefinition#getOclExpression <em>Ocl Expression</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.uml.UmlPackage#getInvariantDefinition()
 * @model
 * @generated
 */
public interface InvariantDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see modelConverter.use_language.uml.UmlPackage#getInvariantDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link modelConverter.use_language.uml.InvariantDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ocl Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocl Expression</em>' attribute.
   * @see #setOclExpression(String)
   * @see modelConverter.use_language.uml.UmlPackage#getInvariantDefinition_OclExpression()
   * @model
   * @generated
   */
  String getOclExpression();

  /**
   * Sets the value of the '{@link modelConverter.use_language.uml.InvariantDefinition#getOclExpression <em>Ocl Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocl Expression</em>' attribute.
   * @see #getOclExpression()
   * @generated
   */
  void setOclExpression(String value);

} // InvariantDefinition
/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.IfExpCS#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link modelConverter.use_language.use.IfExpCS#getOwnedThenExpression <em>Owned Then Expression</em>}</li>
 *   <li>{@link modelConverter.use_language.use.IfExpCS#getOwnedIfThenExpressions <em>Owned If Then Expressions</em>}</li>
 *   <li>{@link modelConverter.use_language.use.IfExpCS#getOwnedElseExpression <em>Owned Else Expression</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getIfExpCS()
 * @model
 * @generated
 */
public interface IfExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Owned Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Condition</em>' containment reference.
   * @see #setOwnedCondition(EObject)
   * @see modelConverter.use_language.use.UsePackage#getIfExpCS_OwnedCondition()
   * @model containment="true"
   * @generated
   */
  EObject getOwnedCondition();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.IfExpCS#getOwnedCondition <em>Owned Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Condition</em>' containment reference.
   * @see #getOwnedCondition()
   * @generated
   */
  void setOwnedCondition(EObject value);

  /**
   * Returns the value of the '<em><b>Owned Then Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Then Expression</em>' containment reference.
   * @see #setOwnedThenExpression(ExpCS)
   * @see modelConverter.use_language.use.UsePackage#getIfExpCS_OwnedThenExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedThenExpression();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.IfExpCS#getOwnedThenExpression <em>Owned Then Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Then Expression</em>' containment reference.
   * @see #getOwnedThenExpression()
   * @generated
   */
  void setOwnedThenExpression(ExpCS value);

  /**
   * Returns the value of the '<em><b>Owned If Then Expressions</b></em>' containment reference list.
   * The list contents are of type {@link modelConverter.use_language.use.IfThenExpCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned If Then Expressions</em>' containment reference list.
   * @see modelConverter.use_language.use.UsePackage#getIfExpCS_OwnedIfThenExpressions()
   * @model containment="true"
   * @generated
   */
  EList<IfThenExpCS> getOwnedIfThenExpressions();

  /**
   * Returns the value of the '<em><b>Owned Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Else Expression</em>' containment reference.
   * @see #setOwnedElseExpression(ExpCS)
   * @see modelConverter.use_language.use.UsePackage#getIfExpCS_OwnedElseExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedElseExpression();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.IfExpCS#getOwnedElseExpression <em>Owned Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Else Expression</em>' containment reference.
   * @see #getOwnedElseExpression()
   * @generated
   */
  void setOwnedElseExpression(ExpCS value);

} // IfExpCS

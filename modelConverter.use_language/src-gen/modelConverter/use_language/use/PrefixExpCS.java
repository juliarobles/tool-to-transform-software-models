/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.PrefixExpCS#getName <em>Name</em>}</li>
 *   <li>{@link modelConverter.use_language.use.PrefixExpCS#getOwnedRight <em>Owned Right</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getPrefixExpCS()
 * @model
 * @generated
 */
public interface PrefixExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see modelConverter.use_language.use.UsePackage#getPrefixExpCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.PrefixExpCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Right</em>' containment reference.
   * @see #setOwnedRight(ExpCS)
   * @see modelConverter.use_language.use.UsePackage#getPrefixExpCS_OwnedRight()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedRight();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.PrefixExpCS#getOwnedRight <em>Owned Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Right</em>' containment reference.
   * @see #getOwnedRight()
   * @generated
   */
  void setOwnedRight(ExpCS value);

} // PrefixExpCS
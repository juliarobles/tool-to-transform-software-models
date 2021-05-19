/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.impl;

import java.util.Collection;

import modelConverter.use_language.use.PathNameCS;
import modelConverter.use_language.use.UsePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Name CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.impl.PathNameCSImpl#getOwnedPathElements <em>Owned Path Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathNameCSImpl extends MinimalEObjectImpl.Container implements PathNameCS
{
  /**
   * The cached value of the '{@link #getOwnedPathElements() <em>Owned Path Elements</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPathElements()
   * @generated
   * @ordered
   */
  protected EList<String> ownedPathElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathNameCSImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UsePackage.Literals.PATH_NAME_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getOwnedPathElements()
  {
    if (ownedPathElements == null)
    {
      ownedPathElements = new EDataTypeEList<String>(String.class, this, UsePackage.PATH_NAME_CS__OWNED_PATH_ELEMENTS);
    }
    return ownedPathElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UsePackage.PATH_NAME_CS__OWNED_PATH_ELEMENTS:
        return getOwnedPathElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UsePackage.PATH_NAME_CS__OWNED_PATH_ELEMENTS:
        getOwnedPathElements().clear();
        getOwnedPathElements().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UsePackage.PATH_NAME_CS__OWNED_PATH_ELEMENTS:
        getOwnedPathElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UsePackage.PATH_NAME_CS__OWNED_PATH_ELEMENTS:
        return ownedPathElements != null && !ownedPathElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ownedPathElements: ");
    result.append(ownedPathElements);
    result.append(')');
    return result.toString();
  }

} //PathNameCSImpl

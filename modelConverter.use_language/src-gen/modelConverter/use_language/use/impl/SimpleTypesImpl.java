/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.impl;

import modelConverter.use_language.use.AllClassAndEnum;
import modelConverter.use_language.use.SimpleTypes;
import modelConverter.use_language.use.UsePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.impl.SimpleTypesImpl#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link modelConverter.use_language.use.impl.SimpleTypesImpl#getReferended <em>Referended</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypesImpl extends AllTypesImpl implements SimpleTypes
{
  /**
   * The default value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultType()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultType()
   * @generated
   * @ordered
   */
  protected String defaultType = DEFAULT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferended() <em>Referended</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferended()
   * @generated
   * @ordered
   */
  protected AllClassAndEnum referended;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleTypesImpl()
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
    return UsePackage.Literals.SIMPLE_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefaultType()
  {
    return defaultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultType(String newDefaultType)
  {
    String oldDefaultType = defaultType;
    defaultType = newDefaultType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.SIMPLE_TYPES__DEFAULT_TYPE, oldDefaultType, defaultType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllClassAndEnum getReferended()
  {
    if (referended != null && referended.eIsProxy())
    {
      InternalEObject oldReferended = (InternalEObject)referended;
      referended = (AllClassAndEnum)eResolveProxy(oldReferended);
      if (referended != oldReferended)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsePackage.SIMPLE_TYPES__REFERENDED, oldReferended, referended));
      }
    }
    return referended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllClassAndEnum basicGetReferended()
  {
    return referended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferended(AllClassAndEnum newReferended)
  {
    AllClassAndEnum oldReferended = referended;
    referended = newReferended;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.SIMPLE_TYPES__REFERENDED, oldReferended, referended));
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
      case UsePackage.SIMPLE_TYPES__DEFAULT_TYPE:
        return getDefaultType();
      case UsePackage.SIMPLE_TYPES__REFERENDED:
        if (resolve) return getReferended();
        return basicGetReferended();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UsePackage.SIMPLE_TYPES__DEFAULT_TYPE:
        setDefaultType((String)newValue);
        return;
      case UsePackage.SIMPLE_TYPES__REFERENDED:
        setReferended((AllClassAndEnum)newValue);
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
      case UsePackage.SIMPLE_TYPES__DEFAULT_TYPE:
        setDefaultType(DEFAULT_TYPE_EDEFAULT);
        return;
      case UsePackage.SIMPLE_TYPES__REFERENDED:
        setReferended((AllClassAndEnum)null);
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
      case UsePackage.SIMPLE_TYPES__DEFAULT_TYPE:
        return DEFAULT_TYPE_EDEFAULT == null ? defaultType != null : !DEFAULT_TYPE_EDEFAULT.equals(defaultType);
      case UsePackage.SIMPLE_TYPES__REFERENDED:
        return referended != null;
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
    result.append(" (defaultType: ");
    result.append(defaultType);
    result.append(')');
    return result.toString();
  }

} //SimpleTypesImpl

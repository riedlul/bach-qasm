/**
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.openQASM3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.openqasm.openQASM3.IndexOperator;
import org.xtext.openqasm.openQASM3.IndexedIdentifier;
import org.xtext.openqasm.openQASM3.OpenQASM3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indexed Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.openqasm.openQASM3.impl.IndexedIdentifierImpl#getGateName <em>Gate Name</em>}</li>
 *   <li>{@link org.xtext.openqasm.openQASM3.impl.IndexedIdentifierImpl#getIo <em>Io</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexedIdentifierImpl extends GateOperandImpl implements IndexedIdentifier
{
  /**
   * The default value of the '{@link #getGateName() <em>Gate Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGateName()
   * @generated
   * @ordered
   */
  protected static final String GATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGateName() <em>Gate Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGateName()
   * @generated
   * @ordered
   */
  protected String gateName = GATE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIo() <em>Io</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIo()
   * @generated
   * @ordered
   */
  protected EList<IndexOperator> io;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexedIdentifierImpl()
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
    return OpenQASM3Package.Literals.INDEXED_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGateName()
  {
    return gateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGateName(String newGateName)
  {
    String oldGateName = gateName;
    gateName = newGateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenQASM3Package.INDEXED_IDENTIFIER__GATE_NAME, oldGateName, gateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IndexOperator> getIo()
  {
    if (io == null)
    {
      io = new EObjectContainmentEList<IndexOperator>(IndexOperator.class, this, OpenQASM3Package.INDEXED_IDENTIFIER__IO);
    }
    return io;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenQASM3Package.INDEXED_IDENTIFIER__IO:
        return ((InternalEList<?>)getIo()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OpenQASM3Package.INDEXED_IDENTIFIER__GATE_NAME:
        return getGateName();
      case OpenQASM3Package.INDEXED_IDENTIFIER__IO:
        return getIo();
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
      case OpenQASM3Package.INDEXED_IDENTIFIER__GATE_NAME:
        setGateName((String)newValue);
        return;
      case OpenQASM3Package.INDEXED_IDENTIFIER__IO:
        getIo().clear();
        getIo().addAll((Collection<? extends IndexOperator>)newValue);
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
      case OpenQASM3Package.INDEXED_IDENTIFIER__GATE_NAME:
        setGateName(GATE_NAME_EDEFAULT);
        return;
      case OpenQASM3Package.INDEXED_IDENTIFIER__IO:
        getIo().clear();
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
      case OpenQASM3Package.INDEXED_IDENTIFIER__GATE_NAME:
        return GATE_NAME_EDEFAULT == null ? gateName != null : !GATE_NAME_EDEFAULT.equals(gateName);
      case OpenQASM3Package.INDEXED_IDENTIFIER__IO:
        return io != null && !io.isEmpty();
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
    result.append(" (gateName: ");
    result.append(gateName);
    result.append(')');
    return result.toString();
  }

} //IndexedIdentifierImpl

/**
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.openQASM3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.openqasm.openQASM3.GateOperand;
import org.xtext.openqasm.openQASM3.OpenQASM3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.openqasm.openQASM3.impl.GateOperandImpl#getExtraGO <em>Extra GO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateOperandImpl extends GateOperandListImpl implements GateOperand
{
  /**
   * The cached value of the '{@link #getExtraGO() <em>Extra GO</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraGO()
   * @generated
   * @ordered
   */
  protected EList<GateOperand> extraGO;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GateOperandImpl()
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
    return OpenQASM3Package.Literals.GATE_OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GateOperand> getExtraGO()
  {
    if (extraGO == null)
    {
      extraGO = new EObjectContainmentEList<GateOperand>(GateOperand.class, this, OpenQASM3Package.GATE_OPERAND__EXTRA_GO);
    }
    return extraGO;
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
      case OpenQASM3Package.GATE_OPERAND__EXTRA_GO:
        return ((InternalEList<?>)getExtraGO()).basicRemove(otherEnd, msgs);
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
      case OpenQASM3Package.GATE_OPERAND__EXTRA_GO:
        return getExtraGO();
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
      case OpenQASM3Package.GATE_OPERAND__EXTRA_GO:
        getExtraGO().clear();
        getExtraGO().addAll((Collection<? extends GateOperand>)newValue);
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
      case OpenQASM3Package.GATE_OPERAND__EXTRA_GO:
        getExtraGO().clear();
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
      case OpenQASM3Package.GATE_OPERAND__EXTRA_GO:
        return extraGO != null && !extraGO.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GateOperandImpl

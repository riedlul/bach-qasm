/**
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.openQASM3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.openqasm.openQASM3.Expression;
import org.xtext.openqasm.openQASM3.IfStatement;
import org.xtext.openqasm.openQASM3.OpenQASM3Package;
import org.xtext.openqasm.openQASM3.statementOrScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.openqasm.openQASM3.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.openqasm.openQASM3.impl.IfStatementImpl#getIf_body <em>If body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getIf_body() <em>If body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_body()
   * @generated
   * @ordered
   */
  protected statementOrScope if_body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return OpenQASM3Package.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenQASM3Package.IF_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenQASM3Package.IF_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenQASM3Package.IF_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenQASM3Package.IF_STATEMENT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statementOrScope getIf_body()
  {
    return if_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_body(statementOrScope newIf_body, NotificationChain msgs)
  {
    statementOrScope oldIf_body = if_body;
    if_body = newIf_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenQASM3Package.IF_STATEMENT__IF_BODY, oldIf_body, newIf_body);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIf_body(statementOrScope newIf_body)
  {
    if (newIf_body != if_body)
    {
      NotificationChain msgs = null;
      if (if_body != null)
        msgs = ((InternalEObject)if_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenQASM3Package.IF_STATEMENT__IF_BODY, null, msgs);
      if (newIf_body != null)
        msgs = ((InternalEObject)newIf_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenQASM3Package.IF_STATEMENT__IF_BODY, null, msgs);
      msgs = basicSetIf_body(newIf_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenQASM3Package.IF_STATEMENT__IF_BODY, newIf_body, newIf_body));
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
      case OpenQASM3Package.IF_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case OpenQASM3Package.IF_STATEMENT__IF_BODY:
        return basicSetIf_body(null, msgs);
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
      case OpenQASM3Package.IF_STATEMENT__CONDITION:
        return getCondition();
      case OpenQASM3Package.IF_STATEMENT__IF_BODY:
        return getIf_body();
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
      case OpenQASM3Package.IF_STATEMENT__CONDITION:
        setCondition((Expression)newValue);
        return;
      case OpenQASM3Package.IF_STATEMENT__IF_BODY:
        setIf_body((statementOrScope)newValue);
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
      case OpenQASM3Package.IF_STATEMENT__CONDITION:
        setCondition((Expression)null);
        return;
      case OpenQASM3Package.IF_STATEMENT__IF_BODY:
        setIf_body((statementOrScope)null);
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
      case OpenQASM3Package.IF_STATEMENT__CONDITION:
        return condition != null;
      case OpenQASM3Package.IF_STATEMENT__IF_BODY:
        return if_body != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
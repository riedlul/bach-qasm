/**
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.openQASM3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.openqasm.openQASM3.GateCallStatement#getGate <em>Gate</em>}</li>
 *   <li>{@link org.xtext.openqasm.openQASM3.GateCallStatement#getEl <em>El</em>}</li>
 *   <li>{@link org.xtext.openqasm.openQASM3.GateCallStatement#getGateList <em>Gate List</em>}</li>
 *   <li>{@link org.xtext.openqasm.openQASM3.GateCallStatement#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.xtext.openqasm.openQASM3.OpenQASM3Package#getGateCallStatement()
 * @model
 * @generated
 */
public interface GateCallStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Gate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gate</em>' attribute.
   * @see #setGate(String)
   * @see org.xtext.openqasm.openQASM3.OpenQASM3Package#getGateCallStatement_Gate()
   * @model
   * @generated
   */
  String getGate();

  /**
   * Sets the value of the '{@link org.xtext.openqasm.openQASM3.GateCallStatement#getGate <em>Gate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gate</em>' attribute.
   * @see #getGate()
   * @generated
   */
  void setGate(String value);

  /**
   * Returns the value of the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' containment reference.
   * @see #setEl(ExpressionList)
   * @see org.xtext.openqasm.openQASM3.OpenQASM3Package#getGateCallStatement_El()
   * @model containment="true"
   * @generated
   */
  ExpressionList getEl();

  /**
   * Sets the value of the '{@link org.xtext.openqasm.openQASM3.GateCallStatement#getEl <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' containment reference.
   * @see #getEl()
   * @generated
   */
  void setEl(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Gate List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gate List</em>' containment reference.
   * @see #setGateList(GateOperandList)
   * @see org.xtext.openqasm.openQASM3.OpenQASM3Package#getGateCallStatement_GateList()
   * @model containment="true"
   * @generated
   */
  GateOperandList getGateList();

  /**
   * Sets the value of the '{@link org.xtext.openqasm.openQASM3.GateCallStatement#getGateList <em>Gate List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gate List</em>' containment reference.
   * @see #getGateList()
   * @generated
   */
  void setGateList(GateOperandList value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see org.xtext.openqasm.openQASM3.OpenQASM3Package#getGateCallStatement_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link org.xtext.openqasm.openQASM3.GateCallStatement#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // GateCallStatement

/**
 * generated by Xtext 2.30.0
 */
package org.xtext.openqasm.openQASM3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.openqasm.openQASM3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenQASM3FactoryImpl extends EFactoryImpl implements OpenQASM3Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OpenQASM3Factory init()
  {
    try
    {
      OpenQASM3Factory theOpenQASM3Factory = (OpenQASM3Factory)EPackage.Registry.INSTANCE.getEFactory(OpenQASM3Package.eNS_URI);
      if (theOpenQASM3Factory != null)
      {
        return theOpenQASM3Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OpenQASM3FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenQASM3FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OpenQASM3Package.PROGRAM: return createProgram();
      case OpenQASM3Package.VERSION: return createVersion();
      case OpenQASM3Package.STATEMENT: return createStatement();
      case OpenQASM3Package.QUANTUM_DECLARATION_STATEMENT: return createquantumDeclarationStatement();
      case OpenQASM3Package.GATE_CALL_STATEMENT: return createGateCallStatement();
      case OpenQASM3Package.IF_STATEMENT: return createIfStatement();
      case OpenQASM3Package.STATEMENT_OR_SCOPE: return createstatementOrScope();
      case OpenQASM3Package.SCOPE: return createScope();
      case OpenQASM3Package.EXPRESSION_LIST: return createExpressionList();
      case OpenQASM3Package.EXPRESSION: return createExpression();
      case OpenQASM3Package.LITERAL: return createLiteral();
      case OpenQASM3Package.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case OpenQASM3Package.UNARY_EXPRESSION: return createUnaryExpression();
      case OpenQASM3Package.INDEX_OPERATOR: return createIndexOperator();
      case OpenQASM3Package.INDEXED_IDENTIFIER: return createIndexedIdentifier();
      case OpenQASM3Package.GATE_OPERAND: return createGateOperand();
      case OpenQASM3Package.GATE_OPERAND_LIST: return createGateOperandList();
      case OpenQASM3Package.QUBIT_TYPE: return createQubitType();
      case OpenQASM3Package.DESIGNATOR: return createDesignator();
      case OpenQASM3Package.INCLUDE_STATEMENT: return createIncludeStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public quantumDeclarationStatement createquantumDeclarationStatement()
  {
    quantumDeclarationStatementImpl quantumDeclarationStatement = new quantumDeclarationStatementImpl();
    return quantumDeclarationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GateCallStatement createGateCallStatement()
  {
    GateCallStatementImpl gateCallStatement = new GateCallStatementImpl();
    return gateCallStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statementOrScope createstatementOrScope()
  {
    statementOrScopeImpl statementOrScope = new statementOrScopeImpl();
    return statementOrScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexOperator createIndexOperator()
  {
    IndexOperatorImpl indexOperator = new IndexOperatorImpl();
    return indexOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexedIdentifier createIndexedIdentifier()
  {
    IndexedIdentifierImpl indexedIdentifier = new IndexedIdentifierImpl();
    return indexedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GateOperand createGateOperand()
  {
    GateOperandImpl gateOperand = new GateOperandImpl();
    return gateOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GateOperandList createGateOperandList()
  {
    GateOperandListImpl gateOperandList = new GateOperandListImpl();
    return gateOperandList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QubitType createQubitType()
  {
    QubitTypeImpl qubitType = new QubitTypeImpl();
    return qubitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Designator createDesignator()
  {
    DesignatorImpl designator = new DesignatorImpl();
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IncludeStatement createIncludeStatement()
  {
    IncludeStatementImpl includeStatement = new IncludeStatementImpl();
    return includeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OpenQASM3Package getOpenQASM3Package()
  {
    return (OpenQASM3Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OpenQASM3Package getPackage()
  {
    return OpenQASM3Package.eINSTANCE;
  }

} //OpenQASM3FactoryImpl

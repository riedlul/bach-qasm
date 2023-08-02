package org.xtext.openqasm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.openqasm.services.OpenQASM3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenQASM3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_ID", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_COMMA", "RULE_STRING", "RULE_ASTERISK", "RULE_SLASH", "RULE_TILDE", "RULE_EXCLAMATION_POINT", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_QUBIT", "RULE_DOT", "RULE_MINUS", "RULE_INT", "RULE_ELSE", "RULE_PERCENT", "RULE_BIT", "RULE_FLOAT", "RULE_ANGLE", "RULE_BOOL", "RULE_DURATION", "RULE_STRETCH", "RULE_COMPLEX", "RULE_ARRAY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OPENQASM'", "'gate'", "'if'", "'e'", "'pi'", "'include'"
    };
    public static final int RULE_LBRACKET=16;
    public static final int RULE_DURATION=28;
    public static final int RULE_STRING=11;
    public static final int RULE_ANGLE=26;
    public static final int RULE_ARRAY=31;
    public static final int RULE_LPAREN=6;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_BIT=24;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_COMPLEX=30;
    public static final int T__39=39;
    public static final int RULE_QUBIT=18;
    public static final int T__36=36;
    public static final int RULE_PERCENT=23;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int RULE_EXCLAMATION_POINT=15;
    public static final int RULE_ID=5;
    public static final int RULE_LBRACE=8;
    public static final int RULE_COMMA=10;
    public static final int RULE_WS=34;
    public static final int RULE_STRETCH=29;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_BOOL=27;
    public static final int RULE_SLASH=13;
    public static final int RULE_RBRACE=9;
    public static final int RULE_MINUS=20;
    public static final int RULE_ASTERISK=12;
    public static final int RULE_TILDE=14;
    public static final int RULE_RPAREN=7;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_FLOAT=25;
    public static final int RULE_SEMICOLON=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_ELSE=22;
    public static final int RULE_RBRACKET=17;

    // delegates
    // delegators


        public InternalOpenQASM3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOpenQASM3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOpenQASM3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalOpenQASM3.g"; }



     	private OpenQASM3GrammarAccess grammarAccess;

        public InternalOpenQASM3Parser(TokenStream input, OpenQASM3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected OpenQASM3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalOpenQASM3.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalOpenQASM3.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalOpenQASM3.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalOpenQASM3.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_version_0_0= ruleVersion ) )? ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_version_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:77:2: ( ( ( (lv_version_0_0= ruleVersion ) )? ( (lv_statements_1_0= ruleStatement ) )* ) )
            // InternalOpenQASM3.g:78:2: ( ( (lv_version_0_0= ruleVersion ) )? ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // InternalOpenQASM3.g:78:2: ( ( (lv_version_0_0= ruleVersion ) )? ( (lv_statements_1_0= ruleStatement ) )* )
            // InternalOpenQASM3.g:79:3: ( (lv_version_0_0= ruleVersion ) )? ( (lv_statements_1_0= ruleStatement ) )*
            {
            // InternalOpenQASM3.g:79:3: ( (lv_version_0_0= ruleVersion ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOpenQASM3.g:80:4: (lv_version_0_0= ruleVersion )
                    {
                    // InternalOpenQASM3.g:80:4: (lv_version_0_0= ruleVersion )
                    // InternalOpenQASM3.g:81:5: lv_version_0_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getVersionVersionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_version_0_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_0_0,
                    						"org.xtext.openqasm.OpenQASM3.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOpenQASM3.g:98:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_QUBIT||(LA2_0>=37 && LA2_0<=38)||LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOpenQASM3.g:99:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalOpenQASM3.g:99:4: (lv_statements_1_0= ruleStatement )
            	    // InternalOpenQASM3.g:100:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"org.xtext.openqasm.OpenQASM3.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleVersion"
    // InternalOpenQASM3.g:121:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalOpenQASM3.g:121:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalOpenQASM3.g:122:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalOpenQASM3.g:128:1: ruleVersion returns [EObject current=null] : ( (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SEMICOLON_2=null;
        AntlrDatatypeRuleToken lv_versionNumber_1_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:134:2: ( ( (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:135:2: ( (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:135:2: ( (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalOpenQASM3.g:136:3: (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            // InternalOpenQASM3.g:136:3: (otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) ) )
            // InternalOpenQASM3.g:137:4: otherlv_0= 'OPENQASM' ( (lv_versionNumber_1_0= ruleFloatLiteral ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            				newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getOPENQASMKeyword_0_0());
            			
            // InternalOpenQASM3.g:141:4: ( (lv_versionNumber_1_0= ruleFloatLiteral ) )
            // InternalOpenQASM3.g:142:5: (lv_versionNumber_1_0= ruleFloatLiteral )
            {
            // InternalOpenQASM3.g:142:5: (lv_versionNumber_1_0= ruleFloatLiteral )
            // InternalOpenQASM3.g:143:6: lv_versionNumber_1_0= ruleFloatLiteral
            {

            						newCompositeNode(grammarAccess.getVersionAccess().getVersionNumberFloatLiteralParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_versionNumber_1_0=ruleFloatLiteral();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVersionRule());
            						}
            						set(
            							current,
            							"versionNumber",
            							lv_versionNumber_1_0,
            							"org.xtext.openqasm.OpenQASM3.FloatLiteral");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getVersionAccess().getSEMICOLONTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleStatement"
    // InternalOpenQASM3.g:169:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOpenQASM3.g:169:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOpenQASM3.g:170:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOpenQASM3.g:176:1: ruleStatement returns [EObject current=null] : (this_IncludeStatement_0= ruleIncludeStatement | this_quantumDeclarationStatement_1= rulequantumDeclarationStatement | this_GateCallStatement_2= ruleGateCallStatement | this_IfStatement_3= ruleIfStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IncludeStatement_0 = null;

        EObject this_quantumDeclarationStatement_1 = null;

        EObject this_GateCallStatement_2 = null;

        EObject this_IfStatement_3 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:182:2: ( (this_IncludeStatement_0= ruleIncludeStatement | this_quantumDeclarationStatement_1= rulequantumDeclarationStatement | this_GateCallStatement_2= ruleGateCallStatement | this_IfStatement_3= ruleIfStatement ) )
            // InternalOpenQASM3.g:183:2: (this_IncludeStatement_0= ruleIncludeStatement | this_quantumDeclarationStatement_1= rulequantumDeclarationStatement | this_GateCallStatement_2= ruleGateCallStatement | this_IfStatement_3= ruleIfStatement )
            {
            // InternalOpenQASM3.g:183:2: (this_IncludeStatement_0= ruleIncludeStatement | this_quantumDeclarationStatement_1= rulequantumDeclarationStatement | this_GateCallStatement_2= ruleGateCallStatement | this_IfStatement_3= ruleIfStatement )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case RULE_QUBIT:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case 37:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOpenQASM3.g:184:3: this_IncludeStatement_0= ruleIncludeStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIncludeStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IncludeStatement_0=ruleIncludeStatement();

                    state._fsp--;


                    			current = this_IncludeStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:193:3: this_quantumDeclarationStatement_1= rulequantumDeclarationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQuantumDeclarationStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_quantumDeclarationStatement_1=rulequantumDeclarationStatement();

                    state._fsp--;


                    			current = this_quantumDeclarationStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:202:3: this_GateCallStatement_2= ruleGateCallStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGateCallStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GateCallStatement_2=ruleGateCallStatement();

                    state._fsp--;


                    			current = this_GateCallStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOpenQASM3.g:211:3: this_IfStatement_3= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulequantumDeclarationStatement"
    // InternalOpenQASM3.g:223:1: entryRulequantumDeclarationStatement returns [EObject current=null] : iv_rulequantumDeclarationStatement= rulequantumDeclarationStatement EOF ;
    public final EObject entryRulequantumDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequantumDeclarationStatement = null;


        try {
            // InternalOpenQASM3.g:223:68: (iv_rulequantumDeclarationStatement= rulequantumDeclarationStatement EOF )
            // InternalOpenQASM3.g:224:2: iv_rulequantumDeclarationStatement= rulequantumDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getQuantumDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulequantumDeclarationStatement=rulequantumDeclarationStatement();

            state._fsp--;

             current =iv_rulequantumDeclarationStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequantumDeclarationStatement"


    // $ANTLR start "rulequantumDeclarationStatement"
    // InternalOpenQASM3.g:230:1: rulequantumDeclarationStatement returns [EObject current=null] : (this_QubitType_0= ruleQubitType ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject rulequantumDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_SEMICOLON_2=null;
        EObject this_QubitType_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:236:2: ( (this_QubitType_0= ruleQubitType ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:237:2: (this_QubitType_0= ruleQubitType ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:237:2: (this_QubitType_0= ruleQubitType ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalOpenQASM3.g:238:3: this_QubitType_0= ruleQubitType ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {

            			newCompositeNode(grammarAccess.getQuantumDeclarationStatementAccess().getQubitTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QubitType_0=ruleQubitType();

            state._fsp--;


            			current = this_QubitType_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOpenQASM3.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpenQASM3.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpenQASM3.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalOpenQASM3.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuantumDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantumDeclarationStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getQuantumDeclarationStatementAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulequantumDeclarationStatement"


    // $ANTLR start "entryRuleGateCallStatement"
    // InternalOpenQASM3.g:272:1: entryRuleGateCallStatement returns [EObject current=null] : iv_ruleGateCallStatement= ruleGateCallStatement EOF ;
    public final EObject entryRuleGateCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateCallStatement = null;


        try {
            // InternalOpenQASM3.g:272:58: (iv_ruleGateCallStatement= ruleGateCallStatement EOF )
            // InternalOpenQASM3.g:273:2: iv_ruleGateCallStatement= ruleGateCallStatement EOF
            {
             newCompositeNode(grammarAccess.getGateCallStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateCallStatement=ruleGateCallStatement();

            state._fsp--;

             current =iv_ruleGateCallStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateCallStatement"


    // $ANTLR start "ruleGateCallStatement"
    // InternalOpenQASM3.g:279:1: ruleGateCallStatement returns [EObject current=null] : ( (otherlv_0= 'gate' )? ( (lv_gate_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )? ( (lv_gateList_5_0= ruleGateOperandList ) ) ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON ) ) ;
    public final EObject ruleGateCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_gate_1_0=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token this_SEMICOLON_7=null;
        EObject lv_el_3_0 = null;

        EObject lv_gateList_5_0 = null;

        EObject lv_scope_6_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:285:2: ( ( (otherlv_0= 'gate' )? ( (lv_gate_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )? ( (lv_gateList_5_0= ruleGateOperandList ) ) ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON ) ) )
            // InternalOpenQASM3.g:286:2: ( (otherlv_0= 'gate' )? ( (lv_gate_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )? ( (lv_gateList_5_0= ruleGateOperandList ) ) ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON ) )
            {
            // InternalOpenQASM3.g:286:2: ( (otherlv_0= 'gate' )? ( (lv_gate_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )? ( (lv_gateList_5_0= ruleGateOperandList ) ) ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:287:3: (otherlv_0= 'gate' )? ( (lv_gate_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )? ( (lv_gateList_5_0= ruleGateOperandList ) ) ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:287:3: (otherlv_0= 'gate' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOpenQASM3.g:288:4: otherlv_0= 'gate'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getGateCallStatementAccess().getGateKeyword_0());
                    			

                    }
                    break;

            }

            // InternalOpenQASM3.g:293:3: ( (lv_gate_1_0= RULE_ID ) )
            // InternalOpenQASM3.g:294:4: (lv_gate_1_0= RULE_ID )
            {
            // InternalOpenQASM3.g:294:4: (lv_gate_1_0= RULE_ID )
            // InternalOpenQASM3.g:295:5: lv_gate_1_0= RULE_ID
            {
            lv_gate_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_gate_1_0, grammarAccess.getGateCallStatementAccess().getGateIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGateCallStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gate",
            						lv_gate_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOpenQASM3.g:311:3: (this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpenQASM3.g:312:4: this_LPAREN_2= RULE_LPAREN ( (lv_el_3_0= ruleExpressionList ) )? this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_8); 

                    				newLeafNode(this_LPAREN_2, grammarAccess.getGateCallStatementAccess().getLPARENTerminalRuleCall_2_0());
                    			
                    // InternalOpenQASM3.g:316:4: ( (lv_el_3_0= ruleExpressionList ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_LPAREN||LA5_0==RULE_STRING||(LA5_0>=RULE_TILDE && LA5_0<=RULE_EXCLAMATION_POINT)||(LA5_0>=RULE_MINUS && LA5_0<=RULE_INT)||LA5_0==40) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalOpenQASM3.g:317:5: (lv_el_3_0= ruleExpressionList )
                            {
                            // InternalOpenQASM3.g:317:5: (lv_el_3_0= ruleExpressionList )
                            // InternalOpenQASM3.g:318:6: lv_el_3_0= ruleExpressionList
                            {

                            						newCompositeNode(grammarAccess.getGateCallStatementAccess().getElExpressionListParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_el_3_0=ruleExpressionList();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGateCallStatementRule());
                            						}
                            						set(
                            							current,
                            							"el",
                            							lv_el_3_0,
                            							"org.xtext.openqasm.OpenQASM3.ExpressionList");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_7); 

                    				newLeafNode(this_RPAREN_4, grammarAccess.getGateCallStatementAccess().getRPARENTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalOpenQASM3.g:340:3: ( (lv_gateList_5_0= ruleGateOperandList ) )
            // InternalOpenQASM3.g:341:4: (lv_gateList_5_0= ruleGateOperandList )
            {
            // InternalOpenQASM3.g:341:4: (lv_gateList_5_0= ruleGateOperandList )
            // InternalOpenQASM3.g:342:5: lv_gateList_5_0= ruleGateOperandList
            {

            					newCompositeNode(grammarAccess.getGateCallStatementAccess().getGateListGateOperandListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_gateList_5_0=ruleGateOperandList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGateCallStatementRule());
            					}
            					set(
            						current,
            						"gateList",
            						lv_gateList_5_0,
            						"org.xtext.openqasm.OpenQASM3.GateOperandList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenQASM3.g:359:3: ( ( (lv_scope_6_0= ruleScope ) ) | this_SEMICOLON_7= RULE_SEMICOLON )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LBRACE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SEMICOLON) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpenQASM3.g:360:4: ( (lv_scope_6_0= ruleScope ) )
                    {
                    // InternalOpenQASM3.g:360:4: ( (lv_scope_6_0= ruleScope ) )
                    // InternalOpenQASM3.g:361:5: (lv_scope_6_0= ruleScope )
                    {
                    // InternalOpenQASM3.g:361:5: (lv_scope_6_0= ruleScope )
                    // InternalOpenQASM3.g:362:6: lv_scope_6_0= ruleScope
                    {

                    						newCompositeNode(grammarAccess.getGateCallStatementAccess().getScopeScopeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_scope_6_0=ruleScope();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGateCallStatementRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_6_0,
                    							"org.xtext.openqasm.OpenQASM3.Scope");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:380:4: this_SEMICOLON_7= RULE_SEMICOLON
                    {
                    this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

                    				newLeafNode(this_SEMICOLON_7, grammarAccess.getGateCallStatementAccess().getSEMICOLONTerminalRuleCall_4_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateCallStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalOpenQASM3.g:389:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalOpenQASM3.g:389:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalOpenQASM3.g:390:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalOpenQASM3.g:396:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleExpression ) ) this_RPAREN_3= RULE_RPAREN ( (lv_if_body_4_0= rulestatementOrScope ) ) ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAREN_1=null;
        Token this_RPAREN_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_if_body_4_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:402:2: ( (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleExpression ) ) this_RPAREN_3= RULE_RPAREN ( (lv_if_body_4_0= rulestatementOrScope ) ) ) )
            // InternalOpenQASM3.g:403:2: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleExpression ) ) this_RPAREN_3= RULE_RPAREN ( (lv_if_body_4_0= rulestatementOrScope ) ) )
            {
            // InternalOpenQASM3.g:403:2: (otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleExpression ) ) this_RPAREN_3= RULE_RPAREN ( (lv_if_body_4_0= rulestatementOrScope ) ) )
            // InternalOpenQASM3.g:404:3: otherlv_0= 'if' this_LPAREN_1= RULE_LPAREN ( (lv_condition_2_0= ruleExpression ) ) this_RPAREN_3= RULE_RPAREN ( (lv_if_body_4_0= rulestatementOrScope ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_12); 

            			newLeafNode(this_LPAREN_1, grammarAccess.getIfStatementAccess().getLPARENTerminalRuleCall_1());
            		
            // InternalOpenQASM3.g:412:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOpenQASM3.g:413:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOpenQASM3.g:413:4: (lv_condition_2_0= ruleExpression )
            // InternalOpenQASM3.g:414:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.openqasm.OpenQASM3.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_13); 

            			newLeafNode(this_RPAREN_3, grammarAccess.getIfStatementAccess().getRPARENTerminalRuleCall_3());
            		
            // InternalOpenQASM3.g:435:3: ( (lv_if_body_4_0= rulestatementOrScope ) )
            // InternalOpenQASM3.g:436:4: (lv_if_body_4_0= rulestatementOrScope )
            {
            // InternalOpenQASM3.g:436:4: (lv_if_body_4_0= rulestatementOrScope )
            // InternalOpenQASM3.g:437:5: lv_if_body_4_0= rulestatementOrScope
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getIf_bodyStatementOrScopeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_if_body_4_0=rulestatementOrScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"if_body",
            						lv_if_body_4_0,
            						"org.xtext.openqasm.OpenQASM3.statementOrScope");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRulestatementOrScope"
    // InternalOpenQASM3.g:458:1: entryRulestatementOrScope returns [EObject current=null] : iv_rulestatementOrScope= rulestatementOrScope EOF ;
    public final EObject entryRulestatementOrScope() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatementOrScope = null;


        try {
            // InternalOpenQASM3.g:458:57: (iv_rulestatementOrScope= rulestatementOrScope EOF )
            // InternalOpenQASM3.g:459:2: iv_rulestatementOrScope= rulestatementOrScope EOF
            {
             newCompositeNode(grammarAccess.getStatementOrScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatementOrScope=rulestatementOrScope();

            state._fsp--;

             current =iv_rulestatementOrScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatementOrScope"


    // $ANTLR start "rulestatementOrScope"
    // InternalOpenQASM3.g:465:1: rulestatementOrScope returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Scope_1= ruleScope ) ;
    public final EObject rulestatementOrScope() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Scope_1 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:471:2: ( (this_Statement_0= ruleStatement | this_Scope_1= ruleScope ) )
            // InternalOpenQASM3.g:472:2: (this_Statement_0= ruleStatement | this_Scope_1= ruleScope )
            {
            // InternalOpenQASM3.g:472:2: (this_Statement_0= ruleStatement | this_Scope_1= ruleScope )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==RULE_QUBIT||(LA8_0>=37 && LA8_0<=38)||LA8_0==41) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_LBRACE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOpenQASM3.g:473:3: this_Statement_0= ruleStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementOrScopeAccess().getStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Statement_0=ruleStatement();

                    state._fsp--;


                    			current = this_Statement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:482:3: this_Scope_1= ruleScope
                    {

                    			newCompositeNode(grammarAccess.getStatementOrScopeAccess().getScopeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scope_1=ruleScope();

                    state._fsp--;


                    			current = this_Scope_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatementOrScope"


    // $ANTLR start "entryRuleScope"
    // InternalOpenQASM3.g:494:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalOpenQASM3.g:494:46: (iv_ruleScope= ruleScope EOF )
            // InternalOpenQASM3.g:495:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalOpenQASM3.g:501:1: ruleScope returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( (lv_statements_2_0= ruleStatement ) )* this_RBRACE_3= RULE_RBRACE ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token this_RBRACE_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:507:2: ( ( () this_LBRACE_1= RULE_LBRACE ( (lv_statements_2_0= ruleStatement ) )* this_RBRACE_3= RULE_RBRACE ) )
            // InternalOpenQASM3.g:508:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_statements_2_0= ruleStatement ) )* this_RBRACE_3= RULE_RBRACE )
            {
            // InternalOpenQASM3.g:508:2: ( () this_LBRACE_1= RULE_LBRACE ( (lv_statements_2_0= ruleStatement ) )* this_RBRACE_3= RULE_RBRACE )
            // InternalOpenQASM3.g:509:3: () this_LBRACE_1= RULE_LBRACE ( (lv_statements_2_0= ruleStatement ) )* this_RBRACE_3= RULE_RBRACE
            {
            // InternalOpenQASM3.g:509:3: ()
            // InternalOpenQASM3.g:510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScopeAccess().getScopeAction_0(),
            					current);
            			

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_14); 

            			newLeafNode(this_LBRACE_1, grammarAccess.getScopeAccess().getLBRACETerminalRuleCall_1());
            		
            // InternalOpenQASM3.g:520:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_QUBIT||(LA9_0>=37 && LA9_0<=38)||LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOpenQASM3.g:521:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalOpenQASM3.g:521:4: (lv_statements_2_0= ruleStatement )
            	    // InternalOpenQASM3.g:522:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScopeAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScopeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"org.xtext.openqasm.OpenQASM3.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_RBRACE_3=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

            			newLeafNode(this_RBRACE_3, grammarAccess.getScopeAccess().getRBRACETerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleExpressionList"
    // InternalOpenQASM3.g:547:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalOpenQASM3.g:547:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalOpenQASM3.g:548:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
             newCompositeNode(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;

             current =iv_ruleExpressionList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalOpenQASM3.g:554:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_e1_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject lv_e1_0_0 = null;

        EObject lv_e2_2_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:560:2: ( ( ( (lv_e1_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // InternalOpenQASM3.g:561:2: ( ( (lv_e1_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // InternalOpenQASM3.g:561:2: ( ( (lv_e1_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // InternalOpenQASM3.g:562:3: ( (lv_e1_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )* (this_COMMA_3= RULE_COMMA )?
            {
            // InternalOpenQASM3.g:562:3: ( (lv_e1_0_0= ruleExpression ) )
            // InternalOpenQASM3.g:563:4: (lv_e1_0_0= ruleExpression )
            {
            // InternalOpenQASM3.g:563:4: (lv_e1_0_0= ruleExpression )
            // InternalOpenQASM3.g:564:5: lv_e1_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionListAccess().getE1ExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_e1_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionListRule());
            					}
            					set(
            						current,
            						"e1",
            						lv_e1_0_0,
            						"org.xtext.openqasm.OpenQASM3.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenQASM3.g:581:3: (this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_LPAREN||LA10_1==RULE_STRING||(LA10_1>=RULE_TILDE && LA10_1<=RULE_EXCLAMATION_POINT)||(LA10_1>=RULE_MINUS && LA10_1<=RULE_INT)||LA10_1==40) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalOpenQASM3.g:582:4: this_COMMA_1= RULE_COMMA ( (lv_e2_2_0= ruleExpression ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            	    				newLeafNode(this_COMMA_1, grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_1_0());
            	    			
            	    // InternalOpenQASM3.g:586:4: ( (lv_e2_2_0= ruleExpression ) )
            	    // InternalOpenQASM3.g:587:5: (lv_e2_2_0= ruleExpression )
            	    {
            	    // InternalOpenQASM3.g:587:5: (lv_e2_2_0= ruleExpression )
            	    // InternalOpenQASM3.g:588:6: lv_e2_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionListAccess().getE2ExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_e2_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"e2",
            	    							lv_e2_2_0,
            	    							"org.xtext.openqasm.OpenQASM3.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalOpenQASM3.g:606:3: (this_COMMA_3= RULE_COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMA) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOpenQASM3.g:607:4: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_3, grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExpression"
    // InternalOpenQASM3.g:616:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOpenQASM3.g:616:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOpenQASM3.g:617:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalOpenQASM3.g:623:1: ruleExpression returns [EObject current=null] : ( (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN ) | ( (lv_ltrs_3_0= ruleLiteral ) ) | ( (lv_unExpressions_4_0= ruleUnaryExpression ) ) | ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_ltrs_3_0 = null;

        EObject lv_unExpressions_4_0 = null;

        EObject lv_multExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:629:2: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN ) | ( (lv_ltrs_3_0= ruleLiteral ) ) | ( (lv_unExpressions_4_0= ruleUnaryExpression ) ) | ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) ) ) )
            // InternalOpenQASM3.g:630:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN ) | ( (lv_ltrs_3_0= ruleLiteral ) ) | ( (lv_unExpressions_4_0= ruleUnaryExpression ) ) | ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) ) )
            {
            // InternalOpenQASM3.g:630:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN ) | ( (lv_ltrs_3_0= ruleLiteral ) ) | ( (lv_unExpressions_4_0= ruleUnaryExpression ) ) | ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalOpenQASM3.g:631:3: (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN )
                    {
                    // InternalOpenQASM3.g:631:3: (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN )
                    // InternalOpenQASM3.g:632:4: this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN
                    {
                    this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_12); 

                    				newLeafNode(this_LPAREN_0, grammarAccess.getExpressionAccess().getLPARENTerminalRuleCall_0_0());
                    			
                    // InternalOpenQASM3.g:636:4: ( (lv_exprs_1_0= ruleExpression ) )
                    // InternalOpenQASM3.g:637:5: (lv_exprs_1_0= ruleExpression )
                    {
                    // InternalOpenQASM3.g:637:5: (lv_exprs_1_0= ruleExpression )
                    // InternalOpenQASM3.g:638:6: lv_exprs_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExprsExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exprs_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_1_0,
                    							"org.xtext.openqasm.OpenQASM3.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

                    				newLeafNode(this_RPAREN_2, grammarAccess.getExpressionAccess().getRPARENTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:661:3: ( (lv_ltrs_3_0= ruleLiteral ) )
                    {
                    // InternalOpenQASM3.g:661:3: ( (lv_ltrs_3_0= ruleLiteral ) )
                    // InternalOpenQASM3.g:662:4: (lv_ltrs_3_0= ruleLiteral )
                    {
                    // InternalOpenQASM3.g:662:4: (lv_ltrs_3_0= ruleLiteral )
                    // InternalOpenQASM3.g:663:5: lv_ltrs_3_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getLtrsLiteralParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ltrs_3_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					add(
                    						current,
                    						"ltrs",
                    						lv_ltrs_3_0,
                    						"org.xtext.openqasm.OpenQASM3.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:681:3: ( (lv_unExpressions_4_0= ruleUnaryExpression ) )
                    {
                    // InternalOpenQASM3.g:681:3: ( (lv_unExpressions_4_0= ruleUnaryExpression ) )
                    // InternalOpenQASM3.g:682:4: (lv_unExpressions_4_0= ruleUnaryExpression )
                    {
                    // InternalOpenQASM3.g:682:4: (lv_unExpressions_4_0= ruleUnaryExpression )
                    // InternalOpenQASM3.g:683:5: lv_unExpressions_4_0= ruleUnaryExpression
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getUnExpressionsUnaryExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unExpressions_4_0=ruleUnaryExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					add(
                    						current,
                    						"unExpressions",
                    						lv_unExpressions_4_0,
                    						"org.xtext.openqasm.OpenQASM3.UnaryExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOpenQASM3.g:701:3: ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) )
                    {
                    // InternalOpenQASM3.g:701:3: ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) )
                    // InternalOpenQASM3.g:702:4: (lv_multExpressions_5_0= ruleMultiplicativeExpression )
                    {
                    // InternalOpenQASM3.g:702:4: (lv_multExpressions_5_0= ruleMultiplicativeExpression )
                    // InternalOpenQASM3.g:703:5: lv_multExpressions_5_0= ruleMultiplicativeExpression
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getMultExpressionsMultiplicativeExpressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_multExpressions_5_0=ruleMultiplicativeExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					add(
                    						current,
                    						"multExpressions",
                    						lv_multExpressions_5_0,
                    						"org.xtext.openqasm.OpenQASM3.MultiplicativeExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalOpenQASM3.g:724:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOpenQASM3.g:724:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOpenQASM3.g:725:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalOpenQASM3.g:731:1: ruleLiteral returns [EObject current=null] : ( ( (lv_l_0_0= ruleFloatLiteral ) ) | ( () this_STRING_2= RULE_STRING ) | ( () ruleDecimalIntegerLiteral ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;
        AntlrDatatypeRuleToken lv_l_0_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:737:2: ( ( ( (lv_l_0_0= ruleFloatLiteral ) ) | ( () this_STRING_2= RULE_STRING ) | ( () ruleDecimalIntegerLiteral ) ) )
            // InternalOpenQASM3.g:738:2: ( ( (lv_l_0_0= ruleFloatLiteral ) ) | ( () this_STRING_2= RULE_STRING ) | ( () ruleDecimalIntegerLiteral ) )
            {
            // InternalOpenQASM3.g:738:2: ( ( (lv_l_0_0= ruleFloatLiteral ) ) | ( () this_STRING_2= RULE_STRING ) | ( () ruleDecimalIntegerLiteral ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_INT) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==EOF||LA13_2==RULE_RPAREN||LA13_2==RULE_COMMA||(LA13_2>=RULE_ASTERISK && LA13_2<=RULE_SLASH)||LA13_2==RULE_RBRACKET) ) {
                        alt13=3;
                    }
                    else if ( (LA13_2==RULE_DOT) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==EOF||LA13_2==RULE_RPAREN||LA13_2==RULE_COMMA||(LA13_2>=RULE_ASTERISK && LA13_2<=RULE_SLASH)||LA13_2==RULE_RBRACKET) ) {
                    alt13=3;
                }
                else if ( (LA13_2==RULE_DOT) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOpenQASM3.g:739:3: ( (lv_l_0_0= ruleFloatLiteral ) )
                    {
                    // InternalOpenQASM3.g:739:3: ( (lv_l_0_0= ruleFloatLiteral ) )
                    // InternalOpenQASM3.g:740:4: (lv_l_0_0= ruleFloatLiteral )
                    {
                    // InternalOpenQASM3.g:740:4: (lv_l_0_0= ruleFloatLiteral )
                    // InternalOpenQASM3.g:741:5: lv_l_0_0= ruleFloatLiteral
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getLFloatLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_l_0_0=ruleFloatLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					set(
                    						current,
                    						"l",
                    						lv_l_0_0,
                    						"org.xtext.openqasm.OpenQASM3.FloatLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:759:3: ( () this_STRING_2= RULE_STRING )
                    {
                    // InternalOpenQASM3.g:759:3: ( () this_STRING_2= RULE_STRING )
                    // InternalOpenQASM3.g:760:4: () this_STRING_2= RULE_STRING
                    {
                    // InternalOpenQASM3.g:760:4: ()
                    // InternalOpenQASM3.g:761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                    						current);
                    				

                    }

                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_2, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:773:3: ( () ruleDecimalIntegerLiteral )
                    {
                    // InternalOpenQASM3.g:773:3: ( () ruleDecimalIntegerLiteral )
                    // InternalOpenQASM3.g:774:4: () ruleDecimalIntegerLiteral
                    {
                    // InternalOpenQASM3.g:774:4: ()
                    // InternalOpenQASM3.g:775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getLiteralAccess().getDecimalIntegerLiteralParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleDecimalIntegerLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalOpenQASM3.g:793:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalOpenQASM3.g:793:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalOpenQASM3.g:794:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalOpenQASM3.g:800:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_l1_0_0= ruleLiteral ) ) ruleMultiplicativeOperator ( (lv_l1_2_0= ruleLiteral ) ) ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_l1_0_0 = null;

        EObject lv_l1_2_0 = null;

        EObject lv_l1_4_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:806:2: ( ( ( (lv_l1_0_0= ruleLiteral ) ) ruleMultiplicativeOperator ( (lv_l1_2_0= ruleLiteral ) ) ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )* ) )
            // InternalOpenQASM3.g:807:2: ( ( (lv_l1_0_0= ruleLiteral ) ) ruleMultiplicativeOperator ( (lv_l1_2_0= ruleLiteral ) ) ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )* )
            {
            // InternalOpenQASM3.g:807:2: ( ( (lv_l1_0_0= ruleLiteral ) ) ruleMultiplicativeOperator ( (lv_l1_2_0= ruleLiteral ) ) ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )* )
            // InternalOpenQASM3.g:808:3: ( (lv_l1_0_0= ruleLiteral ) ) ruleMultiplicativeOperator ( (lv_l1_2_0= ruleLiteral ) ) ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )*
            {
            // InternalOpenQASM3.g:808:3: ( (lv_l1_0_0= ruleLiteral ) )
            // InternalOpenQASM3.g:809:4: (lv_l1_0_0= ruleLiteral )
            {
            // InternalOpenQASM3.g:809:4: (lv_l1_0_0= ruleLiteral )
            // InternalOpenQASM3.g:810:5: lv_l1_0_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_l1_0_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            					}
            					add(
            						current,
            						"l1",
            						lv_l1_0_0,
            						"org.xtext.openqasm.OpenQASM3.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            ruleMultiplicativeOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalOpenQASM3.g:834:3: ( (lv_l1_2_0= ruleLiteral ) )
            // InternalOpenQASM3.g:835:4: (lv_l1_2_0= ruleLiteral )
            {
            // InternalOpenQASM3.g:835:4: (lv_l1_2_0= ruleLiteral )
            // InternalOpenQASM3.g:836:5: lv_l1_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_l1_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            					}
            					add(
            						current,
            						"l1",
            						lv_l1_2_0,
            						"org.xtext.openqasm.OpenQASM3.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenQASM3.g:853:3: ( ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ASTERISK && LA14_0<=RULE_SLASH)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOpenQASM3.g:854:4: ruleMultiplicativeOperator ( (lv_l1_4_0= ruleLiteral ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_3_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleMultiplicativeOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalOpenQASM3.g:861:4: ( (lv_l1_4_0= ruleLiteral ) )
            	    // InternalOpenQASM3.g:862:5: (lv_l1_4_0= ruleLiteral )
            	    {
            	    // InternalOpenQASM3.g:862:5: (lv_l1_4_0= ruleLiteral )
            	    // InternalOpenQASM3.g:863:6: lv_l1_4_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_l1_4_0=ruleLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"l1",
            	    							lv_l1_4_0,
            	    							"org.xtext.openqasm.OpenQASM3.Literal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalOpenQASM3.g:885:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalOpenQASM3.g:885:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalOpenQASM3.g:886:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;

             current =iv_ruleMultiplicativeOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalOpenQASM3.g:892:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ASTERISK_0= RULE_ASTERISK | this_SLASH_1= RULE_SLASH ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ASTERISK_0=null;
        Token this_SLASH_1=null;


        	enterRule();

        try {
            // InternalOpenQASM3.g:898:2: ( (this_ASTERISK_0= RULE_ASTERISK | this_SLASH_1= RULE_SLASH ) )
            // InternalOpenQASM3.g:899:2: (this_ASTERISK_0= RULE_ASTERISK | this_SLASH_1= RULE_SLASH )
            {
            // InternalOpenQASM3.g:899:2: (this_ASTERISK_0= RULE_ASTERISK | this_SLASH_1= RULE_SLASH )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ASTERISK) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_SLASH) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOpenQASM3.g:900:3: this_ASTERISK_0= RULE_ASTERISK
                    {
                    this_ASTERISK_0=(Token)match(input,RULE_ASTERISK,FOLLOW_2); 

                    			current.merge(this_ASTERISK_0);
                    		

                    			newLeafNode(this_ASTERISK_0, grammarAccess.getMultiplicativeOperatorAccess().getASTERISKTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:908:3: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_2); 

                    			current.merge(this_SLASH_1);
                    		

                    			newLeafNode(this_SLASH_1, grammarAccess.getMultiplicativeOperatorAccess().getSLASHTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalOpenQASM3.g:919:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalOpenQASM3.g:919:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalOpenQASM3.g:920:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalOpenQASM3.g:926:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) ) ( (lv_l_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_l_1_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:932:2: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) ( (lv_l_1_0= ruleLiteral ) ) ) )
            // InternalOpenQASM3.g:933:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) ( (lv_l_1_0= ruleLiteral ) ) )
            {
            // InternalOpenQASM3.g:933:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) ( (lv_l_1_0= ruleLiteral ) ) )
            // InternalOpenQASM3.g:934:3: ( (lv_op_0_0= ruleUnaryOperator ) ) ( (lv_l_1_0= ruleLiteral ) )
            {
            // InternalOpenQASM3.g:934:3: ( (lv_op_0_0= ruleUnaryOperator ) )
            // InternalOpenQASM3.g:935:4: (lv_op_0_0= ruleUnaryOperator )
            {
            // InternalOpenQASM3.g:935:4: (lv_op_0_0= ruleUnaryOperator )
            // InternalOpenQASM3.g:936:5: lv_op_0_0= ruleUnaryOperator
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_op_0_0=ruleUnaryOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"org.xtext.openqasm.OpenQASM3.UnaryOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenQASM3.g:953:3: ( (lv_l_1_0= ruleLiteral ) )
            // InternalOpenQASM3.g:954:4: (lv_l_1_0= ruleLiteral )
            {
            // InternalOpenQASM3.g:954:4: (lv_l_1_0= ruleLiteral )
            // InternalOpenQASM3.g:955:5: lv_l_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_l_1_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"l",
            						lv_l_1_0,
            						"org.xtext.openqasm.OpenQASM3.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalOpenQASM3.g:976:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalOpenQASM3.g:976:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalOpenQASM3.g:977:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;

             current =iv_ruleUnaryOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalOpenQASM3.g:983:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TILDE_0= RULE_TILDE | this_EXCLAMATION_POINT_1= RULE_EXCLAMATION_POINT ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TILDE_0=null;
        Token this_EXCLAMATION_POINT_1=null;


        	enterRule();

        try {
            // InternalOpenQASM3.g:989:2: ( (this_TILDE_0= RULE_TILDE | this_EXCLAMATION_POINT_1= RULE_EXCLAMATION_POINT ) )
            // InternalOpenQASM3.g:990:2: (this_TILDE_0= RULE_TILDE | this_EXCLAMATION_POINT_1= RULE_EXCLAMATION_POINT )
            {
            // InternalOpenQASM3.g:990:2: (this_TILDE_0= RULE_TILDE | this_EXCLAMATION_POINT_1= RULE_EXCLAMATION_POINT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_TILDE) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_EXCLAMATION_POINT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOpenQASM3.g:991:3: this_TILDE_0= RULE_TILDE
                    {
                    this_TILDE_0=(Token)match(input,RULE_TILDE,FOLLOW_2); 

                    			current.merge(this_TILDE_0);
                    		

                    			newLeafNode(this_TILDE_0, grammarAccess.getUnaryOperatorAccess().getTILDETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:999:3: this_EXCLAMATION_POINT_1= RULE_EXCLAMATION_POINT
                    {
                    this_EXCLAMATION_POINT_1=(Token)match(input,RULE_EXCLAMATION_POINT,FOLLOW_2); 

                    			current.merge(this_EXCLAMATION_POINT_1);
                    		

                    			newLeafNode(this_EXCLAMATION_POINT_1, grammarAccess.getUnaryOperatorAccess().getEXCLAMATION_POINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleIndexOperator"
    // InternalOpenQASM3.g:1010:1: entryRuleIndexOperator returns [EObject current=null] : iv_ruleIndexOperator= ruleIndexOperator EOF ;
    public final EObject entryRuleIndexOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexOperator = null;


        try {
            // InternalOpenQASM3.g:1010:54: (iv_ruleIndexOperator= ruleIndexOperator EOF )
            // InternalOpenQASM3.g:1011:2: iv_ruleIndexOperator= ruleIndexOperator EOF
            {
             newCompositeNode(grammarAccess.getIndexOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexOperator=ruleIndexOperator();

            state._fsp--;

             current =iv_ruleIndexOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexOperator"


    // $ANTLR start "ruleIndexOperator"
    // InternalOpenQASM3.g:1017:1: ruleIndexOperator returns [EObject current=null] : (this_LBRACKET_0= RULE_LBRACKET (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? ) this_RBRACKET_5= RULE_RBRACKET ) ;
    public final EObject ruleIndexOperator() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_COMMA_2=null;
        Token this_COMMA_4=null;
        Token this_RBRACKET_5=null;
        EObject this_Expression_1 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1023:2: ( (this_LBRACKET_0= RULE_LBRACKET (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? ) this_RBRACKET_5= RULE_RBRACKET ) )
            // InternalOpenQASM3.g:1024:2: (this_LBRACKET_0= RULE_LBRACKET (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? ) this_RBRACKET_5= RULE_RBRACKET )
            {
            // InternalOpenQASM3.g:1024:2: (this_LBRACKET_0= RULE_LBRACKET (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? ) this_RBRACKET_5= RULE_RBRACKET )
            // InternalOpenQASM3.g:1025:3: this_LBRACKET_0= RULE_LBRACKET (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? ) this_RBRACKET_5= RULE_RBRACKET
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_12); 

            			newLeafNode(this_LBRACKET_0, grammarAccess.getIndexOperatorAccess().getLBRACKETTerminalRuleCall_0());
            		
            // InternalOpenQASM3.g:1029:3: (this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )? )
            // InternalOpenQASM3.g:1030:4: this_Expression_1= ruleExpression (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )* (this_COMMA_4= RULE_COMMA )?
            {

            				newCompositeNode(grammarAccess.getIndexOperatorAccess().getExpressionParserRuleCall_1_0());
            			
            pushFollow(FOLLOW_19);
            this_Expression_1=ruleExpression();

            state._fsp--;


            				current = this_Expression_1;
            				afterParserOrEnumRuleCall();
            			
            // InternalOpenQASM3.g:1038:4: (this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_LPAREN||LA17_1==RULE_STRING||(LA17_1>=RULE_TILDE && LA17_1<=RULE_EXCLAMATION_POINT)||(LA17_1>=RULE_MINUS && LA17_1<=RULE_INT)||LA17_1==40) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalOpenQASM3.g:1039:5: this_COMMA_2= RULE_COMMA ( (lv_e_3_0= ruleExpression ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            	    					newLeafNode(this_COMMA_2, grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_1_0());
            	    				
            	    // InternalOpenQASM3.g:1043:5: ( (lv_e_3_0= ruleExpression ) )
            	    // InternalOpenQASM3.g:1044:6: (lv_e_3_0= ruleExpression )
            	    {
            	    // InternalOpenQASM3.g:1044:6: (lv_e_3_0= ruleExpression )
            	    // InternalOpenQASM3.g:1045:7: lv_e_3_0= ruleExpression
            	    {

            	    							newCompositeNode(grammarAccess.getIndexOperatorAccess().getEExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_e_3_0=ruleExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIndexOperatorRule());
            	    							}
            	    							add(
            	    								current,
            	    								"e",
            	    								lv_e_3_0,
            	    								"org.xtext.openqasm.OpenQASM3.Expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalOpenQASM3.g:1063:4: (this_COMMA_4= RULE_COMMA )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOpenQASM3.g:1064:5: this_COMMA_4= RULE_COMMA
                    {
                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_20); 

                    					newLeafNode(this_COMMA_4, grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_2());
                    				

                    }
                    break;

            }


            }

            this_RBRACKET_5=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_5, grammarAccess.getIndexOperatorAccess().getRBRACKETTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexOperator"


    // $ANTLR start "entryRuleIndexedIdentifier"
    // InternalOpenQASM3.g:1078:1: entryRuleIndexedIdentifier returns [EObject current=null] : iv_ruleIndexedIdentifier= ruleIndexedIdentifier EOF ;
    public final EObject entryRuleIndexedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedIdentifier = null;


        try {
            // InternalOpenQASM3.g:1078:58: (iv_ruleIndexedIdentifier= ruleIndexedIdentifier EOF )
            // InternalOpenQASM3.g:1079:2: iv_ruleIndexedIdentifier= ruleIndexedIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIndexedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexedIdentifier=ruleIndexedIdentifier();

            state._fsp--;

             current =iv_ruleIndexedIdentifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedIdentifier"


    // $ANTLR start "ruleIndexedIdentifier"
    // InternalOpenQASM3.g:1085:1: ruleIndexedIdentifier returns [EObject current=null] : ( ( (lv_gateName_0_0= RULE_ID ) ) ( (lv_io_1_0= ruleIndexOperator ) )* ) ;
    public final EObject ruleIndexedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_gateName_0_0=null;
        EObject lv_io_1_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1091:2: ( ( ( (lv_gateName_0_0= RULE_ID ) ) ( (lv_io_1_0= ruleIndexOperator ) )* ) )
            // InternalOpenQASM3.g:1092:2: ( ( (lv_gateName_0_0= RULE_ID ) ) ( (lv_io_1_0= ruleIndexOperator ) )* )
            {
            // InternalOpenQASM3.g:1092:2: ( ( (lv_gateName_0_0= RULE_ID ) ) ( (lv_io_1_0= ruleIndexOperator ) )* )
            // InternalOpenQASM3.g:1093:3: ( (lv_gateName_0_0= RULE_ID ) ) ( (lv_io_1_0= ruleIndexOperator ) )*
            {
            // InternalOpenQASM3.g:1093:3: ( (lv_gateName_0_0= RULE_ID ) )
            // InternalOpenQASM3.g:1094:4: (lv_gateName_0_0= RULE_ID )
            {
            // InternalOpenQASM3.g:1094:4: (lv_gateName_0_0= RULE_ID )
            // InternalOpenQASM3.g:1095:5: lv_gateName_0_0= RULE_ID
            {
            lv_gateName_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_gateName_0_0, grammarAccess.getIndexedIdentifierAccess().getGateNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gateName",
            						lv_gateName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOpenQASM3.g:1111:3: ( (lv_io_1_0= ruleIndexOperator ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_LBRACKET) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOpenQASM3.g:1112:4: (lv_io_1_0= ruleIndexOperator )
            	    {
            	    // InternalOpenQASM3.g:1112:4: (lv_io_1_0= ruleIndexOperator )
            	    // InternalOpenQASM3.g:1113:5: lv_io_1_0= ruleIndexOperator
            	    {

            	    					newCompositeNode(grammarAccess.getIndexedIdentifierAccess().getIoIndexOperatorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_io_1_0=ruleIndexOperator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIndexedIdentifierRule());
            	    					}
            	    					add(
            	    						current,
            	    						"io",
            	    						lv_io_1_0,
            	    						"org.xtext.openqasm.OpenQASM3.IndexOperator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedIdentifier"


    // $ANTLR start "entryRuleGateOperand"
    // InternalOpenQASM3.g:1134:1: entryRuleGateOperand returns [EObject current=null] : iv_ruleGateOperand= ruleGateOperand EOF ;
    public final EObject entryRuleGateOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateOperand = null;


        try {
            // InternalOpenQASM3.g:1134:52: (iv_ruleGateOperand= ruleGateOperand EOF )
            // InternalOpenQASM3.g:1135:2: iv_ruleGateOperand= ruleGateOperand EOF
            {
             newCompositeNode(grammarAccess.getGateOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateOperand=ruleGateOperand();

            state._fsp--;

             current =iv_ruleGateOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateOperand"


    // $ANTLR start "ruleGateOperand"
    // InternalOpenQASM3.g:1141:1: ruleGateOperand returns [EObject current=null] : this_IndexedIdentifier_0= ruleIndexedIdentifier ;
    public final EObject ruleGateOperand() throws RecognitionException {
        EObject current = null;

        EObject this_IndexedIdentifier_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1147:2: (this_IndexedIdentifier_0= ruleIndexedIdentifier )
            // InternalOpenQASM3.g:1148:2: this_IndexedIdentifier_0= ruleIndexedIdentifier
            {

            		newCompositeNode(grammarAccess.getGateOperandAccess().getIndexedIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IndexedIdentifier_0=ruleIndexedIdentifier();

            state._fsp--;


            		current = this_IndexedIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateOperand"


    // $ANTLR start "entryRuleGateOperandList"
    // InternalOpenQASM3.g:1159:1: entryRuleGateOperandList returns [EObject current=null] : iv_ruleGateOperandList= ruleGateOperandList EOF ;
    public final EObject entryRuleGateOperandList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateOperandList = null;


        try {
            // InternalOpenQASM3.g:1159:56: (iv_ruleGateOperandList= ruleGateOperandList EOF )
            // InternalOpenQASM3.g:1160:2: iv_ruleGateOperandList= ruleGateOperandList EOF
            {
             newCompositeNode(grammarAccess.getGateOperandListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateOperandList=ruleGateOperandList();

            state._fsp--;

             current =iv_ruleGateOperandList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateOperandList"


    // $ANTLR start "ruleGateOperandList"
    // InternalOpenQASM3.g:1166:1: ruleGateOperandList returns [EObject current=null] : (this_GateOperand_0= ruleGateOperand (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleGateOperandList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject this_GateOperand_0 = null;

        EObject lv_extraGO_2_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1172:2: ( (this_GateOperand_0= ruleGateOperand (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // InternalOpenQASM3.g:1173:2: (this_GateOperand_0= ruleGateOperand (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // InternalOpenQASM3.g:1173:2: (this_GateOperand_0= ruleGateOperand (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // InternalOpenQASM3.g:1174:3: this_GateOperand_0= ruleGateOperand (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )* (this_COMMA_3= RULE_COMMA )?
            {

            			newCompositeNode(grammarAccess.getGateOperandListAccess().getGateOperandParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_GateOperand_0=ruleGateOperand();

            state._fsp--;


            			current = this_GateOperand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOpenQASM3.g:1182:3: (this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalOpenQASM3.g:1183:4: this_COMMA_1= RULE_COMMA ( (lv_extraGO_2_0= ruleGateOperand ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            	    				newLeafNode(this_COMMA_1, grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_1_0());
            	    			
            	    // InternalOpenQASM3.g:1187:4: ( (lv_extraGO_2_0= ruleGateOperand ) )
            	    // InternalOpenQASM3.g:1188:5: (lv_extraGO_2_0= ruleGateOperand )
            	    {
            	    // InternalOpenQASM3.g:1188:5: (lv_extraGO_2_0= ruleGateOperand )
            	    // InternalOpenQASM3.g:1189:6: lv_extraGO_2_0= ruleGateOperand
            	    {

            	    						newCompositeNode(grammarAccess.getGateOperandListAccess().getExtraGOGateOperandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_extraGO_2_0=ruleGateOperand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGateOperandListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"extraGO",
            	    							lv_extraGO_2_0,
            	    							"org.xtext.openqasm.OpenQASM3.GateOperand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalOpenQASM3.g:1207:3: (this_COMMA_3= RULE_COMMA )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_COMMA) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOpenQASM3.g:1208:4: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_3, grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateOperandList"


    // $ANTLR start "entryRuleQubitType"
    // InternalOpenQASM3.g:1217:1: entryRuleQubitType returns [EObject current=null] : iv_ruleQubitType= ruleQubitType EOF ;
    public final EObject entryRuleQubitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQubitType = null;


        try {
            // InternalOpenQASM3.g:1217:50: (iv_ruleQubitType= ruleQubitType EOF )
            // InternalOpenQASM3.g:1218:2: iv_ruleQubitType= ruleQubitType EOF
            {
             newCompositeNode(grammarAccess.getQubitTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQubitType=ruleQubitType();

            state._fsp--;

             current =iv_ruleQubitType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQubitType"


    // $ANTLR start "ruleQubitType"
    // InternalOpenQASM3.g:1224:1: ruleQubitType returns [EObject current=null] : (this_QUBIT_0= RULE_QUBIT ( (lv_d_1_0= ruleDesignator ) ) ) ;
    public final EObject ruleQubitType() throws RecognitionException {
        EObject current = null;

        Token this_QUBIT_0=null;
        EObject lv_d_1_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1230:2: ( (this_QUBIT_0= RULE_QUBIT ( (lv_d_1_0= ruleDesignator ) ) ) )
            // InternalOpenQASM3.g:1231:2: (this_QUBIT_0= RULE_QUBIT ( (lv_d_1_0= ruleDesignator ) ) )
            {
            // InternalOpenQASM3.g:1231:2: (this_QUBIT_0= RULE_QUBIT ( (lv_d_1_0= ruleDesignator ) ) )
            // InternalOpenQASM3.g:1232:3: this_QUBIT_0= RULE_QUBIT ( (lv_d_1_0= ruleDesignator ) )
            {
            this_QUBIT_0=(Token)match(input,RULE_QUBIT,FOLLOW_22); 

            			newLeafNode(this_QUBIT_0, grammarAccess.getQubitTypeAccess().getQUBITTerminalRuleCall_0());
            		
            // InternalOpenQASM3.g:1236:3: ( (lv_d_1_0= ruleDesignator ) )
            // InternalOpenQASM3.g:1237:4: (lv_d_1_0= ruleDesignator )
            {
            // InternalOpenQASM3.g:1237:4: (lv_d_1_0= ruleDesignator )
            // InternalOpenQASM3.g:1238:5: lv_d_1_0= ruleDesignator
            {

            					newCompositeNode(grammarAccess.getQubitTypeAccess().getDDesignatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_d_1_0=ruleDesignator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQubitTypeRule());
            					}
            					set(
            						current,
            						"d",
            						lv_d_1_0,
            						"org.xtext.openqasm.OpenQASM3.Designator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQubitType"


    // $ANTLR start "entryRuleDesignator"
    // InternalOpenQASM3.g:1259:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // InternalOpenQASM3.g:1259:51: (iv_ruleDesignator= ruleDesignator EOF )
            // InternalOpenQASM3.g:1260:2: iv_ruleDesignator= ruleDesignator EOF
            {
             newCompositeNode(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;

             current =iv_ruleDesignator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // InternalOpenQASM3.g:1266:1: ruleDesignator returns [EObject current=null] : ( () this_LBRACKET_1= RULE_LBRACKET ( (lv_e_2_0= ruleExpression ) )? this_RBRACKET_3= RULE_RBRACKET ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_1=null;
        Token this_RBRACKET_3=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1272:2: ( ( () this_LBRACKET_1= RULE_LBRACKET ( (lv_e_2_0= ruleExpression ) )? this_RBRACKET_3= RULE_RBRACKET ) )
            // InternalOpenQASM3.g:1273:2: ( () this_LBRACKET_1= RULE_LBRACKET ( (lv_e_2_0= ruleExpression ) )? this_RBRACKET_3= RULE_RBRACKET )
            {
            // InternalOpenQASM3.g:1273:2: ( () this_LBRACKET_1= RULE_LBRACKET ( (lv_e_2_0= ruleExpression ) )? this_RBRACKET_3= RULE_RBRACKET )
            // InternalOpenQASM3.g:1274:3: () this_LBRACKET_1= RULE_LBRACKET ( (lv_e_2_0= ruleExpression ) )? this_RBRACKET_3= RULE_RBRACKET
            {
            // InternalOpenQASM3.g:1274:3: ()
            // InternalOpenQASM3.g:1275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDesignatorAccess().getDesignatorAction_0(),
            					current);
            			

            }

            this_LBRACKET_1=(Token)match(input,RULE_LBRACKET,FOLLOW_23); 

            			newLeafNode(this_LBRACKET_1, grammarAccess.getDesignatorAccess().getLBRACKETTerminalRuleCall_1());
            		
            // InternalOpenQASM3.g:1285:3: ( (lv_e_2_0= ruleExpression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LPAREN||LA22_0==RULE_STRING||(LA22_0>=RULE_TILDE && LA22_0<=RULE_EXCLAMATION_POINT)||(LA22_0>=RULE_MINUS && LA22_0<=RULE_INT)||LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOpenQASM3.g:1286:4: (lv_e_2_0= ruleExpression )
                    {
                    // InternalOpenQASM3.g:1286:4: (lv_e_2_0= ruleExpression )
                    // InternalOpenQASM3.g:1287:5: lv_e_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getDesignatorAccess().getEExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_e_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDesignatorRule());
                    					}
                    					set(
                    						current,
                    						"e",
                    						lv_e_2_0,
                    						"org.xtext.openqasm.OpenQASM3.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_RBRACKET_3=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_3, grammarAccess.getDesignatorAccess().getRBRACKETTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalOpenQASM3.g:1312:1: entryRuleFloatLiteral returns [String current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final String entryRuleFloatLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatLiteral = null;


        try {
            // InternalOpenQASM3.g:1312:52: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalOpenQASM3.g:1313:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
             newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;

             current =iv_ruleFloatLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalOpenQASM3.g:1319:1: ruleFloatLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? ) | kw= 'pi' ) ;
    public final AntlrDatatypeRuleToken ruleFloatLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token kw=null;
        Token this_DOT_5=null;
        AntlrDatatypeRuleToken this_DecimalIntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_DecimalIntegerLiteral_2 = null;

        AntlrDatatypeRuleToken this_DecimalIntegerLiteral_4 = null;

        AntlrDatatypeRuleToken this_DecimalIntegerLiteral_6 = null;



        	enterRule();

        try {
            // InternalOpenQASM3.g:1325:2: ( ( (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? ) | kw= 'pi' ) )
            // InternalOpenQASM3.g:1326:2: ( (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? ) | kw= 'pi' )
            {
            // InternalOpenQASM3.g:1326:2: ( (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? ) | kw= 'pi' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_MINUS && LA26_0<=RULE_INT)) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOpenQASM3.g:1327:3: (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? )
                    {
                    // InternalOpenQASM3.g:1327:3: (this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )? )
                    // InternalOpenQASM3.g:1328:4: this_DecimalIntegerLiteral_0= ruleDecimalIntegerLiteral this_DOT_1= RULE_DOT (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )? (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )?
                    {

                    				newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_24);
                    this_DecimalIntegerLiteral_0=ruleDecimalIntegerLiteral();

                    state._fsp--;


                    				current.merge(this_DecimalIntegerLiteral_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_25); 

                    				current.merge(this_DOT_1);
                    			

                    				newLeafNode(this_DOT_1, grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_1());
                    			
                    // InternalOpenQASM3.g:1345:4: (this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_MINUS && LA23_0<=RULE_INT)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalOpenQASM3.g:1346:5: this_DecimalIntegerLiteral_2= ruleDecimalIntegerLiteral
                            {

                            					newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_2());
                            				
                            pushFollow(FOLLOW_26);
                            this_DecimalIntegerLiteral_2=ruleDecimalIntegerLiteral();

                            state._fsp--;


                            					current.merge(this_DecimalIntegerLiteral_2);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalOpenQASM3.g:1357:4: (kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )? )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==39) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalOpenQASM3.g:1358:5: kw= 'e' this_DecimalIntegerLiteral_4= ruleDecimalIntegerLiteral (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )?
                            {
                            kw=(Token)match(input,39,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFloatLiteralAccess().getEKeyword_0_3_0());
                            				

                            					newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_1());
                            				
                            pushFollow(FOLLOW_28);
                            this_DecimalIntegerLiteral_4=ruleDecimalIntegerLiteral();

                            state._fsp--;


                            					current.merge(this_DecimalIntegerLiteral_4);
                            				

                            					afterParserOrEnumRuleCall();
                            				
                            // InternalOpenQASM3.g:1373:5: (this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==RULE_DOT) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalOpenQASM3.g:1374:6: this_DOT_5= RULE_DOT this_DecimalIntegerLiteral_6= ruleDecimalIntegerLiteral
                                    {
                                    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_27); 

                                    						current.merge(this_DOT_5);
                                    					

                                    						newLeafNode(this_DOT_5, grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_3_2_0());
                                    					

                                    						newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_2_1());
                                    					
                                    pushFollow(FOLLOW_2);
                                    this_DecimalIntegerLiteral_6=ruleDecimalIntegerLiteral();

                                    state._fsp--;


                                    						current.merge(this_DecimalIntegerLiteral_6);
                                    					

                                    						afterParserOrEnumRuleCall();
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:1395:3: kw= 'pi'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFloatLiteralAccess().getPiKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleDecimalIntegerLiteral"
    // InternalOpenQASM3.g:1404:1: entryRuleDecimalIntegerLiteral returns [String current=null] : iv_ruleDecimalIntegerLiteral= ruleDecimalIntegerLiteral EOF ;
    public final String entryRuleDecimalIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalIntegerLiteral = null;


        try {
            // InternalOpenQASM3.g:1404:61: (iv_ruleDecimalIntegerLiteral= ruleDecimalIntegerLiteral EOF )
            // InternalOpenQASM3.g:1405:2: iv_ruleDecimalIntegerLiteral= ruleDecimalIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getDecimalIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimalIntegerLiteral=ruleDecimalIntegerLiteral();

            state._fsp--;

             current =iv_ruleDecimalIntegerLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalIntegerLiteral"


    // $ANTLR start "ruleDecimalIntegerLiteral"
    // InternalOpenQASM3.g:1411:1: ruleDecimalIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MINUS_0= RULE_MINUS )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MINUS_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOpenQASM3.g:1417:2: ( ( (this_MINUS_0= RULE_MINUS )? this_INT_1= RULE_INT ) )
            // InternalOpenQASM3.g:1418:2: ( (this_MINUS_0= RULE_MINUS )? this_INT_1= RULE_INT )
            {
            // InternalOpenQASM3.g:1418:2: ( (this_MINUS_0= RULE_MINUS )? this_INT_1= RULE_INT )
            // InternalOpenQASM3.g:1419:3: (this_MINUS_0= RULE_MINUS )? this_INT_1= RULE_INT
            {
            // InternalOpenQASM3.g:1419:3: (this_MINUS_0= RULE_MINUS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_MINUS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOpenQASM3.g:1420:4: this_MINUS_0= RULE_MINUS
                    {
                    this_MINUS_0=(Token)match(input,RULE_MINUS,FOLLOW_29); 

                    				current.merge(this_MINUS_0);
                    			

                    				newLeafNode(this_MINUS_0, grammarAccess.getDecimalIntegerLiteralAccess().getMINUSTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDecimalIntegerLiteralAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalIntegerLiteral"


    // $ANTLR start "entryRuleIncludeStatement"
    // InternalOpenQASM3.g:1439:1: entryRuleIncludeStatement returns [EObject current=null] : iv_ruleIncludeStatement= ruleIncludeStatement EOF ;
    public final EObject entryRuleIncludeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStatement = null;


        try {
            // InternalOpenQASM3.g:1439:57: (iv_ruleIncludeStatement= ruleIncludeStatement EOF )
            // InternalOpenQASM3.g:1440:2: iv_ruleIncludeStatement= ruleIncludeStatement EOF
            {
             newCompositeNode(grammarAccess.getIncludeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludeStatement=ruleIncludeStatement();

            state._fsp--;

             current =iv_ruleIncludeStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeStatement"


    // $ANTLR start "ruleIncludeStatement"
    // InternalOpenQASM3.g:1446:1: ruleIncludeStatement returns [EObject current=null] : (otherlv_0= 'include' ( (lv_libName_1_0= RULE_STRING ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleIncludeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_libName_1_0=null;
        Token this_SEMICOLON_2=null;


        	enterRule();

        try {
            // InternalOpenQASM3.g:1452:2: ( (otherlv_0= 'include' ( (lv_libName_1_0= RULE_STRING ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:1453:2: (otherlv_0= 'include' ( (lv_libName_1_0= RULE_STRING ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:1453:2: (otherlv_0= 'include' ( (lv_libName_1_0= RULE_STRING ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalOpenQASM3.g:1454:3: otherlv_0= 'include' ( (lv_libName_1_0= RULE_STRING ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,41,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0());
            		
            // InternalOpenQASM3.g:1458:3: ( (lv_libName_1_0= RULE_STRING ) )
            // InternalOpenQASM3.g:1459:4: (lv_libName_1_0= RULE_STRING )
            {
            // InternalOpenQASM3.g:1459:4: (lv_libName_1_0= RULE_STRING )
            // InternalOpenQASM3.g:1460:5: lv_libName_1_0= RULE_STRING
            {
            lv_libName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_libName_1_0, grammarAccess.getIncludeStatementAccess().getLibNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"libName",
            						lv_libName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getIncludeStatementAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeStatement"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\3\11\1\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11";
    static final String dfa_3s = "\1\6\1\uffff\1\25\3\7\1\uffff\1\7\2\uffff\1\25\1\7\1\24\1\25\1\7\1\24\1\25\1\7";
    static final String dfa_4s = "\1\50\1\uffff\1\25\1\23\2\21\1\uffff\1\47\2\uffff\1\25\1\47\2\25\1\23\2\25\1\21";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\3\1\uffff\1\4\1\2\10\uffff";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\5\2\uffff\2\6\4\uffff\1\2\1\3\22\uffff\1\4",
            "",
            "\1\3",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11\1\uffff\1\7",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11",
            "",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11\2\uffff\1\12\1\13\21\uffff\1\14",
            "",
            "",
            "\1\13",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11\25\uffff\1\14",
            "\1\15\1\16",
            "\1\16",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11\1\uffff\1\17",
            "\1\20\1\21",
            "\1\21",
            "\1\11\2\uffff\1\11\1\uffff\2\10\3\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "630:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_exprs_1_0= ruleExpression ) ) this_RPAREN_2= RULE_RPAREN ) | ( (lv_ltrs_3_0= ruleLiteral ) ) | ( (lv_unExpressions_4_0= ruleUnaryExpression ) ) | ( (lv_multExpressions_5_0= ruleMultiplicativeExpression ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000026000040022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000300000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001000030C8C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001000030C840L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000026000040120L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000026000040220L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000300800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001000032C840L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000300002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000800L});

}
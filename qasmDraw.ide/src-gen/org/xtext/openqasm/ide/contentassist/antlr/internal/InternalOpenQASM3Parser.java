package org.xtext.openqasm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.openqasm.services.OpenQASM3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenQASM3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_ASTERISK", "RULE_SLASH", "RULE_TILDE", "RULE_EXCLAMATION_POINT", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_COMMA", "RULE_STRING", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_QUBIT", "RULE_DOT", "RULE_MINUS", "RULE_INT", "RULE_ID", "RULE_ELSE", "RULE_PERCENT", "RULE_BIT", "RULE_FLOAT", "RULE_ANGLE", "RULE_BOOL", "RULE_DURATION", "RULE_STRETCH", "RULE_COMPLEX", "RULE_ARRAY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pi'", "'OPENQASM'", "'gate'", "'if'", "'e'", "'include'"
    };
    public static final int RULE_LBRACKET=15;
    public static final int RULE_DURATION=28;
    public static final int RULE_STRING=14;
    public static final int RULE_ANGLE=26;
    public static final int RULE_ARRAY=31;
    public static final int RULE_LPAREN=9;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_BIT=24;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_COMPLEX=30;
    public static final int T__39=39;
    public static final int RULE_QUBIT=17;
    public static final int T__36=36;
    public static final int RULE_PERCENT=23;
    public static final int RULE_DOT=18;
    public static final int EOF=-1;
    public static final int RULE_EXCLAMATION_POINT=8;
    public static final int RULE_LBRACE=11;
    public static final int RULE_ID=21;
    public static final int RULE_COMMA=13;
    public static final int RULE_WS=34;
    public static final int RULE_STRETCH=29;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_BOOL=27;
    public static final int RULE_SLASH=6;
    public static final int RULE_RBRACE=12;
    public static final int RULE_MINUS=19;
    public static final int RULE_ASTERISK=5;
    public static final int RULE_TILDE=7;
    public static final int RULE_RPAREN=10;
    public static final int RULE_INT=20;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_FLOAT=25;
    public static final int RULE_SEMICOLON=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_ELSE=22;
    public static final int RULE_RBRACKET=16;

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

    	public void setGrammarAccess(OpenQASM3GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalOpenQASM3.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:54:1: ( ruleProgram EOF )
            // InternalOpenQASM3.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalOpenQASM3.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalOpenQASM3.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalOpenQASM3.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalOpenQASM3.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalOpenQASM3.g:69:3: ( rule__Program__Group__0 )
            // InternalOpenQASM3.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleVersion"
    // InternalOpenQASM3.g:78:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:79:1: ( ruleVersion EOF )
            // InternalOpenQASM3.g:80:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalOpenQASM3.g:87:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:91:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalOpenQASM3.g:92:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalOpenQASM3.g:92:2: ( ( rule__Version__Group__0 ) )
            // InternalOpenQASM3.g:93:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalOpenQASM3.g:94:3: ( rule__Version__Group__0 )
            // InternalOpenQASM3.g:94:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleStatement"
    // InternalOpenQASM3.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:104:1: ( ruleStatement EOF )
            // InternalOpenQASM3.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOpenQASM3.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalOpenQASM3.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalOpenQASM3.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalOpenQASM3.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalOpenQASM3.g:119:3: ( rule__Statement__Alternatives )
            // InternalOpenQASM3.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulequantumDeclarationStatement"
    // InternalOpenQASM3.g:128:1: entryRulequantumDeclarationStatement : rulequantumDeclarationStatement EOF ;
    public final void entryRulequantumDeclarationStatement() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:129:1: ( rulequantumDeclarationStatement EOF )
            // InternalOpenQASM3.g:130:1: rulequantumDeclarationStatement EOF
            {
             before(grammarAccess.getQuantumDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            rulequantumDeclarationStatement();

            state._fsp--;

             after(grammarAccess.getQuantumDeclarationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulequantumDeclarationStatement"


    // $ANTLR start "rulequantumDeclarationStatement"
    // InternalOpenQASM3.g:137:1: rulequantumDeclarationStatement : ( ( rule__QuantumDeclarationStatement__Group__0 ) ) ;
    public final void rulequantumDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:141:2: ( ( ( rule__QuantumDeclarationStatement__Group__0 ) ) )
            // InternalOpenQASM3.g:142:2: ( ( rule__QuantumDeclarationStatement__Group__0 ) )
            {
            // InternalOpenQASM3.g:142:2: ( ( rule__QuantumDeclarationStatement__Group__0 ) )
            // InternalOpenQASM3.g:143:3: ( rule__QuantumDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getQuantumDeclarationStatementAccess().getGroup()); 
            // InternalOpenQASM3.g:144:3: ( rule__QuantumDeclarationStatement__Group__0 )
            // InternalOpenQASM3.g:144:4: rule__QuantumDeclarationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumDeclarationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumDeclarationStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulequantumDeclarationStatement"


    // $ANTLR start "entryRuleGateCallStatement"
    // InternalOpenQASM3.g:153:1: entryRuleGateCallStatement : ruleGateCallStatement EOF ;
    public final void entryRuleGateCallStatement() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:154:1: ( ruleGateCallStatement EOF )
            // InternalOpenQASM3.g:155:1: ruleGateCallStatement EOF
            {
             before(grammarAccess.getGateCallStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleGateCallStatement();

            state._fsp--;

             after(grammarAccess.getGateCallStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGateCallStatement"


    // $ANTLR start "ruleGateCallStatement"
    // InternalOpenQASM3.g:162:1: ruleGateCallStatement : ( ( rule__GateCallStatement__Group__0 ) ) ;
    public final void ruleGateCallStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:166:2: ( ( ( rule__GateCallStatement__Group__0 ) ) )
            // InternalOpenQASM3.g:167:2: ( ( rule__GateCallStatement__Group__0 ) )
            {
            // InternalOpenQASM3.g:167:2: ( ( rule__GateCallStatement__Group__0 ) )
            // InternalOpenQASM3.g:168:3: ( rule__GateCallStatement__Group__0 )
            {
             before(grammarAccess.getGateCallStatementAccess().getGroup()); 
            // InternalOpenQASM3.g:169:3: ( rule__GateCallStatement__Group__0 )
            // InternalOpenQASM3.g:169:4: rule__GateCallStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGateCallStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateCallStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalOpenQASM3.g:178:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:179:1: ( ruleIfStatement EOF )
            // InternalOpenQASM3.g:180:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalOpenQASM3.g:187:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:191:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalOpenQASM3.g:192:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalOpenQASM3.g:192:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalOpenQASM3.g:193:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalOpenQASM3.g:194:3: ( rule__IfStatement__Group__0 )
            // InternalOpenQASM3.g:194:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRulestatementOrScope"
    // InternalOpenQASM3.g:203:1: entryRulestatementOrScope : rulestatementOrScope EOF ;
    public final void entryRulestatementOrScope() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:204:1: ( rulestatementOrScope EOF )
            // InternalOpenQASM3.g:205:1: rulestatementOrScope EOF
            {
             before(grammarAccess.getStatementOrScopeRule()); 
            pushFollow(FOLLOW_1);
            rulestatementOrScope();

            state._fsp--;

             after(grammarAccess.getStatementOrScopeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatementOrScope"


    // $ANTLR start "rulestatementOrScope"
    // InternalOpenQASM3.g:212:1: rulestatementOrScope : ( ( rule__StatementOrScope__Alternatives ) ) ;
    public final void rulestatementOrScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:216:2: ( ( ( rule__StatementOrScope__Alternatives ) ) )
            // InternalOpenQASM3.g:217:2: ( ( rule__StatementOrScope__Alternatives ) )
            {
            // InternalOpenQASM3.g:217:2: ( ( rule__StatementOrScope__Alternatives ) )
            // InternalOpenQASM3.g:218:3: ( rule__StatementOrScope__Alternatives )
            {
             before(grammarAccess.getStatementOrScopeAccess().getAlternatives()); 
            // InternalOpenQASM3.g:219:3: ( rule__StatementOrScope__Alternatives )
            // InternalOpenQASM3.g:219:4: rule__StatementOrScope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatementOrScope__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementOrScopeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatementOrScope"


    // $ANTLR start "entryRuleScope"
    // InternalOpenQASM3.g:228:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:229:1: ( ruleScope EOF )
            // InternalOpenQASM3.g:230:1: ruleScope EOF
            {
             before(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getScopeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalOpenQASM3.g:237:1: ruleScope : ( ( rule__Scope__Group__0 ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:241:2: ( ( ( rule__Scope__Group__0 ) ) )
            // InternalOpenQASM3.g:242:2: ( ( rule__Scope__Group__0 ) )
            {
            // InternalOpenQASM3.g:242:2: ( ( rule__Scope__Group__0 ) )
            // InternalOpenQASM3.g:243:3: ( rule__Scope__Group__0 )
            {
             before(grammarAccess.getScopeAccess().getGroup()); 
            // InternalOpenQASM3.g:244:3: ( rule__Scope__Group__0 )
            // InternalOpenQASM3.g:244:4: rule__Scope__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleExpressionList"
    // InternalOpenQASM3.g:253:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:254:1: ( ruleExpressionList EOF )
            // InternalOpenQASM3.g:255:1: ruleExpressionList EOF
            {
             before(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getExpressionListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalOpenQASM3.g:262:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:266:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // InternalOpenQASM3.g:267:2: ( ( rule__ExpressionList__Group__0 ) )
            {
            // InternalOpenQASM3.g:267:2: ( ( rule__ExpressionList__Group__0 ) )
            // InternalOpenQASM3.g:268:3: ( rule__ExpressionList__Group__0 )
            {
             before(grammarAccess.getExpressionListAccess().getGroup()); 
            // InternalOpenQASM3.g:269:3: ( rule__ExpressionList__Group__0 )
            // InternalOpenQASM3.g:269:4: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExpression"
    // InternalOpenQASM3.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:279:1: ( ruleExpression EOF )
            // InternalOpenQASM3.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalOpenQASM3.g:287:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:291:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalOpenQASM3.g:292:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalOpenQASM3.g:292:2: ( ( rule__Expression__Alternatives ) )
            // InternalOpenQASM3.g:293:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalOpenQASM3.g:294:3: ( rule__Expression__Alternatives )
            // InternalOpenQASM3.g:294:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalOpenQASM3.g:303:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:304:1: ( ruleLiteral EOF )
            // InternalOpenQASM3.g:305:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalOpenQASM3.g:312:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:316:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalOpenQASM3.g:317:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalOpenQASM3.g:317:2: ( ( rule__Literal__Alternatives ) )
            // InternalOpenQASM3.g:318:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalOpenQASM3.g:319:3: ( rule__Literal__Alternatives )
            // InternalOpenQASM3.g:319:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalOpenQASM3.g:328:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:329:1: ( ruleMultiplicativeExpression EOF )
            // InternalOpenQASM3.g:330:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalOpenQASM3.g:337:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:341:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalOpenQASM3.g:342:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalOpenQASM3.g:342:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalOpenQASM3.g:343:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalOpenQASM3.g:344:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalOpenQASM3.g:344:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalOpenQASM3.g:353:1: entryRuleMultiplicativeOperator : ruleMultiplicativeOperator EOF ;
    public final void entryRuleMultiplicativeOperator() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:354:1: ( ruleMultiplicativeOperator EOF )
            // InternalOpenQASM3.g:355:1: ruleMultiplicativeOperator EOF
            {
             before(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalOpenQASM3.g:362:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:366:2: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalOpenQASM3.g:367:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalOpenQASM3.g:367:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalOpenQASM3.g:368:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalOpenQASM3.g:369:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalOpenQASM3.g:369:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalOpenQASM3.g:378:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:379:1: ( ruleUnaryExpression EOF )
            // InternalOpenQASM3.g:380:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalOpenQASM3.g:387:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:391:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalOpenQASM3.g:392:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalOpenQASM3.g:392:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalOpenQASM3.g:393:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalOpenQASM3.g:394:3: ( rule__UnaryExpression__Group__0 )
            // InternalOpenQASM3.g:394:4: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalOpenQASM3.g:403:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:404:1: ( ruleUnaryOperator EOF )
            // InternalOpenQASM3.g:405:1: ruleUnaryOperator EOF
            {
             before(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalOpenQASM3.g:412:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:416:2: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalOpenQASM3.g:417:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalOpenQASM3.g:417:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalOpenQASM3.g:418:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalOpenQASM3.g:419:3: ( rule__UnaryOperator__Alternatives )
            // InternalOpenQASM3.g:419:4: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleIndexOperator"
    // InternalOpenQASM3.g:428:1: entryRuleIndexOperator : ruleIndexOperator EOF ;
    public final void entryRuleIndexOperator() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:429:1: ( ruleIndexOperator EOF )
            // InternalOpenQASM3.g:430:1: ruleIndexOperator EOF
            {
             before(grammarAccess.getIndexOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexOperator();

            state._fsp--;

             after(grammarAccess.getIndexOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexOperator"


    // $ANTLR start "ruleIndexOperator"
    // InternalOpenQASM3.g:437:1: ruleIndexOperator : ( ( rule__IndexOperator__Group__0 ) ) ;
    public final void ruleIndexOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:441:2: ( ( ( rule__IndexOperator__Group__0 ) ) )
            // InternalOpenQASM3.g:442:2: ( ( rule__IndexOperator__Group__0 ) )
            {
            // InternalOpenQASM3.g:442:2: ( ( rule__IndexOperator__Group__0 ) )
            // InternalOpenQASM3.g:443:3: ( rule__IndexOperator__Group__0 )
            {
             before(grammarAccess.getIndexOperatorAccess().getGroup()); 
            // InternalOpenQASM3.g:444:3: ( rule__IndexOperator__Group__0 )
            // InternalOpenQASM3.g:444:4: rule__IndexOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexOperator"


    // $ANTLR start "entryRuleIndexedIdentifier"
    // InternalOpenQASM3.g:453:1: entryRuleIndexedIdentifier : ruleIndexedIdentifier EOF ;
    public final void entryRuleIndexedIdentifier() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:454:1: ( ruleIndexedIdentifier EOF )
            // InternalOpenQASM3.g:455:1: ruleIndexedIdentifier EOF
            {
             before(grammarAccess.getIndexedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexedIdentifier();

            state._fsp--;

             after(grammarAccess.getIndexedIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexedIdentifier"


    // $ANTLR start "ruleIndexedIdentifier"
    // InternalOpenQASM3.g:462:1: ruleIndexedIdentifier : ( ( rule__IndexedIdentifier__Group__0 ) ) ;
    public final void ruleIndexedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:466:2: ( ( ( rule__IndexedIdentifier__Group__0 ) ) )
            // InternalOpenQASM3.g:467:2: ( ( rule__IndexedIdentifier__Group__0 ) )
            {
            // InternalOpenQASM3.g:467:2: ( ( rule__IndexedIdentifier__Group__0 ) )
            // InternalOpenQASM3.g:468:3: ( rule__IndexedIdentifier__Group__0 )
            {
             before(grammarAccess.getIndexedIdentifierAccess().getGroup()); 
            // InternalOpenQASM3.g:469:3: ( rule__IndexedIdentifier__Group__0 )
            // InternalOpenQASM3.g:469:4: rule__IndexedIdentifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexedIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexedIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexedIdentifier"


    // $ANTLR start "entryRuleGateOperand"
    // InternalOpenQASM3.g:478:1: entryRuleGateOperand : ruleGateOperand EOF ;
    public final void entryRuleGateOperand() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:479:1: ( ruleGateOperand EOF )
            // InternalOpenQASM3.g:480:1: ruleGateOperand EOF
            {
             before(grammarAccess.getGateOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleGateOperand();

            state._fsp--;

             after(grammarAccess.getGateOperandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGateOperand"


    // $ANTLR start "ruleGateOperand"
    // InternalOpenQASM3.g:487:1: ruleGateOperand : ( ruleIndexedIdentifier ) ;
    public final void ruleGateOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:491:2: ( ( ruleIndexedIdentifier ) )
            // InternalOpenQASM3.g:492:2: ( ruleIndexedIdentifier )
            {
            // InternalOpenQASM3.g:492:2: ( ruleIndexedIdentifier )
            // InternalOpenQASM3.g:493:3: ruleIndexedIdentifier
            {
             before(grammarAccess.getGateOperandAccess().getIndexedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIndexedIdentifier();

            state._fsp--;

             after(grammarAccess.getGateOperandAccess().getIndexedIdentifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateOperand"


    // $ANTLR start "entryRuleGateOperandList"
    // InternalOpenQASM3.g:503:1: entryRuleGateOperandList : ruleGateOperandList EOF ;
    public final void entryRuleGateOperandList() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:504:1: ( ruleGateOperandList EOF )
            // InternalOpenQASM3.g:505:1: ruleGateOperandList EOF
            {
             before(grammarAccess.getGateOperandListRule()); 
            pushFollow(FOLLOW_1);
            ruleGateOperandList();

            state._fsp--;

             after(grammarAccess.getGateOperandListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGateOperandList"


    // $ANTLR start "ruleGateOperandList"
    // InternalOpenQASM3.g:512:1: ruleGateOperandList : ( ( rule__GateOperandList__Group__0 ) ) ;
    public final void ruleGateOperandList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:516:2: ( ( ( rule__GateOperandList__Group__0 ) ) )
            // InternalOpenQASM3.g:517:2: ( ( rule__GateOperandList__Group__0 ) )
            {
            // InternalOpenQASM3.g:517:2: ( ( rule__GateOperandList__Group__0 ) )
            // InternalOpenQASM3.g:518:3: ( rule__GateOperandList__Group__0 )
            {
             before(grammarAccess.getGateOperandListAccess().getGroup()); 
            // InternalOpenQASM3.g:519:3: ( rule__GateOperandList__Group__0 )
            // InternalOpenQASM3.g:519:4: rule__GateOperandList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGateOperandListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateOperandList"


    // $ANTLR start "entryRuleQubitType"
    // InternalOpenQASM3.g:528:1: entryRuleQubitType : ruleQubitType EOF ;
    public final void entryRuleQubitType() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:529:1: ( ruleQubitType EOF )
            // InternalOpenQASM3.g:530:1: ruleQubitType EOF
            {
             before(grammarAccess.getQubitTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleQubitType();

            state._fsp--;

             after(grammarAccess.getQubitTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQubitType"


    // $ANTLR start "ruleQubitType"
    // InternalOpenQASM3.g:537:1: ruleQubitType : ( ( rule__QubitType__Group__0 ) ) ;
    public final void ruleQubitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:541:2: ( ( ( rule__QubitType__Group__0 ) ) )
            // InternalOpenQASM3.g:542:2: ( ( rule__QubitType__Group__0 ) )
            {
            // InternalOpenQASM3.g:542:2: ( ( rule__QubitType__Group__0 ) )
            // InternalOpenQASM3.g:543:3: ( rule__QubitType__Group__0 )
            {
             before(grammarAccess.getQubitTypeAccess().getGroup()); 
            // InternalOpenQASM3.g:544:3: ( rule__QubitType__Group__0 )
            // InternalOpenQASM3.g:544:4: rule__QubitType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QubitType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQubitTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQubitType"


    // $ANTLR start "entryRuleDesignator"
    // InternalOpenQASM3.g:553:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:554:1: ( ruleDesignator EOF )
            // InternalOpenQASM3.g:555:1: ruleDesignator EOF
            {
             before(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_1);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getDesignatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // InternalOpenQASM3.g:562:1: ruleDesignator : ( ( rule__Designator__Group__0 ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:566:2: ( ( ( rule__Designator__Group__0 ) ) )
            // InternalOpenQASM3.g:567:2: ( ( rule__Designator__Group__0 ) )
            {
            // InternalOpenQASM3.g:567:2: ( ( rule__Designator__Group__0 ) )
            // InternalOpenQASM3.g:568:3: ( rule__Designator__Group__0 )
            {
             before(grammarAccess.getDesignatorAccess().getGroup()); 
            // InternalOpenQASM3.g:569:3: ( rule__Designator__Group__0 )
            // InternalOpenQASM3.g:569:4: rule__Designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalOpenQASM3.g:578:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:579:1: ( ruleFloatLiteral EOF )
            // InternalOpenQASM3.g:580:1: ruleFloatLiteral EOF
            {
             before(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatLiteral();

            state._fsp--;

             after(grammarAccess.getFloatLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalOpenQASM3.g:587:1: ruleFloatLiteral : ( ( rule__FloatLiteral__Alternatives ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:591:2: ( ( ( rule__FloatLiteral__Alternatives ) ) )
            // InternalOpenQASM3.g:592:2: ( ( rule__FloatLiteral__Alternatives ) )
            {
            // InternalOpenQASM3.g:592:2: ( ( rule__FloatLiteral__Alternatives ) )
            // InternalOpenQASM3.g:593:3: ( rule__FloatLiteral__Alternatives )
            {
             before(grammarAccess.getFloatLiteralAccess().getAlternatives()); 
            // InternalOpenQASM3.g:594:3: ( rule__FloatLiteral__Alternatives )
            // InternalOpenQASM3.g:594:4: rule__FloatLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleDecimalIntegerLiteral"
    // InternalOpenQASM3.g:603:1: entryRuleDecimalIntegerLiteral : ruleDecimalIntegerLiteral EOF ;
    public final void entryRuleDecimalIntegerLiteral() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:604:1: ( ruleDecimalIntegerLiteral EOF )
            // InternalOpenQASM3.g:605:1: ruleDecimalIntegerLiteral EOF
            {
             before(grammarAccess.getDecimalIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getDecimalIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalIntegerLiteral"


    // $ANTLR start "ruleDecimalIntegerLiteral"
    // InternalOpenQASM3.g:612:1: ruleDecimalIntegerLiteral : ( ( rule__DecimalIntegerLiteral__Group__0 ) ) ;
    public final void ruleDecimalIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:616:2: ( ( ( rule__DecimalIntegerLiteral__Group__0 ) ) )
            // InternalOpenQASM3.g:617:2: ( ( rule__DecimalIntegerLiteral__Group__0 ) )
            {
            // InternalOpenQASM3.g:617:2: ( ( rule__DecimalIntegerLiteral__Group__0 ) )
            // InternalOpenQASM3.g:618:3: ( rule__DecimalIntegerLiteral__Group__0 )
            {
             before(grammarAccess.getDecimalIntegerLiteralAccess().getGroup()); 
            // InternalOpenQASM3.g:619:3: ( rule__DecimalIntegerLiteral__Group__0 )
            // InternalOpenQASM3.g:619:4: rule__DecimalIntegerLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecimalIntegerLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalIntegerLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalIntegerLiteral"


    // $ANTLR start "entryRuleIncludeStatement"
    // InternalOpenQASM3.g:628:1: entryRuleIncludeStatement : ruleIncludeStatement EOF ;
    public final void entryRuleIncludeStatement() throws RecognitionException {
        try {
            // InternalOpenQASM3.g:629:1: ( ruleIncludeStatement EOF )
            // InternalOpenQASM3.g:630:1: ruleIncludeStatement EOF
            {
             before(grammarAccess.getIncludeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludeStatement();

            state._fsp--;

             after(grammarAccess.getIncludeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncludeStatement"


    // $ANTLR start "ruleIncludeStatement"
    // InternalOpenQASM3.g:637:1: ruleIncludeStatement : ( ( rule__IncludeStatement__Group__0 ) ) ;
    public final void ruleIncludeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:641:2: ( ( ( rule__IncludeStatement__Group__0 ) ) )
            // InternalOpenQASM3.g:642:2: ( ( rule__IncludeStatement__Group__0 ) )
            {
            // InternalOpenQASM3.g:642:2: ( ( rule__IncludeStatement__Group__0 ) )
            // InternalOpenQASM3.g:643:3: ( rule__IncludeStatement__Group__0 )
            {
             before(grammarAccess.getIncludeStatementAccess().getGroup()); 
            // InternalOpenQASM3.g:644:3: ( rule__IncludeStatement__Group__0 )
            // InternalOpenQASM3.g:644:4: rule__IncludeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludeStatement"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalOpenQASM3.g:652:1: rule__Statement__Alternatives : ( ( ruleIncludeStatement ) | ( rulequantumDeclarationStatement ) | ( ruleGateCallStatement ) | ( ruleIfStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:656:1: ( ( ruleIncludeStatement ) | ( rulequantumDeclarationStatement ) | ( ruleGateCallStatement ) | ( ruleIfStatement ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case RULE_QUBIT:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 38:
                {
                alt1=3;
                }
                break;
            case 39:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOpenQASM3.g:657:2: ( ruleIncludeStatement )
                    {
                    // InternalOpenQASM3.g:657:2: ( ruleIncludeStatement )
                    // InternalOpenQASM3.g:658:3: ruleIncludeStatement
                    {
                     before(grammarAccess.getStatementAccess().getIncludeStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIncludeStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIncludeStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:663:2: ( rulequantumDeclarationStatement )
                    {
                    // InternalOpenQASM3.g:663:2: ( rulequantumDeclarationStatement )
                    // InternalOpenQASM3.g:664:3: rulequantumDeclarationStatement
                    {
                     before(grammarAccess.getStatementAccess().getQuantumDeclarationStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulequantumDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getQuantumDeclarationStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:669:2: ( ruleGateCallStatement )
                    {
                    // InternalOpenQASM3.g:669:2: ( ruleGateCallStatement )
                    // InternalOpenQASM3.g:670:3: ruleGateCallStatement
                    {
                     before(grammarAccess.getStatementAccess().getGateCallStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGateCallStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGateCallStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenQASM3.g:675:2: ( ruleIfStatement )
                    {
                    // InternalOpenQASM3.g:675:2: ( ruleIfStatement )
                    // InternalOpenQASM3.g:676:3: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__GateCallStatement__Alternatives_4"
    // InternalOpenQASM3.g:685:1: rule__GateCallStatement__Alternatives_4 : ( ( ( rule__GateCallStatement__ScopeAssignment_4_0 ) ) | ( RULE_SEMICOLON ) );
    public final void rule__GateCallStatement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:689:1: ( ( ( rule__GateCallStatement__ScopeAssignment_4_0 ) ) | ( RULE_SEMICOLON ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LBRACE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SEMICOLON) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOpenQASM3.g:690:2: ( ( rule__GateCallStatement__ScopeAssignment_4_0 ) )
                    {
                    // InternalOpenQASM3.g:690:2: ( ( rule__GateCallStatement__ScopeAssignment_4_0 ) )
                    // InternalOpenQASM3.g:691:3: ( rule__GateCallStatement__ScopeAssignment_4_0 )
                    {
                     before(grammarAccess.getGateCallStatementAccess().getScopeAssignment_4_0()); 
                    // InternalOpenQASM3.g:692:3: ( rule__GateCallStatement__ScopeAssignment_4_0 )
                    // InternalOpenQASM3.g:692:4: rule__GateCallStatement__ScopeAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GateCallStatement__ScopeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGateCallStatementAccess().getScopeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:696:2: ( RULE_SEMICOLON )
                    {
                    // InternalOpenQASM3.g:696:2: ( RULE_SEMICOLON )
                    // InternalOpenQASM3.g:697:3: RULE_SEMICOLON
                    {
                     before(grammarAccess.getGateCallStatementAccess().getSEMICOLONTerminalRuleCall_4_1()); 
                    match(input,RULE_SEMICOLON,FOLLOW_2); 
                     after(grammarAccess.getGateCallStatementAccess().getSEMICOLONTerminalRuleCall_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Alternatives_4"


    // $ANTLR start "rule__StatementOrScope__Alternatives"
    // InternalOpenQASM3.g:706:1: rule__StatementOrScope__Alternatives : ( ( ruleStatement ) | ( ruleScope ) );
    public final void rule__StatementOrScope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:710:1: ( ( ruleStatement ) | ( ruleScope ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_QUBIT||LA3_0==RULE_ID||(LA3_0>=38 && LA3_0<=39)||LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_LBRACE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOpenQASM3.g:711:2: ( ruleStatement )
                    {
                    // InternalOpenQASM3.g:711:2: ( ruleStatement )
                    // InternalOpenQASM3.g:712:3: ruleStatement
                    {
                     before(grammarAccess.getStatementOrScopeAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementOrScopeAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:717:2: ( ruleScope )
                    {
                    // InternalOpenQASM3.g:717:2: ( ruleScope )
                    // InternalOpenQASM3.g:718:3: ruleScope
                    {
                     before(grammarAccess.getStatementOrScopeAccess().getScopeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScope();

                    state._fsp--;

                     after(grammarAccess.getStatementOrScopeAccess().getScopeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementOrScope__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalOpenQASM3.g:727:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__LtrsAssignment_1 ) ) | ( ( rule__Expression__UnExpressionsAssignment_2 ) ) | ( ( rule__Expression__MultExpressionsAssignment_3 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:731:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__LtrsAssignment_1 ) ) | ( ( rule__Expression__UnExpressionsAssignment_2 ) ) | ( ( rule__Expression__MultExpressionsAssignment_3 ) ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOpenQASM3.g:732:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalOpenQASM3.g:732:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalOpenQASM3.g:733:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalOpenQASM3.g:734:3: ( rule__Expression__Group_0__0 )
                    // InternalOpenQASM3.g:734:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:738:2: ( ( rule__Expression__LtrsAssignment_1 ) )
                    {
                    // InternalOpenQASM3.g:738:2: ( ( rule__Expression__LtrsAssignment_1 ) )
                    // InternalOpenQASM3.g:739:3: ( rule__Expression__LtrsAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getLtrsAssignment_1()); 
                    // InternalOpenQASM3.g:740:3: ( rule__Expression__LtrsAssignment_1 )
                    // InternalOpenQASM3.g:740:4: rule__Expression__LtrsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__LtrsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getLtrsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:744:2: ( ( rule__Expression__UnExpressionsAssignment_2 ) )
                    {
                    // InternalOpenQASM3.g:744:2: ( ( rule__Expression__UnExpressionsAssignment_2 ) )
                    // InternalOpenQASM3.g:745:3: ( rule__Expression__UnExpressionsAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getUnExpressionsAssignment_2()); 
                    // InternalOpenQASM3.g:746:3: ( rule__Expression__UnExpressionsAssignment_2 )
                    // InternalOpenQASM3.g:746:4: rule__Expression__UnExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__UnExpressionsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getUnExpressionsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenQASM3.g:750:2: ( ( rule__Expression__MultExpressionsAssignment_3 ) )
                    {
                    // InternalOpenQASM3.g:750:2: ( ( rule__Expression__MultExpressionsAssignment_3 ) )
                    // InternalOpenQASM3.g:751:3: ( rule__Expression__MultExpressionsAssignment_3 )
                    {
                     before(grammarAccess.getExpressionAccess().getMultExpressionsAssignment_3()); 
                    // InternalOpenQASM3.g:752:3: ( rule__Expression__MultExpressionsAssignment_3 )
                    // InternalOpenQASM3.g:752:4: rule__Expression__MultExpressionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__MultExpressionsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getMultExpressionsAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalOpenQASM3.g:760:1: rule__Literal__Alternatives : ( ( ( rule__Literal__LAssignment_0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:764:1: ( ( ( rule__Literal__LAssignment_0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_INT) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_DOT) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==EOF||(LA5_2>=RULE_ASTERISK && LA5_2<=RULE_SLASH)||LA5_2==RULE_RPAREN||LA5_2==RULE_COMMA||LA5_2==RULE_RBRACKET) ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_DOT) ) {
                    alt5=1;
                }
                else if ( (LA5_2==EOF||(LA5_2>=RULE_ASTERISK && LA5_2<=RULE_SLASH)||LA5_2==RULE_RPAREN||LA5_2==RULE_COMMA||LA5_2==RULE_RBRACKET) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOpenQASM3.g:765:2: ( ( rule__Literal__LAssignment_0 ) )
                    {
                    // InternalOpenQASM3.g:765:2: ( ( rule__Literal__LAssignment_0 ) )
                    // InternalOpenQASM3.g:766:3: ( rule__Literal__LAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getLAssignment_0()); 
                    // InternalOpenQASM3.g:767:3: ( rule__Literal__LAssignment_0 )
                    // InternalOpenQASM3.g:767:4: rule__Literal__LAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__LAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getLAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:771:2: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalOpenQASM3.g:771:2: ( ( rule__Literal__Group_1__0 ) )
                    // InternalOpenQASM3.g:772:3: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // InternalOpenQASM3.g:773:3: ( rule__Literal__Group_1__0 )
                    // InternalOpenQASM3.g:773:4: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenQASM3.g:777:2: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalOpenQASM3.g:777:2: ( ( rule__Literal__Group_2__0 ) )
                    // InternalOpenQASM3.g:778:3: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // InternalOpenQASM3.g:779:3: ( rule__Literal__Group_2__0 )
                    // InternalOpenQASM3.g:779:4: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalOpenQASM3.g:787:1: rule__MultiplicativeOperator__Alternatives : ( ( RULE_ASTERISK ) | ( RULE_SLASH ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:791:1: ( ( RULE_ASTERISK ) | ( RULE_SLASH ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ASTERISK) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SLASH) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpenQASM3.g:792:2: ( RULE_ASTERISK )
                    {
                    // InternalOpenQASM3.g:792:2: ( RULE_ASTERISK )
                    // InternalOpenQASM3.g:793:3: RULE_ASTERISK
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getASTERISKTerminalRuleCall_0()); 
                    match(input,RULE_ASTERISK,FOLLOW_2); 
                     after(grammarAccess.getMultiplicativeOperatorAccess().getASTERISKTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:798:2: ( RULE_SLASH )
                    {
                    // InternalOpenQASM3.g:798:2: ( RULE_SLASH )
                    // InternalOpenQASM3.g:799:3: RULE_SLASH
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getSLASHTerminalRuleCall_1()); 
                    match(input,RULE_SLASH,FOLLOW_2); 
                     after(grammarAccess.getMultiplicativeOperatorAccess().getSLASHTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // InternalOpenQASM3.g:808:1: rule__UnaryOperator__Alternatives : ( ( RULE_TILDE ) | ( RULE_EXCLAMATION_POINT ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:812:1: ( ( RULE_TILDE ) | ( RULE_EXCLAMATION_POINT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TILDE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_EXCLAMATION_POINT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpenQASM3.g:813:2: ( RULE_TILDE )
                    {
                    // InternalOpenQASM3.g:813:2: ( RULE_TILDE )
                    // InternalOpenQASM3.g:814:3: RULE_TILDE
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getTILDETerminalRuleCall_0()); 
                    match(input,RULE_TILDE,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getTILDETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:819:2: ( RULE_EXCLAMATION_POINT )
                    {
                    // InternalOpenQASM3.g:819:2: ( RULE_EXCLAMATION_POINT )
                    // InternalOpenQASM3.g:820:3: RULE_EXCLAMATION_POINT
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getEXCLAMATION_POINTTerminalRuleCall_1()); 
                    match(input,RULE_EXCLAMATION_POINT,FOLLOW_2); 
                     after(grammarAccess.getUnaryOperatorAccess().getEXCLAMATION_POINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__FloatLiteral__Alternatives"
    // InternalOpenQASM3.g:829:1: rule__FloatLiteral__Alternatives : ( ( ( rule__FloatLiteral__Group_0__0 ) ) | ( 'pi' ) );
    public final void rule__FloatLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:833:1: ( ( ( rule__FloatLiteral__Group_0__0 ) ) | ( 'pi' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_MINUS && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==36) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOpenQASM3.g:834:2: ( ( rule__FloatLiteral__Group_0__0 ) )
                    {
                    // InternalOpenQASM3.g:834:2: ( ( rule__FloatLiteral__Group_0__0 ) )
                    // InternalOpenQASM3.g:835:3: ( rule__FloatLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getFloatLiteralAccess().getGroup_0()); 
                    // InternalOpenQASM3.g:836:3: ( rule__FloatLiteral__Group_0__0 )
                    // InternalOpenQASM3.g:836:4: rule__FloatLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:840:2: ( 'pi' )
                    {
                    // InternalOpenQASM3.g:840:2: ( 'pi' )
                    // InternalOpenQASM3.g:841:3: 'pi'
                    {
                     before(grammarAccess.getFloatLiteralAccess().getPiKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getFloatLiteralAccess().getPiKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalOpenQASM3.g:850:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:854:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalOpenQASM3.g:855:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalOpenQASM3.g:862:1: rule__Program__Group__0__Impl : ( ( rule__Program__VersionAssignment_0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:866:1: ( ( ( rule__Program__VersionAssignment_0 )? ) )
            // InternalOpenQASM3.g:867:1: ( ( rule__Program__VersionAssignment_0 )? )
            {
            // InternalOpenQASM3.g:867:1: ( ( rule__Program__VersionAssignment_0 )? )
            // InternalOpenQASM3.g:868:2: ( rule__Program__VersionAssignment_0 )?
            {
             before(grammarAccess.getProgramAccess().getVersionAssignment_0()); 
            // InternalOpenQASM3.g:869:2: ( rule__Program__VersionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOpenQASM3.g:869:3: rule__Program__VersionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__VersionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getVersionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalOpenQASM3.g:877:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:881:1: ( rule__Program__Group__1__Impl )
            // InternalOpenQASM3.g:882:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalOpenQASM3.g:888:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:892:1: ( ( ( rule__Program__StatementsAssignment_1 )* ) )
            // InternalOpenQASM3.g:893:1: ( ( rule__Program__StatementsAssignment_1 )* )
            {
            // InternalOpenQASM3.g:893:1: ( ( rule__Program__StatementsAssignment_1 )* )
            // InternalOpenQASM3.g:894:2: ( rule__Program__StatementsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_1()); 
            // InternalOpenQASM3.g:895:2: ( rule__Program__StatementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_QUBIT||LA10_0==RULE_ID||(LA10_0>=38 && LA10_0<=39)||LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOpenQASM3.g:895:3: rule__Program__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalOpenQASM3.g:904:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:908:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalOpenQASM3.g:909:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalOpenQASM3.g:916:1: rule__Version__Group__0__Impl : ( ( rule__Version__Group_0__0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:920:1: ( ( ( rule__Version__Group_0__0 ) ) )
            // InternalOpenQASM3.g:921:1: ( ( rule__Version__Group_0__0 ) )
            {
            // InternalOpenQASM3.g:921:1: ( ( rule__Version__Group_0__0 ) )
            // InternalOpenQASM3.g:922:2: ( rule__Version__Group_0__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup_0()); 
            // InternalOpenQASM3.g:923:2: ( rule__Version__Group_0__0 )
            // InternalOpenQASM3.g:923:3: rule__Version__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalOpenQASM3.g:931:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:935:1: ( rule__Version__Group__1__Impl )
            // InternalOpenQASM3.g:936:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalOpenQASM3.g:942:1: rule__Version__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:946:1: ( ( RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:947:1: ( RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:947:1: ( RULE_SEMICOLON )
            // InternalOpenQASM3.g:948:2: RULE_SEMICOLON
            {
             before(grammarAccess.getVersionAccess().getSEMICOLONTerminalRuleCall_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getSEMICOLONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group_0__0"
    // InternalOpenQASM3.g:958:1: rule__Version__Group_0__0 : rule__Version__Group_0__0__Impl rule__Version__Group_0__1 ;
    public final void rule__Version__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:962:1: ( rule__Version__Group_0__0__Impl rule__Version__Group_0__1 )
            // InternalOpenQASM3.g:963:2: rule__Version__Group_0__0__Impl rule__Version__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Version__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0__0"


    // $ANTLR start "rule__Version__Group_0__0__Impl"
    // InternalOpenQASM3.g:970:1: rule__Version__Group_0__0__Impl : ( 'OPENQASM' ) ;
    public final void rule__Version__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:974:1: ( ( 'OPENQASM' ) )
            // InternalOpenQASM3.g:975:1: ( 'OPENQASM' )
            {
            // InternalOpenQASM3.g:975:1: ( 'OPENQASM' )
            // InternalOpenQASM3.g:976:2: 'OPENQASM'
            {
             before(grammarAccess.getVersionAccess().getOPENQASMKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getOPENQASMKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0__0__Impl"


    // $ANTLR start "rule__Version__Group_0__1"
    // InternalOpenQASM3.g:985:1: rule__Version__Group_0__1 : rule__Version__Group_0__1__Impl ;
    public final void rule__Version__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:989:1: ( rule__Version__Group_0__1__Impl )
            // InternalOpenQASM3.g:990:2: rule__Version__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0__1"


    // $ANTLR start "rule__Version__Group_0__1__Impl"
    // InternalOpenQASM3.g:996:1: rule__Version__Group_0__1__Impl : ( ( rule__Version__VersionNumberAssignment_0_1 ) ) ;
    public final void rule__Version__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1000:1: ( ( ( rule__Version__VersionNumberAssignment_0_1 ) ) )
            // InternalOpenQASM3.g:1001:1: ( ( rule__Version__VersionNumberAssignment_0_1 ) )
            {
            // InternalOpenQASM3.g:1001:1: ( ( rule__Version__VersionNumberAssignment_0_1 ) )
            // InternalOpenQASM3.g:1002:2: ( rule__Version__VersionNumberAssignment_0_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionNumberAssignment_0_1()); 
            // InternalOpenQASM3.g:1003:2: ( rule__Version__VersionNumberAssignment_0_1 )
            // InternalOpenQASM3.g:1003:3: rule__Version__VersionNumberAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Version__VersionNumberAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getVersionNumberAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0__1__Impl"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__0"
    // InternalOpenQASM3.g:1012:1: rule__QuantumDeclarationStatement__Group__0 : rule__QuantumDeclarationStatement__Group__0__Impl rule__QuantumDeclarationStatement__Group__1 ;
    public final void rule__QuantumDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1016:1: ( rule__QuantumDeclarationStatement__Group__0__Impl rule__QuantumDeclarationStatement__Group__1 )
            // InternalOpenQASM3.g:1017:2: rule__QuantumDeclarationStatement__Group__0__Impl rule__QuantumDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QuantumDeclarationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumDeclarationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__0"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__0__Impl"
    // InternalOpenQASM3.g:1024:1: rule__QuantumDeclarationStatement__Group__0__Impl : ( ruleQubitType ) ;
    public final void rule__QuantumDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1028:1: ( ( ruleQubitType ) )
            // InternalOpenQASM3.g:1029:1: ( ruleQubitType )
            {
            // InternalOpenQASM3.g:1029:1: ( ruleQubitType )
            // InternalOpenQASM3.g:1030:2: ruleQubitType
            {
             before(grammarAccess.getQuantumDeclarationStatementAccess().getQubitTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQubitType();

            state._fsp--;

             after(grammarAccess.getQuantumDeclarationStatementAccess().getQubitTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__0__Impl"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__1"
    // InternalOpenQASM3.g:1039:1: rule__QuantumDeclarationStatement__Group__1 : rule__QuantumDeclarationStatement__Group__1__Impl rule__QuantumDeclarationStatement__Group__2 ;
    public final void rule__QuantumDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1043:1: ( rule__QuantumDeclarationStatement__Group__1__Impl rule__QuantumDeclarationStatement__Group__2 )
            // InternalOpenQASM3.g:1044:2: rule__QuantumDeclarationStatement__Group__1__Impl rule__QuantumDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QuantumDeclarationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumDeclarationStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__1"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__1__Impl"
    // InternalOpenQASM3.g:1051:1: rule__QuantumDeclarationStatement__Group__1__Impl : ( ( rule__QuantumDeclarationStatement__NameAssignment_1 ) ) ;
    public final void rule__QuantumDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1055:1: ( ( ( rule__QuantumDeclarationStatement__NameAssignment_1 ) ) )
            // InternalOpenQASM3.g:1056:1: ( ( rule__QuantumDeclarationStatement__NameAssignment_1 ) )
            {
            // InternalOpenQASM3.g:1056:1: ( ( rule__QuantumDeclarationStatement__NameAssignment_1 ) )
            // InternalOpenQASM3.g:1057:2: ( rule__QuantumDeclarationStatement__NameAssignment_1 )
            {
             before(grammarAccess.getQuantumDeclarationStatementAccess().getNameAssignment_1()); 
            // InternalOpenQASM3.g:1058:2: ( rule__QuantumDeclarationStatement__NameAssignment_1 )
            // InternalOpenQASM3.g:1058:3: rule__QuantumDeclarationStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantumDeclarationStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantumDeclarationStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__1__Impl"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__2"
    // InternalOpenQASM3.g:1066:1: rule__QuantumDeclarationStatement__Group__2 : rule__QuantumDeclarationStatement__Group__2__Impl ;
    public final void rule__QuantumDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1070:1: ( rule__QuantumDeclarationStatement__Group__2__Impl )
            // InternalOpenQASM3.g:1071:2: rule__QuantumDeclarationStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumDeclarationStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__2"


    // $ANTLR start "rule__QuantumDeclarationStatement__Group__2__Impl"
    // InternalOpenQASM3.g:1077:1: rule__QuantumDeclarationStatement__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__QuantumDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1081:1: ( ( RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:1082:1: ( RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:1082:1: ( RULE_SEMICOLON )
            // InternalOpenQASM3.g:1083:2: RULE_SEMICOLON
            {
             before(grammarAccess.getQuantumDeclarationStatementAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getQuantumDeclarationStatementAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__Group__2__Impl"


    // $ANTLR start "rule__GateCallStatement__Group__0"
    // InternalOpenQASM3.g:1093:1: rule__GateCallStatement__Group__0 : rule__GateCallStatement__Group__0__Impl rule__GateCallStatement__Group__1 ;
    public final void rule__GateCallStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1097:1: ( rule__GateCallStatement__Group__0__Impl rule__GateCallStatement__Group__1 )
            // InternalOpenQASM3.g:1098:2: rule__GateCallStatement__Group__0__Impl rule__GateCallStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GateCallStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__0"


    // $ANTLR start "rule__GateCallStatement__Group__0__Impl"
    // InternalOpenQASM3.g:1105:1: rule__GateCallStatement__Group__0__Impl : ( ( 'gate' )? ) ;
    public final void rule__GateCallStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1109:1: ( ( ( 'gate' )? ) )
            // InternalOpenQASM3.g:1110:1: ( ( 'gate' )? )
            {
            // InternalOpenQASM3.g:1110:1: ( ( 'gate' )? )
            // InternalOpenQASM3.g:1111:2: ( 'gate' )?
            {
             before(grammarAccess.getGateCallStatementAccess().getGateKeyword_0()); 
            // InternalOpenQASM3.g:1112:2: ( 'gate' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOpenQASM3.g:1112:3: 'gate'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGateCallStatementAccess().getGateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__0__Impl"


    // $ANTLR start "rule__GateCallStatement__Group__1"
    // InternalOpenQASM3.g:1120:1: rule__GateCallStatement__Group__1 : rule__GateCallStatement__Group__1__Impl rule__GateCallStatement__Group__2 ;
    public final void rule__GateCallStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1124:1: ( rule__GateCallStatement__Group__1__Impl rule__GateCallStatement__Group__2 )
            // InternalOpenQASM3.g:1125:2: rule__GateCallStatement__Group__1__Impl rule__GateCallStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GateCallStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__1"


    // $ANTLR start "rule__GateCallStatement__Group__1__Impl"
    // InternalOpenQASM3.g:1132:1: rule__GateCallStatement__Group__1__Impl : ( ( rule__GateCallStatement__GateAssignment_1 ) ) ;
    public final void rule__GateCallStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1136:1: ( ( ( rule__GateCallStatement__GateAssignment_1 ) ) )
            // InternalOpenQASM3.g:1137:1: ( ( rule__GateCallStatement__GateAssignment_1 ) )
            {
            // InternalOpenQASM3.g:1137:1: ( ( rule__GateCallStatement__GateAssignment_1 ) )
            // InternalOpenQASM3.g:1138:2: ( rule__GateCallStatement__GateAssignment_1 )
            {
             before(grammarAccess.getGateCallStatementAccess().getGateAssignment_1()); 
            // InternalOpenQASM3.g:1139:2: ( rule__GateCallStatement__GateAssignment_1 )
            // InternalOpenQASM3.g:1139:3: rule__GateCallStatement__GateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__GateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGateCallStatementAccess().getGateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__1__Impl"


    // $ANTLR start "rule__GateCallStatement__Group__2"
    // InternalOpenQASM3.g:1147:1: rule__GateCallStatement__Group__2 : rule__GateCallStatement__Group__2__Impl rule__GateCallStatement__Group__3 ;
    public final void rule__GateCallStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1151:1: ( rule__GateCallStatement__Group__2__Impl rule__GateCallStatement__Group__3 )
            // InternalOpenQASM3.g:1152:2: rule__GateCallStatement__Group__2__Impl rule__GateCallStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GateCallStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__2"


    // $ANTLR start "rule__GateCallStatement__Group__2__Impl"
    // InternalOpenQASM3.g:1159:1: rule__GateCallStatement__Group__2__Impl : ( ( rule__GateCallStatement__Group_2__0 )? ) ;
    public final void rule__GateCallStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1163:1: ( ( ( rule__GateCallStatement__Group_2__0 )? ) )
            // InternalOpenQASM3.g:1164:1: ( ( rule__GateCallStatement__Group_2__0 )? )
            {
            // InternalOpenQASM3.g:1164:1: ( ( rule__GateCallStatement__Group_2__0 )? )
            // InternalOpenQASM3.g:1165:2: ( rule__GateCallStatement__Group_2__0 )?
            {
             before(grammarAccess.getGateCallStatementAccess().getGroup_2()); 
            // InternalOpenQASM3.g:1166:2: ( rule__GateCallStatement__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LPAREN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOpenQASM3.g:1166:3: rule__GateCallStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GateCallStatement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGateCallStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__2__Impl"


    // $ANTLR start "rule__GateCallStatement__Group__3"
    // InternalOpenQASM3.g:1174:1: rule__GateCallStatement__Group__3 : rule__GateCallStatement__Group__3__Impl rule__GateCallStatement__Group__4 ;
    public final void rule__GateCallStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1178:1: ( rule__GateCallStatement__Group__3__Impl rule__GateCallStatement__Group__4 )
            // InternalOpenQASM3.g:1179:2: rule__GateCallStatement__Group__3__Impl rule__GateCallStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__GateCallStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__3"


    // $ANTLR start "rule__GateCallStatement__Group__3__Impl"
    // InternalOpenQASM3.g:1186:1: rule__GateCallStatement__Group__3__Impl : ( ( rule__GateCallStatement__GateListAssignment_3 ) ) ;
    public final void rule__GateCallStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1190:1: ( ( ( rule__GateCallStatement__GateListAssignment_3 ) ) )
            // InternalOpenQASM3.g:1191:1: ( ( rule__GateCallStatement__GateListAssignment_3 ) )
            {
            // InternalOpenQASM3.g:1191:1: ( ( rule__GateCallStatement__GateListAssignment_3 ) )
            // InternalOpenQASM3.g:1192:2: ( rule__GateCallStatement__GateListAssignment_3 )
            {
             before(grammarAccess.getGateCallStatementAccess().getGateListAssignment_3()); 
            // InternalOpenQASM3.g:1193:2: ( rule__GateCallStatement__GateListAssignment_3 )
            // InternalOpenQASM3.g:1193:3: rule__GateCallStatement__GateListAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__GateListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGateCallStatementAccess().getGateListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__3__Impl"


    // $ANTLR start "rule__GateCallStatement__Group__4"
    // InternalOpenQASM3.g:1201:1: rule__GateCallStatement__Group__4 : rule__GateCallStatement__Group__4__Impl ;
    public final void rule__GateCallStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1205:1: ( rule__GateCallStatement__Group__4__Impl )
            // InternalOpenQASM3.g:1206:2: rule__GateCallStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__4"


    // $ANTLR start "rule__GateCallStatement__Group__4__Impl"
    // InternalOpenQASM3.g:1212:1: rule__GateCallStatement__Group__4__Impl : ( ( rule__GateCallStatement__Alternatives_4 ) ) ;
    public final void rule__GateCallStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1216:1: ( ( ( rule__GateCallStatement__Alternatives_4 ) ) )
            // InternalOpenQASM3.g:1217:1: ( ( rule__GateCallStatement__Alternatives_4 ) )
            {
            // InternalOpenQASM3.g:1217:1: ( ( rule__GateCallStatement__Alternatives_4 ) )
            // InternalOpenQASM3.g:1218:2: ( rule__GateCallStatement__Alternatives_4 )
            {
             before(grammarAccess.getGateCallStatementAccess().getAlternatives_4()); 
            // InternalOpenQASM3.g:1219:2: ( rule__GateCallStatement__Alternatives_4 )
            // InternalOpenQASM3.g:1219:3: rule__GateCallStatement__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getGateCallStatementAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group__4__Impl"


    // $ANTLR start "rule__GateCallStatement__Group_2__0"
    // InternalOpenQASM3.g:1228:1: rule__GateCallStatement__Group_2__0 : rule__GateCallStatement__Group_2__0__Impl rule__GateCallStatement__Group_2__1 ;
    public final void rule__GateCallStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1232:1: ( rule__GateCallStatement__Group_2__0__Impl rule__GateCallStatement__Group_2__1 )
            // InternalOpenQASM3.g:1233:2: rule__GateCallStatement__Group_2__0__Impl rule__GateCallStatement__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__GateCallStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__0"


    // $ANTLR start "rule__GateCallStatement__Group_2__0__Impl"
    // InternalOpenQASM3.g:1240:1: rule__GateCallStatement__Group_2__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__GateCallStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1244:1: ( ( RULE_LPAREN ) )
            // InternalOpenQASM3.g:1245:1: ( RULE_LPAREN )
            {
            // InternalOpenQASM3.g:1245:1: ( RULE_LPAREN )
            // InternalOpenQASM3.g:1246:2: RULE_LPAREN
            {
             before(grammarAccess.getGateCallStatementAccess().getLPARENTerminalRuleCall_2_0()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getGateCallStatementAccess().getLPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__0__Impl"


    // $ANTLR start "rule__GateCallStatement__Group_2__1"
    // InternalOpenQASM3.g:1255:1: rule__GateCallStatement__Group_2__1 : rule__GateCallStatement__Group_2__1__Impl rule__GateCallStatement__Group_2__2 ;
    public final void rule__GateCallStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1259:1: ( rule__GateCallStatement__Group_2__1__Impl rule__GateCallStatement__Group_2__2 )
            // InternalOpenQASM3.g:1260:2: rule__GateCallStatement__Group_2__1__Impl rule__GateCallStatement__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__GateCallStatement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__1"


    // $ANTLR start "rule__GateCallStatement__Group_2__1__Impl"
    // InternalOpenQASM3.g:1267:1: rule__GateCallStatement__Group_2__1__Impl : ( ( rule__GateCallStatement__ElAssignment_2_1 )? ) ;
    public final void rule__GateCallStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1271:1: ( ( ( rule__GateCallStatement__ElAssignment_2_1 )? ) )
            // InternalOpenQASM3.g:1272:1: ( ( rule__GateCallStatement__ElAssignment_2_1 )? )
            {
            // InternalOpenQASM3.g:1272:1: ( ( rule__GateCallStatement__ElAssignment_2_1 )? )
            // InternalOpenQASM3.g:1273:2: ( rule__GateCallStatement__ElAssignment_2_1 )?
            {
             before(grammarAccess.getGateCallStatementAccess().getElAssignment_2_1()); 
            // InternalOpenQASM3.g:1274:2: ( rule__GateCallStatement__ElAssignment_2_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_TILDE && LA13_0<=RULE_LPAREN)||LA13_0==RULE_STRING||(LA13_0>=RULE_MINUS && LA13_0<=RULE_INT)||LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOpenQASM3.g:1274:3: rule__GateCallStatement__ElAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GateCallStatement__ElAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGateCallStatementAccess().getElAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__1__Impl"


    // $ANTLR start "rule__GateCallStatement__Group_2__2"
    // InternalOpenQASM3.g:1282:1: rule__GateCallStatement__Group_2__2 : rule__GateCallStatement__Group_2__2__Impl ;
    public final void rule__GateCallStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1286:1: ( rule__GateCallStatement__Group_2__2__Impl )
            // InternalOpenQASM3.g:1287:2: rule__GateCallStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GateCallStatement__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__2"


    // $ANTLR start "rule__GateCallStatement__Group_2__2__Impl"
    // InternalOpenQASM3.g:1293:1: rule__GateCallStatement__Group_2__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__GateCallStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1297:1: ( ( RULE_RPAREN ) )
            // InternalOpenQASM3.g:1298:1: ( RULE_RPAREN )
            {
            // InternalOpenQASM3.g:1298:1: ( RULE_RPAREN )
            // InternalOpenQASM3.g:1299:2: RULE_RPAREN
            {
             before(grammarAccess.getGateCallStatementAccess().getRPARENTerminalRuleCall_2_2()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getGateCallStatementAccess().getRPARENTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__Group_2__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalOpenQASM3.g:1309:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1313:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalOpenQASM3.g:1314:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalOpenQASM3.g:1321:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1325:1: ( ( 'if' ) )
            // InternalOpenQASM3.g:1326:1: ( 'if' )
            {
            // InternalOpenQASM3.g:1326:1: ( 'if' )
            // InternalOpenQASM3.g:1327:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalOpenQASM3.g:1336:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1340:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalOpenQASM3.g:1341:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalOpenQASM3.g:1348:1: rule__IfStatement__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1352:1: ( ( RULE_LPAREN ) )
            // InternalOpenQASM3.g:1353:1: ( RULE_LPAREN )
            {
            // InternalOpenQASM3.g:1353:1: ( RULE_LPAREN )
            // InternalOpenQASM3.g:1354:2: RULE_LPAREN
            {
             before(grammarAccess.getIfStatementAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalOpenQASM3.g:1363:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1367:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalOpenQASM3.g:1368:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalOpenQASM3.g:1375:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1379:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // InternalOpenQASM3.g:1380:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // InternalOpenQASM3.g:1380:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // InternalOpenQASM3.g:1381:2: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // InternalOpenQASM3.g:1382:2: ( rule__IfStatement__ConditionAssignment_2 )
            // InternalOpenQASM3.g:1382:3: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalOpenQASM3.g:1390:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1394:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalOpenQASM3.g:1395:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalOpenQASM3.g:1402:1: rule__IfStatement__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1406:1: ( ( RULE_RPAREN ) )
            // InternalOpenQASM3.g:1407:1: ( RULE_RPAREN )
            {
            // InternalOpenQASM3.g:1407:1: ( RULE_RPAREN )
            // InternalOpenQASM3.g:1408:2: RULE_RPAREN
            {
             before(grammarAccess.getIfStatementAccess().getRPARENTerminalRuleCall_3()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getRPARENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalOpenQASM3.g:1417:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1421:1: ( rule__IfStatement__Group__4__Impl )
            // InternalOpenQASM3.g:1422:2: rule__IfStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalOpenQASM3.g:1428:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__If_bodyAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1432:1: ( ( ( rule__IfStatement__If_bodyAssignment_4 ) ) )
            // InternalOpenQASM3.g:1433:1: ( ( rule__IfStatement__If_bodyAssignment_4 ) )
            {
            // InternalOpenQASM3.g:1433:1: ( ( rule__IfStatement__If_bodyAssignment_4 ) )
            // InternalOpenQASM3.g:1434:2: ( rule__IfStatement__If_bodyAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIf_bodyAssignment_4()); 
            // InternalOpenQASM3.g:1435:2: ( rule__IfStatement__If_bodyAssignment_4 )
            // InternalOpenQASM3.g:1435:3: rule__IfStatement__If_bodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__If_bodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIf_bodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__Scope__Group__0"
    // InternalOpenQASM3.g:1444:1: rule__Scope__Group__0 : rule__Scope__Group__0__Impl rule__Scope__Group__1 ;
    public final void rule__Scope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1448:1: ( rule__Scope__Group__0__Impl rule__Scope__Group__1 )
            // InternalOpenQASM3.g:1449:2: rule__Scope__Group__0__Impl rule__Scope__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__0"


    // $ANTLR start "rule__Scope__Group__0__Impl"
    // InternalOpenQASM3.g:1456:1: rule__Scope__Group__0__Impl : ( () ) ;
    public final void rule__Scope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1460:1: ( ( () ) )
            // InternalOpenQASM3.g:1461:1: ( () )
            {
            // InternalOpenQASM3.g:1461:1: ( () )
            // InternalOpenQASM3.g:1462:2: ()
            {
             before(grammarAccess.getScopeAccess().getScopeAction_0()); 
            // InternalOpenQASM3.g:1463:2: ()
            // InternalOpenQASM3.g:1463:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getScopeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__0__Impl"


    // $ANTLR start "rule__Scope__Group__1"
    // InternalOpenQASM3.g:1471:1: rule__Scope__Group__1 : rule__Scope__Group__1__Impl rule__Scope__Group__2 ;
    public final void rule__Scope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1475:1: ( rule__Scope__Group__1__Impl rule__Scope__Group__2 )
            // InternalOpenQASM3.g:1476:2: rule__Scope__Group__1__Impl rule__Scope__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Scope__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__1"


    // $ANTLR start "rule__Scope__Group__1__Impl"
    // InternalOpenQASM3.g:1483:1: rule__Scope__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__Scope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1487:1: ( ( RULE_LBRACE ) )
            // InternalOpenQASM3.g:1488:1: ( RULE_LBRACE )
            {
            // InternalOpenQASM3.g:1488:1: ( RULE_LBRACE )
            // InternalOpenQASM3.g:1489:2: RULE_LBRACE
            {
             before(grammarAccess.getScopeAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__1__Impl"


    // $ANTLR start "rule__Scope__Group__2"
    // InternalOpenQASM3.g:1498:1: rule__Scope__Group__2 : rule__Scope__Group__2__Impl rule__Scope__Group__3 ;
    public final void rule__Scope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1502:1: ( rule__Scope__Group__2__Impl rule__Scope__Group__3 )
            // InternalOpenQASM3.g:1503:2: rule__Scope__Group__2__Impl rule__Scope__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Scope__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__2"


    // $ANTLR start "rule__Scope__Group__2__Impl"
    // InternalOpenQASM3.g:1510:1: rule__Scope__Group__2__Impl : ( ( rule__Scope__StatementsAssignment_2 )* ) ;
    public final void rule__Scope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1514:1: ( ( ( rule__Scope__StatementsAssignment_2 )* ) )
            // InternalOpenQASM3.g:1515:1: ( ( rule__Scope__StatementsAssignment_2 )* )
            {
            // InternalOpenQASM3.g:1515:1: ( ( rule__Scope__StatementsAssignment_2 )* )
            // InternalOpenQASM3.g:1516:2: ( rule__Scope__StatementsAssignment_2 )*
            {
             before(grammarAccess.getScopeAccess().getStatementsAssignment_2()); 
            // InternalOpenQASM3.g:1517:2: ( rule__Scope__StatementsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_QUBIT||LA14_0==RULE_ID||(LA14_0>=38 && LA14_0<=39)||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOpenQASM3.g:1517:3: rule__Scope__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scope__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScopeAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__2__Impl"


    // $ANTLR start "rule__Scope__Group__3"
    // InternalOpenQASM3.g:1525:1: rule__Scope__Group__3 : rule__Scope__Group__3__Impl ;
    public final void rule__Scope__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1529:1: ( rule__Scope__Group__3__Impl )
            // InternalOpenQASM3.g:1530:2: rule__Scope__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__3"


    // $ANTLR start "rule__Scope__Group__3__Impl"
    // InternalOpenQASM3.g:1536:1: rule__Scope__Group__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__Scope__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1540:1: ( ( RULE_RBRACE ) )
            // InternalOpenQASM3.g:1541:1: ( RULE_RBRACE )
            {
            // InternalOpenQASM3.g:1541:1: ( RULE_RBRACE )
            // InternalOpenQASM3.g:1542:2: RULE_RBRACE
            {
             before(grammarAccess.getScopeAccess().getRBRACETerminalRuleCall_3()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getRBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__3__Impl"


    // $ANTLR start "rule__ExpressionList__Group__0"
    // InternalOpenQASM3.g:1552:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1556:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // InternalOpenQASM3.g:1557:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0"


    // $ANTLR start "rule__ExpressionList__Group__0__Impl"
    // InternalOpenQASM3.g:1564:1: rule__ExpressionList__Group__0__Impl : ( ( rule__ExpressionList__E1Assignment_0 ) ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1568:1: ( ( ( rule__ExpressionList__E1Assignment_0 ) ) )
            // InternalOpenQASM3.g:1569:1: ( ( rule__ExpressionList__E1Assignment_0 ) )
            {
            // InternalOpenQASM3.g:1569:1: ( ( rule__ExpressionList__E1Assignment_0 ) )
            // InternalOpenQASM3.g:1570:2: ( rule__ExpressionList__E1Assignment_0 )
            {
             before(grammarAccess.getExpressionListAccess().getE1Assignment_0()); 
            // InternalOpenQASM3.g:1571:2: ( rule__ExpressionList__E1Assignment_0 )
            // InternalOpenQASM3.g:1571:3: rule__ExpressionList__E1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__E1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getE1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group__1"
    // InternalOpenQASM3.g:1579:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl rule__ExpressionList__Group__2 ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1583:1: ( rule__ExpressionList__Group__1__Impl rule__ExpressionList__Group__2 )
            // InternalOpenQASM3.g:1584:2: rule__ExpressionList__Group__1__Impl rule__ExpressionList__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1"


    // $ANTLR start "rule__ExpressionList__Group__1__Impl"
    // InternalOpenQASM3.g:1591:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__Group_1__0 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1595:1: ( ( ( rule__ExpressionList__Group_1__0 )* ) )
            // InternalOpenQASM3.g:1596:1: ( ( rule__ExpressionList__Group_1__0 )* )
            {
            // InternalOpenQASM3.g:1596:1: ( ( rule__ExpressionList__Group_1__0 )* )
            // InternalOpenQASM3.g:1597:2: ( rule__ExpressionList__Group_1__0 )*
            {
             before(grammarAccess.getExpressionListAccess().getGroup_1()); 
            // InternalOpenQASM3.g:1598:2: ( rule__ExpressionList__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=RULE_TILDE && LA15_1<=RULE_LPAREN)||LA15_1==RULE_STRING||(LA15_1>=RULE_MINUS && LA15_1<=RULE_INT)||LA15_1==36) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalOpenQASM3.g:1598:3: rule__ExpressionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ExpressionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExpressionListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1__Impl"


    // $ANTLR start "rule__ExpressionList__Group__2"
    // InternalOpenQASM3.g:1606:1: rule__ExpressionList__Group__2 : rule__ExpressionList__Group__2__Impl ;
    public final void rule__ExpressionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1610:1: ( rule__ExpressionList__Group__2__Impl )
            // InternalOpenQASM3.g:1611:2: rule__ExpressionList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__2"


    // $ANTLR start "rule__ExpressionList__Group__2__Impl"
    // InternalOpenQASM3.g:1617:1: rule__ExpressionList__Group__2__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__ExpressionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1621:1: ( ( ( RULE_COMMA )? ) )
            // InternalOpenQASM3.g:1622:1: ( ( RULE_COMMA )? )
            {
            // InternalOpenQASM3.g:1622:1: ( ( RULE_COMMA )? )
            // InternalOpenQASM3.g:1623:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_2()); 
            // InternalOpenQASM3.g:1624:2: ( RULE_COMMA )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMA) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOpenQASM3.g:1624:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__2__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__0"
    // InternalOpenQASM3.g:1633:1: rule__ExpressionList__Group_1__0 : rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 ;
    public final void rule__ExpressionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1637:1: ( rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 )
            // InternalOpenQASM3.g:1638:2: rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0"


    // $ANTLR start "rule__ExpressionList__Group_1__0__Impl"
    // InternalOpenQASM3.g:1645:1: rule__ExpressionList__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ExpressionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1649:1: ( ( RULE_COMMA ) )
            // InternalOpenQASM3.g:1650:1: ( RULE_COMMA )
            {
            // InternalOpenQASM3.g:1650:1: ( RULE_COMMA )
            // InternalOpenQASM3.g:1651:2: RULE_COMMA
            {
             before(grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getExpressionListAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__1"
    // InternalOpenQASM3.g:1660:1: rule__ExpressionList__Group_1__1 : rule__ExpressionList__Group_1__1__Impl ;
    public final void rule__ExpressionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1664:1: ( rule__ExpressionList__Group_1__1__Impl )
            // InternalOpenQASM3.g:1665:2: rule__ExpressionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1"


    // $ANTLR start "rule__ExpressionList__Group_1__1__Impl"
    // InternalOpenQASM3.g:1671:1: rule__ExpressionList__Group_1__1__Impl : ( ( rule__ExpressionList__E2Assignment_1_1 ) ) ;
    public final void rule__ExpressionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1675:1: ( ( ( rule__ExpressionList__E2Assignment_1_1 ) ) )
            // InternalOpenQASM3.g:1676:1: ( ( rule__ExpressionList__E2Assignment_1_1 ) )
            {
            // InternalOpenQASM3.g:1676:1: ( ( rule__ExpressionList__E2Assignment_1_1 ) )
            // InternalOpenQASM3.g:1677:2: ( rule__ExpressionList__E2Assignment_1_1 )
            {
             before(grammarAccess.getExpressionListAccess().getE2Assignment_1_1()); 
            // InternalOpenQASM3.g:1678:2: ( rule__ExpressionList__E2Assignment_1_1 )
            // InternalOpenQASM3.g:1678:3: rule__ExpressionList__E2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionList__E2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getE2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalOpenQASM3.g:1687:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1691:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalOpenQASM3.g:1692:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalOpenQASM3.g:1699:1: rule__Expression__Group_0__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1703:1: ( ( RULE_LPAREN ) )
            // InternalOpenQASM3.g:1704:1: ( RULE_LPAREN )
            {
            // InternalOpenQASM3.g:1704:1: ( RULE_LPAREN )
            // InternalOpenQASM3.g:1705:2: RULE_LPAREN
            {
             before(grammarAccess.getExpressionAccess().getLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLPARENTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalOpenQASM3.g:1714:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1718:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // InternalOpenQASM3.g:1719:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalOpenQASM3.g:1726:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__ExprsAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1730:1: ( ( ( rule__Expression__ExprsAssignment_0_1 ) ) )
            // InternalOpenQASM3.g:1731:1: ( ( rule__Expression__ExprsAssignment_0_1 ) )
            {
            // InternalOpenQASM3.g:1731:1: ( ( rule__Expression__ExprsAssignment_0_1 ) )
            // InternalOpenQASM3.g:1732:2: ( rule__Expression__ExprsAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getExprsAssignment_0_1()); 
            // InternalOpenQASM3.g:1733:2: ( rule__Expression__ExprsAssignment_0_1 )
            // InternalOpenQASM3.g:1733:3: rule__Expression__ExprsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExprsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExprsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // InternalOpenQASM3.g:1741:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1745:1: ( rule__Expression__Group_0__2__Impl )
            // InternalOpenQASM3.g:1746:2: rule__Expression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // InternalOpenQASM3.g:1752:1: rule__Expression__Group_0__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1756:1: ( ( RULE_RPAREN ) )
            // InternalOpenQASM3.g:1757:1: ( RULE_RPAREN )
            {
            // InternalOpenQASM3.g:1757:1: ( RULE_RPAREN )
            // InternalOpenQASM3.g:1758:2: RULE_RPAREN
            {
             before(grammarAccess.getExpressionAccess().getRPARENTerminalRuleCall_0_2()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRPARENTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // InternalOpenQASM3.g:1768:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1772:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalOpenQASM3.g:1773:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // InternalOpenQASM3.g:1780:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1784:1: ( ( () ) )
            // InternalOpenQASM3.g:1785:1: ( () )
            {
            // InternalOpenQASM3.g:1785:1: ( () )
            // InternalOpenQASM3.g:1786:2: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // InternalOpenQASM3.g:1787:2: ()
            // InternalOpenQASM3.g:1787:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // InternalOpenQASM3.g:1795:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1799:1: ( rule__Literal__Group_1__1__Impl )
            // InternalOpenQASM3.g:1800:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // InternalOpenQASM3.g:1806:1: rule__Literal__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1810:1: ( ( RULE_STRING ) )
            // InternalOpenQASM3.g:1811:1: ( RULE_STRING )
            {
            // InternalOpenQASM3.g:1811:1: ( RULE_STRING )
            // InternalOpenQASM3.g:1812:2: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // InternalOpenQASM3.g:1822:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1826:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalOpenQASM3.g:1827:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // InternalOpenQASM3.g:1834:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1838:1: ( ( () ) )
            // InternalOpenQASM3.g:1839:1: ( () )
            {
            // InternalOpenQASM3.g:1839:1: ( () )
            // InternalOpenQASM3.g:1840:2: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // InternalOpenQASM3.g:1841:2: ()
            // InternalOpenQASM3.g:1841:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // InternalOpenQASM3.g:1849:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1853:1: ( rule__Literal__Group_2__1__Impl )
            // InternalOpenQASM3.g:1854:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // InternalOpenQASM3.g:1860:1: rule__Literal__Group_2__1__Impl : ( ruleDecimalIntegerLiteral ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1864:1: ( ( ruleDecimalIntegerLiteral ) )
            // InternalOpenQASM3.g:1865:1: ( ruleDecimalIntegerLiteral )
            {
            // InternalOpenQASM3.g:1865:1: ( ruleDecimalIntegerLiteral )
            // InternalOpenQASM3.g:1866:2: ruleDecimalIntegerLiteral
            {
             before(grammarAccess.getLiteralAccess().getDecimalIntegerLiteralParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleDecimalIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getDecimalIntegerLiteralParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalOpenQASM3.g:1876:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1880:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalOpenQASM3.g:1881:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalOpenQASM3.g:1888:1: rule__MultiplicativeExpression__Group__0__Impl : ( ( rule__MultiplicativeExpression__L1Assignment_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1892:1: ( ( ( rule__MultiplicativeExpression__L1Assignment_0 ) ) )
            // InternalOpenQASM3.g:1893:1: ( ( rule__MultiplicativeExpression__L1Assignment_0 ) )
            {
            // InternalOpenQASM3.g:1893:1: ( ( rule__MultiplicativeExpression__L1Assignment_0 ) )
            // InternalOpenQASM3.g:1894:2: ( rule__MultiplicativeExpression__L1Assignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_0()); 
            // InternalOpenQASM3.g:1895:2: ( rule__MultiplicativeExpression__L1Assignment_0 )
            // InternalOpenQASM3.g:1895:3: rule__MultiplicativeExpression__L1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__L1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalOpenQASM3.g:1903:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1907:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // InternalOpenQASM3.g:1908:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalOpenQASM3.g:1915:1: rule__MultiplicativeExpression__Group__1__Impl : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1919:1: ( ( ruleMultiplicativeOperator ) )
            // InternalOpenQASM3.g:1920:1: ( ruleMultiplicativeOperator )
            {
            // InternalOpenQASM3.g:1920:1: ( ruleMultiplicativeOperator )
            // InternalOpenQASM3.g:1921:2: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2"
    // InternalOpenQASM3.g:1930:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl rule__MultiplicativeExpression__Group__3 ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1934:1: ( rule__MultiplicativeExpression__Group__2__Impl rule__MultiplicativeExpression__Group__3 )
            // InternalOpenQASM3.g:1935:2: rule__MultiplicativeExpression__Group__2__Impl rule__MultiplicativeExpression__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicativeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2__Impl"
    // InternalOpenQASM3.g:1942:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__L1Assignment_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1946:1: ( ( ( rule__MultiplicativeExpression__L1Assignment_2 ) ) )
            // InternalOpenQASM3.g:1947:1: ( ( rule__MultiplicativeExpression__L1Assignment_2 ) )
            {
            // InternalOpenQASM3.g:1947:1: ( ( rule__MultiplicativeExpression__L1Assignment_2 ) )
            // InternalOpenQASM3.g:1948:2: ( rule__MultiplicativeExpression__L1Assignment_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_2()); 
            // InternalOpenQASM3.g:1949:2: ( rule__MultiplicativeExpression__L1Assignment_2 )
            // InternalOpenQASM3.g:1949:3: rule__MultiplicativeExpression__L1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__L1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__3"
    // InternalOpenQASM3.g:1957:1: rule__MultiplicativeExpression__Group__3 : rule__MultiplicativeExpression__Group__3__Impl ;
    public final void rule__MultiplicativeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1961:1: ( rule__MultiplicativeExpression__Group__3__Impl )
            // InternalOpenQASM3.g:1962:2: rule__MultiplicativeExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__3"


    // $ANTLR start "rule__MultiplicativeExpression__Group__3__Impl"
    // InternalOpenQASM3.g:1968:1: rule__MultiplicativeExpression__Group__3__Impl : ( ( rule__MultiplicativeExpression__Group_3__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1972:1: ( ( ( rule__MultiplicativeExpression__Group_3__0 )* ) )
            // InternalOpenQASM3.g:1973:1: ( ( rule__MultiplicativeExpression__Group_3__0 )* )
            {
            // InternalOpenQASM3.g:1973:1: ( ( rule__MultiplicativeExpression__Group_3__0 )* )
            // InternalOpenQASM3.g:1974:2: ( rule__MultiplicativeExpression__Group_3__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_3()); 
            // InternalOpenQASM3.g:1975:2: ( rule__MultiplicativeExpression__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ASTERISK && LA17_0<=RULE_SLASH)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOpenQASM3.g:1975:3: rule__MultiplicativeExpression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MultiplicativeExpression__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__3__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_3__0"
    // InternalOpenQASM3.g:1984:1: rule__MultiplicativeExpression__Group_3__0 : rule__MultiplicativeExpression__Group_3__0__Impl rule__MultiplicativeExpression__Group_3__1 ;
    public final void rule__MultiplicativeExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:1988:1: ( rule__MultiplicativeExpression__Group_3__0__Impl rule__MultiplicativeExpression__Group_3__1 )
            // InternalOpenQASM3.g:1989:2: rule__MultiplicativeExpression__Group_3__0__Impl rule__MultiplicativeExpression__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__MultiplicativeExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_3__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_3__0__Impl"
    // InternalOpenQASM3.g:1996:1: rule__MultiplicativeExpression__Group_3__0__Impl : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2000:1: ( ( ruleMultiplicativeOperator ) )
            // InternalOpenQASM3.g:2001:1: ( ruleMultiplicativeOperator )
            {
            // InternalOpenQASM3.g:2001:1: ( ruleMultiplicativeOperator )
            // InternalOpenQASM3.g:2002:2: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeOperatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_3__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_3__1"
    // InternalOpenQASM3.g:2011:1: rule__MultiplicativeExpression__Group_3__1 : rule__MultiplicativeExpression__Group_3__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2015:1: ( rule__MultiplicativeExpression__Group_3__1__Impl )
            // InternalOpenQASM3.g:2016:2: rule__MultiplicativeExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_3__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_3__1__Impl"
    // InternalOpenQASM3.g:2022:1: rule__MultiplicativeExpression__Group_3__1__Impl : ( ( rule__MultiplicativeExpression__L1Assignment_3_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2026:1: ( ( ( rule__MultiplicativeExpression__L1Assignment_3_1 ) ) )
            // InternalOpenQASM3.g:2027:1: ( ( rule__MultiplicativeExpression__L1Assignment_3_1 ) )
            {
            // InternalOpenQASM3.g:2027:1: ( ( rule__MultiplicativeExpression__L1Assignment_3_1 ) )
            // InternalOpenQASM3.g:2028:2: ( rule__MultiplicativeExpression__L1Assignment_3_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_3_1()); 
            // InternalOpenQASM3.g:2029:2: ( rule__MultiplicativeExpression__L1Assignment_3_1 )
            // InternalOpenQASM3.g:2029:3: rule__MultiplicativeExpression__L1Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__L1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_3__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalOpenQASM3.g:2038:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2042:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalOpenQASM3.g:2043:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // InternalOpenQASM3.g:2050:1: rule__UnaryExpression__Group__0__Impl : ( ( rule__UnaryExpression__OpAssignment_0 ) ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2054:1: ( ( ( rule__UnaryExpression__OpAssignment_0 ) ) )
            // InternalOpenQASM3.g:2055:1: ( ( rule__UnaryExpression__OpAssignment_0 ) )
            {
            // InternalOpenQASM3.g:2055:1: ( ( rule__UnaryExpression__OpAssignment_0 ) )
            // InternalOpenQASM3.g:2056:2: ( rule__UnaryExpression__OpAssignment_0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 
            // InternalOpenQASM3.g:2057:2: ( rule__UnaryExpression__OpAssignment_0 )
            // InternalOpenQASM3.g:2057:3: rule__UnaryExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // InternalOpenQASM3.g:2065:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2069:1: ( rule__UnaryExpression__Group__1__Impl )
            // InternalOpenQASM3.g:2070:2: rule__UnaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // InternalOpenQASM3.g:2076:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__LAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2080:1: ( ( ( rule__UnaryExpression__LAssignment_1 ) ) )
            // InternalOpenQASM3.g:2081:1: ( ( rule__UnaryExpression__LAssignment_1 ) )
            {
            // InternalOpenQASM3.g:2081:1: ( ( rule__UnaryExpression__LAssignment_1 ) )
            // InternalOpenQASM3.g:2082:2: ( rule__UnaryExpression__LAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getLAssignment_1()); 
            // InternalOpenQASM3.g:2083:2: ( rule__UnaryExpression__LAssignment_1 )
            // InternalOpenQASM3.g:2083:3: rule__UnaryExpression__LAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__LAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getLAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__IndexOperator__Group__0"
    // InternalOpenQASM3.g:2092:1: rule__IndexOperator__Group__0 : rule__IndexOperator__Group__0__Impl rule__IndexOperator__Group__1 ;
    public final void rule__IndexOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2096:1: ( rule__IndexOperator__Group__0__Impl rule__IndexOperator__Group__1 )
            // InternalOpenQASM3.g:2097:2: rule__IndexOperator__Group__0__Impl rule__IndexOperator__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IndexOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__0"


    // $ANTLR start "rule__IndexOperator__Group__0__Impl"
    // InternalOpenQASM3.g:2104:1: rule__IndexOperator__Group__0__Impl : ( RULE_LBRACKET ) ;
    public final void rule__IndexOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2108:1: ( ( RULE_LBRACKET ) )
            // InternalOpenQASM3.g:2109:1: ( RULE_LBRACKET )
            {
            // InternalOpenQASM3.g:2109:1: ( RULE_LBRACKET )
            // InternalOpenQASM3.g:2110:2: RULE_LBRACKET
            {
             before(grammarAccess.getIndexOperatorAccess().getLBRACKETTerminalRuleCall_0()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getIndexOperatorAccess().getLBRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__0__Impl"


    // $ANTLR start "rule__IndexOperator__Group__1"
    // InternalOpenQASM3.g:2119:1: rule__IndexOperator__Group__1 : rule__IndexOperator__Group__1__Impl rule__IndexOperator__Group__2 ;
    public final void rule__IndexOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2123:1: ( rule__IndexOperator__Group__1__Impl rule__IndexOperator__Group__2 )
            // InternalOpenQASM3.g:2124:2: rule__IndexOperator__Group__1__Impl rule__IndexOperator__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__IndexOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__1"


    // $ANTLR start "rule__IndexOperator__Group__1__Impl"
    // InternalOpenQASM3.g:2131:1: rule__IndexOperator__Group__1__Impl : ( ( rule__IndexOperator__Group_1__0 ) ) ;
    public final void rule__IndexOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2135:1: ( ( ( rule__IndexOperator__Group_1__0 ) ) )
            // InternalOpenQASM3.g:2136:1: ( ( rule__IndexOperator__Group_1__0 ) )
            {
            // InternalOpenQASM3.g:2136:1: ( ( rule__IndexOperator__Group_1__0 ) )
            // InternalOpenQASM3.g:2137:2: ( rule__IndexOperator__Group_1__0 )
            {
             before(grammarAccess.getIndexOperatorAccess().getGroup_1()); 
            // InternalOpenQASM3.g:2138:2: ( rule__IndexOperator__Group_1__0 )
            // InternalOpenQASM3.g:2138:3: rule__IndexOperator__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexOperatorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__1__Impl"


    // $ANTLR start "rule__IndexOperator__Group__2"
    // InternalOpenQASM3.g:2146:1: rule__IndexOperator__Group__2 : rule__IndexOperator__Group__2__Impl ;
    public final void rule__IndexOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2150:1: ( rule__IndexOperator__Group__2__Impl )
            // InternalOpenQASM3.g:2151:2: rule__IndexOperator__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__2"


    // $ANTLR start "rule__IndexOperator__Group__2__Impl"
    // InternalOpenQASM3.g:2157:1: rule__IndexOperator__Group__2__Impl : ( RULE_RBRACKET ) ;
    public final void rule__IndexOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2161:1: ( ( RULE_RBRACKET ) )
            // InternalOpenQASM3.g:2162:1: ( RULE_RBRACKET )
            {
            // InternalOpenQASM3.g:2162:1: ( RULE_RBRACKET )
            // InternalOpenQASM3.g:2163:2: RULE_RBRACKET
            {
             before(grammarAccess.getIndexOperatorAccess().getRBRACKETTerminalRuleCall_2()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getIndexOperatorAccess().getRBRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group__2__Impl"


    // $ANTLR start "rule__IndexOperator__Group_1__0"
    // InternalOpenQASM3.g:2173:1: rule__IndexOperator__Group_1__0 : rule__IndexOperator__Group_1__0__Impl rule__IndexOperator__Group_1__1 ;
    public final void rule__IndexOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2177:1: ( rule__IndexOperator__Group_1__0__Impl rule__IndexOperator__Group_1__1 )
            // InternalOpenQASM3.g:2178:2: rule__IndexOperator__Group_1__0__Impl rule__IndexOperator__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__IndexOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__0"


    // $ANTLR start "rule__IndexOperator__Group_1__0__Impl"
    // InternalOpenQASM3.g:2185:1: rule__IndexOperator__Group_1__0__Impl : ( ruleExpression ) ;
    public final void rule__IndexOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2189:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:2190:1: ( ruleExpression )
            {
            // InternalOpenQASM3.g:2190:1: ( ruleExpression )
            // InternalOpenQASM3.g:2191:2: ruleExpression
            {
             before(grammarAccess.getIndexOperatorAccess().getExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIndexOperatorAccess().getExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__0__Impl"


    // $ANTLR start "rule__IndexOperator__Group_1__1"
    // InternalOpenQASM3.g:2200:1: rule__IndexOperator__Group_1__1 : rule__IndexOperator__Group_1__1__Impl rule__IndexOperator__Group_1__2 ;
    public final void rule__IndexOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2204:1: ( rule__IndexOperator__Group_1__1__Impl rule__IndexOperator__Group_1__2 )
            // InternalOpenQASM3.g:2205:2: rule__IndexOperator__Group_1__1__Impl rule__IndexOperator__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__IndexOperator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__1"


    // $ANTLR start "rule__IndexOperator__Group_1__1__Impl"
    // InternalOpenQASM3.g:2212:1: rule__IndexOperator__Group_1__1__Impl : ( ( rule__IndexOperator__Group_1_1__0 )* ) ;
    public final void rule__IndexOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2216:1: ( ( ( rule__IndexOperator__Group_1_1__0 )* ) )
            // InternalOpenQASM3.g:2217:1: ( ( rule__IndexOperator__Group_1_1__0 )* )
            {
            // InternalOpenQASM3.g:2217:1: ( ( rule__IndexOperator__Group_1_1__0 )* )
            // InternalOpenQASM3.g:2218:2: ( rule__IndexOperator__Group_1_1__0 )*
            {
             before(grammarAccess.getIndexOperatorAccess().getGroup_1_1()); 
            // InternalOpenQASM3.g:2219:2: ( rule__IndexOperator__Group_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>=RULE_TILDE && LA18_1<=RULE_LPAREN)||LA18_1==RULE_STRING||(LA18_1>=RULE_MINUS && LA18_1<=RULE_INT)||LA18_1==36) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalOpenQASM3.g:2219:3: rule__IndexOperator__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IndexOperator__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIndexOperatorAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__1__Impl"


    // $ANTLR start "rule__IndexOperator__Group_1__2"
    // InternalOpenQASM3.g:2227:1: rule__IndexOperator__Group_1__2 : rule__IndexOperator__Group_1__2__Impl ;
    public final void rule__IndexOperator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2231:1: ( rule__IndexOperator__Group_1__2__Impl )
            // InternalOpenQASM3.g:2232:2: rule__IndexOperator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__2"


    // $ANTLR start "rule__IndexOperator__Group_1__2__Impl"
    // InternalOpenQASM3.g:2238:1: rule__IndexOperator__Group_1__2__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__IndexOperator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2242:1: ( ( ( RULE_COMMA )? ) )
            // InternalOpenQASM3.g:2243:1: ( ( RULE_COMMA )? )
            {
            // InternalOpenQASM3.g:2243:1: ( ( RULE_COMMA )? )
            // InternalOpenQASM3.g:2244:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_2()); 
            // InternalOpenQASM3.g:2245:2: ( RULE_COMMA )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMA) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOpenQASM3.g:2245:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1__2__Impl"


    // $ANTLR start "rule__IndexOperator__Group_1_1__0"
    // InternalOpenQASM3.g:2254:1: rule__IndexOperator__Group_1_1__0 : rule__IndexOperator__Group_1_1__0__Impl rule__IndexOperator__Group_1_1__1 ;
    public final void rule__IndexOperator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2258:1: ( rule__IndexOperator__Group_1_1__0__Impl rule__IndexOperator__Group_1_1__1 )
            // InternalOpenQASM3.g:2259:2: rule__IndexOperator__Group_1_1__0__Impl rule__IndexOperator__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__IndexOperator__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1_1__0"


    // $ANTLR start "rule__IndexOperator__Group_1_1__0__Impl"
    // InternalOpenQASM3.g:2266:1: rule__IndexOperator__Group_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__IndexOperator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2270:1: ( ( RULE_COMMA ) )
            // InternalOpenQASM3.g:2271:1: ( RULE_COMMA )
            {
            // InternalOpenQASM3.g:2271:1: ( RULE_COMMA )
            // InternalOpenQASM3.g:2272:2: RULE_COMMA
            {
             before(grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getIndexOperatorAccess().getCOMMATerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1_1__0__Impl"


    // $ANTLR start "rule__IndexOperator__Group_1_1__1"
    // InternalOpenQASM3.g:2281:1: rule__IndexOperator__Group_1_1__1 : rule__IndexOperator__Group_1_1__1__Impl ;
    public final void rule__IndexOperator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2285:1: ( rule__IndexOperator__Group_1_1__1__Impl )
            // InternalOpenQASM3.g:2286:2: rule__IndexOperator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1_1__1"


    // $ANTLR start "rule__IndexOperator__Group_1_1__1__Impl"
    // InternalOpenQASM3.g:2292:1: rule__IndexOperator__Group_1_1__1__Impl : ( ( rule__IndexOperator__EAssignment_1_1_1 ) ) ;
    public final void rule__IndexOperator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2296:1: ( ( ( rule__IndexOperator__EAssignment_1_1_1 ) ) )
            // InternalOpenQASM3.g:2297:1: ( ( rule__IndexOperator__EAssignment_1_1_1 ) )
            {
            // InternalOpenQASM3.g:2297:1: ( ( rule__IndexOperator__EAssignment_1_1_1 ) )
            // InternalOpenQASM3.g:2298:2: ( rule__IndexOperator__EAssignment_1_1_1 )
            {
             before(grammarAccess.getIndexOperatorAccess().getEAssignment_1_1_1()); 
            // InternalOpenQASM3.g:2299:2: ( rule__IndexOperator__EAssignment_1_1_1 )
            // InternalOpenQASM3.g:2299:3: rule__IndexOperator__EAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexOperator__EAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexOperatorAccess().getEAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__Group_1_1__1__Impl"


    // $ANTLR start "rule__IndexedIdentifier__Group__0"
    // InternalOpenQASM3.g:2308:1: rule__IndexedIdentifier__Group__0 : rule__IndexedIdentifier__Group__0__Impl rule__IndexedIdentifier__Group__1 ;
    public final void rule__IndexedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2312:1: ( rule__IndexedIdentifier__Group__0__Impl rule__IndexedIdentifier__Group__1 )
            // InternalOpenQASM3.g:2313:2: rule__IndexedIdentifier__Group__0__Impl rule__IndexedIdentifier__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IndexedIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__Group__0"


    // $ANTLR start "rule__IndexedIdentifier__Group__0__Impl"
    // InternalOpenQASM3.g:2320:1: rule__IndexedIdentifier__Group__0__Impl : ( ( rule__IndexedIdentifier__GateNameAssignment_0 ) ) ;
    public final void rule__IndexedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2324:1: ( ( ( rule__IndexedIdentifier__GateNameAssignment_0 ) ) )
            // InternalOpenQASM3.g:2325:1: ( ( rule__IndexedIdentifier__GateNameAssignment_0 ) )
            {
            // InternalOpenQASM3.g:2325:1: ( ( rule__IndexedIdentifier__GateNameAssignment_0 ) )
            // InternalOpenQASM3.g:2326:2: ( rule__IndexedIdentifier__GateNameAssignment_0 )
            {
             before(grammarAccess.getIndexedIdentifierAccess().getGateNameAssignment_0()); 
            // InternalOpenQASM3.g:2327:2: ( rule__IndexedIdentifier__GateNameAssignment_0 )
            // InternalOpenQASM3.g:2327:3: rule__IndexedIdentifier__GateNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IndexedIdentifier__GateNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIndexedIdentifierAccess().getGateNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__Group__0__Impl"


    // $ANTLR start "rule__IndexedIdentifier__Group__1"
    // InternalOpenQASM3.g:2335:1: rule__IndexedIdentifier__Group__1 : rule__IndexedIdentifier__Group__1__Impl ;
    public final void rule__IndexedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2339:1: ( rule__IndexedIdentifier__Group__1__Impl )
            // InternalOpenQASM3.g:2340:2: rule__IndexedIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexedIdentifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__Group__1"


    // $ANTLR start "rule__IndexedIdentifier__Group__1__Impl"
    // InternalOpenQASM3.g:2346:1: rule__IndexedIdentifier__Group__1__Impl : ( ( rule__IndexedIdentifier__IoAssignment_1 )* ) ;
    public final void rule__IndexedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2350:1: ( ( ( rule__IndexedIdentifier__IoAssignment_1 )* ) )
            // InternalOpenQASM3.g:2351:1: ( ( rule__IndexedIdentifier__IoAssignment_1 )* )
            {
            // InternalOpenQASM3.g:2351:1: ( ( rule__IndexedIdentifier__IoAssignment_1 )* )
            // InternalOpenQASM3.g:2352:2: ( rule__IndexedIdentifier__IoAssignment_1 )*
            {
             before(grammarAccess.getIndexedIdentifierAccess().getIoAssignment_1()); 
            // InternalOpenQASM3.g:2353:2: ( rule__IndexedIdentifier__IoAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_LBRACKET) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOpenQASM3.g:2353:3: rule__IndexedIdentifier__IoAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__IndexedIdentifier__IoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getIndexedIdentifierAccess().getIoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__Group__1__Impl"


    // $ANTLR start "rule__GateOperandList__Group__0"
    // InternalOpenQASM3.g:2362:1: rule__GateOperandList__Group__0 : rule__GateOperandList__Group__0__Impl rule__GateOperandList__Group__1 ;
    public final void rule__GateOperandList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2366:1: ( rule__GateOperandList__Group__0__Impl rule__GateOperandList__Group__1 )
            // InternalOpenQASM3.g:2367:2: rule__GateOperandList__Group__0__Impl rule__GateOperandList__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__GateOperandList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__0"


    // $ANTLR start "rule__GateOperandList__Group__0__Impl"
    // InternalOpenQASM3.g:2374:1: rule__GateOperandList__Group__0__Impl : ( ruleGateOperand ) ;
    public final void rule__GateOperandList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2378:1: ( ( ruleGateOperand ) )
            // InternalOpenQASM3.g:2379:1: ( ruleGateOperand )
            {
            // InternalOpenQASM3.g:2379:1: ( ruleGateOperand )
            // InternalOpenQASM3.g:2380:2: ruleGateOperand
            {
             before(grammarAccess.getGateOperandListAccess().getGateOperandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGateOperand();

            state._fsp--;

             after(grammarAccess.getGateOperandListAccess().getGateOperandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__0__Impl"


    // $ANTLR start "rule__GateOperandList__Group__1"
    // InternalOpenQASM3.g:2389:1: rule__GateOperandList__Group__1 : rule__GateOperandList__Group__1__Impl rule__GateOperandList__Group__2 ;
    public final void rule__GateOperandList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2393:1: ( rule__GateOperandList__Group__1__Impl rule__GateOperandList__Group__2 )
            // InternalOpenQASM3.g:2394:2: rule__GateOperandList__Group__1__Impl rule__GateOperandList__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__GateOperandList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__1"


    // $ANTLR start "rule__GateOperandList__Group__1__Impl"
    // InternalOpenQASM3.g:2401:1: rule__GateOperandList__Group__1__Impl : ( ( rule__GateOperandList__Group_1__0 )* ) ;
    public final void rule__GateOperandList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2405:1: ( ( ( rule__GateOperandList__Group_1__0 )* ) )
            // InternalOpenQASM3.g:2406:1: ( ( rule__GateOperandList__Group_1__0 )* )
            {
            // InternalOpenQASM3.g:2406:1: ( ( rule__GateOperandList__Group_1__0 )* )
            // InternalOpenQASM3.g:2407:2: ( rule__GateOperandList__Group_1__0 )*
            {
             before(grammarAccess.getGateOperandListAccess().getGroup_1()); 
            // InternalOpenQASM3.g:2408:2: ( rule__GateOperandList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalOpenQASM3.g:2408:3: rule__GateOperandList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__GateOperandList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGateOperandListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__1__Impl"


    // $ANTLR start "rule__GateOperandList__Group__2"
    // InternalOpenQASM3.g:2416:1: rule__GateOperandList__Group__2 : rule__GateOperandList__Group__2__Impl ;
    public final void rule__GateOperandList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2420:1: ( rule__GateOperandList__Group__2__Impl )
            // InternalOpenQASM3.g:2421:2: rule__GateOperandList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__2"


    // $ANTLR start "rule__GateOperandList__Group__2__Impl"
    // InternalOpenQASM3.g:2427:1: rule__GateOperandList__Group__2__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__GateOperandList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2431:1: ( ( ( RULE_COMMA )? ) )
            // InternalOpenQASM3.g:2432:1: ( ( RULE_COMMA )? )
            {
            // InternalOpenQASM3.g:2432:1: ( ( RULE_COMMA )? )
            // InternalOpenQASM3.g:2433:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_2()); 
            // InternalOpenQASM3.g:2434:2: ( RULE_COMMA )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMA) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOpenQASM3.g:2434:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group__2__Impl"


    // $ANTLR start "rule__GateOperandList__Group_1__0"
    // InternalOpenQASM3.g:2443:1: rule__GateOperandList__Group_1__0 : rule__GateOperandList__Group_1__0__Impl rule__GateOperandList__Group_1__1 ;
    public final void rule__GateOperandList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2447:1: ( rule__GateOperandList__Group_1__0__Impl rule__GateOperandList__Group_1__1 )
            // InternalOpenQASM3.g:2448:2: rule__GateOperandList__Group_1__0__Impl rule__GateOperandList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__GateOperandList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group_1__0"


    // $ANTLR start "rule__GateOperandList__Group_1__0__Impl"
    // InternalOpenQASM3.g:2455:1: rule__GateOperandList__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__GateOperandList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2459:1: ( ( RULE_COMMA ) )
            // InternalOpenQASM3.g:2460:1: ( RULE_COMMA )
            {
            // InternalOpenQASM3.g:2460:1: ( RULE_COMMA )
            // InternalOpenQASM3.g:2461:2: RULE_COMMA
            {
             before(grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getGateOperandListAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group_1__0__Impl"


    // $ANTLR start "rule__GateOperandList__Group_1__1"
    // InternalOpenQASM3.g:2470:1: rule__GateOperandList__Group_1__1 : rule__GateOperandList__Group_1__1__Impl ;
    public final void rule__GateOperandList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2474:1: ( rule__GateOperandList__Group_1__1__Impl )
            // InternalOpenQASM3.g:2475:2: rule__GateOperandList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GateOperandList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group_1__1"


    // $ANTLR start "rule__GateOperandList__Group_1__1__Impl"
    // InternalOpenQASM3.g:2481:1: rule__GateOperandList__Group_1__1__Impl : ( ( rule__GateOperandList__ExtraGOAssignment_1_1 ) ) ;
    public final void rule__GateOperandList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2485:1: ( ( ( rule__GateOperandList__ExtraGOAssignment_1_1 ) ) )
            // InternalOpenQASM3.g:2486:1: ( ( rule__GateOperandList__ExtraGOAssignment_1_1 ) )
            {
            // InternalOpenQASM3.g:2486:1: ( ( rule__GateOperandList__ExtraGOAssignment_1_1 ) )
            // InternalOpenQASM3.g:2487:2: ( rule__GateOperandList__ExtraGOAssignment_1_1 )
            {
             before(grammarAccess.getGateOperandListAccess().getExtraGOAssignment_1_1()); 
            // InternalOpenQASM3.g:2488:2: ( rule__GateOperandList__ExtraGOAssignment_1_1 )
            // InternalOpenQASM3.g:2488:3: rule__GateOperandList__ExtraGOAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GateOperandList__ExtraGOAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGateOperandListAccess().getExtraGOAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__Group_1__1__Impl"


    // $ANTLR start "rule__QubitType__Group__0"
    // InternalOpenQASM3.g:2497:1: rule__QubitType__Group__0 : rule__QubitType__Group__0__Impl rule__QubitType__Group__1 ;
    public final void rule__QubitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2501:1: ( rule__QubitType__Group__0__Impl rule__QubitType__Group__1 )
            // InternalOpenQASM3.g:2502:2: rule__QubitType__Group__0__Impl rule__QubitType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QubitType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QubitType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QubitType__Group__0"


    // $ANTLR start "rule__QubitType__Group__0__Impl"
    // InternalOpenQASM3.g:2509:1: rule__QubitType__Group__0__Impl : ( RULE_QUBIT ) ;
    public final void rule__QubitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2513:1: ( ( RULE_QUBIT ) )
            // InternalOpenQASM3.g:2514:1: ( RULE_QUBIT )
            {
            // InternalOpenQASM3.g:2514:1: ( RULE_QUBIT )
            // InternalOpenQASM3.g:2515:2: RULE_QUBIT
            {
             before(grammarAccess.getQubitTypeAccess().getQUBITTerminalRuleCall_0()); 
            match(input,RULE_QUBIT,FOLLOW_2); 
             after(grammarAccess.getQubitTypeAccess().getQUBITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QubitType__Group__0__Impl"


    // $ANTLR start "rule__QubitType__Group__1"
    // InternalOpenQASM3.g:2524:1: rule__QubitType__Group__1 : rule__QubitType__Group__1__Impl ;
    public final void rule__QubitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2528:1: ( rule__QubitType__Group__1__Impl )
            // InternalOpenQASM3.g:2529:2: rule__QubitType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QubitType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QubitType__Group__1"


    // $ANTLR start "rule__QubitType__Group__1__Impl"
    // InternalOpenQASM3.g:2535:1: rule__QubitType__Group__1__Impl : ( ( rule__QubitType__DAssignment_1 ) ) ;
    public final void rule__QubitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2539:1: ( ( ( rule__QubitType__DAssignment_1 ) ) )
            // InternalOpenQASM3.g:2540:1: ( ( rule__QubitType__DAssignment_1 ) )
            {
            // InternalOpenQASM3.g:2540:1: ( ( rule__QubitType__DAssignment_1 ) )
            // InternalOpenQASM3.g:2541:2: ( rule__QubitType__DAssignment_1 )
            {
             before(grammarAccess.getQubitTypeAccess().getDAssignment_1()); 
            // InternalOpenQASM3.g:2542:2: ( rule__QubitType__DAssignment_1 )
            // InternalOpenQASM3.g:2542:3: rule__QubitType__DAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QubitType__DAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQubitTypeAccess().getDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QubitType__Group__1__Impl"


    // $ANTLR start "rule__Designator__Group__0"
    // InternalOpenQASM3.g:2551:1: rule__Designator__Group__0 : rule__Designator__Group__0__Impl rule__Designator__Group__1 ;
    public final void rule__Designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2555:1: ( rule__Designator__Group__0__Impl rule__Designator__Group__1 )
            // InternalOpenQASM3.g:2556:2: rule__Designator__Group__0__Impl rule__Designator__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__0"


    // $ANTLR start "rule__Designator__Group__0__Impl"
    // InternalOpenQASM3.g:2563:1: rule__Designator__Group__0__Impl : ( () ) ;
    public final void rule__Designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2567:1: ( ( () ) )
            // InternalOpenQASM3.g:2568:1: ( () )
            {
            // InternalOpenQASM3.g:2568:1: ( () )
            // InternalOpenQASM3.g:2569:2: ()
            {
             before(grammarAccess.getDesignatorAccess().getDesignatorAction_0()); 
            // InternalOpenQASM3.g:2570:2: ()
            // InternalOpenQASM3.g:2570:3: 
            {
            }

             after(grammarAccess.getDesignatorAccess().getDesignatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__0__Impl"


    // $ANTLR start "rule__Designator__Group__1"
    // InternalOpenQASM3.g:2578:1: rule__Designator__Group__1 : rule__Designator__Group__1__Impl rule__Designator__Group__2 ;
    public final void rule__Designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2582:1: ( rule__Designator__Group__1__Impl rule__Designator__Group__2 )
            // InternalOpenQASM3.g:2583:2: rule__Designator__Group__1__Impl rule__Designator__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__1"


    // $ANTLR start "rule__Designator__Group__1__Impl"
    // InternalOpenQASM3.g:2590:1: rule__Designator__Group__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2594:1: ( ( RULE_LBRACKET ) )
            // InternalOpenQASM3.g:2595:1: ( RULE_LBRACKET )
            {
            // InternalOpenQASM3.g:2595:1: ( RULE_LBRACKET )
            // InternalOpenQASM3.g:2596:2: RULE_LBRACKET
            {
             before(grammarAccess.getDesignatorAccess().getLBRACKETTerminalRuleCall_1()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getLBRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__1__Impl"


    // $ANTLR start "rule__Designator__Group__2"
    // InternalOpenQASM3.g:2605:1: rule__Designator__Group__2 : rule__Designator__Group__2__Impl rule__Designator__Group__3 ;
    public final void rule__Designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2609:1: ( rule__Designator__Group__2__Impl rule__Designator__Group__3 )
            // InternalOpenQASM3.g:2610:2: rule__Designator__Group__2__Impl rule__Designator__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__2"


    // $ANTLR start "rule__Designator__Group__2__Impl"
    // InternalOpenQASM3.g:2617:1: rule__Designator__Group__2__Impl : ( ( rule__Designator__EAssignment_2 )? ) ;
    public final void rule__Designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2621:1: ( ( ( rule__Designator__EAssignment_2 )? ) )
            // InternalOpenQASM3.g:2622:1: ( ( rule__Designator__EAssignment_2 )? )
            {
            // InternalOpenQASM3.g:2622:1: ( ( rule__Designator__EAssignment_2 )? )
            // InternalOpenQASM3.g:2623:2: ( rule__Designator__EAssignment_2 )?
            {
             before(grammarAccess.getDesignatorAccess().getEAssignment_2()); 
            // InternalOpenQASM3.g:2624:2: ( rule__Designator__EAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_TILDE && LA23_0<=RULE_LPAREN)||LA23_0==RULE_STRING||(LA23_0>=RULE_MINUS && LA23_0<=RULE_INT)||LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOpenQASM3.g:2624:3: rule__Designator__EAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designator__EAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignatorAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__2__Impl"


    // $ANTLR start "rule__Designator__Group__3"
    // InternalOpenQASM3.g:2632:1: rule__Designator__Group__3 : rule__Designator__Group__3__Impl ;
    public final void rule__Designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2636:1: ( rule__Designator__Group__3__Impl )
            // InternalOpenQASM3.g:2637:2: rule__Designator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__3"


    // $ANTLR start "rule__Designator__Group__3__Impl"
    // InternalOpenQASM3.g:2643:1: rule__Designator__Group__3__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2647:1: ( ( RULE_RBRACKET ) )
            // InternalOpenQASM3.g:2648:1: ( RULE_RBRACKET )
            {
            // InternalOpenQASM3.g:2648:1: ( RULE_RBRACKET )
            // InternalOpenQASM3.g:2649:2: RULE_RBRACKET
            {
             before(grammarAccess.getDesignatorAccess().getRBRACKETTerminalRuleCall_3()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getRBRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__3__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0__0"
    // InternalOpenQASM3.g:2659:1: rule__FloatLiteral__Group_0__0 : rule__FloatLiteral__Group_0__0__Impl rule__FloatLiteral__Group_0__1 ;
    public final void rule__FloatLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2663:1: ( rule__FloatLiteral__Group_0__0__Impl rule__FloatLiteral__Group_0__1 )
            // InternalOpenQASM3.g:2664:2: rule__FloatLiteral__Group_0__0__Impl rule__FloatLiteral__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__FloatLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__0"


    // $ANTLR start "rule__FloatLiteral__Group_0__0__Impl"
    // InternalOpenQASM3.g:2671:1: rule__FloatLiteral__Group_0__0__Impl : ( ruleDecimalIntegerLiteral ) ;
    public final void rule__FloatLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2675:1: ( ( ruleDecimalIntegerLiteral ) )
            // InternalOpenQASM3.g:2676:1: ( ruleDecimalIntegerLiteral )
            {
            // InternalOpenQASM3.g:2676:1: ( ruleDecimalIntegerLiteral )
            // InternalOpenQASM3.g:2677:2: ruleDecimalIntegerLiteral
            {
             before(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimalIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0__1"
    // InternalOpenQASM3.g:2686:1: rule__FloatLiteral__Group_0__1 : rule__FloatLiteral__Group_0__1__Impl rule__FloatLiteral__Group_0__2 ;
    public final void rule__FloatLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2690:1: ( rule__FloatLiteral__Group_0__1__Impl rule__FloatLiteral__Group_0__2 )
            // InternalOpenQASM3.g:2691:2: rule__FloatLiteral__Group_0__1__Impl rule__FloatLiteral__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__FloatLiteral__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__1"


    // $ANTLR start "rule__FloatLiteral__Group_0__1__Impl"
    // InternalOpenQASM3.g:2698:1: rule__FloatLiteral__Group_0__1__Impl : ( RULE_DOT ) ;
    public final void rule__FloatLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2702:1: ( ( RULE_DOT ) )
            // InternalOpenQASM3.g:2703:1: ( RULE_DOT )
            {
            // InternalOpenQASM3.g:2703:1: ( RULE_DOT )
            // InternalOpenQASM3.g:2704:2: RULE_DOT
            {
             before(grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_1()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0__2"
    // InternalOpenQASM3.g:2713:1: rule__FloatLiteral__Group_0__2 : rule__FloatLiteral__Group_0__2__Impl rule__FloatLiteral__Group_0__3 ;
    public final void rule__FloatLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2717:1: ( rule__FloatLiteral__Group_0__2__Impl rule__FloatLiteral__Group_0__3 )
            // InternalOpenQASM3.g:2718:2: rule__FloatLiteral__Group_0__2__Impl rule__FloatLiteral__Group_0__3
            {
            pushFollow(FOLLOW_29);
            rule__FloatLiteral__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__2"


    // $ANTLR start "rule__FloatLiteral__Group_0__2__Impl"
    // InternalOpenQASM3.g:2725:1: rule__FloatLiteral__Group_0__2__Impl : ( ( ruleDecimalIntegerLiteral )? ) ;
    public final void rule__FloatLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2729:1: ( ( ( ruleDecimalIntegerLiteral )? ) )
            // InternalOpenQASM3.g:2730:1: ( ( ruleDecimalIntegerLiteral )? )
            {
            // InternalOpenQASM3.g:2730:1: ( ( ruleDecimalIntegerLiteral )? )
            // InternalOpenQASM3.g:2731:2: ( ruleDecimalIntegerLiteral )?
            {
             before(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_2()); 
            // InternalOpenQASM3.g:2732:2: ( ruleDecimalIntegerLiteral )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_MINUS && LA24_0<=RULE_INT)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOpenQASM3.g:2732:3: ruleDecimalIntegerLiteral
                    {
                    pushFollow(FOLLOW_2);
                    ruleDecimalIntegerLiteral();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0__3"
    // InternalOpenQASM3.g:2740:1: rule__FloatLiteral__Group_0__3 : rule__FloatLiteral__Group_0__3__Impl ;
    public final void rule__FloatLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2744:1: ( rule__FloatLiteral__Group_0__3__Impl )
            // InternalOpenQASM3.g:2745:2: rule__FloatLiteral__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__3"


    // $ANTLR start "rule__FloatLiteral__Group_0__3__Impl"
    // InternalOpenQASM3.g:2751:1: rule__FloatLiteral__Group_0__3__Impl : ( ( rule__FloatLiteral__Group_0_3__0 )? ) ;
    public final void rule__FloatLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2755:1: ( ( ( rule__FloatLiteral__Group_0_3__0 )? ) )
            // InternalOpenQASM3.g:2756:1: ( ( rule__FloatLiteral__Group_0_3__0 )? )
            {
            // InternalOpenQASM3.g:2756:1: ( ( rule__FloatLiteral__Group_0_3__0 )? )
            // InternalOpenQASM3.g:2757:2: ( rule__FloatLiteral__Group_0_3__0 )?
            {
             before(grammarAccess.getFloatLiteralAccess().getGroup_0_3()); 
            // InternalOpenQASM3.g:2758:2: ( rule__FloatLiteral__Group_0_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOpenQASM3.g:2758:3: rule__FloatLiteral__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatLiteral__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLiteralAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0__3__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__0"
    // InternalOpenQASM3.g:2767:1: rule__FloatLiteral__Group_0_3__0 : rule__FloatLiteral__Group_0_3__0__Impl rule__FloatLiteral__Group_0_3__1 ;
    public final void rule__FloatLiteral__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2771:1: ( rule__FloatLiteral__Group_0_3__0__Impl rule__FloatLiteral__Group_0_3__1 )
            // InternalOpenQASM3.g:2772:2: rule__FloatLiteral__Group_0_3__0__Impl rule__FloatLiteral__Group_0_3__1
            {
            pushFollow(FOLLOW_30);
            rule__FloatLiteral__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__0"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__0__Impl"
    // InternalOpenQASM3.g:2779:1: rule__FloatLiteral__Group_0_3__0__Impl : ( 'e' ) ;
    public final void rule__FloatLiteral__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2783:1: ( ( 'e' ) )
            // InternalOpenQASM3.g:2784:1: ( 'e' )
            {
            // InternalOpenQASM3.g:2784:1: ( 'e' )
            // InternalOpenQASM3.g:2785:2: 'e'
            {
             before(grammarAccess.getFloatLiteralAccess().getEKeyword_0_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFloatLiteralAccess().getEKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__0__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__1"
    // InternalOpenQASM3.g:2794:1: rule__FloatLiteral__Group_0_3__1 : rule__FloatLiteral__Group_0_3__1__Impl rule__FloatLiteral__Group_0_3__2 ;
    public final void rule__FloatLiteral__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2798:1: ( rule__FloatLiteral__Group_0_3__1__Impl rule__FloatLiteral__Group_0_3__2 )
            // InternalOpenQASM3.g:2799:2: rule__FloatLiteral__Group_0_3__1__Impl rule__FloatLiteral__Group_0_3__2
            {
            pushFollow(FOLLOW_28);
            rule__FloatLiteral__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__1"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__1__Impl"
    // InternalOpenQASM3.g:2806:1: rule__FloatLiteral__Group_0_3__1__Impl : ( ruleDecimalIntegerLiteral ) ;
    public final void rule__FloatLiteral__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2810:1: ( ( ruleDecimalIntegerLiteral ) )
            // InternalOpenQASM3.g:2811:1: ( ruleDecimalIntegerLiteral )
            {
            // InternalOpenQASM3.g:2811:1: ( ruleDecimalIntegerLiteral )
            // InternalOpenQASM3.g:2812:2: ruleDecimalIntegerLiteral
            {
             before(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_1()); 
            pushFollow(FOLLOW_2);
            ruleDecimalIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__1__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__2"
    // InternalOpenQASM3.g:2821:1: rule__FloatLiteral__Group_0_3__2 : rule__FloatLiteral__Group_0_3__2__Impl ;
    public final void rule__FloatLiteral__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2825:1: ( rule__FloatLiteral__Group_0_3__2__Impl )
            // InternalOpenQASM3.g:2826:2: rule__FloatLiteral__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__2"


    // $ANTLR start "rule__FloatLiteral__Group_0_3__2__Impl"
    // InternalOpenQASM3.g:2832:1: rule__FloatLiteral__Group_0_3__2__Impl : ( ( rule__FloatLiteral__Group_0_3_2__0 )? ) ;
    public final void rule__FloatLiteral__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2836:1: ( ( ( rule__FloatLiteral__Group_0_3_2__0 )? ) )
            // InternalOpenQASM3.g:2837:1: ( ( rule__FloatLiteral__Group_0_3_2__0 )? )
            {
            // InternalOpenQASM3.g:2837:1: ( ( rule__FloatLiteral__Group_0_3_2__0 )? )
            // InternalOpenQASM3.g:2838:2: ( rule__FloatLiteral__Group_0_3_2__0 )?
            {
             before(grammarAccess.getFloatLiteralAccess().getGroup_0_3_2()); 
            // InternalOpenQASM3.g:2839:2: ( rule__FloatLiteral__Group_0_3_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOpenQASM3.g:2839:3: rule__FloatLiteral__Group_0_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatLiteral__Group_0_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLiteralAccess().getGroup_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3__2__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0_3_2__0"
    // InternalOpenQASM3.g:2848:1: rule__FloatLiteral__Group_0_3_2__0 : rule__FloatLiteral__Group_0_3_2__0__Impl rule__FloatLiteral__Group_0_3_2__1 ;
    public final void rule__FloatLiteral__Group_0_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2852:1: ( rule__FloatLiteral__Group_0_3_2__0__Impl rule__FloatLiteral__Group_0_3_2__1 )
            // InternalOpenQASM3.g:2853:2: rule__FloatLiteral__Group_0_3_2__0__Impl rule__FloatLiteral__Group_0_3_2__1
            {
            pushFollow(FOLLOW_30);
            rule__FloatLiteral__Group_0_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3_2__0"


    // $ANTLR start "rule__FloatLiteral__Group_0_3_2__0__Impl"
    // InternalOpenQASM3.g:2860:1: rule__FloatLiteral__Group_0_3_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__FloatLiteral__Group_0_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2864:1: ( ( RULE_DOT ) )
            // InternalOpenQASM3.g:2865:1: ( RULE_DOT )
            {
            // InternalOpenQASM3.g:2865:1: ( RULE_DOT )
            // InternalOpenQASM3.g:2866:2: RULE_DOT
            {
             before(grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_3_2_0()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getFloatLiteralAccess().getDOTTerminalRuleCall_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3_2__0__Impl"


    // $ANTLR start "rule__FloatLiteral__Group_0_3_2__1"
    // InternalOpenQASM3.g:2875:1: rule__FloatLiteral__Group_0_3_2__1 : rule__FloatLiteral__Group_0_3_2__1__Impl ;
    public final void rule__FloatLiteral__Group_0_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2879:1: ( rule__FloatLiteral__Group_0_3_2__1__Impl )
            // InternalOpenQASM3.g:2880:2: rule__FloatLiteral__Group_0_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatLiteral__Group_0_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3_2__1"


    // $ANTLR start "rule__FloatLiteral__Group_0_3_2__1__Impl"
    // InternalOpenQASM3.g:2886:1: rule__FloatLiteral__Group_0_3_2__1__Impl : ( ruleDecimalIntegerLiteral ) ;
    public final void rule__FloatLiteral__Group_0_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2890:1: ( ( ruleDecimalIntegerLiteral ) )
            // InternalOpenQASM3.g:2891:1: ( ruleDecimalIntegerLiteral )
            {
            // InternalOpenQASM3.g:2891:1: ( ruleDecimalIntegerLiteral )
            // InternalOpenQASM3.g:2892:2: ruleDecimalIntegerLiteral
            {
             before(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_2_1()); 
            pushFollow(FOLLOW_2);
            ruleDecimalIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getFloatLiteralAccess().getDecimalIntegerLiteralParserRuleCall_0_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__Group_0_3_2__1__Impl"


    // $ANTLR start "rule__DecimalIntegerLiteral__Group__0"
    // InternalOpenQASM3.g:2902:1: rule__DecimalIntegerLiteral__Group__0 : rule__DecimalIntegerLiteral__Group__0__Impl rule__DecimalIntegerLiteral__Group__1 ;
    public final void rule__DecimalIntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2906:1: ( rule__DecimalIntegerLiteral__Group__0__Impl rule__DecimalIntegerLiteral__Group__1 )
            // InternalOpenQASM3.g:2907:2: rule__DecimalIntegerLiteral__Group__0__Impl rule__DecimalIntegerLiteral__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__DecimalIntegerLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalIntegerLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalIntegerLiteral__Group__0"


    // $ANTLR start "rule__DecimalIntegerLiteral__Group__0__Impl"
    // InternalOpenQASM3.g:2914:1: rule__DecimalIntegerLiteral__Group__0__Impl : ( ( RULE_MINUS )? ) ;
    public final void rule__DecimalIntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2918:1: ( ( ( RULE_MINUS )? ) )
            // InternalOpenQASM3.g:2919:1: ( ( RULE_MINUS )? )
            {
            // InternalOpenQASM3.g:2919:1: ( ( RULE_MINUS )? )
            // InternalOpenQASM3.g:2920:2: ( RULE_MINUS )?
            {
             before(grammarAccess.getDecimalIntegerLiteralAccess().getMINUSTerminalRuleCall_0()); 
            // InternalOpenQASM3.g:2921:2: ( RULE_MINUS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_MINUS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOpenQASM3.g:2921:3: RULE_MINUS
                    {
                    match(input,RULE_MINUS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDecimalIntegerLiteralAccess().getMINUSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalIntegerLiteral__Group__0__Impl"


    // $ANTLR start "rule__DecimalIntegerLiteral__Group__1"
    // InternalOpenQASM3.g:2929:1: rule__DecimalIntegerLiteral__Group__1 : rule__DecimalIntegerLiteral__Group__1__Impl ;
    public final void rule__DecimalIntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2933:1: ( rule__DecimalIntegerLiteral__Group__1__Impl )
            // InternalOpenQASM3.g:2934:2: rule__DecimalIntegerLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalIntegerLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalIntegerLiteral__Group__1"


    // $ANTLR start "rule__DecimalIntegerLiteral__Group__1__Impl"
    // InternalOpenQASM3.g:2940:1: rule__DecimalIntegerLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DecimalIntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2944:1: ( ( RULE_INT ) )
            // InternalOpenQASM3.g:2945:1: ( RULE_INT )
            {
            // InternalOpenQASM3.g:2945:1: ( RULE_INT )
            // InternalOpenQASM3.g:2946:2: RULE_INT
            {
             before(grammarAccess.getDecimalIntegerLiteralAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalIntegerLiteralAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalIntegerLiteral__Group__1__Impl"


    // $ANTLR start "rule__IncludeStatement__Group__0"
    // InternalOpenQASM3.g:2956:1: rule__IncludeStatement__Group__0 : rule__IncludeStatement__Group__0__Impl rule__IncludeStatement__Group__1 ;
    public final void rule__IncludeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2960:1: ( rule__IncludeStatement__Group__0__Impl rule__IncludeStatement__Group__1 )
            // InternalOpenQASM3.g:2961:2: rule__IncludeStatement__Group__0__Impl rule__IncludeStatement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__IncludeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IncludeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__0"


    // $ANTLR start "rule__IncludeStatement__Group__0__Impl"
    // InternalOpenQASM3.g:2968:1: rule__IncludeStatement__Group__0__Impl : ( 'include' ) ;
    public final void rule__IncludeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2972:1: ( ( 'include' ) )
            // InternalOpenQASM3.g:2973:1: ( 'include' )
            {
            // InternalOpenQASM3.g:2973:1: ( 'include' )
            // InternalOpenQASM3.g:2974:2: 'include'
            {
             before(grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__0__Impl"


    // $ANTLR start "rule__IncludeStatement__Group__1"
    // InternalOpenQASM3.g:2983:1: rule__IncludeStatement__Group__1 : rule__IncludeStatement__Group__1__Impl rule__IncludeStatement__Group__2 ;
    public final void rule__IncludeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2987:1: ( rule__IncludeStatement__Group__1__Impl rule__IncludeStatement__Group__2 )
            // InternalOpenQASM3.g:2988:2: rule__IncludeStatement__Group__1__Impl rule__IncludeStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__IncludeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IncludeStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__1"


    // $ANTLR start "rule__IncludeStatement__Group__1__Impl"
    // InternalOpenQASM3.g:2995:1: rule__IncludeStatement__Group__1__Impl : ( ( rule__IncludeStatement__LibNameAssignment_1 ) ) ;
    public final void rule__IncludeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:2999:1: ( ( ( rule__IncludeStatement__LibNameAssignment_1 ) ) )
            // InternalOpenQASM3.g:3000:1: ( ( rule__IncludeStatement__LibNameAssignment_1 ) )
            {
            // InternalOpenQASM3.g:3000:1: ( ( rule__IncludeStatement__LibNameAssignment_1 ) )
            // InternalOpenQASM3.g:3001:2: ( rule__IncludeStatement__LibNameAssignment_1 )
            {
             before(grammarAccess.getIncludeStatementAccess().getLibNameAssignment_1()); 
            // InternalOpenQASM3.g:3002:2: ( rule__IncludeStatement__LibNameAssignment_1 )
            // InternalOpenQASM3.g:3002:3: rule__IncludeStatement__LibNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStatement__LibNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStatementAccess().getLibNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__1__Impl"


    // $ANTLR start "rule__IncludeStatement__Group__2"
    // InternalOpenQASM3.g:3010:1: rule__IncludeStatement__Group__2 : rule__IncludeStatement__Group__2__Impl ;
    public final void rule__IncludeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3014:1: ( rule__IncludeStatement__Group__2__Impl )
            // InternalOpenQASM3.g:3015:2: rule__IncludeStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__2"


    // $ANTLR start "rule__IncludeStatement__Group__2__Impl"
    // InternalOpenQASM3.g:3021:1: rule__IncludeStatement__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__IncludeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3025:1: ( ( RULE_SEMICOLON ) )
            // InternalOpenQASM3.g:3026:1: ( RULE_SEMICOLON )
            {
            // InternalOpenQASM3.g:3026:1: ( RULE_SEMICOLON )
            // InternalOpenQASM3.g:3027:2: RULE_SEMICOLON
            {
             before(grammarAccess.getIncludeStatementAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getIncludeStatementAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__Group__2__Impl"


    // $ANTLR start "rule__Program__VersionAssignment_0"
    // InternalOpenQASM3.g:3037:1: rule__Program__VersionAssignment_0 : ( ruleVersion ) ;
    public final void rule__Program__VersionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3041:1: ( ( ruleVersion ) )
            // InternalOpenQASM3.g:3042:2: ( ruleVersion )
            {
            // InternalOpenQASM3.g:3042:2: ( ruleVersion )
            // InternalOpenQASM3.g:3043:3: ruleVersion
            {
             before(grammarAccess.getProgramAccess().getVersionVersionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getVersionVersionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__VersionAssignment_0"


    // $ANTLR start "rule__Program__StatementsAssignment_1"
    // InternalOpenQASM3.g:3052:1: rule__Program__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3056:1: ( ( ruleStatement ) )
            // InternalOpenQASM3.g:3057:2: ( ruleStatement )
            {
            // InternalOpenQASM3.g:3057:2: ( ruleStatement )
            // InternalOpenQASM3.g:3058:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment_1"


    // $ANTLR start "rule__Version__VersionNumberAssignment_0_1"
    // InternalOpenQASM3.g:3067:1: rule__Version__VersionNumberAssignment_0_1 : ( ruleFloatLiteral ) ;
    public final void rule__Version__VersionNumberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3071:1: ( ( ruleFloatLiteral ) )
            // InternalOpenQASM3.g:3072:2: ( ruleFloatLiteral )
            {
            // InternalOpenQASM3.g:3072:2: ( ruleFloatLiteral )
            // InternalOpenQASM3.g:3073:3: ruleFloatLiteral
            {
             before(grammarAccess.getVersionAccess().getVersionNumberFloatLiteralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatLiteral();

            state._fsp--;

             after(grammarAccess.getVersionAccess().getVersionNumberFloatLiteralParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__VersionNumberAssignment_0_1"


    // $ANTLR start "rule__QuantumDeclarationStatement__NameAssignment_1"
    // InternalOpenQASM3.g:3082:1: rule__QuantumDeclarationStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QuantumDeclarationStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3086:1: ( ( RULE_ID ) )
            // InternalOpenQASM3.g:3087:2: ( RULE_ID )
            {
            // InternalOpenQASM3.g:3087:2: ( RULE_ID )
            // InternalOpenQASM3.g:3088:3: RULE_ID
            {
             before(grammarAccess.getQuantumDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuantumDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumDeclarationStatement__NameAssignment_1"


    // $ANTLR start "rule__GateCallStatement__GateAssignment_1"
    // InternalOpenQASM3.g:3097:1: rule__GateCallStatement__GateAssignment_1 : ( RULE_ID ) ;
    public final void rule__GateCallStatement__GateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3101:1: ( ( RULE_ID ) )
            // InternalOpenQASM3.g:3102:2: ( RULE_ID )
            {
            // InternalOpenQASM3.g:3102:2: ( RULE_ID )
            // InternalOpenQASM3.g:3103:3: RULE_ID
            {
             before(grammarAccess.getGateCallStatementAccess().getGateIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGateCallStatementAccess().getGateIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__GateAssignment_1"


    // $ANTLR start "rule__GateCallStatement__ElAssignment_2_1"
    // InternalOpenQASM3.g:3112:1: rule__GateCallStatement__ElAssignment_2_1 : ( ruleExpressionList ) ;
    public final void rule__GateCallStatement__ElAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3116:1: ( ( ruleExpressionList ) )
            // InternalOpenQASM3.g:3117:2: ( ruleExpressionList )
            {
            // InternalOpenQASM3.g:3117:2: ( ruleExpressionList )
            // InternalOpenQASM3.g:3118:3: ruleExpressionList
            {
             before(grammarAccess.getGateCallStatementAccess().getElExpressionListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getGateCallStatementAccess().getElExpressionListParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__ElAssignment_2_1"


    // $ANTLR start "rule__GateCallStatement__GateListAssignment_3"
    // InternalOpenQASM3.g:3127:1: rule__GateCallStatement__GateListAssignment_3 : ( ruleGateOperandList ) ;
    public final void rule__GateCallStatement__GateListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3131:1: ( ( ruleGateOperandList ) )
            // InternalOpenQASM3.g:3132:2: ( ruleGateOperandList )
            {
            // InternalOpenQASM3.g:3132:2: ( ruleGateOperandList )
            // InternalOpenQASM3.g:3133:3: ruleGateOperandList
            {
             before(grammarAccess.getGateCallStatementAccess().getGateListGateOperandListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGateOperandList();

            state._fsp--;

             after(grammarAccess.getGateCallStatementAccess().getGateListGateOperandListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__GateListAssignment_3"


    // $ANTLR start "rule__GateCallStatement__ScopeAssignment_4_0"
    // InternalOpenQASM3.g:3142:1: rule__GateCallStatement__ScopeAssignment_4_0 : ( ruleScope ) ;
    public final void rule__GateCallStatement__ScopeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3146:1: ( ( ruleScope ) )
            // InternalOpenQASM3.g:3147:2: ( ruleScope )
            {
            // InternalOpenQASM3.g:3147:2: ( ruleScope )
            // InternalOpenQASM3.g:3148:3: ruleScope
            {
             before(grammarAccess.getGateCallStatementAccess().getScopeScopeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getGateCallStatementAccess().getScopeScopeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateCallStatement__ScopeAssignment_4_0"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_2"
    // InternalOpenQASM3.g:3157:1: rule__IfStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3161:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3162:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3162:2: ( ruleExpression )
            // InternalOpenQASM3.g:3163:3: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__If_bodyAssignment_4"
    // InternalOpenQASM3.g:3172:1: rule__IfStatement__If_bodyAssignment_4 : ( rulestatementOrScope ) ;
    public final void rule__IfStatement__If_bodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3176:1: ( ( rulestatementOrScope ) )
            // InternalOpenQASM3.g:3177:2: ( rulestatementOrScope )
            {
            // InternalOpenQASM3.g:3177:2: ( rulestatementOrScope )
            // InternalOpenQASM3.g:3178:3: rulestatementOrScope
            {
             before(grammarAccess.getIfStatementAccess().getIf_bodyStatementOrScopeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulestatementOrScope();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIf_bodyStatementOrScopeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__If_bodyAssignment_4"


    // $ANTLR start "rule__Scope__StatementsAssignment_2"
    // InternalOpenQASM3.g:3187:1: rule__Scope__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Scope__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3191:1: ( ( ruleStatement ) )
            // InternalOpenQASM3.g:3192:2: ( ruleStatement )
            {
            // InternalOpenQASM3.g:3192:2: ( ruleStatement )
            // InternalOpenQASM3.g:3193:3: ruleStatement
            {
             before(grammarAccess.getScopeAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__StatementsAssignment_2"


    // $ANTLR start "rule__ExpressionList__E1Assignment_0"
    // InternalOpenQASM3.g:3202:1: rule__ExpressionList__E1Assignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionList__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3206:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3207:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3207:2: ( ruleExpression )
            // InternalOpenQASM3.g:3208:3: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getE1ExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getE1ExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__E1Assignment_0"


    // $ANTLR start "rule__ExpressionList__E2Assignment_1_1"
    // InternalOpenQASM3.g:3217:1: rule__ExpressionList__E2Assignment_1_1 : ( ruleExpression ) ;
    public final void rule__ExpressionList__E2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3221:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3222:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3222:2: ( ruleExpression )
            // InternalOpenQASM3.g:3223:3: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getE2ExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getE2ExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__E2Assignment_1_1"


    // $ANTLR start "rule__Expression__ExprsAssignment_0_1"
    // InternalOpenQASM3.g:3232:1: rule__Expression__ExprsAssignment_0_1 : ( ruleExpression ) ;
    public final void rule__Expression__ExprsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3236:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3237:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3237:2: ( ruleExpression )
            // InternalOpenQASM3.g:3238:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExprsExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExprsExpressionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExprsAssignment_0_1"


    // $ANTLR start "rule__Expression__LtrsAssignment_1"
    // InternalOpenQASM3.g:3247:1: rule__Expression__LtrsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__Expression__LtrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3251:1: ( ( ruleLiteral ) )
            // InternalOpenQASM3.g:3252:2: ( ruleLiteral )
            {
            // InternalOpenQASM3.g:3252:2: ( ruleLiteral )
            // InternalOpenQASM3.g:3253:3: ruleLiteral
            {
             before(grammarAccess.getExpressionAccess().getLtrsLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLtrsLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LtrsAssignment_1"


    // $ANTLR start "rule__Expression__UnExpressionsAssignment_2"
    // InternalOpenQASM3.g:3262:1: rule__Expression__UnExpressionsAssignment_2 : ( ruleUnaryExpression ) ;
    public final void rule__Expression__UnExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3266:1: ( ( ruleUnaryExpression ) )
            // InternalOpenQASM3.g:3267:2: ( ruleUnaryExpression )
            {
            // InternalOpenQASM3.g:3267:2: ( ruleUnaryExpression )
            // InternalOpenQASM3.g:3268:3: ruleUnaryExpression
            {
             before(grammarAccess.getExpressionAccess().getUnExpressionsUnaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getUnExpressionsUnaryExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__UnExpressionsAssignment_2"


    // $ANTLR start "rule__Expression__MultExpressionsAssignment_3"
    // InternalOpenQASM3.g:3277:1: rule__Expression__MultExpressionsAssignment_3 : ( ruleMultiplicativeExpression ) ;
    public final void rule__Expression__MultExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3281:1: ( ( ruleMultiplicativeExpression ) )
            // InternalOpenQASM3.g:3282:2: ( ruleMultiplicativeExpression )
            {
            // InternalOpenQASM3.g:3282:2: ( ruleMultiplicativeExpression )
            // InternalOpenQASM3.g:3283:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getExpressionAccess().getMultExpressionsMultiplicativeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getMultExpressionsMultiplicativeExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__MultExpressionsAssignment_3"


    // $ANTLR start "rule__Literal__LAssignment_0"
    // InternalOpenQASM3.g:3292:1: rule__Literal__LAssignment_0 : ( ruleFloatLiteral ) ;
    public final void rule__Literal__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3296:1: ( ( ruleFloatLiteral ) )
            // InternalOpenQASM3.g:3297:2: ( ruleFloatLiteral )
            {
            // InternalOpenQASM3.g:3297:2: ( ruleFloatLiteral )
            // InternalOpenQASM3.g:3298:3: ruleFloatLiteral
            {
             before(grammarAccess.getLiteralAccess().getLFloatLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLFloatLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LAssignment_0"


    // $ANTLR start "rule__MultiplicativeExpression__L1Assignment_0"
    // InternalOpenQASM3.g:3307:1: rule__MultiplicativeExpression__L1Assignment_0 : ( ruleLiteral ) ;
    public final void rule__MultiplicativeExpression__L1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3311:1: ( ( ruleLiteral ) )
            // InternalOpenQASM3.g:3312:2: ( ruleLiteral )
            {
            // InternalOpenQASM3.g:3312:2: ( ruleLiteral )
            // InternalOpenQASM3.g:3313:3: ruleLiteral
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__L1Assignment_0"


    // $ANTLR start "rule__MultiplicativeExpression__L1Assignment_2"
    // InternalOpenQASM3.g:3322:1: rule__MultiplicativeExpression__L1Assignment_2 : ( ruleLiteral ) ;
    public final void rule__MultiplicativeExpression__L1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3326:1: ( ( ruleLiteral ) )
            // InternalOpenQASM3.g:3327:2: ( ruleLiteral )
            {
            // InternalOpenQASM3.g:3327:2: ( ruleLiteral )
            // InternalOpenQASM3.g:3328:3: ruleLiteral
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__L1Assignment_2"


    // $ANTLR start "rule__MultiplicativeExpression__L1Assignment_3_1"
    // InternalOpenQASM3.g:3337:1: rule__MultiplicativeExpression__L1Assignment_3_1 : ( ruleLiteral ) ;
    public final void rule__MultiplicativeExpression__L1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3341:1: ( ( ruleLiteral ) )
            // InternalOpenQASM3.g:3342:2: ( ruleLiteral )
            {
            // InternalOpenQASM3.g:3342:2: ( ruleLiteral )
            // InternalOpenQASM3.g:3343:3: ruleLiteral
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getL1LiteralParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__L1Assignment_3_1"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_0"
    // InternalOpenQASM3.g:3352:1: rule__UnaryExpression__OpAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3356:1: ( ( ruleUnaryOperator ) )
            // InternalOpenQASM3.g:3357:2: ( ruleUnaryOperator )
            {
            // InternalOpenQASM3.g:3357:2: ( ruleUnaryOperator )
            // InternalOpenQASM3.g:3358:3: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OpAssignment_0"


    // $ANTLR start "rule__UnaryExpression__LAssignment_1"
    // InternalOpenQASM3.g:3367:1: rule__UnaryExpression__LAssignment_1 : ( ruleLiteral ) ;
    public final void rule__UnaryExpression__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3371:1: ( ( ruleLiteral ) )
            // InternalOpenQASM3.g:3372:2: ( ruleLiteral )
            {
            // InternalOpenQASM3.g:3372:2: ( ruleLiteral )
            // InternalOpenQASM3.g:3373:3: ruleLiteral
            {
             before(grammarAccess.getUnaryExpressionAccess().getLLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getLLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__LAssignment_1"


    // $ANTLR start "rule__IndexOperator__EAssignment_1_1_1"
    // InternalOpenQASM3.g:3382:1: rule__IndexOperator__EAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__IndexOperator__EAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3386:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3387:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3387:2: ( ruleExpression )
            // InternalOpenQASM3.g:3388:3: ruleExpression
            {
             before(grammarAccess.getIndexOperatorAccess().getEExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIndexOperatorAccess().getEExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexOperator__EAssignment_1_1_1"


    // $ANTLR start "rule__IndexedIdentifier__GateNameAssignment_0"
    // InternalOpenQASM3.g:3397:1: rule__IndexedIdentifier__GateNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IndexedIdentifier__GateNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3401:1: ( ( RULE_ID ) )
            // InternalOpenQASM3.g:3402:2: ( RULE_ID )
            {
            // InternalOpenQASM3.g:3402:2: ( RULE_ID )
            // InternalOpenQASM3.g:3403:3: RULE_ID
            {
             before(grammarAccess.getIndexedIdentifierAccess().getGateNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexedIdentifierAccess().getGateNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__GateNameAssignment_0"


    // $ANTLR start "rule__IndexedIdentifier__IoAssignment_1"
    // InternalOpenQASM3.g:3412:1: rule__IndexedIdentifier__IoAssignment_1 : ( ruleIndexOperator ) ;
    public final void rule__IndexedIdentifier__IoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3416:1: ( ( ruleIndexOperator ) )
            // InternalOpenQASM3.g:3417:2: ( ruleIndexOperator )
            {
            // InternalOpenQASM3.g:3417:2: ( ruleIndexOperator )
            // InternalOpenQASM3.g:3418:3: ruleIndexOperator
            {
             before(grammarAccess.getIndexedIdentifierAccess().getIoIndexOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIndexOperator();

            state._fsp--;

             after(grammarAccess.getIndexedIdentifierAccess().getIoIndexOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedIdentifier__IoAssignment_1"


    // $ANTLR start "rule__GateOperandList__ExtraGOAssignment_1_1"
    // InternalOpenQASM3.g:3427:1: rule__GateOperandList__ExtraGOAssignment_1_1 : ( ruleGateOperand ) ;
    public final void rule__GateOperandList__ExtraGOAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3431:1: ( ( ruleGateOperand ) )
            // InternalOpenQASM3.g:3432:2: ( ruleGateOperand )
            {
            // InternalOpenQASM3.g:3432:2: ( ruleGateOperand )
            // InternalOpenQASM3.g:3433:3: ruleGateOperand
            {
             before(grammarAccess.getGateOperandListAccess().getExtraGOGateOperandParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGateOperand();

            state._fsp--;

             after(grammarAccess.getGateOperandListAccess().getExtraGOGateOperandParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GateOperandList__ExtraGOAssignment_1_1"


    // $ANTLR start "rule__QubitType__DAssignment_1"
    // InternalOpenQASM3.g:3442:1: rule__QubitType__DAssignment_1 : ( ruleDesignator ) ;
    public final void rule__QubitType__DAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3446:1: ( ( ruleDesignator ) )
            // InternalOpenQASM3.g:3447:2: ( ruleDesignator )
            {
            // InternalOpenQASM3.g:3447:2: ( ruleDesignator )
            // InternalOpenQASM3.g:3448:3: ruleDesignator
            {
             before(grammarAccess.getQubitTypeAccess().getDDesignatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getQubitTypeAccess().getDDesignatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QubitType__DAssignment_1"


    // $ANTLR start "rule__Designator__EAssignment_2"
    // InternalOpenQASM3.g:3457:1: rule__Designator__EAssignment_2 : ( ruleExpression ) ;
    public final void rule__Designator__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3461:1: ( ( ruleExpression ) )
            // InternalOpenQASM3.g:3462:2: ( ruleExpression )
            {
            // InternalOpenQASM3.g:3462:2: ( ruleExpression )
            // InternalOpenQASM3.g:3463:3: ruleExpression
            {
             before(grammarAccess.getDesignatorAccess().getEExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDesignatorAccess().getEExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__EAssignment_2"


    // $ANTLR start "rule__IncludeStatement__LibNameAssignment_1"
    // InternalOpenQASM3.g:3472:1: rule__IncludeStatement__LibNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IncludeStatement__LibNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenQASM3.g:3476:1: ( ( RULE_STRING ) )
            // InternalOpenQASM3.g:3477:2: ( RULE_STRING )
            {
            // InternalOpenQASM3.g:3477:2: ( RULE_STRING )
            // InternalOpenQASM3.g:3478:3: RULE_STRING
            {
             before(grammarAccess.getIncludeStatementAccess().getLibNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeStatementAccess().getLibNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStatement__LibNameAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\3\11\1\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11";
    static final String dfa_3s = "\1\7\1\uffff\1\24\3\5\1\uffff\1\5\2\uffff\1\24\1\5\1\23\1\24\1\5\1\23\1\24\1\5";
    static final String dfa_4s = "\1\44\1\uffff\1\24\1\22\2\20\1\uffff\1\50\2\uffff\1\24\1\50\2\24\1\22\2\24\1\20";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\3\1\uffff\1\4\1\2\10\uffff";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\2\6\1\1\4\uffff\1\5\4\uffff\1\2\1\3\17\uffff\1\4",
            "",
            "\1\3",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11\1\uffff\1\7",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11",
            "",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11\2\uffff\1\12\1\13\23\uffff\1\14",
            "",
            "",
            "\1\13",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11\27\uffff\1\14",
            "\1\15\1\16",
            "\1\16",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11\1\uffff\1\17",
            "\1\20\1\21",
            "\1\21",
            "\2\10\3\uffff\1\11\2\uffff\1\11\2\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "727:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__LtrsAssignment_1 ) ) | ( ( rule__Expression__UnExpressionsAssignment_2 ) ) | ( ( rule__Expression__MultExpressionsAssignment_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000002C000220000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000002C000220002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000184780L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000184380L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000002C000220800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000002C000221000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000184000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000194380L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000180000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000180000L});

}
package org.xtext.openqasm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenQASM3Lexer extends Lexer {
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

    public InternalOpenQASM3Lexer() {;} 
    public InternalOpenQASM3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOpenQASM3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOpenQASM3.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:11:7: ( 'OPENQASM' )
            // InternalOpenQASM3.g:11:9: 'OPENQASM'
            {
            match("OPENQASM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:12:7: ( 'gate' )
            // InternalOpenQASM3.g:12:9: 'gate'
            {
            match("gate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:13:7: ( 'if' )
            // InternalOpenQASM3.g:13:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:14:7: ( 'e' )
            // InternalOpenQASM3.g:14:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:15:7: ( 'pi' )
            // InternalOpenQASM3.g:15:9: 'pi'
            {
            match("pi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:16:7: ( 'include' )
            // InternalOpenQASM3.g:16:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1483:11: ( 'else' )
            // InternalOpenQASM3.g:1483:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1485:12: ( '-' )
            // InternalOpenQASM3.g:1485:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_EXCLAMATION_POINT"
    public final void mRULE_EXCLAMATION_POINT() throws RecognitionException {
        try {
            int _type = RULE_EXCLAMATION_POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1487:24: ( '!' )
            // InternalOpenQASM3.g:1487:26: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLAMATION_POINT"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1489:12: ( '~' )
            // InternalOpenQASM3.g:1489:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1491:14: ( '%' )
            // InternalOpenQASM3.g:1491:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1493:12: ( '/' )
            // InternalOpenQASM3.g:1493:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_ASTERISK"
    public final void mRULE_ASTERISK() throws RecognitionException {
        try {
            int _type = RULE_ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1495:15: ( '*' )
            // InternalOpenQASM3.g:1495:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASTERISK"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1497:10: ( '.' )
            // InternalOpenQASM3.g:1497:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1499:12: ( ',' )
            // InternalOpenQASM3.g:1499:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            int _type = RULE_BIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1501:10: ( 'bit' )
            // InternalOpenQASM3.g:1501:12: 'bit'
            {
            match("bit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1503:12: ( 'float' )
            // InternalOpenQASM3.g:1503:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ANGLE"
    public final void mRULE_ANGLE() throws RecognitionException {
        try {
            int _type = RULE_ANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1505:12: ( 'angle' )
            // InternalOpenQASM3.g:1505:14: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANGLE"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1507:11: ( 'bool' )
            // InternalOpenQASM3.g:1507:13: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1509:15: ( 'duration' )
            // InternalOpenQASM3.g:1509:17: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_STRETCH"
    public final void mRULE_STRETCH() throws RecognitionException {
        try {
            int _type = RULE_STRETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1511:14: ( 'stretch' )
            // InternalOpenQASM3.g:1511:16: 'stretch'
            {
            match("stretch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRETCH"

    // $ANTLR start "RULE_COMPLEX"
    public final void mRULE_COMPLEX() throws RecognitionException {
        try {
            int _type = RULE_COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1513:14: ( 'complex' )
            // InternalOpenQASM3.g:1513:16: 'complex'
            {
            match("complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPLEX"

    // $ANTLR start "RULE_ARRAY"
    public final void mRULE_ARRAY() throws RecognitionException {
        try {
            int _type = RULE_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1515:12: ( 'array' )
            // InternalOpenQASM3.g:1515:14: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY"

    // $ANTLR start "RULE_QUBIT"
    public final void mRULE_QUBIT() throws RecognitionException {
        try {
            int _type = RULE_QUBIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1517:12: ( 'qubit' )
            // InternalOpenQASM3.g:1517:14: 'qubit'
            {
            match("qubit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUBIT"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1519:15: ( '[' )
            // InternalOpenQASM3.g:1519:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1521:15: ( ']' )
            // InternalOpenQASM3.g:1521:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1523:16: ( ';' )
            // InternalOpenQASM3.g:1523:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1525:13: ( '(' )
            // InternalOpenQASM3.g:1525:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1527:13: ( ')' )
            // InternalOpenQASM3.g:1527:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1529:13: ( '{' )
            // InternalOpenQASM3.g:1529:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1531:13: ( '}' )
            // InternalOpenQASM3.g:1531:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1533:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOpenQASM3.g:1533:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOpenQASM3.g:1533:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOpenQASM3.g:1533:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOpenQASM3.g:1533:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOpenQASM3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1535:10: ( ( '0' .. '9' )+ )
            // InternalOpenQASM3.g:1535:12: ( '0' .. '9' )+
            {
            // InternalOpenQASM3.g:1535:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOpenQASM3.g:1535:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1537:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOpenQASM3.g:1537:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOpenQASM3.g:1537:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpenQASM3.g:1537:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOpenQASM3.g:1537:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOpenQASM3.g:1537:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOpenQASM3.g:1537:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOpenQASM3.g:1537:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOpenQASM3.g:1537:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOpenQASM3.g:1537:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOpenQASM3.g:1537:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1539:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOpenQASM3.g:1539:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOpenQASM3.g:1539:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOpenQASM3.g:1539:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1541:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOpenQASM3.g:1541:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOpenQASM3.g:1541:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOpenQASM3.g:1541:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalOpenQASM3.g:1541:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOpenQASM3.g:1541:41: ( '\\r' )? '\\n'
                    {
                    // InternalOpenQASM3.g:1541:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalOpenQASM3.g:1541:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1543:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOpenQASM3.g:1543:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOpenQASM3.g:1543:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOpenQASM3.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOpenQASM3.g:1545:16: ( . )
            // InternalOpenQASM3.g:1545:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOpenQASM3.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ELSE | RULE_MINUS | RULE_EXCLAMATION_POINT | RULE_TILDE | RULE_PERCENT | RULE_SLASH | RULE_ASTERISK | RULE_DOT | RULE_COMMA | RULE_BIT | RULE_FLOAT | RULE_ANGLE | RULE_BOOL | RULE_DURATION | RULE_STRETCH | RULE_COMPLEX | RULE_ARRAY | RULE_QUBIT | RULE_LBRACKET | RULE_RBRACKET | RULE_SEMICOLON | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalOpenQASM3.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // InternalOpenQASM3.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // InternalOpenQASM3.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // InternalOpenQASM3.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // InternalOpenQASM3.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // InternalOpenQASM3.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // InternalOpenQASM3.g:1:46: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 8 :
                // InternalOpenQASM3.g:1:56: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 9 :
                // InternalOpenQASM3.g:1:67: RULE_EXCLAMATION_POINT
                {
                mRULE_EXCLAMATION_POINT(); 

                }
                break;
            case 10 :
                // InternalOpenQASM3.g:1:90: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 11 :
                // InternalOpenQASM3.g:1:101: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 12 :
                // InternalOpenQASM3.g:1:114: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 13 :
                // InternalOpenQASM3.g:1:125: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 14 :
                // InternalOpenQASM3.g:1:139: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 15 :
                // InternalOpenQASM3.g:1:148: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 16 :
                // InternalOpenQASM3.g:1:159: RULE_BIT
                {
                mRULE_BIT(); 

                }
                break;
            case 17 :
                // InternalOpenQASM3.g:1:168: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 18 :
                // InternalOpenQASM3.g:1:179: RULE_ANGLE
                {
                mRULE_ANGLE(); 

                }
                break;
            case 19 :
                // InternalOpenQASM3.g:1:190: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 20 :
                // InternalOpenQASM3.g:1:200: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 21 :
                // InternalOpenQASM3.g:1:214: RULE_STRETCH
                {
                mRULE_STRETCH(); 

                }
                break;
            case 22 :
                // InternalOpenQASM3.g:1:227: RULE_COMPLEX
                {
                mRULE_COMPLEX(); 

                }
                break;
            case 23 :
                // InternalOpenQASM3.g:1:240: RULE_ARRAY
                {
                mRULE_ARRAY(); 

                }
                break;
            case 24 :
                // InternalOpenQASM3.g:1:251: RULE_QUBIT
                {
                mRULE_QUBIT(); 

                }
                break;
            case 25 :
                // InternalOpenQASM3.g:1:262: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 26 :
                // InternalOpenQASM3.g:1:276: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 27 :
                // InternalOpenQASM3.g:1:290: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 28 :
                // InternalOpenQASM3.g:1:305: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 29 :
                // InternalOpenQASM3.g:1:317: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 30 :
                // InternalOpenQASM3.g:1:329: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 31 :
                // InternalOpenQASM3.g:1:341: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 32 :
                // InternalOpenQASM3.g:1:353: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalOpenQASM3.g:1:361: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalOpenQASM3.g:1:370: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalOpenQASM3.g:1:382: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalOpenQASM3.g:1:398: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalOpenQASM3.g:1:414: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalOpenQASM3.g:1:422: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\44\1\51\1\44\4\uffff\1\61\3\uffff\7\44\7\uffff\1\42\2\uffff\2\42\2\uffff\1\44\1\uffff\1\44\1\112\2\44\1\uffff\1\115\12\uffff\11\44\12\uffff\2\44\1\uffff\2\44\1\uffff\1\133\11\44\1\145\1\44\1\147\1\uffff\1\150\10\44\1\uffff\1\44\2\uffff\1\162\1\163\1\164\3\44\1\170\2\44\3\uffff\3\44\1\uffff\1\44\1\177\1\44\1\u0081\1\u0082\1\u0083\1\uffff\1\u0084\4\uffff";
    static final String DFA12_eofS =
        "\u0085\uffff";
    static final String DFA12_minS =
        "\1\0\1\120\1\141\1\146\1\60\1\151\4\uffff\1\52\3\uffff\1\151\1\154\1\156\1\165\1\164\1\157\1\165\7\uffff\1\101\2\uffff\2\0\2\uffff\1\105\1\uffff\1\164\1\60\1\143\1\163\1\uffff\1\60\12\uffff\1\164\2\157\1\147\3\162\1\155\1\142\12\uffff\1\116\1\145\1\uffff\1\154\1\145\1\uffff\1\60\1\154\1\141\1\154\2\141\1\145\1\160\1\151\1\121\1\60\1\165\1\60\1\uffff\1\60\1\164\1\145\1\171\2\164\1\154\1\164\1\101\1\uffff\1\144\2\uffff\3\60\1\151\1\143\1\145\1\60\1\123\1\145\3\uffff\1\157\1\150\1\170\1\uffff\1\115\1\60\1\156\3\60\1\uffff\1\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\120\1\141\1\156\1\172\1\151\4\uffff\1\57\3\uffff\1\157\1\154\1\162\1\165\1\164\1\157\1\165\7\uffff\1\172\2\uffff\2\uffff\2\uffff\1\105\1\uffff\1\164\1\172\1\143\1\163\1\uffff\1\172\12\uffff\1\164\2\157\1\147\3\162\1\155\1\142\12\uffff\1\116\1\145\1\uffff\1\154\1\145\1\uffff\1\172\1\154\1\141\1\154\2\141\1\145\1\160\1\151\1\121\1\172\1\165\1\172\1\uffff\1\172\1\164\1\145\1\171\2\164\1\154\1\164\1\101\1\uffff\1\144\2\uffff\3\172\1\151\1\143\1\145\1\172\1\123\1\145\3\uffff\1\157\1\150\1\170\1\uffff\1\115\1\172\1\156\3\172\1\uffff\1\172\4\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\10\1\11\1\12\1\13\1\uffff\1\15\1\16\1\17\7\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40\1\41\2\uffff\1\45\1\46\1\uffff\1\40\4\uffff\1\4\1\uffff\1\10\1\11\1\12\1\13\1\43\1\44\1\14\1\15\1\16\1\17\11\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\45\2\uffff\1\3\2\uffff\1\5\15\uffff\1\20\11\uffff\1\2\1\uffff\1\7\1\23\11\uffff\1\21\1\22\1\27\3\uffff\1\30\6\uffff\1\6\1\uffff\1\25\1\26\1\1\1\24";
    static final String DFA12_specialS =
        "\1\1\36\uffff\1\0\1\2\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\7\1\37\2\42\1\11\1\42\1\40\1\30\1\31\1\13\1\42\1\15\1\6\1\14\1\12\12\36\1\42\1\27\5\42\16\35\1\1\13\35\1\25\1\42\1\26\1\34\1\35\1\42\1\20\1\16\1\23\1\21\1\4\1\17\1\2\1\35\1\3\6\35\1\5\1\24\1\35\1\22\7\35\1\32\1\42\1\33\1\10\uff81\42",
            "\1\43",
            "\1\45",
            "\1\46\7\uffff\1\47",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\50\16\44",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "",
            "\1\65\5\uffff\1\66",
            "\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\106",
            "\0\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\113",
            "\1\114",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\146",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0080",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ELSE | RULE_MINUS | RULE_EXCLAMATION_POINT | RULE_TILDE | RULE_PERCENT | RULE_SLASH | RULE_ASTERISK | RULE_DOT | RULE_COMMA | RULE_BIT | RULE_FLOAT | RULE_ANGLE | RULE_BOOL | RULE_DURATION | RULE_STRETCH | RULE_COMPLEX | RULE_ARRAY | RULE_QUBIT | RULE_LBRACKET | RULE_RBRACKET | RULE_SEMICOLON | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 70;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='O') ) {s = 1;}

                        else if ( (LA12_0=='g') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='-') ) {s = 6;}

                        else if ( (LA12_0=='!') ) {s = 7;}

                        else if ( (LA12_0=='~') ) {s = 8;}

                        else if ( (LA12_0=='%') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( (LA12_0=='*') ) {s = 11;}

                        else if ( (LA12_0=='.') ) {s = 12;}

                        else if ( (LA12_0==',') ) {s = 13;}

                        else if ( (LA12_0=='b') ) {s = 14;}

                        else if ( (LA12_0=='f') ) {s = 15;}

                        else if ( (LA12_0=='a') ) {s = 16;}

                        else if ( (LA12_0=='d') ) {s = 17;}

                        else if ( (LA12_0=='s') ) {s = 18;}

                        else if ( (LA12_0=='c') ) {s = 19;}

                        else if ( (LA12_0=='q') ) {s = 20;}

                        else if ( (LA12_0=='[') ) {s = 21;}

                        else if ( (LA12_0==']') ) {s = 22;}

                        else if ( (LA12_0==';') ) {s = 23;}

                        else if ( (LA12_0=='(') ) {s = 24;}

                        else if ( (LA12_0==')') ) {s = 25;}

                        else if ( (LA12_0=='{') ) {s = 26;}

                        else if ( (LA12_0=='}') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='A' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='o')||LA12_0=='r'||(LA12_0>='t' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||LA12_0=='+'||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 70;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
package org.eclipse.xtext.lexer.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.lexer.idea.lang.BacktrackingLexerTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.lexer.services.BacktrackingLexerTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalBacktrackingLexerTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_YC", "RULE_CHARY", "RULE_CHARA", "RULE_CHARB", "RULE_CHARX", "RULE_CHARC", "RULE_WS", "RULE_SL_COMMENT", "'Abc'", "'Efg'"
    };
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_CHARX=8;
    public static final int RULE_YC=4;
    public static final int RULE_CHARY=5;
    public static final int RULE_WS=10;
    public static final int RULE_CHARA=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_CHARB=7;
    public static final int EOF=-1;
    public static final int RULE_CHARC=9;

    // delegates
    // delegators


        public PsiInternalBacktrackingLexerTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalBacktrackingLexerTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[14+1];
             
             
        }
        

    public String[] getTokenNames() { return PsiInternalBacktrackingLexerTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalBacktrackingLexerTestLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

    	protected BacktrackingLexerTestLanguageGrammarAccess grammarAccess;

    	protected BacktrackingLexerTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalBacktrackingLexerTestLanguageParser(PsiBuilder builder, TokenStream input, BacktrackingLexerTestLanguageElementTypeProvider elementTypeProvider, BacktrackingLexerTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalBacktrackingLexerTestLanguage.g:59:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        int entryRuleModel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:59:15: ( ruleModel EOF )
            // PsiInternalBacktrackingLexerTestLanguage.g:60:2: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getModelElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleModel_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalBacktrackingLexerTestLanguage.g:65:1: ruleModel : ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* ) ;
    public final void ruleModel() throws RecognitionException {
        int ruleModel_StartIndex = input.index();
        Token lv_ycs_1_0=null;
        Token lv_ys_4_0=null;
        Token lv_as_5_0=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:65:10: ( ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:66:2: ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:66:2: ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* )
            // PsiInternalBacktrackingLexerTestLanguage.g:67:3: ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )*
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:67:3: ( (lv_enums_0_0= ruleEnumName ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:68:4: (lv_enums_0_0= ruleEnumName )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:68:4: (lv_enums_0_0= ruleEnumName )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:69:5: lv_enums_0_0= ruleEnumName
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_EnumsEnumNameEnumRuleCall_0_0ElementType());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    ruleEnumName();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalBacktrackingLexerTestLanguage.g:78:3: ( (lv_ycs_1_0= RULE_YC ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_YC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:79:4: (lv_ycs_1_0= RULE_YC )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:79:4: (lv_ycs_1_0= RULE_YC )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:80:5: lv_ycs_1_0= RULE_YC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getModel_YcsYcTerminalRuleCall_1_0ElementType());
            	      				
            	    }
            	    lv_ycs_1_0=(Token)match(input,RULE_YC,FollowSets000.FOLLOW_4); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(lv_ycs_1_0);
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // PsiInternalBacktrackingLexerTestLanguage.g:89:3: ( (lv_abs_2_0= ruleAb ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_CHARA) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_CHARB) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:90:4: (lv_abs_2_0= ruleAb )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:90:4: (lv_abs_2_0= ruleAb )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:91:5: lv_abs_2_0= ruleAb
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_AbsAbParserRuleCall_2_0ElementType());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    ruleAb();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // PsiInternalBacktrackingLexerTestLanguage.g:100:3: ( (lv_xbs_3_0= ruleXb ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_CHARX) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:101:4: (lv_xbs_3_0= ruleXb )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:101:4: (lv_xbs_3_0= ruleXb )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:102:5: lv_xbs_3_0= ruleXb
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_XbsXbParserRuleCall_3_0ElementType());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    ruleXb();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // PsiInternalBacktrackingLexerTestLanguage.g:111:3: ( (lv_ys_4_0= RULE_CHARY ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_CHARY) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:112:4: (lv_ys_4_0= RULE_CHARY )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:112:4: (lv_ys_4_0= RULE_CHARY )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:113:5: lv_ys_4_0= RULE_CHARY
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getModel_YsCharYTerminalRuleCall_4_0ElementType());
            	      				
            	    }
            	    lv_ys_4_0=(Token)match(input,RULE_CHARY,FollowSets000.FOLLOW_6); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(lv_ys_4_0);
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // PsiInternalBacktrackingLexerTestLanguage.g:122:3: ( (lv_as_5_0= RULE_CHARA ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_CHARA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalBacktrackingLexerTestLanguage.g:123:4: (lv_as_5_0= RULE_CHARA )
            	    {
            	    // PsiInternalBacktrackingLexerTestLanguage.g:123:4: (lv_as_5_0= RULE_CHARA )
            	    // PsiInternalBacktrackingLexerTestLanguage.g:124:5: lv_as_5_0= RULE_CHARA
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getModel_AsCharATerminalRuleCall_5_0ElementType());
            	      				
            	    }
            	    lv_as_5_0=(Token)match(input,RULE_CHARA,FollowSets000.FOLLOW_7); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(lv_as_5_0);
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ruleModel_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAb"
    // PsiInternalBacktrackingLexerTestLanguage.g:137:1: entryRuleAb : ruleAb EOF ;
    public final void entryRuleAb() throws RecognitionException {
        int entryRuleAb_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:137:12: ( ruleAb EOF )
            // PsiInternalBacktrackingLexerTestLanguage.g:138:2: ruleAb EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAbElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAb();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleAb_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "entryRuleAb"


    // $ANTLR start "ruleAb"
    // PsiInternalBacktrackingLexerTestLanguage.g:143:1: ruleAb : ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) ;
    public final void ruleAb() throws RecognitionException {
        int ruleAb_StartIndex = input.index();
        Token lv_x_0_0=null;
        Token lv_y_1_0=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:143:7: ( ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:144:2: ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:144:2: ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:145:3: ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:145:3: ( (lv_x_0_0= RULE_CHARA ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:146:4: (lv_x_0_0= RULE_CHARA )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:146:4: (lv_x_0_0= RULE_CHARA )
            // PsiInternalBacktrackingLexerTestLanguage.g:147:5: lv_x_0_0= RULE_CHARA
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getAb_XCharATerminalRuleCall_0_0ElementType());
              				
            }
            lv_x_0_0=(Token)match(input,RULE_CHARA,FollowSets000.FOLLOW_8); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_x_0_0);
              				
            }

            }


            }

            // PsiInternalBacktrackingLexerTestLanguage.g:156:3: ( (lv_y_1_0= RULE_CHARB ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:157:4: (lv_y_1_0= RULE_CHARB )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:157:4: (lv_y_1_0= RULE_CHARB )
            // PsiInternalBacktrackingLexerTestLanguage.g:158:5: lv_y_1_0= RULE_CHARB
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getAb_YCharbTerminalRuleCall_1_0ElementType());
              				
            }
            lv_y_1_0=(Token)match(input,RULE_CHARB,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_y_1_0);
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, ruleAb_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ruleAb"


    // $ANTLR start "entryRuleXb"
    // PsiInternalBacktrackingLexerTestLanguage.g:171:1: entryRuleXb : ruleXb EOF ;
    public final void entryRuleXb() throws RecognitionException {
        int entryRuleXb_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:171:12: ( ruleXb EOF )
            // PsiInternalBacktrackingLexerTestLanguage.g:172:2: ruleXb EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getXbElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXb();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleXb_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "entryRuleXb"


    // $ANTLR start "ruleXb"
    // PsiInternalBacktrackingLexerTestLanguage.g:177:1: ruleXb : ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) ;
    public final void ruleXb() throws RecognitionException {
        int ruleXb_StartIndex = input.index();
        Token lv_x_0_0=null;
        Token lv_y_1_0=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:177:7: ( ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:178:2: ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:178:2: ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:179:3: ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:179:3: ( (lv_x_0_0= RULE_CHARX ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:180:4: (lv_x_0_0= RULE_CHARX )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:180:4: (lv_x_0_0= RULE_CHARX )
            // PsiInternalBacktrackingLexerTestLanguage.g:181:5: lv_x_0_0= RULE_CHARX
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXb_XCharXTerminalRuleCall_0_0ElementType());
              				
            }
            lv_x_0_0=(Token)match(input,RULE_CHARX,FollowSets000.FOLLOW_8); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_x_0_0);
              				
            }

            }


            }

            // PsiInternalBacktrackingLexerTestLanguage.g:190:3: ( (lv_y_1_0= RULE_CHARB ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:191:4: (lv_y_1_0= RULE_CHARB )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:191:4: (lv_y_1_0= RULE_CHARB )
            // PsiInternalBacktrackingLexerTestLanguage.g:192:5: lv_y_1_0= RULE_CHARB
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getXb_YCharbTerminalRuleCall_1_0ElementType());
              				
            }
            lv_y_1_0=(Token)match(input,RULE_CHARB,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_y_1_0);
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, ruleXb_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ruleXb"


    // $ANTLR start "ruleEnumName"
    // PsiInternalBacktrackingLexerTestLanguage.g:205:1: ruleEnumName : ( (enumLiteral_0= 'Abc' ) | (enumLiteral_1= 'Efg' ) ) ;
    public final void ruleEnumName() throws RecognitionException {
        int ruleEnumName_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // PsiInternalBacktrackingLexerTestLanguage.g:205:13: ( ( (enumLiteral_0= 'Abc' ) | (enumLiteral_1= 'Efg' ) ) )
            // PsiInternalBacktrackingLexerTestLanguage.g:206:2: ( (enumLiteral_0= 'Abc' ) | (enumLiteral_1= 'Efg' ) )
            {
            // PsiInternalBacktrackingLexerTestLanguage.g:206:2: ( (enumLiteral_0= 'Abc' ) | (enumLiteral_1= 'Efg' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalBacktrackingLexerTestLanguage.g:207:3: (enumLiteral_0= 'Abc' )
                    {
                    // PsiInternalBacktrackingLexerTestLanguage.g:207:3: (enumLiteral_0= 'Abc' )
                    // PsiInternalBacktrackingLexerTestLanguage.g:208:4: enumLiteral_0= 'Abc'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getEnumName_AbcEnumLiteralDeclaration_0ElementType());
                      			
                    }
                    enumLiteral_0=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(enumLiteral_0);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalBacktrackingLexerTestLanguage.g:217:3: (enumLiteral_1= 'Efg' )
                    {
                    // PsiInternalBacktrackingLexerTestLanguage.g:217:3: (enumLiteral_1= 'Efg' )
                    // PsiInternalBacktrackingLexerTestLanguage.g:218:4: enumLiteral_1= 'Efg'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getEnumName_EfgEnumLiteralDeclaration_1ElementType());
                      			
                    }
                    enumLiteral_1=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(enumLiteral_1);
                      			
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, ruleEnumName_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ruleEnumName"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003172L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000172L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000162L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    }


}
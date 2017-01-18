/* A Bison parser, made by GNU Bison 3.0.2.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2013 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

package com.sine_x.regexp.parser;
/* First part of user declarations.  */

/* "Parser.java":37  */ /* lalr1.java:91  */

/* "Parser.java":39  */ /* lalr1.java:92  */
/* "%code imports" blocks.  */
/* "parser.yacc":1  */ /* lalr1.java:93  */

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.sine_x.regexp.exeception.RegexException;
import com.sine_x.regexp.state.*;
import com.sine_x.regexp.Pattern;

/* "Parser.java":50  */ /* lalr1.java:93  */

/**
 * A Bison parser, automatically generated from <tt>parser.yacc</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class Parser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.0.2";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";





  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>Parser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int DIGIT = 258;
    /** Token number,to be returned by the scanner.  */
    static final int CHAR = 259;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param msg The string for the error message.
     */
     void yyerror (String msg);
  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;
  
  
    /* User arguments.  */
    protected final Pattern pattern;



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public Parser (Lexer yylexer, Pattern pattern) 
  {
    
    this.yylexer = yylexer;
    this.pattern = pattern;
          
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
  }


  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            ) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yy_lr_goto_state_ (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) throws RegexException
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
          case 2:
  if (yyn == 2)
    /* "parser.yacc":33  */ /* lalr1.java:489  */
    { pattern.setStart(new MatchedState());     };
  break;
    

  case 3:
  if (yyn == 3)
    /* "parser.yacc":34  */ /* lalr1.java:489  */
    { pattern.setStart(((Fragment)(yystack.valueAt (1-(1)))).getStart());
                                      ((Fragment)(yystack.valueAt (1-(1)))).patch(new MatchedState());             };
  break;
    

  case 4:
  if (yyn == 4)
    /* "parser.yacc":38  */ /* lalr1.java:489  */
    { yyval = ((Fragment)(yystack.valueAt (1-(1))));                  };
  break;
    

  case 5:
  if (yyn == 5)
    /* "parser.yacc":39  */ /* lalr1.java:489  */
    { yyval = ((Fragment)(yystack.valueAt (3-(1)))).alternates(((Fragment)(yystack.valueAt (3-(3)))));   };
  break;
    

  case 6:
  if (yyn == 6)
    /* "parser.yacc":42  */ /* lalr1.java:489  */
    { yyval = ((Fragment)(yystack.valueAt (1-(1))));                  };
  break;
    

  case 7:
  if (yyn == 7)
    /* "parser.yacc":43  */ /* lalr1.java:489  */
    { yyval = ((Fragment)(yystack.valueAt (2-(1)))).concatenate(((Fragment)(yystack.valueAt (2-(2)))));  };
  break;
    

  case 8:
  if (yyn == 8)
    /* "parser.yacc":46  */ /* lalr1.java:489  */
    { yyval = new Fragment(new CharState(((Character)(yystack.valueAt (1-(1)))))); 	};
  break;
    

  case 9:
  if (yyn == 9)
    /* "parser.yacc":47  */ /* lalr1.java:489  */
    { yyval = new Fragment(((CharClassState)(yystack.valueAt (1-(1)))));					};
  break;
    

  case 10:
  if (yyn == 10)
    /* "parser.yacc":48  */ /* lalr1.java:489  */
    { yyval = new Fragment(new WildCardState());	};
  break;
    

  case 11:
  if (yyn == 11)
    /* "parser.yacc":49  */ /* lalr1.java:489  */
    { yyval = ((Repeater)(yystack.valueAt (2-(2)))).repeat(((Fragment)(yystack.valueAt (2-(1)))));                       };
  break;
    

  case 12:
  if (yyn == 12)
    /* "parser.yacc":50  */ /* lalr1.java:489  */
    { yyval = ((Fragment)(yystack.valueAt (3-(2))));                                  };
  break;
    

  case 13:
  if (yyn == 13)
    /* "parser.yacc":53  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 14:
  if (yyn == 14)
    /* "parser.yacc":54  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 15:
  if (yyn == 15)
    /* "parser.yacc":55  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));  };
  break;
    

  case 16:
  if (yyn == 16)
    /* "parser.yacc":56  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));  };
  break;
    

  case 17:
  if (yyn == 17)
    /* "parser.yacc":57  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (2-(2))));	};
  break;
    

  case 18:
  if (yyn == 18)
    /* "parser.yacc":58  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (2-(2))));	};
  break;
    

  case 19:
  if (yyn == 19)
    /* "parser.yacc":63  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 20:
  if (yyn == 20)
    /* "parser.yacc":64  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 21:
  if (yyn == 21)
    /* "parser.yacc":65  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 22:
  if (yyn == 22)
    /* "parser.yacc":66  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 23:
  if (yyn == 23)
    /* "parser.yacc":67  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 24:
  if (yyn == 24)
    /* "parser.yacc":68  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 25:
  if (yyn == 25)
    /* "parser.yacc":69  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 26:
  if (yyn == 26)
    /* "parser.yacc":72  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 27:
  if (yyn == 27)
    /* "parser.yacc":73  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 28:
  if (yyn == 28)
    /* "parser.yacc":74  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 29:
  if (yyn == 29)
    /* "parser.yacc":77  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 30:
  if (yyn == 30)
    /* "parser.yacc":78  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 31:
  if (yyn == 31)
    /* "parser.yacc":83  */ /* lalr1.java:489  */
    { yyval = Repeater.REP_MORE_THAN_ONCE;				};
  break;
    

  case 32:
  if (yyn == 32)
    /* "parser.yacc":84  */ /* lalr1.java:489  */
    { yyval = Repeater.REP_ANY_TIME;					};
  break;
    

  case 33:
  if (yyn == 33)
    /* "parser.yacc":85  */ /* lalr1.java:489  */
    { yyval = Repeater.REP_NONE_OR_ONCE;				};
  break;
    

  case 34:
  if (yyn == 34)
    /* "parser.yacc":86  */ /* lalr1.java:489  */
    { yyval = new Repeater(((Integer)(yystack.valueAt (3-(2)))), Repeater.NUM_NONE);		};
  break;
    

  case 35:
  if (yyn == 35)
    /* "parser.yacc":87  */ /* lalr1.java:489  */
    { yyval = new Repeater(((Integer)(yystack.valueAt (4-(2)))), Repeater.NUM_INFINITY);	};
  break;
    

  case 36:
  if (yyn == 36)
    /* "parser.yacc":88  */ /* lalr1.java:489  */
    { yyval = new Repeater(((Integer)(yystack.valueAt (5-(2)))), ((Integer)(yystack.valueAt (5-(4)))));					};
  break;
    

  case 37:
  if (yyn == 37)
    /* "parser.yacc":91  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1)))) - '0';				};
  break;
    

  case 38:
  if (yyn == 38)
    /* "parser.yacc":92  */ /* lalr1.java:489  */
    { yyval = ((Integer)(yystack.valueAt (2-(1)))) * 10 + (((Character)(yystack.valueAt (2-(2)))) - '0');	};
  break;
    

  case 39:
  if (yyn == 39)
    /* "parser.yacc":97  */ /* lalr1.java:489  */
    { yyval = new CharClassState(((RangeSet<Character>)(yystack.valueAt (3-(2)))));				};
  break;
    

  case 40:
  if (yyn == 40)
    /* "parser.yacc":98  */ /* lalr1.java:489  */
    { yyval = new CharClassState(((RangeSet<Character>)(yystack.valueAt (4-(3)))), true);		};
  break;
    

  case 41:
  if (yyn == 41)
    /* "parser.yacc":101  */ /* lalr1.java:489  */
    { RangeSet<Character> set = TreeRangeSet.create(); set.add(((Range)(yystack.valueAt (1-(1))))); yyval = set;	};
  break;
    

  case 42:
  if (yyn == 42)
    /* "parser.yacc":102  */ /* lalr1.java:489  */
    { RangeSet<Character> set = ((RangeSet<Character>)(yystack.valueAt (2-(2)))); set.add(((Range)(yystack.valueAt (2-(1))))); yyval = set;						};
  break;
    

  case 43:
  if (yyn == 43)
    /* "parser.yacc":105  */ /* lalr1.java:489  */
    { yyval = Range.closed(((Character)(yystack.valueAt (1-(1)))), ((Character)(yystack.valueAt (1-(1)))));	};
  break;
    

  case 44:
  if (yyn == 44)
    /* "parser.yacc":106  */ /* lalr1.java:489  */
    { yyval = Range.closed(((Character)(yystack.valueAt (3-(1)))), ((Character)(yystack.valueAt (3-(3)))));	};
  break;
    

  case 45:
  if (yyn == 45)
    /* "parser.yacc":109  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 46:
  if (yyn == 46)
    /* "parser.yacc":110  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 47:
  if (yyn == 47)
    /* "parser.yacc":111  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 48:
  if (yyn == 48)
    /* "parser.yacc":112  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (1-(1))));	};
  break;
    

  case 49:
  if (yyn == 49)
    /* "parser.yacc":113  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (2-(2))));	};
  break;
    

  case 50:
  if (yyn == 50)
    /* "parser.yacc":114  */ /* lalr1.java:489  */
    { yyval = ((Character)(yystack.valueAt (2-(2))));	};
  break;
    


/* "Parser.java":667  */ /* lalr1.java:489  */
        default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yy_lr_goto_state_ (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }



  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                 Object yyvaluep                                 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
   public boolean parse () throws java.io.IOException, RegexException

  {
    


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {


            yycdebug ("Reading a token: ");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

        /* Convert token to internal form.  */
        if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
            yycdebug ("Now at end of input.\n");
          }
        else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                             yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
              {
                yyn = -yyn;
                label = YYREDUCE;
              }
          }

        else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                             yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
        /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

        if (yychar <= Lexer.EOF)
          {
          /* Return failure if at end of input.  */
          if (yychar == Lexer.EOF)
            return false;
          }
        else
            yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                yyn += yyterror_;
                if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;



        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
                         yylval);

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final byte yypact_ninf_ = -12;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
      62,   -12,   -12,    33,   -12,   -12,    62,   -12,   -12,   -12,
     -12,    14,    12,   -12,    10,    -1,   -12,   -12,   -12,   -12,
     -12,   -12,   -12,   -12,   -12,   -12,   -12,   -12,   -12,    49,
      73,   -12,   -12,    21,    49,    29,    45,   -12,   -12,   -12,
      62,   -12,   -12,   -12,    58,   -12,   -12,    59,   -12,   -12,
     -12,   -12,    49,   -12,   -12,   -12,    72,   -12,   -12,   -12,
     -12,    22,   -12,    31,   -12
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       2,    14,    13,     0,    28,    30,     0,    10,    29,    27,
      26,     0,     0,     3,     4,     6,     8,    15,    16,     9,
      46,    45,    19,    20,    21,    23,    22,    25,    24,     0,
       0,    47,    48,     0,    41,    43,     0,    18,    17,     1,
       0,    31,    33,    32,     0,     7,    11,     0,    50,    49,
      39,    42,     0,    12,     5,    37,     0,    40,    44,    38,
      34,     0,    35,     0,    36
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -12,   -12,    -5,    54,   -12,   -12,    61,    51,    -3,   -12,
      23,   -12,   -11,   -12,    34
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,    12,    13,    14,    15,    16,    31,    17,    18,    46,
      56,    19,    33,    34,    35
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte yytable_[] = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
    {
      32,    36,     1,     2,    41,    42,    43,     3,     4,    44,
       5,     6,    39,     7,     8,     9,    10,    11,    47,    22,
      23,    24,    25,    51,    26,    55,    32,    27,    28,    40,
      50,    32,    37,    62,    59,    54,    20,    21,    22,    23,
      24,    25,    64,    26,     5,    52,    27,    28,     8,    32,
      29,    30,    20,    21,    22,    23,    24,    25,    53,    26,
       5,    55,    27,    28,     8,     1,     2,    30,    57,    45,
       3,     4,    38,     5,     6,    59,     7,     8,     9,    10,
      11,    49,     4,    60,    63,     0,    58,    61,     0,     9,
      10,    48
    };
  }

private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
       3,     6,     3,     4,     5,     6,     7,     8,     9,    10,
      11,    12,     0,    14,    15,    16,    17,    18,    29,     5,
       6,     7,     8,    34,    10,     3,    29,    13,    14,    19,
       9,    34,    18,    11,     3,    40,     3,     4,     5,     6,
       7,     8,    11,    10,    11,    16,    13,    14,    15,    52,
      17,    18,     3,     4,     5,     6,     7,     8,    13,    10,
      11,     3,    13,    14,    15,     3,     4,    18,     9,    15,
       8,     9,    11,    11,    12,     3,    14,    15,    16,    17,
      18,    30,     9,    11,    61,    -1,    52,    15,    -1,    16,
      17,    18
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,     3,     4,     8,     9,    11,    12,    14,    15,    16,
      17,    18,    21,    22,    23,    24,    25,    27,    28,    31,
       3,     4,     5,     6,     7,     8,    10,    13,    14,    17,
      18,    26,    28,    32,    33,    34,    22,    18,    26,     0,
      19,     5,     6,     7,    10,    23,    29,    32,    18,    27,
       9,    32,    16,    13,    22,     3,    30,     9,    34,     3,
      11,    15,    11,    30,    11
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    20,    21,    21,    22,    22,    23,    23,    24,    24,
      24,    24,    24,    25,    25,    25,    25,    25,    25,    26,
      26,    26,    26,    26,    26,    26,    27,    27,    27,    28,
      28,    29,    29,    29,    29,    29,    29,    30,    30,    31,
      31,    32,    32,    33,    33,    34,    34,    34,    34,    34,
      34
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     0,     1,     1,     3,     1,     2,     1,     1,
       1,     2,     3,     1,     1,     1,     1,     2,     2,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     3,     4,     5,     1,     2,     3,
       4,     1,     2,     1,     3,     1,     1,     1,     1,     2,
       2
    };
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
    {
       0,   256,   257,   258,   259,    43,    63,    42,    91,    93,
     123,   125,    40,    41,    46,    44,    45,    94,    92,   124
    };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "DIGIT", "CHAR", "'+'", "'?'", "'*'",
  "'['", "']'", "'{'", "'}'", "'('", "')'", "'.'", "','", "'-'", "'^'",
  "'\\\\'", "'|'", "$accept", "exp", "alternations", "concatenations",
  "closed", "exp_char", "exp_op", "set_op", "rep_op", "repeater", "number",
  "set", "items", "item", "set_char", null
    };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final byte yyrline_[] = yyrline_init();
  private static final byte[] yyrline_init()
  {
    return new byte[]
    {
       0,    33,    33,    34,    38,    39,    42,    43,    46,    47,
      48,    49,    50,    53,    54,    55,    56,    57,    58,    63,
      64,    65,    66,    67,    68,    69,    72,    73,    74,    77,
      78,    83,    84,    85,    86,    87,    88,    91,    92,    97,
      98,   101,   102,   105,   106,   109,   110,   111,   112,   113,
     114
    };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
              + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
                       yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
                       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
      12,    13,     7,     5,    15,    16,    14,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     6,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     8,    18,     9,    17,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    10,    19,    11,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4
    };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 91;
  private static final int yynnts_ = 15;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 39;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 20;

  private static final int yyuser_token_number_max_ = 259;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}

